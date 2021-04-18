<!DOCTYPE html>
<html>
<head>
    <script src="../../../static/js/jquery-3.6.0.js"></script>
    <script src="../../../static/js/jquery.serializejson.js"></script>
    <meta charset="UTF-8">
    <title>欢迎使用OAuth2 Demo</title>
</head>

<style type="text/css">
.txt{
    margin-left: 100px;
    margin-top: 10px;
}

.login{
    margin-left: 200px;
}
</style>
<body>
<div class="login">
    <h2>欢迎使用OAuth2 Demo</h2>
    <form id="loginForm">
        <div class="txt">用户名：<input type="text" class="userName"/></div><br>
        <div class="txt">密 码：<input type="password" class="password"/></div><br>
        <div style="margin-left: 200px;">
            <input type="button" value="使用github登录" id="gitLogin" />
        </div>
    </form>

    <div id="result">

    </div>
</div>
</body>
<script>
    $(function(){
        $("#gitLogin").click(function (){
            var json=$("#loginForm").serializeJSON();
            var jsonString = JSON.stringify(json);;
            $.ajax({
                    contentType: "application/json; charset=utf-8",
                    type:"post",
                    url:"loginWithGithub",
                    data:jsonString,
                    success:function(data){
                        alert("success!!!");
                    },
                    error:function(e){
                        alert("error!!!");
                    },
                }
            )
        });
    });
</script>
</html>
