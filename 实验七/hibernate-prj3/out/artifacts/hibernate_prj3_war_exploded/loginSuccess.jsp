<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>个人信息</title>
</head>
<body>
<table>
  <tr>
    <td>个人信息：<p></td>
  </tr>
  <tr>
    <td>用户名：</td>
    <td><s:property value="#request.loginUser.account"/></td>
  </tr>
  <tr>
    <td>Email：</td>
    <td><s:property value="#request.loginUser.email"/></td>
  </tr>
  <tr>
    <td>姓名：</td>
    <td><s:property value="#request.loginUser.name"/></td>
  </tr>
<s:if test="#request.loginUser.address">
<%--  <s:iterator value="#request.loginUser.addresses" status="st">--%>
  <s:form action="delAddr" method="post">
  <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
<%--  <s:hidden name="address.addressId" value="%{addressId}"/>--%>
<%--  <tr>--%>
<%--    <td>地址<s:property value="#st.count"/>：</td>--%>
<%--  <tr>--%>
  <tr>
    <td>详细地址：</td>
    <td><s:property value="#request.loginUser.address.detail"/></td>
  <tr>
  <tr>
    <td>邮政编码：</td>
    <td><s:property value="#request.loginUser.address.zipcode"/></td>
  <tr>
  <tr>
    <td>联系电话：</td>
    <td><s:property value="#request.loginUser.address.phone"/></td>
  <tr>
  <tr>
    <td>地址类型：</td>
    <td><s:property value="#request.loginUser.address.type"/></td>
  <tr>
  <tr>
    <td><s:submit value="删除"/></td>
  <tr>
  </s:form>
</s:if>
<s:else>
<%--  </s:iterator>--%>
<%--</table>--%>
<%--<hr>--%>
添加新地址：<p>
  <s:form action="addAddr" method="post">
    <s:hidden name="loginUser.customerId" value="%{#request.loginUser.customerId}"/>
    <s:textfield name="address.detail" label="详细地址"/>
    <s:textfield name="address.zipcode" label="邮政编码"/>
    <s:textfield name="address.phone" label="联系电话"/>
    <s:textfield name="address.type" label="地址类型（office,home,etc.）"/>
    <s:submit value="添加"/>
  </s:form>
    </s:else>
</table>
</body>
</html>
