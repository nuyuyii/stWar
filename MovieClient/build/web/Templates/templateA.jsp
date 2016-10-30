<%-- 
    Document   : Home
    Created on : Oct 30, 2016, 5:18:30 AM
    Author     : nuyuyii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Template A</title>
        <link rel="stylesheet" href="../static/metamorph_lekato/styles.css">
        <style>
            .fregment{
                width: 100%;
                float: left;
            }
            .content{
                float: left;
                width: 500px; 
                padding: 10px;
            }
        </style>
    </head>
    <body>
        <header class="p30">
        <div class="main">
        <h1><a class="logo" href="Home.jsp">Movie</a></h1>
        <nav>
            <ul class="my_menu">
            <li><a class="active" href="Home.jsp">Home</a></li>
            <li><a href="Add.jsp">Add Movie</a></li>
            <li><a href="Search.jsp">Search</a></li>
            <li><a href="Edit.jsp">Edit</a></li>
            <li><a href="About.jsp">About us</a></li>
            </ul>
        </nav>
        </div>
        <!-- Header fragment -->
        <div class="fregment">
            <jsp:include page="/Fragments/header.jsp"></jsp:include>
        </div>
        </header>

 
        <!-- Content fragment -->
        <div class="fregment">
            <jsp:include page="${param.content }"></jsp:include>
        </div>
 
        <!-- Footer fragment -->
        <div class="fregment">
            <jsp:include page="/Fragments/footer.jsp"></jsp:include>
        </div>
    </body>
</html>
