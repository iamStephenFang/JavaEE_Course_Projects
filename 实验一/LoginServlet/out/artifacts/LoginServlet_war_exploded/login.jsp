<%--
  Created by IntelliJ IDEA.
  User: stephenfang
  Date: 2019/9/25
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=GBK">
  <title>�û���¼ҳ��</title>
</head>
<body>

<script type="text/javascript">
    function check() {
        var username = document.getElementById("username");
        var password = document.getElementById("password");
        if (username.value.length > 6 || password.value.length > 6) {
            alert("�û��������벻�ó���6λ��");
            return false;
        } else if (username.value == "" || password.value == "") {
            alert("�û��������벻��Ϊ��");
            return false;
        } else return true;
    }</script>

<font color=red>${result}</font>

<form action="login" method="post" onSubmit="return check()">
  <table>
    <tr>
      <td>�������û���:</td>
      <td><input name="username" id="username" type="text"></td>
    </tr>
    <tr>
      <td>����������:</td>
      <td><input name="password" id = "password" type="password"></td>
    </tr>
    <tr>
      <td>��ѡ���û�����:</td>
      <td>
        <select name="type" id="type">
        <option value ="1">��ͨ�û�</option>
        <option value ="2">����Ա</option>
        </select>
      </td>
    </tr>
    <tr>
      <td><input type="submit" value="��¼"></td>
    </tr>
  </table>
</form>
</body>
</html>



