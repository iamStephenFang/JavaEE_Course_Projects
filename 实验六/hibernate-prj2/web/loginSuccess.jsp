<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>登录成功</title>
</head>
<body>
<s:property value="#request.tip"/>
<p>修改个人信息<p>
  <s:form action="update" method="post">
      <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
      <s:textfield name="loginUser.account" label="用户名不能修改" value="%{#request.loginUser.account}" readonly="true"/>
      <s:textfield type="loginUser.password" name="loginUser.password" label="修改密码" value="%{#request.loginUser.password}"/>
      <s:textfield name="loginUser.name" label="修改姓名" value="%{#request.loginUser.name}"/>
      <s:textfield name="loginUser.phone" label="修改电话号码" value="%{#request.loginUser.phone}"/>
      <s:textfield name="loginUser.fax" label="修改传真地址" value="%{#request.loginUser.fax}"/>
      <s:textfield name="loginUser.email" label="修改邮件地址" value="%{#request.loginUser.email}"/>
      <s:textfield name="loginUser.address" label="修改地址" value="%{#request.loginUser.address}"/>
      <s:submit value="修改"/>
  </s:form>

  <s:form action="delete" method="post">
    <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
    <s:submit value="删除"/>
  </s:form>
    <a href="./findItems">查看商品信息</a>
</body>
</html>
