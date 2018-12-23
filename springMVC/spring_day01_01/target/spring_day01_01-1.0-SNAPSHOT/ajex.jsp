<%--
  Created by IntelliJ IDEA.
  User: WYD
  Date: 2018/12/15
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#butt").click(function () {
              $.ajax({
                  type:'post',
                  url:"user/save",
                  data:"id=1&username=小李",
                  success:function (data) {
                      alert("ok  "+data.length);
                  },
                  error:function () {
                      alert("error");
                  }
              })
            })
        })
    </script>
</head>
<body>
<input type="button" id="butt" value="test">
</body>
</html>
