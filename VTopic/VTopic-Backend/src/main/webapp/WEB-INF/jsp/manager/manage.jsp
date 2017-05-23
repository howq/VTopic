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
                                <%--<span>毕业年级</span>--%>

                                <div class="controls">
                                    <div class="input-prepend input-group ">
                                        <div class="dropdown">
                                            <select id="myYear" class="dropdown-select"  style="cursor: pointer;line-height: 21px;">
                                            </select>
                                        </div>

                                        <span class="add-on input-group-addon" style="width: 34px;height: 32px;position: absolute;top: 1px;left: 149px;"><i class="glyphicon glyphicon-calendar fa fa-calendar"></i></span>
                                        <input type="text" readonly style="cursor: pointer;width: 200px;    position: absolute;width: 200px;top: 1px;left: 183px;height: 32px;" name="reservation" id="reservation" class="form-control" value="2017-2-21 - 2017-6-21" />
                                        <input type="text" name="recordbookid" id="recordbookid" class="hidden" value="" />

                                        <button type="button" onclick="saveData()" class="btn btn-primary btn-sm" style="margin-left: 2px;position: absolute;top: 2px;left: 390px;">
                                            <i class="fa fa-check"></i>Submit</button>
                                        <%--<button type="button" class="btn btn-success btn-sm" style="position: absolute;top: 2px;left: 470px;">--%>
                                            <%--<i class="fa fa-refresh fa-spin mg-r-xs"></i>Mixing</button>--%>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </form>

                    <script language="javascript" type="text/javascript">
                        window.onload=function(){//设置年份的选择
                            var myDate= new Date();
                            var startYear=myDate.getFullYear()-50;//起始年份
                            var endYear=myDate.getFullYear()+50;//结束年份
                            var obj=document.getElementById('myYear')
                            for (var i=startYear;i<=endYear;i++)
                            {
                                obj.options.add(new Option(i,i));
                            }
                            obj.options[obj.options.length-51].selected=1;
                        }
                    </script>
                    <script type="text/javascript">
                        $(document).ready(function() {
                            $('#reservation').daterangepicker(null, function(start, end, label) {
                                console.log(start.toISOString(), end.toISOString(), label);
                            });
                        });
                    </script>

                    <script type="text/javascript">
                        var page = {
                            type:0     //0表示添加 1表示修改
                        };

                        function resetDate() {
                            var arr = $("#reservation").val().split(' - ');
//                            $('#daterange').data('daterangepicker').setStartDate('2014-03-01');
//                            $('#daterange').data('daterangepicker').setEndDate('2014-03-31');
                            $('#reservation').daterangepicker(null, function(start, end, label) {
                                console.log(start.toISOString(), end.toISOString(), label);
                            });
                        }

                        function saveData() {
//                            alert($("#reservation").val());
//                            $("#reservation").val();
                            var arr = $("#reservation").val().split(' - ');

                            $.ajax({
                                url: "<%= request.getContextPath()%>/manage/changeRecordBook",
                                type: "POST",
                                data: {
                                    recordbookid: $("#recordbookid").val(),
                                    vyear: $("#myYear").val(),
                                    starttime:arr[0],
                                    endtime:arr[1],
                                    isUpdate:page.type
                                },
                                success: function (data) {
                                    if('SUCCESS'==data.code){
                                        alert("保存成功");
                                        $('#grid-news').datagrid('reload');
                                    }
                                    else if('ERROR'==data.code){
                                        alert('保存失败!');
                                    }
                                },
                                error: function(xhr){alert('动态页出错\n\n'+xhr.responseText);}///////////增加错误回调，看什么问题

                            });
                        }
                    </script>

                </div>


                <div class="well">
                    <table class="toolbar" id="actions" style="width:700px; margin-bottom: 10px">
                        <tr>
                            <td style="width:100%;">
                                <%--<a class="easyui-linkbutton" onclick="addNews()" data-options="iconCls:'icon-add'">增加</a>--%>
                                <a class="easyui-linkbutton" onclick="editNews()" data-options="iconCls:'icon-edit'">修改</a>
                                <a class="easyui-linkbutton" onclick="removeNews()" data-options="iconCls:'icon-remove'">删除</a>

                                <span style="margin-left: 20px;font-weight: bold">选择模式</span>
                                <select onchange="$('#grid-news').datagrid({singleSelect:(this.value==0)})" id="mode">
                                    <option value="0">单选</option>
                                    <option value="1">多选</option>
                                </select>
                            </td>
                        </tr>
                    </table>

                    <!--url:'admin.php?r=manage/news',-->

                    <table id="grid-news" title="文章编辑" class="easyui-datagrid" style="width: 530px" data-options="
               url:'/VTopic-backend/manage/recordBook',
               method:'get',
               singleSelect:true,
               collapsible:true,
               iconCls:'icon-edit',
			   pagination:true,
			   pageSize:10">
                        <thead>
                        <tr>
                            <th data-options="field:'ck',checkbox:true"></th>
                            <th data-options="field:'recordbookid',hidden:true"></th>
                            <th data-options="field:'vyear',width:100,align:'center'">开题年份</th>
                            <th data-options="field:'starttime',width:200,align:'center'">开始时间</th>
                            <th data-options="field:'endtime',width:200,align:'center '">截至时间</th>
                            <%--<th data-options="field:'managerid',width:100">编辑</th>--%>
                        </tr>
                        </thead>
                    </table>


                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript">
