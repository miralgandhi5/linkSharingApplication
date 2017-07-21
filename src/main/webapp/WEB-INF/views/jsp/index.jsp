<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/13/2017
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>HomePage</title>

    <head>

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-autocomplete/1.0.7/jquery.auto-complete.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
        <link rel="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css">
        <link rel="https://cdnjs.cloudflare.com/ajax/libs/jquery-autocomplete/1.0.7/jquery.auto-complete.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


    </head>

<body>
<div class="container">
    <!--Header-->
    <jsp:include page="header.jsp"></jsp:include>
    <!--Recent Shar es-->
    <div class="col-md-8 col-lg-8 col-sm-12 col-xs-12">
        <div class="row">
            <div class="panel panel-default box">
                <div class="panel-heading borderStyle">Recent Shares</div>
                <div class="panel-body content">

                    <div class="postHeading">
                        <span class="glyphicon glyphicon-user pull-left"></span>

                        <ul class="list-inline">
                            <li>Uday pratap Singh</li>
                            <li style="color:lightgrey">@Uday5min</li>
                            <li class="pull-right"><a>Grails</a></li>
                        </ul>
                        </span>
                        <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci
                            lacus, finibus
                            commodo nunc auctor vel. Quisque ac varius urna. </p>

                        <ul class="list-inline para">
                            <li><i class="fa fa-facebook-official" aria-hidden="true"></i></li>
                            <li><i class="fa fa-tumblr" aria-hidden="true"></i></li>
                            <li class="pull-right viewPost"><a>View Post</a></li>
                            <i class="fa fa-google-plus" aria-hidden="true"></i>
                        </ul>
                        </span>
                    </div>
                    <div class="postHeading">
                        <span class="glyphicon glyphicon-user pull-left"></span>

                        <ul class="list-inline">
                            <li>Uday pratap Singh</li>
                            <li style="color:lightgray">@Uday5min</li>
                            <li class="pull-right"><a>Grails</a></li>
                        </ul>
                        </span>
                        <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci
                            lacus, finibus
                            commodo nunc auctor vel. Quisque ac varius urna. </p>

                        <ul class="list-inline para">
                            <li><i class="fa fa-facebook-official" aria-hidden="true"></i></li>
                            <li><i class="fa fa-tumblr" aria-hidden="true"></i></li>
                            <li class="pull-right viewPost"><a>View Post</a></li>
                            <i class="fa fa-google-plus" aria-hidden="true"></i>
                        </ul>
                        </span>
                    </div>

                </div>
            </div>
        </div>
        <!--Topposts-->

        <div class="row">

            <div class="panel panel-default box">
                <div class="panel-heading">Top Posts
                    <div style="padding-bottom:1px" class="dropdown pull-right changeFontSize">
                        <!--<button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                        <select>
                            <option>Today</option>
                            <option>1 Week</option>
                            <option>1 Month</option>
                            <option>1 Year</option>
                        </select>
                        <!--<span class="caret"></span></button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                <li role="presentation"><a role="menuitem" tabindex="1" href="#">1 Week</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="2" href="#">1 month</a></li>
                                <li role="presentation"><a role="menuitem" tabindex="3" href="#">1 year</a></li>
                            </ul>-->
                    </div>
                </div>
                <div class="panel-body content">

                    <div class="postHeading">
                        <span class="glyphicon glyphicon-user pull-left"></span>

                        <ul class="list-inline">
                            <li>Uday pratap Singh</li>
                            <li style="color:lightgrey">@Uday5min</li>
                            <li class="pull-right"><a>Grails</a></li>
                        </ul>
                        </span>
                        <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci
                            lacus, finibus
                            commodo nunc auctor vel. Quisque ac varius urna. </p>

                        <ul class="list-inline para">
                            <li><i class="fa fa-facebook-official" aria-hidden="true"></i></li>
                            <li><i class="fa fa-tumblr" aria-hidden="true"></i></li>
                            <li class="pull-right viewPost"><a>View Post</a></li>
                            <i class="fa fa-google-plus" aria-hidden="true"></i>
                        </ul>
                        </span>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!--login-->
    <div class="col-md-4  col-lg-4 col-sm-12 col-xs-12">
        <div class="row">
            <div class="panel panel-default box">
                <div class="panel-heading">Login</div>
                <div class="panel-body content">
                    <form class="form-horizontal" action="/user/login" method="post">

                        <row>
                            <div class="form-group changeFontSize"><label class="control-label" for="user1">Username/Email*</label>
                                <input type="textbox" name="user1" id="user1"required>
                            </div>
                        </row>
                        <row>
                            <div class="form-group changeFontSize">
                                <label class="control-label" for="password1">Password*</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                <input type="password" id="password1" name="password1" required>

                            </div>
                        </row>
                        <row>
                            <div class="form-group changeFontSize ">

                                <a style="text-decoration:underline" href="#" data-toggle="modal"
                                   data-target="#myModal">Forgot password</a>


                                <button class="pull-right">Login</button>


                            </div>
                        </row>

                    </form>
                </div>
            </div>
        </div>


        <div class="row">

            <!--Register-->


<jsp:include page="register.jsp"></jsp:include>
    <!-- Register -->
</div>
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">Enter Registered Email</h4>
            </div>

            <div class="modal-body">


                <div class="form-group changeFontSize">
                    <div class="row">

                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes"
                               for="forgetEmail">Email*:</label>

                        <input type="textbox" class="col-sm-6 col-xs-6" id="forgetEmail" placeholder="abc@gmail.com"
                               name="forgetEmail">
                    </div>

                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="submit" id="forget" class="btn btn-primary">Send Link</button>
            </div>

        </div>
    </div>
</div>



    <script type="text/javascript">
        $(document).ready(function () {
            $("#validateform").validate({

                rules: {
                    email: {
                        required: true,
                        email: true,
                        remote:'/user/checkEmail'
                    },
                    userName: {
                        required: true,
                        minlength: 5,
                        remote:'/user/checkUserName'
                    },
                    password: {
                        required: true,
                        minlength: 5
                    },
                    cpswd: {
                        required: true,
                        equalTo: "#password"
                    }

                },
                messages: {
                    email:{
                        require: "email required",
                        email:"not a valid email",
                        remote:" Already registered email"

                    },
                    userName: {
                        require: "Dont Forget your Username",
                        minlength: "You minlength is not right",


                    },
                    password: {
                        require: "Dont Forget your password",
                        minlength: "You minlength is not right in password",
                        remote:"Already exists"

                    },
                    cpswd: {
                        require: "You Forgot to confirm your password",
                        equalTo: "Password Not match"
                    }
                }

            });


        });

        $('#search').autocomplete({
            source: function (request, response) {
                $.ajax({
                    url: "/dashboard/getPublicTopics",
                    type: "post",
                    accept: "application/json",

                    data: {
                        name: $("#search").val()
                    },
                    success: function (data) {
                        console.log(data)
                        response($.map(data, function (item) {
                            return {
                                label: item,
                                value: item,

                            }
                        }));
                    }
                });
            },

            autoFocus: true,
            minLength: 1
        });

    </script>
</body>

</html>