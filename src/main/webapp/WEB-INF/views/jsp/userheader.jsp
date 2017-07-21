<%@ page import="linksharing.entities.LinkResource" %>
<%@ page import="linksharing.entities.Resource" %><%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/16/2017
  Time: 1:21 PM
  To change this template use File | Settings | File Templates.
--%>
<header>
    <div class="row">
        <div class="col-md-12  col-lg-12 col-sm-12 col-xs-12 head">
            <div class="heading">
                <a href="http://miral.somee.com/homepage.html#">Link Sharing</a>

                <span class="search" style="margin-left:450px;">
                                <span class="glyphicon glyphicon-search"></span>
                                <input type="text" style="border:none" placeholder="Search">
                                <span class="glyphicon glyphicon-remove-sign"></span>
                            </span>

                <div class="menu pull-right">

                    <a id="topiclink" data-toggle="modal" data-target="#myModal" class="fa fa-comment fa-2x" aria-hidden="true" style="padding-right:10px;margin-top:17px;"></a>
                    <a  id="invitelink" data-toggle="modal" data-target="#myInviteModal" class="fa fa-envelope-o fa-fw" style="padding-right:10px;"></a>
                    <a id="urllink"data-toggle="modal" data-target="#myLinkModal" class="fa fa-link fa-2x" aria-hidden="true" style="padding-right:10px;"></a>
                    <a id="doclink" data-toggle="modal" data-target="#myDocModal"  class="fa fa-file-o fa-2x" aria-hidden="true" style="padding-right:50px;"></a>


                    <div class="dropdown pull-right changeFontSize" style="margin-top:15px;">
                        <div class="dropdown changeFontSize">
                            <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                <i class="fa fa-user fa-2x pull-left" aria-hidden="true" style="padding-right:10px;"></i>
                                uday
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu changeFontSize" aria-labelledby="dropdownMenu">
                                <li><a href="/user/profile">Profile</a></li>
                                <%-- <li role="separator" class="divider"></li>
                                 <li><a href="#">Users</a></li>
                                 <li role="separator" class="divider"></li>
                                 <li><a href="#">Topics</a></li>
                                 <li role="separator" class="divider"></li>
                                 <li><a href="#">Posts</a></li>--%>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Logout</a></li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>


