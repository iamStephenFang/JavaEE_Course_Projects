<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="javax.naming.*, java.util.Properties" %>
<%@ page import="cn.edu.zjut.ejb.*" %>

<%
  try {
    final Hashtable jndiProperties = new Hashtable();
    jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
    final Context context = new InitialContext(jndiProperties);
    final String appName = "";
    final String moduleName = "ejb_project1";
    final String distinctName = "";
    final String beanName = "ProductCartBean";
    final String viewClassName = ProductCartRemote.class.getName();
    final String namespace = "ejb:" + appName + "/" + moduleName + "_war_exploded" + distinctName + "/" + beanName + "!" + viewClassName;
    ProductCartRemote cart = null;
    cart = (ProductCartRemote) session.getAttribute("cart");
    if (cart == null) {
      cart = (ProductCartRemote) context.lookup(namespace);
      session.setAttribute("cart", cart);
    } else {
      String productName = request.getParameter("product");
      String sPrice = request.getParameter("price");
      int price = 0;
      if (sPrice != null) price = Integer.parseInt(sPrice);
      cart.addProduct(productName, price);
      List<String> myProducts = cart.listProducts();
      out.println("Total Price:" + cart.totalPrice() + "<br>");
      out.println("My Products:<br>" + myProducts);
    }
  } catch (NamingException e) {

    e.printStackTrace();
  }

%>
<table border=1>

  <tr>
    <td><a href="myCart.jsp?product=fridge&price=3000">fridge buy</a></td>
  </tr>

  <tr>
    <td><a href="myCart.jsp?product=ledtv&price=5000">ledtv buy</a></td>
  </tr>

  <tr>
    <td><a href="myCart.jsp?product=waterheater&price=2800">waterheater buy</a></td>
  </tr>

  <tr>
    <td><a href="myCart.jsp?product=car&price=300000">car buy</a></td>
  </tr>
</table>