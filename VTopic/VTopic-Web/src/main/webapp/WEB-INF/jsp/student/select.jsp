<%--
  Created by IntelliJ IDEA.
  User: howq
  Date: 2017/3/16
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h3>选题页面</h3>
<div class="row" style="margin-top: 0px">
    <c:choose>
        <c:when test="${openstatus == 0}">
            <div class="col-lg-12">
                <div class="container">
                    <div class="span12">
                        <hr/>
                        <div class="well">
                            <div style="color: red"><span>尚未进入开题阶段，请等候通知</span>
                                <div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:when>
        <c:when test="${openstatus == 1}">
            <div class="col-lg-12">
                <div class="container">
                    <div class="span12">
                        <hr/>
                        <div class="well">

                            <form id="form" method="post" class="form-horizontal">
                                <fieldset>
                                    <div class="control-group">
                                        <div class="controls">
                                            <div class="input-prepend input-group ">
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">课题名称</label>
                                                    <div class="col-md-9">
                                                        <input type="text" name="topicid" id="topicid"
                                                               class="hidden"
                                                               value=""/>
                                                        <input type="text" name="topicid" id="teacher"
                                                               class="hidden"
                                                               value=""/>
                                                        <input type="text" class="form-control" id="topicname"
                                                               maxlength="40"
                                                               placeholder="课题名称" readonly="true">
                                                    </div>
                                                </div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">课题描述</label>
                                                    <div class="col-md-9">
                                            <textarea class="form-control" id="topiccoment" placeholder="课题描述"
                                                      maxlength="80" readonly="true"></textarea>
                                                    </div>
                                                </div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">类别</label>
                                                    <select id="categoryid" readonly="true"
                                                            class="easyui-combobox col-md-2"
                                                            data-options="url:'<%= request.getContextPath()%>/common/category',method:'get',required:false,textField:'categoryname',valueField:'categoryid'">
                                                    </select>
                                                </div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">限选专业</label>
                                                    <input id="majorid" readonly="true"
                                                           class="easyui-combobox col-md-2" name="major"
                                                           data-options="valueField:'majorid',textField:'tag_name',url:'<%= request.getContextPath()%>/common/major',method:'get',required:false,textField:'majorname',valueField:'majorid',multiple:true"/>
                                                </div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">限选人数</label>
                                                    <div class="col-md-1">
                                                        <input type="text" readonly="true" class="form-control"
                                                               id="limitnum" maxlength="40">
                                                    </div>
                                                </div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-2 control-label">学生</label>
                                                    <select id="student" class="easyui-combobox col-md-2"
                                                            data-options="url:'<%= request.getContextPath()%>/common/student',method:'get',required:false,textField:'username',valueField:'userid'">
                                                    </select>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>

                        </div>

                        <div class="well">
                            <table class="toolbar" id="actions" style="width:700px; margin-bottom: 10px">
                                <tr>
                                    <td style="width:100%;">
                                        <a class="easyui-linkbutton" onclick="onSubmit()"
                                           data-options="iconCls:'icon-add'">选题</a>
                                    </td>
                                </tr>
                            </table>
                            <table id="grid-news" title="课题列表" class="easyui-datagrid" style="width: 530px"
                                   data-options="
                   url:'<%= request.getContextPath()%>/common/topic',
                   method:'get',
                   singleSelect:true,
                   collapsible:true,
                   iconCls:'icon-edit',
                   pagination:true,
                   pageSize:10">
                                <thead>
                                <tr>
                                    <th data-options="field:'ck',checkbox:true"></th>
                                    <th data-options="field:'topicid',hidden:true"></th>
                                    <th data-options="field:'limitnum',hidden:true"></th>
                                    <th data-options="field:'teacher',hidden:true"></th>
                                    <th data-options="field:'majoeid',hidden:true"></th>
                                    <th data-options="field:'topicname',width:100,align:'center'">课题名称</th>
                                    <th data-options="field:'topiccoment',width:200,align:'center'">课题描述</th>
                                    <th data-options="field:'categoryid',width:200,align:'center ',hidden:true">
                                        类别id
                                    </th>
                                    <th data-options="field:'categoryname',width:200,align:'center '">类别</th>
                                </tr>
                                </thead>
                            </table>

                        </div>
                    </div>
                </div>
            </div>
        </c:when>
    </c:choose>

</div>

