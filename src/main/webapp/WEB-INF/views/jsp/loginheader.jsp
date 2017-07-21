<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/21/2017
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>


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

                    <i id="topiclink" data-toggle="modal" data-target="#myModal" class="fa fa-comment fa-2x" aria-hidden="true" style="padding-right:10px;margin-top:17px;"></i>
                    <i  id="invitelink" data-toggle="modal" data-target="#myInviteModal" class="fa fa-envelope-o fa-fw" style="padding-right:10px;"></i>
                    <i id="urllink"data-toggle="modal" data-target="#myLinkModal" class="fa fa-link fa-2x" aria-hidden="true" style="padding-right:10px;"></i>
                    <i id="doclink" data-toggle="modal" data-target="#myDocModal"  class="fa fa-file-o fa-2x" aria-hidden="true" style="padding-right:50px;"></i>


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

