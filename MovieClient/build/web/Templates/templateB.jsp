<%-- 
    Document   : AddMovie
    Created on : Oct 30, 2016, 5:19:09 AM
    Author     : nuyuyii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Template B</title>
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
 
        <!-- Header fragment -->
        <div class="fregment">
            <jsp:include page="/Fragments/header.jsp"></jsp:include>
            <hr>
        </div>
 
        <!-- Content fragment -->
        <div class="fregment">
            <div class="content" style="background-color: skyblue;">
                <jsp:include page="${param.contentA }"></jsp:include>
            </div>
            <div class="content" style="background-color: yellowgreen;">
                <jsp:include page="${param.contentB }"></jsp:include>
            </div>
        </div>
 
        <!-- Footer fragment -->
        <div class="fregment">
            <hr>
            <jsp:include page="/Fragments/footer.jsp"></jsp:include>
        </div>
 
    </body>
</html>