<script type="text/javascript">
    function onSubmit() {
        var major_id = $('#majorid').combobox('getValues');
        major = major_id.join(",");
        $.ajax({
            url: "<%= request.getContextPath()%>/common/selectTopic",
            type: "POST",
            data: {
                topicid: $("#topicid").val(),
                student: $('#student').combobox('getValue'),
                teacher: $("#teacher").val(),
                isUpdate: 0
            },
            success: function (data) {
                if ('SUCCESS' == data.code) {
                    alert("保存成功");
                    reset();
                    $('#grid-news').datagrid('reload');
                }
                else if ('ERROR' == data.code) {
                    alert('保存失败!');
                }
            },
            error: function (xhr) {
                alert('动态页出错\n\n' + xhr.responseText);
            }///////////增加错误回调，看什么问题

        });
    }
    function editNews() {
        var data = $("#grid-news").datagrid('getSelected');
        var major = data.majoeid.split(',');
        $("#topicid").val(data.topicid);
        $("#teacher").val(data.teacher);
        $("#topicname").val(data.topicname);
        $("#topiccoment").val(data.topiccoment);
        $("#limitnum").val(data.limitnum);
        $('#categoryid').combobox('select', data.categoryid);
        $('#majorid').combobox('setValues', major);
//        page.type = 1;
    }

    (function ($) {
        function pagerFilter(data) {
            if ($.isArray(data)) {	// is array
                data = {
                    total: data.length,
                    list: data
                }
            }
            var target = this;
            var dg = $(target);
            var state = dg.data('datagrid');
            var opts = dg.datagrid('options');
            if (!state.allRows) {
                state.allRows = (data.rows);
            }
            if (!opts.remoteSort && opts.sortName) {
                var names = opts.sortName.split(',');
                var orders = opts.sortOrder.split(',');
                state.allRows.sort(function (r1, r2) {
                    var r = 0;
                    for (var i = 0; i < names.length; i++) {
                        var sn = names[i];
                        var so = orders[i];
                        var col = $(target).datagrid('getColumnOption', sn);
                        var sortFunc = col.sorter || function (a, b) {
                                return a == b ? 0 : (a > b ? 1 : -1);
                            };
                        r = sortFunc(r1[sn], r2[sn]) * (so == 'asc' ? 1 : -1);
                        if (r != 0) {
                            return r;
                        }
                    }
                    return r;
                });
            }
            var start = (opts.pageNumber - 1) * parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = state.allRows.slice(start, end);
            return data;
        }

        var loadDataMethod = $.fn.datagrid.methods.loadData;
        var deleteRowMethod = $.fn.datagrid.methods.deleteRow;
        $.extend($.fn.datagrid.methods, {
            clientPaging: function (jq) {
                return jq.each(function () {
                    var dg = $(this);
                    var state = dg.data('datagrid');
                    var opts = state.options;
                    opts.loadFilter = pagerFilter;
                    var onBeforeLoad = opts.onBeforeLoad;
                    opts.onBeforeLoad = function (param) {
                        state.allRows = null;
                        return onBeforeLoad.call(this, param);
                    }
                    var pager = dg.datagrid('getPager');
                    pager.pagination({
                        onSelectPage: function (pageNum, pageSize) {
                            opts.pageNumber = pageNum;
                            opts.pageSize = pageSize;
                            pager.pagination('refresh', {
                                pageNumber: pageNum,
                                pageSize: pageSize
                            });
                            dg.datagrid('loadData', state.allRows);
                        }
                    });
                    $(this).datagrid('loadData', state.data);
                    if (opts.url) {
                        $(this).datagrid('reload');
                    }
                });
            },
            loadData: function (jq, data) {
                jq.each(function () {
                    $(this).data('datagrid').allRows = null;
                });
                return loadDataMethod.call($.fn.datagrid.methods, jq, data);
            },
            deleteRow: function (jq, index) {
                return jq.each(function () {
                    var row = $(this).datagrid('getRows')[index];
                    deleteRowMethod.call($.fn.datagrid.methods, $(this), index);
                    var state = $(this).data('datagrid');
                    if (state.options.loadFilter == pagerFilter) {
                        for (var i = 0; i < state.allRows.length; i++) {
                            if (state.allRows[i] == row) {
                                state.allRows.splice(i, 1);
                                break;
                            }
                        }
                        $(this).datagrid('loadData', state.allRows);
                    }
                });
            },
            getAllRows: function (jq) {
                return jq.data('datagrid').allRows;
            }
        })
    })(jQuery);
    function getData() {
        $.ajax({
            url: "<%= request.getContextPath()%>/common/topic",
            data: {},
            dataType: "json",
            type: "post",
            success: function (data) {
                myData = data;
            },
            error: function () {
                alert("加载数据失败，请刷新重试!");
            }
        });
    }
    $(function () {
        $('#grid-news').datagrid().datagrid('clientPaging');
    });
    $('#grid-news').datagrid({singleSelect: 1});
    $('#grid-news').datagrid({
        onClickRow: function (index, row) {  //easyui封装好的时间（被单机行的索引，被单击行的值）
            editNews();
        }

    });
</script>