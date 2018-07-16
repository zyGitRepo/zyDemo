<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
    <h1>我是${name}</h1>

    <label for="in">姓名</label>
    <input id="in" value="${name}" />

    <div class="row">
        <div class="span4">4</div>
        <div class="span8">8</div>
    </div>

    <!-- 标准的按钮 -->
    <button type="button" class="btn btn-default" onclick="clickbb()">默认按钮</button>
    <!-- 提供额外的视觉效果，标识一组按钮中的原始动作 -->
    <button type="button" class="btn btn-primary">原始按钮</button>
    <!-- 表示一个成功的或积极的动作 -->
    <button type="button" class="btn btn-success">成功按钮</button>
    <!-- 信息警告消息的上下文按钮 -->
    <button type="button" class="btn btn-info">信息按钮</button>
    <!-- 表示应谨慎采取的动作 -->
    <button type="button" class="btn btn-warning">警告按钮</button>
    <!-- 表示一个危险的或潜在的负面动作 -->
    <button type="button" class="btn btn-danger">危险按钮</button>
    <!-- 并不强调是一个按钮，看起来像一个链接，但同时保持按钮的行为 -->
    <button type="button" class="btn btn-link">链接按钮</button>

    <script type="text/javascript">
        /*$(function () {
            $("#in").css("background-color",'gray');
        });*/

        /*$(document).ready(function(){
            $("#in").css("background-color",'gray');
        });*/

        //以上两个方法作用相同

        function clickbb () {
            $('#in').val("章鱼");
        }


    </script>
</body>
</html>