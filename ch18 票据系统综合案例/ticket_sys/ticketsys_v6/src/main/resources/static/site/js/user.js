////////////////////////////////////////BootStrapTable的数据显示部分////////////////////////////////////////////////////////////////
//获取table对象
var table = $('#table');
var dstUrl = '/admin/user';//定义目的url
//将返回的json数据调整为表格所需的数据格式, bootstrap table渲染数据格式{total:xx,rows:[]}
// res为服务器返回的数据
function responseHandler(res) {
    console.log(res)
    var datas = [];
    datas.push({total: res.data.total, rows: res.data.list});
    return datas[0];
}

//动态生成操作区域的的按钮
// row.id为每行数据的主键
function opFormatter(value, row, index) {
    var actions = [];
    actions.push('<a class="btn btn-success btn-sm" href="javascript:void(0)" onclick="view(\'' + row.id + '\')"><i class="fa fa-user"></i> 详情</a> ');
    actions.push('<a class="btn btn-primary btn-sm" href="javascript:void(0)" onclick="edit(\'' + row.id + '\')"><i class="fa fa-edit"></i> 编辑</a> ');
    actions.push('<a class="btn btn-warning btn-sm " href="javascript:void(0)" onclick="remove(\'' + row.id + '\')"><i class="fa fa-remove"></i> 删除</a>');
    // actions.push(' <a class="btn btn-info btn-sm " href="javascript:void(0)" onclick="resetPwd(\'' + row.id + '\')"><i class="fa fa-user-secret"></i> 重置密码</a>');
    return actions.join('');
}

// 显示当前记录的index索引
function idSeqFormatter(value, row, index) {
    //获取当前页面大小以及当前页面
    var options = $('#table').bootstrapTable('getOptions');
    // 返回每条的序号： 每页条数 *（当前页 - 1 ）+ 序号
    return options.pageSize * (options.pageNumber - 1) + index + 1;
}

//定义表格列与json数据字段的对应关系
var columns = [{
    checkbox: true               //复选框
},
    {
        title: '序号',
        formatter: idSeqFormatter
    },
    {
        field: 'username',
        title: '用户名',
        sortable: true

    },
    {
        field: 'email',
        title: 'Email地址',
        sortable: true,
    },
    {
        field: 'registerIp',
        title: '注册IP',
        sortable: true,
        formatter: function (value, row, index) { //格式化输出
            return (row.registerIp == null) ? '无' : row.registerIp;
        }
    },
    {
        field: 'createTime',
        title: '注册时间',
        sortable: true,
    },
    {
        field: 'enable',
        title: '状态',
        sortable: true,
        formatter: function (value, row, index) { //格式化输出
            return (row.enable == '1') ? '已激活' : '未激活';
        }
    },
    {
        title: '操作',
        align: 'center',
        formatter: opFormatter
    }
];

//和后台交互的查询参数对象，该参数将传递到后台控制器，包括分页参数、排序以及查询等
function queryParams(params) {

    return queryParams;
}

//定义表格属性
var options = {
    height: 670,    //表格高度
    pagination: true,  // 启动分页
    sortable: true,   //启动排序
    sortStable: true,
    pageList: "[10, 20, 50, All]",  //每页显示的数量
    pageSize: 10,    //默认每页的记录数
    striped: true,   //间隔显示颜色
    url: "/admin/user/list",  //获取分页数据的后台接口
    // methods:'get',                       //请求方法
    responseHandler: responseHandler,  //将服务器返回数据转换为bootstrap-table的数据格式
    sidePagination: 'server',  //服务器分页则修改为server
    clickToSelect: true,     //单击行进行选择
    // multipleSelectRow: true,   //允许多选
    pageNumber: 1,            //默认页面为第一页
    queryParams: queryParams,  //与服务器交互的查询参数
    // theadClasses: 'thead-light', //设置表头样式，thead-light,thead-dark,''
    columns: columns           //设置每列的字段内容
};
/**
 *   初始化表格
 */
$(function () {
    //定义表格的相关属性
    table.bootstrapTable('destroy').bootstrapTable(options);
});
//////////////////////////////数据对象的常用操作：添加、详情、编辑、更新、删除等////////////////////////////////////////////
// 表单输入框数据校验
function validateForm(formId) {
    if ($(formId)[0].checkValidity() === false) {
        $(formId).addClass("was-validated")
        return false;
    }
    return true;
}

