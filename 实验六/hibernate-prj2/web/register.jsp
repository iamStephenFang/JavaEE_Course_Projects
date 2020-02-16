<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
  <s:head theme="xhtml"/>
  <sx:head parseContent="true" extraLocales="UTF-8"/>
</head>
<body>
<s:form action="register" method="post" >
  <s:textfield name="loginUser.account" label="请输入用户名："/>
  <s:password name="loginUser.password"  label="请输入密码："/>
  <s:textfield name="loginUser.name"  label="请输入姓名："/>
  <s:radio name="loginUser.sex" list="#{1 : '男', 0 : '女'}"  label="请输入性别："/>
  <sx:datetimepicker name="loginUser.birthday" displayFormat="yyyy-MM-dd"  label="请输入生日："/>
  <s:textfield name="loginUser.address"  label="请输入联系地址："/>
  <s:textfield name="loginUser.phone"  label="请输入电话号码："/>
  <s:textfield name="loginUser.email"  label="请输入电子邮件地址："/>
  <s:textfield name="loginUser.fax"  label="请输入传真地址："/>
  <s:textfield name="loginUser.zipcode"  label="请输入邮编："/>
  <s:submit name="submit" value="提交"/>
  <s:reset name="reset" value="重置"/>
</s:form>
</body>
</html>
