<%--
  Created by IntelliJ IDEA.
  User: miral
  Date: 7/20/2017
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Create Topic</h4>
            </div>

            <div class="modal-body">


                <div class="form-group changeFontSize">
                    <div class="row">

                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="Name">Name*:</label>

                        <input type="text" class="col-sm-6 col-xs-6" id="Name" placeholder="Name" name="Name">
                    </div>
                    <div class="row">
                        <label class="control-label  col-sm-4 col-xs-4 changeFontSizes" for="visible">Visibility*:</label>

                        <select class="col-sm-6 col-xs-6"  id="visible" name="visible">
                            <option value="Public"  selected="selected">Public</option>
                            <option value="Private">Private</option>
                        </select>
                    </div>

                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="submit"  id="addTopic" class="btn btn-primary">Save</button>
            </div>

        </div>
    </div>
</div>
