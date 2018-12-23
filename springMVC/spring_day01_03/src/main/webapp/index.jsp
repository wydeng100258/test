<%--
  Created by IntelliJ IDEA.
  User: WYD
  Date: 2018/12/15
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
       /* $(function () {
            $("#button").click(function () {
                $.ajax({
                    type:'post',
                    url:'user/test8',
                    data:"id=1&username=刘德华",
                    success:function (data) {
                       alert(data.username+data.id)
                    },
                    error:function() {
                        alert("我错了")
                    }
                });
            })
        })*/
       $(function () {
           $("#button").click(function () {
               $.ajax({
                   type:'post',
                   url:'user/test9',
                   data:"id=5&username=张学友",
                   success:function (data) {
                       alert(data.length)
                   },
                   error:function () {
                       alert("我错了")
                   }
               })
           })
       })
    </script>
</head>
<body>

<h3><a href="user/test2?username=李四">test2</a></h3><br/>
<hr>
<h3><a href="user/test3?username=李四">test3</a></h3><br/>
<hr>
<h3><a href="user/test4?username=李四">test4</a></h3><br/>
<hr>
<h3><a href="user/test5?username=李四">test5</a></h3><br/>
<hr>
<h3><a href="user/test6?username=李四&id=3">test6</a></h3><br/>
<hr>
<h3><a href="user/test7?username=王五&id=6">test7</a></h3>
<input type="button" id="button" value="请点我">
</body>
</html>
