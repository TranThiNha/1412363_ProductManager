<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 6/2/2017
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>DataTables | Gentelella</title>

    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <!-- Font Awesome -->
    <link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css"/>
    <!-- NProgress -->
    <link href="<c:url value="/resources/css/nprogress.css"/>" rel="stylesheet" type="text/css"/>
    <!-- iCheck -->
    <link href="<c:url value="/resources/css/green.css"/>" rel="stylesheet" type="text/css"/>
    <!-- Datatables -->
    <link href="<c:url value="/resources/css/dataTables.bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/buttons.bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/fixedHeader.bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/responsive.bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/scroller.bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>


    <!-- Custom Theme Style -->
    <link href="<c:url value="/resources/css/custom.min.css"/>" rel="stylesheet" type="text/css"/>
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Product Manager</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <div class="profile clearfix">
                    <div class="profile_pic">
                        <img src="<c:url value="/resources/img.jpg"/>" alt="..." class="img-circle profile_img">
                    </div>
                    <div class="profile_info">

                        <span>Welcome,</span>
                        <h2>Trần Thị Nhã</h2>

                    </div>
                </div>
                <!-- /menu profile quick info -->

                <br />

                <!-- sidebar menu -->
                <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
                    <div class="menu_section">
                        <h3>General</h3>
                        <ul class="nav side-menu">
                            <li><a href="/show-list.html"><i class="fa fa-home"></i>View List Product</a>
                            </li>
                            <li><a href="/form.html"><i class="fa fa-edit"></i> Add new user Form</a>
                            </li>
                        </ul>

                    </div>
                </div>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <div class="sidebar-footer hidden-small">
                    <a data-toggle="tooltip" data-placement="top" title="Settings">
                        <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                        <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Lock">
                        <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
                    </a>
                    <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                        <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                    </a>
                </div>
                <!-- /menu footer buttons -->
            </div>
        </div>

        <!-- top navigation -->
        <div class="top_nav">
            <div class="nav_menu">
                <nav>
                    <div class="nav toggle">
                        <a id="menu_toggle"><i class="fa fa-bars"></i></a>
                    </div>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
                            <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                <img src= "<c:url value="/resources/img.jpg"/>" alt="">Trần Thị Nhã
                                <span class=" fa fa-angle-down"> <img src= "<c:url value="/resources/img.jpg"/>" alt=""></span>
                            </a>
                            <ul class="dropdown-menu dropdown-usermenu pull-right">
                                <li><a href="/logout"><i class="fa fa-sign-out pull-right"></i> Log Out</a></li>
                            </ul>

                        </li>

                    </ul>
                </nav>
            </div>
        </div>

        <!-- /top navigation -->
        <!-- page content -->
        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Create new product form</h3>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_content">
                                <br />
                                <form:form action="save.html" method="post" id="demo-form2" commandName="product" class="form-horizontal form-label-left">

                                    <div class="form-group">
                                    </div>
                                    <div class="form-group">
                                        <form:label class="control-label col-md-3 col-sm-3 col-xs-12" for="name" path="productName">Name:<span class="required">*</span>
                                        </form:label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <form:input type="text" id="name" required="required" class="form-control col-md-7 col-xs-12" path="productName"></form:input>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <form:label class="control-label col-md-3 col-sm-3 col-xs-12" for="cost" path="cost">Cost:<span class="required">*</span>
                                        </form:label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <form:input path="cost" type="text" id="cost" name="last-name" required="required" class="form-control col-md-7 col-xs-12"></form:input>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <form:label class="control-label col-md-3 col-sm-3 col-xs-12" for="description" path="description">Description:</form:label>
                                        <div class="col-md-6 col-sm-6 col-xs-12">
                                            <form:input class="form-control col-md-7 col-xs-12" id="description" type="text" path="description"></form:input>
                                        </div>
                                    </div>
                                    <div class="ln_solid"></div>
                                    <div class="form-group">
                                        <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                            <button class="btn btn-primary" type="button">Cancel</button>
                                            <button class="btn btn-primary" type="reset">Reset</button>
                                            <button class="btn btn-primary" type="submit">Submit</button>

                                        </div>
                                    </div>

                                </form:form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jquery.min.js"/>" type="text/javascript"></script>
<!-- Bootstrap -->
<script src="<c:url value="/resources/js/bootstrap.min.js"/>" type="text/javascript"></script>
<!-- FastClick -->
<script src="<c:url value="/resources/js/fastclick.js"/>" type="text/javascript"></script>
<!-- NProgress -->
<script src="<c:url value="/resources/js/nprogress.js"/>" type="text/javascript"></script>
<!-- iCheck -->
<script src="<c:url value="/resources/js/icheck.min.js"/>" type="text/javascript"></script>
<!-- Datatables -->
<script src="<c:url value="/resources/js/jquery.dataTables.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.buttons.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/buttons.bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/buttons.flash.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/buttons.html5.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/buttons.print.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.fixedHeader.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.keyTable.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.responsive.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/responsive.bootstrap.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/dataTables.scroller.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/jszip.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/pdfmake.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/js/vfs_fonts.js"/>" type="text/javascript"></script>
<!-- Detail -->
<script src="<c:url value="/resources/js/custom.min.js"/>" type="text/javascript"></script>

</body>
</html>
