<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>商品列表</title>
</head>
<body>
<center>商品列表</center>
<%--<table border=1>--%>
<%--  <tr>--%>
<%--    <th>编号</th>--%>
<%--    <th>书名</th>--%>
<%--    <th>说明</th>--%>
<%--    <th>单价</th>--%>
<%--  </tr>--%>
<%--  <s:iterator value="items">--%>
<%--    <tr>--%>
<%--      <td><s:property value="itemID"/></td>--%>
<%--      <td><s:property value="title"/></td>--%>
<%--      <td><s:property value="description"/></td>--%>
<%--      <td><s:property value="cost"/></td>--%>
<%--    </tr>--%>
<%--  </s:iterator></table>--%>

<%--<table border=1>--%>
<%--  <tr>--%>
<%--    <th>书名</th>--%>
<%--  </tr>--%>
<%--  <s:iterator value="items" var="object">--%>
<%--    <tr>--%>
<%--      <td><s:property value="object"/></td>--%>
<%--    </tr>--%>
<%--  </s:iterator></table>--%>

<table border=1>
  <tr>
<%--    <th>书名</th>--%>
<%--    <th>单价</th>--%>
<%--    <th>描述</th>--%>
  <th>均价</th>
  <th>最高价</th>
  <th>总数</th>
  </tr>
  <s:iterator value="items" var="object">
    <tr>
      <td><s:property value="#object[0]"/></td>
      <td><s:property value="#object[1]"/></td>
      <td><s:property value="#object[2]"/></td>
    </tr>
  </s:iterator>
</table>

</body>
</html>
