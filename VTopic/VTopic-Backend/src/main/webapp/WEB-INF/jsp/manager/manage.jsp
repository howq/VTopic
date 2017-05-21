<%--
  Created by IntelliJ IDEA.
  User: howq
  Date: 2017/3/16
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row mg-b">
    <div class="col-xs-6">
        <h4 class="no-margin">开题页面</h4>
        <%--<small>Drag and Drop</small>--%>
    </div>
    <div class="col-xs-6 text-right">
        <div id="nestable-menu" class="btn-group">
            <button class="btn btn-white btn-sm" type="button" data-action="expand-all">Expand All</button>
            <button class="btn btn-white btn-sm" type="button" data-action="collapse-all">Collapse All</button>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="container">
            <div class="span12">

                <hr />

                <h4>Basic Date Range Picker</h4>
                <div class="well">

                    <form class="form-horizontal">
                        <fieldset>
                            <div class="control-group">
                                <div class="controls">
                                    <div class="input-prepend input-group">
                                        <span class="add-on input-group-addon"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                        <input type="text" readonly style="width: 200px" name="reservation" id="reservation" class="form-control" value="2014-5-21 - 2014-6-21" />
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </form>

                    <script type="text/javascript">
                        $(document).ready(function() {
                            $('#reservation').daterangepicker(null, function(start, end, label) {
                                console.log(start.toISOString(), end.toISOString(), label);
                            });
                        });
                    </script>

                </div>

            </div>
        </div>
    </div>
</div>
