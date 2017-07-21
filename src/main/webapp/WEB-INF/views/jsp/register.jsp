<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/20/2017
  Time: 1:40 AM
  To change this template use File | Settings | File Templates.
--%>

<div class="panel panel-default box">
    <div class="panel-heading">Register</div>
    <div class="panel-body content">

        <form class="form-horizontal" name="validateform" id="validateform" action="/user/save" enctype="multipart/form-data"
              method="post">

            <div class="form-group changeFontSize">
                <div class="row">

                    <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="firstName">First
                        name*</label>

                    <input type="textbox" class="col-sm-6 col-xs-6" id="firstName" placeholder=""
                           name="firstName" required>
                </div>
                <div class="row">
                    <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="lastName">Last
                        name*</label>

                    <input type="textbox" class="col-sm-6 col-xs-6" id="lastName" name="lastName" required>
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="email">Email*</label>

                    <input type="text" class="col-sm-6 col-xs-6" id="email" name="email" >
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="userName">Username*</label>

                    <input type="text" class="col-sm-6 col-xs-6" id="userName" name="userName"/>
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4 " for="password">Password*</label>

                    <input type="password" id="password" class="col-sm-6 col-xs-6" name="password" >
                </div>
                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4 " for="cpswd">Confirm Password*</label>

                    <input type="password" class="col-sm-6 col-xs-6" id="cpswd" name="cpswd" >
                </div>

                <div class="row">
                    <label class="control-label col-sm-4 col-xs-4" for="phot">Photo</label>

                    <input type="file" style="width:40%" class="col-sm-6 col-xs-6" id="phot" name="phot">


                </div>
            </div>


            <button type="submit" class=" pull-right">Register</button>


        </form>
    </div>
</div>
</div>
</div>