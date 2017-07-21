<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/20/2017
  Time: 6:16 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="modal fade" id="myDocModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalDocLabel">Create Document</h4>

                <form  id=docForm action="/resource/createdocresource" method="post" enctype="multipart/form-data">
                    <div class="modal-body">


                        <div class="form-group changeFontSize">
                            <div class="row">

                                <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="file">Document*:</label>

                                <input type="file" id="file" name="file"/>

                            </div>
                            <div class="row">

                                <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="des">Description*:</label>

                                <input type="text" class="col-sm-6 col-xs-6" id="des" placeholder="Description" name="des">
                            </div>
                            <div class="row">
                                <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Topics">Topic*:</label>

                                <select class="col-sm-6 col-xs-6 topicList" name="Topics" id="Topics">
                                </select>
                            </div>

                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit"  id="adddocbtn" class="btn btn-primary">Save</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>