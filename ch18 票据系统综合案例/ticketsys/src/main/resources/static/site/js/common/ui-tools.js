////////////////////////////////////////BootStrapTable的数据显示部分////////////////////////////////////////////////////////////////

// 显示当前记录的index索引
function serialNumber(value, row, index) {
    //获取当前页面大小以及当前页面
    var options = this.bootstrapTable('getOptions');
    // 返回每条的序号： 每页条数 *（当前页 - 1 ）+ 序号
    return options.pageSize * (options.pageNumber - 1) + index + 1;
}

// //初始化表格
// init: function (tableId, tableOptions) {
//     var options = $.extend(this.defaults, tableOptions);
//     console.log(tableId);
//     $(tableId).bootstrapTable(options);
// },

//初始化表格
function getOptions(options) {
    var options = $.extend(table_config, options);
    return options;
}


// 基于bootstrap实现表达数据校验
function validateForm(formId) {
    if ($(formId)[0].checkValidity() === false) {
        $(formId).addClass("was-validated")
        return false;
    }
    return true;
}


