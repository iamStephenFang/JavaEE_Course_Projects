<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=GBK">
  <title>注册成功</title></head>
<body>
<!-- 数据标签 property -->
<s:property value="loginUser.name"/>
<!-- 控制标签 if/else -->
<s:if test="%{loginUser.sex==\"1\"}">
  <s:text name="先生, "/>
</s:if>
<s:else>
  <s:text name="女士,"/>
</s:else>
您注册成功了！
<!-- 数据标签 set -->
<s:set value="loginUser" scope="session"  var="user"/>
</body>
</html>
