<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        <table>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="uname" /></td>
            </tr>
            <tr>
                <td>密&nbsp;&nbsp;码：</td>
                <td><input type="password" name="pwd" /></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="提交" /></td>
            </tr>
        </table>
    </form>
</body>
</html>