//提交用户信息，添加用户
function addUser() {
    // 获取 CSRF Token
    var csrfToken = $("meta[name='_csrf']").attr("content");
    var csrfHeader = $("meta[name='_csrf_header']").attr("content");
    //提交前的数据校验
    if (validateForm("#addUserForm") == false) return;
    var formValues = $("#addUserForm").serialize(); //序列化表单数据
    console.log(formValues);
    $.ajax({
     
    });
}

//获取用户信息，显示用户信息编辑界面
function edit(id) {
    $.ajax({
        url: "/admin/user/edit/" + id,
        success: function (res) {
            //如果数据返回正确,加载数据到Modal框
            $('#editUserContainer').html(res);
            $('#editUserModal').modal('show');
        },
        error: function () {
            alert("ajax请求失败")
        }
    })
}

//更新用户数据
function updateUser() {
    // 获取 CSRF Token
    var csrfToken = $("meta[name='_csrf']").attr("content");
    var csrfHeader = $("meta[name='_csrf_header']").attr("content");
    //提交前的数据校验
    if (validateForm("#editUserForm") == false) return;
    var formValues = $("#editUserForm").serialize(); //序列化表单数据
    console.log(formValues);
    $.ajax({
        method: 'PUT',  //提交的方法为PUT
        url: dstUrl, //后台接收数据的URL路径
        data: formValues,
        beforeSend: function (request) {
            request.setRequestHeader(csrfHeader, csrfToken); // 添加  CSRF Token
        },
        success: function (res) {         //ajax成功后执行
            if (res.code == "200") {
                $('#editUserModal').modal('hide'); //隐藏票据对话框
                toastr.success("用户信息更新成功!");
                table.bootstrapTable('refresh'); //刷新表格
            }
        },
        error: function () {   // ajax请求失败
            alert("ajax请求执行失败!");
        }
    });
}

//重置用户密码
function resetPwd(id) {
    // 获取 CSRF Token
    var csrfToken = $("meta[name='_csrf']").attr("content");
    var csrfHeader = $("meta[name='_csrf_header']").attr("content");
    //发送Ajax请求
    $.ajax({
        method: 'POST',  //提交的方法为PUT
        url: dstUrl + "/resetPassword/" + id, //后台接收数据的URL路径
        beforeSend: function (request) {
            request.setRequestHeader(csrfHeader, csrfToken); // 添加  CSRF Token
        },
        success: function (res) {         //ajax成功后执行
            if (res.code == "200") {
                toastr.success("新密码已经发送到用户指定Email邮箱!");
            }
        },
        error: function () {   // ajax请求失败
            alert("ajax请求执行失败!");
        }
    });
}


//查看用户详细信息
function view(id) {
    //通过ajax获取数据
    $.ajax({
        url: "/admin/user/" + id,
        success: function (res) {
            //如果数据返回正确,加载数据到Modal框
            $('#viewUserContainer').html(res);
            $('#viewUserModal').modal('show');
        },
        error: function () {
            alert("ajax请求失败")
        }
    })
}


//删除用户
function remove(id) {
    if (confirm("确定删除该记录吗？")) {
        // 获取 CSRF Token
        var csrfToken = $("meta[name='_csrf']").attr("content");
        var csrfHeader = $("meta[name='_csrf_header']").attr("content");
        //通过ajax获取数据
        $.ajax({
            method: 'DELETE',
            url: "/admin/user/" + id,
            beforeSend: function (request) {
                request.setRequestHeader(csrfHeader, csrfToken); // 添加  CSRF Token
            },
            success: function (res) {
                if (res.code == '200') {
                    toastr.success("用户删除成功!");
                    table.bootstrapTable('refresh'); //刷新表格
                } else {
                    toastr.error("用户删除失败!失败消息:" + res.message);
                }
            },
            error: function () {
                alert("ajax请求失败")
            }
        })
    }
}

/**
 * 用户搜索
 * @returns {boolean}
 */
function searchUser() {
    //刷新表格数据
}

/**
 * 清除搜索结果，重新加载表格数据
 */
function clearResult() {
    //清空搜索表单
    document.getElementById('userSearchForm').reset();
    table.bootstrapTable('destroy').bootstrapTable(options);
}


/**
 * 获取多选记录的id，返回数组
 */
function getSelectionIds() {
 
}

/**
 * 判断
 * @param ids
 * @returns {boolean}
 */
function validateSelections(ids) {
    if (ids.length == 0) {
        alert("请先选择记录!");
        return false;
    } else {
        return true;
    }
}

/**
 * 批量操作函数的封装
 * @opType 操作类型：active-激活；deactive-停用；delete-删除；resetPassword-重置密码
 */
function batchOps(opType) {
    
}


//取消所有选择项
function unChecked() {
    table.bootstrapTable('uncheckAll');
}


