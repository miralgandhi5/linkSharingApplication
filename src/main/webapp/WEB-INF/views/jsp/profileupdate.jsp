<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/21/2017
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="mediafiles.jsp"></jsp:include>
    <jsp:include page="loginheader.jsp"></jsp:include>
</head>
<body>
<div class="col-md-4  col-lg-4 col-sm-12 col-xs-12">
    <div class="row">
<div class="panel panel-default box">
    <div class="panel-heading">Profile</div>
    <div class="panel-body content">

        <form class="form-horizontal" name="validateform" id="validateform" action="/user/update" enctype="multipart/form-data"
              method="post">

            <div class="form-group changeFontSize">
                <div class="row">

                    <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="firstName">First
                        name*</label>

                    <input type="textbox" class="col-sm-6 col-xs-6" id="firstName" value="${User.firstName}"
                           name="firstName" required>
                </div>
                <div class="row">
                    <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="lastName">Last
                        name*</label>

                    <input type="textbox" class="col-sm-6 col-xs-6" id="lastName" name="lastName" value="${User.lastName}" >
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="email">Email*</label>

                    <input type="text" class="col-sm-6 col-xs-6" id="email" name="email" value="${User.email}" >
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="userName">Username*</label>

                    <input type="text" class="col-sm-6 col-xs-6" id="userName" name="userName" value="${User.userName}"/>
                </div>

                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="phot">Photo</label>

                    <input type="file" style="width:40%" class="col-sm-6 col-xs-6" id="phot" name="phot">


                </div>
            </div>


            <button type="submit" class=" pull-right">update</button>


        </form>
    </div>
</div>
</div>
</div>
<div class="col-md-4  col-lg-4 col-sm-12 col-xs-12">
    <div class="row">
        <div class="panel panel-default box">
            <div class="panel-heading">Update Password</div>
            <div class="panel-body content">
                <form class="form-horizontal" action="/user/resetPassword" method="post">
                    <div class="row">
                        <label class="control-label col-sm-4 col-xs-4 " for="password">Password*</label>

                        <input type="password" id="password" class="col-sm-6 col-xs-6"  name="password" >
                    </div>
                    <div class="row">
                        <label class="control-label col-sm-4 col-xs-4 " for="cpswd">Confirm Password*</label>

                        <input type="password" class="col-sm-6 col-xs-6" id="cpswd" name="cpswd" >
                    </div>

                    <button type="submit" class=" pull-right">update</button>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>
