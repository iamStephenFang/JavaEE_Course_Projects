package cn.edu.zjut.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.security.Security;
import java.util.Hashtable;

import cn.edu.zjut.ejb.UserServiceRemote;

public class LoginClient {
    private static UserServiceRemote lookupRemoteStatelessEjbBean() throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);
        final String appName = "";
        final String moduleName = "ejb_project1";
        final String distinctName = "";
        final String beanName = "UserService";
        final String viewClassName = UserServiceRemote.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName + "_war_exploded" + distinctName + "/" + beanName + "!" + viewClassName;
        return (UserServiceRemote) context.lookup(namespace);
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        try {
            UserServiceRemote usBean = lookupRemoteStatelessEjbBean();
            System.out.println(usBean);
            boolean b1 = usBean.login("zjut", "zjut");
            System.out.println(b1);
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

}