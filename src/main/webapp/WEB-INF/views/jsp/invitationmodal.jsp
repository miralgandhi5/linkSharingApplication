<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/20/2017
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="modal fade" id="myInviteModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalInviteLabel">Send invitation</h4>
            </div>
            <form class="form-horizontal" method="post" action="/topic" >
                <div class="modal-body">


                    <div class="form-group changeFontSize">
                        <div class="row">

                            <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Email">Email*:</label>

                            <input type="email" class="col-sm-6 col-xs-6" id="Email" placeholder="abc@gmail.com" name="email">
                        </div>
                        <div class="row">
                            <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="topicList">Topic*:</label>

                            <select class="col-sm-6 col-xs-6"  id="topicList">
                                <option  selected="selected">Public</option>
                                <option>Private</option>
                            </select>
                        </div>

                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit"  id="invitebtn" class="btn btn-primary">Save</button>
                </div>
            </form>
        </div>
    </div>
</div>
