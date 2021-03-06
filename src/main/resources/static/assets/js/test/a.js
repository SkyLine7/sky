

function uploadFile(obj){
    console.log(obj);
    let file = obj.files[0];
    let suffix = file.name;
    if(suffix.lastIndexOf("xls") == -1 && suffix.lastIndexOf("xlsx") == -1){
        DialogHelper.Fail("格式不对");
        return;
    }

    let formData = new FormData();
    formData.append("file",file);
    $.ajax({
        url: "/xlsx/outputXlxs.json?&rdm=" + Math.random(),
        type: 'POST',
        cache: false,
        data: formData,
        async: true,
        dataType: 'JSON',
        processData: false,  //必须为false
        contentType: false,
        beforeSend: function(){},
        success: function (res,status,xhr){
            window.console.log(res);
        },
        error: function (res) {
            console.log(res);
            $.DialogHelper.Fail(res.responseJSON.msg);
        }
    });
}

var E = window.wangEditor;
var editor = new E('#editor');
//开启debug模式
editor.customConfig.debug = location.href.indexOf('wangeditor_debug_mode=1') > 0;
// 配置onchange函数
editor.customConfig.onchange = function (html) {
    // html：变化之后的内容
    console.log(html);
};

//配置 onfocus 事件
editor.customConfig.onfocus = function () {
    console.log("onfocus");
};

// 配置 onblur 事件
editor.customConfig.onblur = function (html) {
    // html 即编辑器中的内容
    console.log('onblur', html);
};
// 上传图片到服务器
// editor.customConfig.uploadImgServer = '/upload';

// 自定义 onchange 触发的延迟时间，默认为 200 ms
editor.customConfig.onchangeTimeout = 1000 // 单位 ms
// 关闭粘贴样式的过滤
editor.customConfig.pasteFilterStyle = false
// 忽略粘贴内容中的图片
editor.customConfig.pasteIgnoreImg = true
// 自定义处理粘贴的文本内容
editor.customConfig.pasteTextHandle = function (content) {
    // content 即粘贴过来的内容（html 或 纯文本），可进行自定义处理然后返回
    return content + '<p>在粘贴内容后面追加一行</p>'
}
//生成编辑器
editor.create();

//手动修改html 调用change事件
document.getElementById('btn1').addEventListener('click', function () {
    // 如果未配置 editor.customConfig.onchange，则 editor.change 为 undefined
    editor.change && editor.change()
});


document.getElementById("submit").addEventListener("click",sendToRemote,false);


function sendToRemote() {
    let formData = new FormData();
    //读取html,包含标签
    let content = editor.txt.html();
    formData.append("jsonData",content);

    $.ajax({
        url: "/xlsx/getJsonData?&rdm=" + Math.random(),
        type: 'POST',
        cache: false,
        data: formData,
        async: true,
        dataType: 'JSON',
        processData: false,  //必须为false
        contentType: false,
        beforeSend: function(){},
        success: function (res,status,xhr){
            window.console.log(res);
        },
        error: function (res) {
            console.log(res);
            $.DialogHelper.Fail(res.responseJSON.msg);
        }
    });
}


function toDownloadWord(obj){
    let content =  '<h3 style="text-align: center;">中标通知书</h3> <p>致 <label><b>所说的发公司:</b></label></p>';
        content += '<p>经过<b>斯科拉广告</b>招标小组的认真评审，确定贵公司为<b>斯诺克的感觉项目</b>的中标人，主要中标条件如下：</p>';
        content += '<ul style="list-style-type: none;">';
        content += '    <li>中标价：人民币(大写)<b>777</b>元整（小写）#：<b>999</b>元。</li>';
        content += '</ul>';
        content += '<h4 style="text-align: right;">';
        content += '上海项目部：张山';
        content += '</h4>';
    window.location.href = "/document/downloadDocx.html?jsonData="+content;
}


function toDownloadWordx(obj){
    let content =  '<h3 style="text-align: center;">中标通知书</h3> <p>致 <label><b>所说的发公司:</b></label></p>';
    content += '<p>经过<b>斯科拉广告</b>招标小组的认真评审，确定贵公司为<b>斯诺克的感觉项目</b>的中标人，主要中标条件如下：</p>';
    content += '<ul style="list-style-type: none;">';
    content += '    <li>中标价：人民币(大写)<b>777</b>元整（小写）#：<b>999</b>元。</li>';
    content += '</ul>';
    content += '<h4 style="text-align: right;">';
    content += '上海项目部：张山';
    content += '</h4>';
    window.location.href = "/document/downloadDocxx.html?jsonData="+content;

}