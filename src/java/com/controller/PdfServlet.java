/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.control.Multas;
import com.control.MultasDaoLocal;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.OutputStream;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;

import com.itextpdf.text.pdf.PdfWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author andre
 */
@WebServlet(name = "PdfServlet", urlPatterns = {"/PdfServlet"})
public class PdfServlet extends HttpServlet {

    @EJB
    private MultasDaoLocal multasDao;
    private BaseFont bfBold;
    private BaseFont bf;
    private List<Multas> multas;
    private int pageNumber = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application.pdf");

        OutputStream out = response.getOutputStream();
        try {
            String studentIdStr = request.getParameter("id");
            int studentId = 0;
            if (studentIdStr != null && !studentIdStr.equals("")) {
                studentId = Integer.parseInt(studentIdStr);
            }
            multas = multasDao.getAllMultas();
            try {
                Document documento = new Document();
                PdfWriter docWriter = null;
                initializeFonts();

                try {
                    docWriter = PdfWriter.getInstance(documento, out);
                    documento.addAuthor("betterThanZero");
                    documento.addCreationDate();
                    documento.addProducer();
                    documento.addCreator("MySampleCode.com");
                    documento.addTitle("Reporte Multas");
                    documento.setPageSize(PageSize.LETTER);

                    documento.open();
                    PdfContentByte cb = docWriter.getDirectContent();

                    boolean beginPage = true;
                    int y = 0;

                    for (Multas multa : multas) {
                        if (beginPage) {
                            beginPage = false;
                            generateLayout(documento, cb, multa);
                            generateHeader(documento, cb, multa);
                            y = 615;
                        }
                        generateDetail(documento, cb, multa, y);
                        y = y - 15;
                        if (y < 50) {
                            printPageNumber(cb);
                            documento.newPage();
                            beginPage = true;
                        }
                    }
                    printPageNumber(cb);

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    if (documento != null) {
                        documento.close();
                    }
                    if (docWriter != null) {
                        docWriter.close();
                    }
                }
            } catch (Exception ex) {
                ex.getMessage();
            }

        } finally {
            out.close();
        }
    }

    private void generateLayout(Document doc, PdfContentByte cb, Multas multa) {

        try {

            cb.setLineWidth(1f);

            // Invoice Header box layout
            cb.rectangle(420, 700, 150, 60);
            cb.moveTo(420, 720);
            cb.lineTo(570, 720);
            cb.moveTo(420, 740);
            cb.lineTo(570, 740);
            cb.moveTo(480, 700);
            cb.lineTo(480, 760);
            cb.stroke();

            // Invoice Header box Text Headings
            createHeadings(cb, 422, 743, "No. Multas");
            createHeadings(cb, 422, 723, "Lugar Reporte");
            createHeadings(cb, 422, 703, "Fecha Reporte");

            // Invoice Detail box layout
            cb.rectangle(20, 50, 550, 600);
            cb.moveTo(20, 630);
            cb.lineTo(570, 630);
            cb.moveTo(50, 50);
            cb.lineTo(50, 650);
            cb.moveTo(150, 50);
            cb.lineTo(150, 650);
            cb.moveTo(430, 50);
            cb.lineTo(430, 650);
            cb.moveTo(500, 50);
            cb.lineTo(500, 650);
            cb.stroke();

            // Invoice Detail box Text Headings
            createHeadings(cb, 22, 633, "ID");
            createHeadings(cb, 52, 633, "Nombre");
            createHeadings(cb, 152, 633, "Fecha");
            createHeadings(cb, 432, 633, "Valor");
            createHeadings(cb, 502, 633, "Estado");

            //add the images
            Image companyLogo = Image.getInstance("C:\\Users\\natog\\Desktop\\prueba2\\dsa\\prueba\\src\\java\\com\\controller\\logo.png");
            companyLogo.setAbsolutePosition(40, 680);
            companyLogo.scalePercent(7);
            doc.add(companyLogo);

        } catch (DocumentException dex) {
            dex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void generateHeader(Document doc, PdfContentByte cb, Multas multa) {

        try {

            createHeadings(cb, 200, 750, "UNIVERSOFT");
            createHeadings(cb, 200, 735, "");
            createHeadings(cb, 200, 720, "Address Line 2");
            createHeadings(cb, 200, 705, "Universidad de Antioquia");
            createHeadings(cb, 200, 690, "Colombia");

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            System.out.println(dtf.format(localDate));
            createHeadings(cb, 482, 743, String.valueOf(multas.size()));
            createHeadings(cb, 482, 723, "Antioquia, Medellin");
            createHeadings(cb, 482, 703, dtf.format(localDate));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void generateDetail(Document doc, PdfContentByte cb, Multas multa, int y) {
        DecimalFormat df = new DecimalFormat("0.00");

        try {

            createContent(cb, 48, y, String.valueOf(multa.getId()), PdfContentByte.ALIGN_RIGHT);
            createContent(cb, 52, y, multa.getNombre(), PdfContentByte.ALIGN_LEFT);
            createContent(cb, 152, y, multa.getFecha(), PdfContentByte.ALIGN_LEFT);;
            createContent(cb, 498, y, multa.getValormulta().toString(), PdfContentByte.ALIGN_RIGHT);
            createContent(cb, 568, y, multa.getEstado(), PdfContentByte.ALIGN_RIGHT);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void createHeadings(PdfContentByte cb, float x, float y, String text) {

        cb.beginText();
        cb.setFontAndSize(bfBold, 8);
        cb.setTextMatrix(x, y);
        cb.showText(text.trim());
        cb.endText();

    }

    private void printPageNumber(PdfContentByte cb) {

        cb.beginText();
        cb.setFontAndSize(bfBold, 8);
        cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Page No. " + (pageNumber + 1), 570, 25, 0);
        cb.endText();

        pageNumber++;

    }

    private void createContent(PdfContentByte cb, float x, float y, String text, int align) {

        cb.beginText();
        cb.setFontAndSize(bf, 8);
        cb.showTextAligned(align, text.trim(), x, y, 0);
        cb.endText();

    }

    private void initializeFonts() {

        try {
            bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
