<%--
    Document   : pay
    Created on : 24/05/2018, 03:24:33 PM
    Author     : Fdieg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String id = (String) session.getAttribute("id");
    String nombre = (String) session.getAttribute("nombre");
    String fecha = (String) session.getAttribute("fecha");
    String valor = (String) session.getAttribute("valor");
    String estado = (String) session.getAttribute("estado");
%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Universoft &mdash; Multas</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
        <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
        <meta name="author" content="FREEHTML5.CO" />

        <!--
              //////////////////////////////////////////////////////

              FREE HTML5 TEMPLATE
              DESIGNED & DEVELOPED by FREEHTML5.CO

              Website: 		http://freehtml5.co/
              Email: 			info@freehtml5.co
              Twitter: 		http://twitter.com/fh5co
              Facebook: 		https://www.facebook.com/fh5co

              //////////////////////////////////////////////////////
        -->

        <!-- Facebook and Twitter integration -->
        <meta property="og:title" content=""/>
        <meta property="og:image" content=""/>
        <meta property="og:url" content=""/>
        <meta property="og:site_name" content=""/>
        <meta property="og:description" content=""/>
        <meta name="twitter:title" content="" />
        <meta name="twitter:image" content="" />
        <meta name="twitter:url" content="" />
        <meta name="twitter:card" content="" />

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">

        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700,300' rel='stylesheet' type='text/css'>

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Superfish -->
        <link rel="stylesheet" href="css/superfish.css">

        <link rel="stylesheet" href="css/style.css">
        <!--===============================================================================================-->
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="css/util.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <!--===============================================================================================-->


        <!-- Modernizr JS -->


        <script src="js/modernizr-2.6.2.min.js"></script>


        <!-- FOR IE9 below -->
        <!--[if lt IE 9]>
        <script src="js/respond.min.js"></script>
        <![endif]-->
        <script type="text/javascript">
            function consultar() {
                document.getElementById('oculto').style.display = 'block';
            }
        </script>

    </head>
    <body>
        <div id="fh5co-wrapper">
            <div id="fh5co-page">
                <div id="fh5co-header">
                    <header id="fh5co-header-section">
                        <div class="container">
                            <div class="nav-header">
                                <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle"><i></i></a>
                                <h1 id="fh5co-logo"><a href="index.html">Universoft</a></h1>
                                <!-- START #fh5co-menu-wrap -->
                                <nav id="fh5co-menu-wrap" role="navigation">
                                    <ul class="sf-menu" id="fh5co-primary-menu">
                                        <li class="active">
                                            <a href="index.html">Home</a>
                                        </li>
                                        <li><a href="about.html">Sobre Nosotros</a></li>
                                        <li><a href="blog.html">Noticias</a></li>
                                        <li>
                                            <a href="portfolio.html" class="fh5co-sub-ddown">Proyectos</a>
                                            <ul class="fh5co-sub-menu">
                                                <li><a href="#" target="_blank">P1</a></li>
                                                <li><a href="#" target="_blank">P2</a></li>
                                                <li><a href="#" target="_blank">P3</a></li>
                                                <li><a href="#" target="_blank">P4</a></li>
                                                <li><a href="#" target="_blank">P5</a></li>
                                                <li><a href="#" target="_blank">P6</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="services.html" class="fh5co-sub-ddown">Reportes</a>
                                            <ul class="fh5co-sub-menu">
                                                <li><a href="left-sidebar.html">Producción de Basura</a></li>
                                                <li><a href="right-sidebar.html">Planes de Desarrollo</a></li>
                                                <li>
                                                    <a href="#" class="fh5co-sub-ddown">PNUMA</a>
                                                    <ul class="fh5co-sub-menu">
                                                        <li><a href="#" target="_blank">Programa</a></li>
                                                        <li><a href="#" target="_blank">Naciones</a></li>
                                                        <li><a href="#" target="_blank">Unidas</a></li>
                                                        <li><a href="#" target="_blank">Medio</a></li>
                                                        <li><a href="#" target="_blank">Ambiente</a></li>
                                                    </ul>
                                                </li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="microsites.html" class="fh5co-sub-ddown">Micrositios</a>
                                            <ul class="fh5co-sub-menu">
                                                <li><a href="#" target="_blank">COLANTA</a></li>
                                                <li><a href="#" target="_blank">MINAMBIENTE</a></li>
                                                <li><a href="#" target="_blank">UDEA</a></li>
                                                <li><a href="#" target="_blank">Alcaldía de Medellín</a></li>
                                                <li><a href="#" target="_blank">EPM</a></li>
                                                <li><a href="#" target="_blank">TIGO/UNE</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="contact.html">Contactanos</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                    </header>
                </div>


                <div class="fh5co-hero fh5co-hero-2">
                    <div class="fh5co-overlay"></div>
                    <div class="fh5co-cover fh5co-cover_2 text-center" data-stellar-background-ratio="0.5" style="background-image: url(images/billpay.jpg);">
                        <div class="desc animate-box">
                            <h2><strong>Paga Tus </strong>Multas</h2>
                            <span>Utiliza nuestra herramienta para pagar tus multas en linea</span>
                        </div>
                    </div>
                </div>
                <!-- end:header-top -->


                <div id="fh5co-contact" class="animate-box" align="center">
                    <div class="container text-center row">
                        <form action="MultasServlet" method="POST">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <h3 class="section-title">Consulta Tus Multas</h3>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="mail">Numero de Multa</label>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="number" name="id" id="mail" class="center-block" style="background: grey; color: white;"/>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="submit" value="Consultar" name="action" onclick="consultar()" class="btn btn-primary">
                                </div>
                            </div>
                        </form>
                        <form name="reporte" action="PdfServlet" align="center">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <input type="submit" value="Reporte de Multas"  name="btnPdf" class="btn btn-primary"/>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

                <!-- END OF first space -->
                <center>
                    <div id="fh5co-contact" class="animate-box fh5co-section-gray">
                        <div class="container">
                            <c:set var="nombre" value="${multas.nombre}"/>
                            <form action="MultasServlet" method="POST">
                                <!--Empieza Tabla-->
                                <div class="wrap-table100">
                                    <div class="table100 ver1">
                                        <div class="table100-firstcol">
                                            <table>
                                                <thead>
                                                    <tr class="row100 head">
                                                        <th class="cell100 column1">ID</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr class="row100 body">
                                                        <td class="cell100 column1"><%=id%></td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>

                                        <div class="wrap-table100-nextcols js-pscroll">
                                            <div class="table100-nextcols">
                                                <table>
                                                    <thead>
                                                        <tr class="row100 head">
                                                            <th class="cell100 column2">Nombre</th>
                                                            <th class="cell100 column3">Fecha</th>
                                                            <th class="cell100 column4">Valor</th>
                                                            <th class="cell100 column5">Estado</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <tr class="row100 body">
                                                            <td class="cell100 column2"><%=nombre%></td>
                                                            <td class="cell100 column3"><%=fecha%></td>
                                                            <td class="cell100 column4"><%=valor%></td>
                                                            <td class="cell100 column5"><%=estado%></td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!--TerminaTabla-->
                            </form>
                        </div>
                    </div>
                </center>

                <!-- END fh5co-contact -->
                <!-- END map -->
                <footer>
                    <div id="footer">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-6 col-md-offset-3 text-center">
                                    <p class="fh5co-social-icons">
                                        <a href="#"><i class="icon-twitter2"></i></a>
                                        <a href="#"><i class="icon-facebook2"></i></a>
                                        <a href="#"><i class="icon-instagram"></i></a>
                                        <a href="#"><i class="icon-dribbble2"></i></a>
                                        <a href="#"><i class="icon-youtube"></i></a>
                                    </p>
                                    <p>Copyright 2016 Free Html5 <a href="#">Pentagon</a>. All Rights Reserved. <br>Made with <i class="icon-heart3"></i> by <a href="http://freehtml5.co/" target="_blank">Freehtml5.co</a> / Demo Images: <a href="https://unsplash.com/" target="_blank">Unsplash</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>


            </div>
            <!-- END fh5co-page -->

        </div>
        <!-- END fh5co-wrapper -->

        <!-- jQuery -->


        <!--===============================================================================================-->
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
        <script>
                                            $('.js-pscroll').each(function () {
                                                var ps = new PerfectScrollbar(this);

                                                $(window).on('resize', function () {
                                                    ps.update();
                                                })

                                                $(this).on('ps-x-reach-start', function () {
                                                    $(this).parent().find('.table100-firstcol').removeClass('shadow-table100-firstcol');
                                                });

                                                $(this).on('ps-scroll-x', function () {
                                                    $(this).parent().find('.table100-firstcol').addClass('shadow-table100-firstcol');
                                                });

                                            });




        </script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

        <script src="js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <!-- Stellar -->
        <script src="js/jquery.stellar.min.js"></script>
        <!-- Superfish -->
        <script src="js/hoverIntent.js"></script>
        <script src="js/superfish.js"></script>
        <!-- Google Map -->
        <!-- Main JS (Do not remove) -->
        <script src="js/main.js"></script>

    </body>
</html>
