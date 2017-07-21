<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/20/2017
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="modal fade" id="myLinkModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLinkLabel">Create LinkResource</h4>
            </div>

            <div class="modal-body">


                <div class="form-group changeFontSize">
                    <div class="row">

                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Link">Link*:</label>

                        <input type="text" class="col-sm-6 col-xs-6" id="Link" placeholder="link" name="link">
                    </div>
                    <div class="row">

                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Description">Description*:</label>

                        <input type="text" class="col-sm-6 col-xs-6" id="Description" placeholder="Description" name="description">
                    </div>
                    <div class="row">
                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Topic">Topic*:</label>

                        <select class="col-sm-6 col-xs-6 topicList" id="Topic">
                        </select>
                    </div>

                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="submit"  id="addLink" class="btn btn-primary">Save</button>
            </div>

        </div>
    </div>
</div>