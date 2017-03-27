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
        <small>Drag and Drop</small>
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
        <p>
            <strong>Serialised Output (per list)</strong>
        </p>
        <pre id="nestable-output">[{"id":1},{"id":2,"children":[{"id":3,"children":[{"id":4}]},{"id":5}]},{"id":6}]</pre>
        <pre id="nestable2-output">[{"id":7},{"id":8},{"id":9,"children":[{"id":10},{"id":17},{"id":12}]}]</pre>
    </div>
</div>
