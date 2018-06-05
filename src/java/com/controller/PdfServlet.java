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




/**
 *
 * @author andre
 */
@WebServlet(name = "PdfServlet", urlPatterns = {"/PdfServlet"})
public class PdfServlet extends HttpServlet {
                     
                    
                
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application.pdf");
                
        
        OutputStream out = response.getOutputStream();
        try{           
            try{
                Document documento = new Document();
                PdfWriter.getInstance(documento, out);

                documento.open();

                Paragraph par1 = new Paragraph();
                Font fontTitulo = new Font(Font.FontFamily.TIMES_ROMAN,20 , Font.BOLD, BaseColor.BLACK);
                par1.add(new Phrase("Reportes", fontTitulo));
                par1.setAlignment(Element.ALIGN_CENTER);
                par1.add(new Phrase(Chunk.NEWLINE));
                par1.add(new Phrase(Chunk.NEWLINE));
                documento.add(par1);
                
                Paragraph par2 = new Paragraph();
                Font fontDescrip = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);
                par2.add(new Phrase("Universoft se caracteriza por brindar a sus usuarios la mejor experiencia "
                        + "para nuestra estadia en este mundo", fontDescrip));
                par2.setAlignment(Element.ALIGN_JUSTIFIED);
                par2.add(new Phrase(Chunk.NEWLINE));
                par2.add(new Phrase(Chunk.NEWLINE));
                documento.add(par2);
                            
                
                PdfPTable tabla = new PdfPTable(5);
                PdfPCell celda1 = new PdfPCell(new Paragraph("Id",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda2 = new PdfPCell(new Paragraph("Nombre",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda3 = new PdfPCell(new Paragraph("Valor Multa",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda4 = new PdfPCell(new Paragraph("Estado",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                PdfPCell celda5 = new PdfPCell(new Paragraph("Fecha",FontFactory.getFont("Arial", 12, Font.BOLD, BaseColor.BLACK)));
                tabla.addCell(celda1);
                tabla.addCell(celda2);
                tabla.addCell(celda3);
                tabla.addCell(celda4);
                tabla.addCell(celda5);
                
                tabla.addCell(new PdfPCell(new Paragraph("2173821",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Juan Pepito",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("5445600.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Abril 22 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                
                 tabla.addCell(new PdfPCell(new Paragraph("56562223",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Andrea Giraldo",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("856610.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Enero 20 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("84479921",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Felipe Sierra",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("5874250.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Pago",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Diciembre 27 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("12335549",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Estefania Gomez",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("12002300.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Agosto 30 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("13566540",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("German Quintero",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("6987000.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Pago",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Enero 30 del 2018",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("7164588",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Cesar Alzate",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("8999000.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Abril 20 del 2018",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("7620255",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Juan Alzate",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("55884562.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Septiembre 2 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("55522448",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Camilo Paniagua",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("8000000.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Pago",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Febrero 5 del 2017",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                 
                tabla.addCell(new PdfPCell(new Paragraph("8444522",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Stella Ospina",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("6598880.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Abril 27 del 2018",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                
                tabla.addCell(new PdfPCell(new Paragraph("55522145",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("David Ospina",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("88442220.0",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Debe",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                tabla.addCell(new PdfPCell(new Paragraph("Diciembre 25 del 2016",FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK))));
                     
                documento.add(tabla);
               
                
                documento.close(); 
            
            }catch(Exception ex){
            ex.getMessage();
            }
            
            
        }finally{
                out.close();
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
