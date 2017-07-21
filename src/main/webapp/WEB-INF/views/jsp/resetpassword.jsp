<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/19/2017
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="mediafiles.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="col-md-4  col-lg-4 col-sm-12 col-xs-12">
    <div class="row ">
        <div class="panel panel-default box">
            <div class="panel-heading">Reset Password</div>
            <div class="panel-body content">
                <form class="form-horizontal" name="resetform" action="/user/resetPassword" method="post">

                    <div class="row">
                        <label class="control-label col-sm-4 col-xs-4 " for="password">Password*</label>

                        <input type="password" id="password" class="col-sm-6 col-xs-6" name="password" required>
                    </div>
                    <div class="row">
                        <label class="control-label col-sm-4 col-xs-4 " for="cpswd">Confirm Password*</label>

                        <input type="password" class="col-sm-6 col-xs-6" id="cpswd" name="cpswd" required>
                    </div>
                    <input type="hidden" class="col-sm-6 col-xs-6" id="id" name="id" value="<%=request.getAttribute("id")%>">

                            <button class="pull-right">Reset</button>

                </form>
                        </div>
                    </row>

                </form>
            </div>
        </div>
    </div>
</div>
<script> $(document).ready(function () {

    $("form[name='resetform']").validate({

        rules: {

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

            password: {
                require: "Dont Forget your Username",
                minlength: "You minlength is not right",

            },
            cpswd: {
                require: "You Forgot to confirm your password",
                equalTo: "Password Not match"
            }
        },
        submitHandler: function(form) {

            form.submit();
        }
    });
});
</script>
</body>
</html>