</header>
    <!--user-info-->
    <div class="col-md-4  col-lg-4 col-sm-12 col-xs-12">
        <div class="row">
            <div class="panel panel-default box">
                <div class="panel-body content">
                    <span><img src="/user/getPhoto" style="height: 80px;width: 80px"/></span>

                    <ul class="list-inline" style="margin-top:0px;">
                        <li class=""><span style="font-size:40px; font-color:black;"><strong>Uday Pratap Singh</strong></span></li><br />
                        <span style="color:lightgrey;">@uday</span>

                    </ul>



                    <ul class="list-inline">

                        <li class="" style="color:lightgrey;">Subscriptions</li>
                        <li class="" style="color:lightgrey;">Topics</li>
                    </ul>

                    <ul class="list-inline">



                        <li class=""><a>50</a></li>
                        <li style="margin-left:80px;"><a>30</a></li>

                    </ul>
                </div>
            </div>
        </div>


        <!--Register starts-->
        <div class="row" style="margin-top:2px;">
            <div class="panel panel-default box">
                <div class="panel-heading"><p>Subscription
                    <a href="" style="padding-left:178px;">View All</a>
                </div>
                <div class="panel-body content">
                    <!--
                        <div class="form-group changeFontSize">
                        </div>-->

                    <div class="postHeading" style="border-bottom: 2px solid black;">
                        <span class="glyphicon glyphicon-user pull-left" style="font-size:75px;"></span>

                        <ul class="list-inline">
                            <li class="" style="text-decoration:underline;"><a>Grails</a></li>

                        </ul>
                        <!--
                                       <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci lacus, finibus
                                           commodo nunc auctor vel. Quisque ac varius urna. </p>
                         -->

                        <ul class="list-inline">
                            <li style="color:lightgrey;">@uday</li>
                            <li class="pull-right" style="color:lightgrey;">Post</li>
                            <li class="pull-right" style="color:lightgrey;">Subscriptions</li>
                        </ul>

                        <ul class="list-inline">

                            <li class="" style="text-decoration:underline;"><a>Unsubscribe</a></li>
                            <li class="pull-right"><a>50</a></li>
                            <li class=""><a>30</a></li>

                        </ul>

                        <ul class="list-inline">
                            <div style="padding-bottom:1px;margin-left:30px;" class="dropdown changeFontSize">
                                <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu9" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">

                                    Serious
                                    <span class="caret"></span>
                                </button>
                                <!--

                                  <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu9">
                                    <li><a href="#">Profile</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Users</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Topics</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Posts</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                                <!--
                                </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                        <li role="presentation"><a role="menuitem" tabindex="1" href="#">1 Week</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="2" href="#">1 month</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="3" href="#">1 year</a></li>
                                    </ul>-->

                                <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu4" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">

                                    Private
                                    <span class="caret"></span>
                                </button>
                                <!--

                                  <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu4">
                                    <li><a href="#">Profile</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Users</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Topics</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Posts</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                                <!--
                                </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                        <li role="presentation"><a role="menuitem" tabindex="1" href="#">1 Week</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="2" href="#">1 month</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="3" href="#">1 year</a></li>
                                    </ul>-->
                                <i class="fa fa-envelope-o fa-fw fa-3x" style="padding-right:10px;padding-left:20px;"></i>
                                <i class="fa fa-file-o fa-3x" aria-hidden="true" style="padding-left:20px;"></i>
                                <i class="fa fa-trash fa-3x" aria-hidden="true" style="padding-left:20px;"></i>
                            </div>

                        </ul>
                    </div>

                    <div class="postHeading" style="padding-top:15px;">
                        <span class="glyphicon glyphicon-user pull-left" style="font-size:75px;"></span>

                        <ul class="list-inline">
                            <li class="" style="text-decoration:underline;"><a>Grails</a></li>

                        </ul>
                        <!--
                                       <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci lacus, finibus
                                           commodo nunc auctor vel. Quisque ac varius urna. </p>
                         -->

                        <ul class="list-inline">
                            <li style="color:lightgrey;">@uday</li>
                            <li class="pull-right" style="color:lightgrey;">Post</li>
                            <li class="pull-right" style="color:lightgrey;">Subscriptions</li>
                        </ul>

                        <ul class="list-inline">

                            <li class="" style="text-decoration:underline;"><a>Unsubscribe</a></li>
                            <li class="pull-right"><a>50</a></li>
                            <li class=""><a>30</a></li>

                        </ul>

                        <ul class="list-inline">
                            <div style="padding-bottom:1px;margin-left:30px;" class="dropdown pull-right changeFontSize">
                                <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">

                                    Serious
                                    <span class="caret"></span>
                                </button>
                                <!--

                                  <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                    <li><a href="#">Profile</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Users</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Topics</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Posts</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>
                                <!--
                                </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                        <li role="presentation"><a role="menuitem" tabindex="1" href="#">1 Week</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="2" href="#">1 month</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="3" href="#">1 year</a></li>
                                    </ul>-->


                                <!--
                                </button>
                                    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                        <li role="presentation"><a role="menuitem" tabindex="1" href="#">1 Week</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="2" href="#">1 month</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="3" href="#">1 year</a></li>
                                    </ul>-->
                                <i class="fa fa-envelope-o fa-fw fa-3x" style="padding-right:10px;padding-left:10px;"></i>

                            </div>

                        </ul>

                    </div>

                </div>

            </div>
        </div>

        <!-- Register ends-->

        <!--Trending topics starts-->
        <div class="row">
            <div class="panel panel-default box">
                <div class="panel-heading"><p>Trending Topics

                </div>
                <div class="panel-body content">
                    <!--
                        <div class="form-group changeFontSize">
                        </div>-->

                    <div class="postHeading" style="border-bottom: 2px solid black;">
                        <span class="glyphicon glyphicon-user pull-left" style="font-size:75px;"></span>

                        <ul class="list-inline">

                            <li class="" style="text-decoration:underline;"><a>Grails</a></li>

                        </ul>
                        <!--
                                       <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci lacus, finibus
                                           commodo nunc auctor vel. Quisque ac varius urna. </p>
                         -->

                        <ul class="list-inline">
                            <li style="color:lightgrey;">@uday</li>
                            <li class="pull-right" style="color:lightgrey;">Post</li>
                            <li class="pull-right" style="color:lightgrey;">Subscriptions</li>
                        </ul>

                        <ul class="list-inline">

                            <li class="" style="text-decoration:underline;"><a>Unsubscribe</a></li>
                            <li class="pull-right"><a>50</a></li>
                            <li class=""><a>30</a></li>

                        </ul>

                    </div>

                    <div class="postHeading" style="padding-top:15px;">
                        <span class="glyphicon glyphicon-user pull-left" style="font-size:75px;"></span>

                        <ul class="list-inline">

                            <input type="text" style="border:1px solid black; width:100px;" placeholder="Grails">
                            <button class="">Save</button>
                            <button class="">Cancel</button>

                        </ul>
                        <!--
                                       <p class="para">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur egestas orci lacus, finibus
                                           commodo nunc auctor vel. Quisque ac varius urna. </p>
                         -->

                        <ul class="list-inline">
                            <li style="color:lightgrey;">@uday</li>
                            <li class="pull-right" style="color:lightgrey;">Post</li>
                            <li class="pull-right" style="color:lightgrey;">Subscriptions</li>
                        </ul>

                        <ul class="list-inline">

                            <li class="" style="text-decoration:underline;"><a>Unsubscribe</a></li>
                            <li class="pull-right"><a>50</a></li>
                            <li class=""><a>30</a></li>

                        </ul>

                        <ul class="list-inline">
                            <div style="padding-bottom:1px;margin-left:30px;" class="dropdown pull-right changeFontSize">
                                <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">

                                    Serious
                                    <span class="caret"></span>
                                </button>
                                <!--

                                  <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                    <li><a href="#">Profile</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Users</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Topics</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Posts</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>

                                <button class="btn btn-default btn-sm dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">

                                    Private
                                    <span class="caret"></span>
                                </button>
                                <!--

                                  <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">-->

                                <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                    <li><a href="#">Profile</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Users</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Topics</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Posts</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Logout</a></li>
                                </ul>


                                <i class="fa fa-envelope-o fa-fw fa-3x" style="padding-right:10px;padding-left:10px;"></i>

                                <i class="fa fa-file-o fa-3x" aria-hidden="true" style="padding-left:20px;"></i>
                                <i class="fa fa-trash fa-3x" aria-hidden="true" style="padding-left:20px;"></i>
                            </div>

                        </ul>

                    </div>

                </div>

            </div>
        </div>
    </div>
    <!--Trending-topics-->

    <!--Recent Shares-->
    <div class="col-md-8 col-lg-8 col-sm-12 col-xs-12">
        <div class="row">
            <div class="panel panel-default box">
                <div class="panel-heading borderStyle">Inbox</div>
                <div class="panel-body content">


                    <c:if test="${not empty lists}">

                        <ul>
                            <c:forEach var="listValue" items="${lists}">
                                <div class="postHeading" style="padding-top:15px;">
                                    <span class="glyphicon glyphicon-user pull-left"></span>

                                    <ul class="list-inline">
                                        <li>${listValue.userName}</li>
                                        <li style="color:lightgray">@${listValue.userName}</li>
                                        <li class="pull-right" style="text-decoration:underline;"><a>${listValue.topicName}</a></li>
                                    </ul>

                                    <p class="para">${listValue.desc} </p>

                                    <ul class="list-inline para">
                                        <li><i class="fa fa-facebook-official" aria-hidden="true"></i></li>
                                        <li><i class="fa fa-tumblr" aria-hidden="true"></i></li>
                                        <li class="pull-right viewPost" style="text-decoration:underline;"><a>View full site</a></li>
                                        <li class="pull-right viewPost" style="text-decoration:underline;"><a>Mark as read</a></li>
                                            <%-- <li class="pull-right viewPost" style="text-decoration:underline;"><a>View Post</a></li>--%>
                                        <i class="fa fa-google-plus" aria-hidden="true"></i>
                                        (${listValue.doc})
                                        <c:if test="${listValue.doc}">
                                            <li class="pull-right viewPost" style="text-decoration:underline;"><a>Download</a></li>
                                        </c:if>
                                        <c:else>
                                            <li class="pull-right viewPost" style="text-decoration:underline;"><a>View Post</a></li>
                                        </c:else>


                                    </ul>
                                </div>
                            </c:forEach>
                        </ul>

                    </c:if>


        </div>



</div>
        </div>
    </div>
</div>