//    function addNews(){
//        window.open("<?=Url::toRoute(['manage/addnews'])?>");
//    }
    function editNews(){
        var data = $("#grid-news").datagrid('getSelected');
        $("#recordbookid").val(data.recordbookid);
        $("#myYear").val(data.vyear);
        var res = data.starttime +" - "+ data.endtime;
        $("#reservation").val(res);
        page.type = 1;
    }
    function removeNews(){
        var data = $("#grid-news").datagrid('getSelected');
        var index=$('#grid-news').datagrid('getRowIndex',data);
        $.ajax({
//            url:"<?//=Url::toRoute(['manage/remove_news'])?>//",
            url:"/VTopic-backend/manage/delRecordBook",
            type:'POST',
            data:{
                recordBookId:data.recordbookid
            },
            success: function (data) {
                if('SUCCESS'==data.code){
                    alert('删除成功!');
                    $('#grid-news').datagrid('deleteRow',index);
                }
                else if('ERROR'==data.code){
                    alert('删除失败!');
                }
            },
            error: function (data) {
//                alert("服务器内部出错，删除失败!");
                alert(data.error);
            }
        });
    }
    var check = {
        editId:null,
        isOkAlter:function(){
            if(1==$('#mode').val()){
                alert('修改仅限于单篇文章，请重新选择模式!');
                return false;
            }
            var row = $('#grid-news').datagrid('getSelected');
            if(null==row){
                alert('请选择修改文章!');
                return false;
            }
            else {
                this.editId = row.news_id;
                return true;
            }
        }
    };
</script>
<script type="text/javascript">
    (function($){
        function pagerFilter(data){
            if ($.isArray(data)){	// is array
                data = {
                    total: data.length,
                    list: data
                }
            }
            var target = this;
            var dg = $(target);
            var state = dg.data('datagrid');
            var opts = dg.datagrid('options');
            if (!state.allRows){
                state.allRows = (data.rows);
            }
            if (!opts.remoteSort && opts.sortName){
                var names = opts.sortName.split(',');
                var orders = opts.sortOrder.split(',');
                state.allRows.sort(function(r1,r2){
                    var r = 0;
                    for(var i=0; i<names.length; i++){
                        var sn = names[i];
                        var so = orders[i];
                        var col = $(target).datagrid('getColumnOption', sn);
                        var sortFunc = col.sorter || function(a,b){
                                return a==b ? 0 : (a>b?1:-1);
                            };
                        r = sortFunc(r1[sn], r2[sn]) * (so=='asc'?1:-1);
                        if (r != 0){
                            return r;
                        }
                    }
                    return r;
                });
            }
            var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
            var end = start + parseInt(opts.pageSize);
            data.rows = state.allRows.slice(start, end);
            return data;
        }
        var loadDataMethod = $.fn.datagrid.methods.loadData;
        var deleteRowMethod = $.fn.datagrid.methods.deleteRow;
        $.extend($.fn.datagrid.methods, {
            clientPaging: function(jq){
                return jq.each(function(){
                    var dg = $(this);
                    var state = dg.data('datagrid');
                    var opts = state.options;
                    opts.loadFilter = pagerFilter;
                    var onBeforeLoad = opts.onBeforeLoad;
                    opts.onBeforeLoad = function(param){
                        state.allRows = null;
                        return onBeforeLoad.call(this, param);
                    }
                    var pager = dg.datagrid('getPager');
                    pager.pagination({
                        onSelectPage:function(pageNum, pageSize){
                            opts.pageNumber = pageNum;
                            opts.pageSize = pageSize;
                            pager.pagination('refresh',{
                                pageNumber:pageNum,
                                pageSize:pageSize
                            });
                            dg.datagrid('loadData',state.allRows);
                        }
                    });
                    $(this).datagrid('loadData', state.data);
                    if (opts.url){
                        $(this).datagrid('reload');
                    }
                });
            },
            loadData: function(jq, data){
                jq.each(function(){
                    $(this).data('datagrid').allRows = null;
                });
                return loadDataMethod.call($.fn.datagrid.methods, jq, data);
            },
            deleteRow: function(jq, index){
                return jq.each(function(){
                    var row = $(this).datagrid('getRows')[index];
                    deleteRowMethod.call($.fn.datagrid.methods, $(this), index);
                    var state = $(this).data('datagrid');
                    if (state.options.loadFilter == pagerFilter){
                        for(var i=0; i<state.allRows.length; i++){
                            if (state.allRows[i] == row){
                                state.allRows.splice(i,1);
                                break;
                            }
                        }
                        $(this).datagrid('loadData', state.allRows);
                    }
                });
            },
            getAllRows: function(jq){
                return jq.data('datagrid').allRows;
            }
        })
    })(jQuery);
    function getData(){
        $.ajax({
            url: "/VTopic-backend/manage/recordBook",
            data: {},
            dataType: "json",
            type:"post",
            success: function(data){
                myData = data;
            },
            error:function(){
                alert("加载数据失败，请刷新重试!");
            }
        });
    }
    $(function(){
        $('#grid-news').datagrid().datagrid('clientPaging');
    });
</script>