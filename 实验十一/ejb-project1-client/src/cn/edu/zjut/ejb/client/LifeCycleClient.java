package cn.edu.zjut.ejb.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.security.Security;
import java.util.Hashtable;

import cn.edu.zjut.ejb.lifecycle.*;

public class LifeCycleClient {
    private static LifeCycleRemote lookupRemoteStatefulEjbBean() throws NamingException {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);
        final String appName = "";
        final String moduleName = "ejb_project1";
        final String distinctName = "";
        final String beanName = "LifeCycle";
        final String viewClassName = LifeCycleRemote.class.getName();
        final String namespace = "ejb:" + appName + "/" + moduleName + "_war_exploded" + distinctName + "/" + beanName + "!" + viewClassName + "?stateful";
        System.out.println("namespace=" + namespace);
        return (LifeCycleRemote) context.lookup(namespace);
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
            LifeCycleRemote lc = lookupRemoteStatefulEjbBean();
            lc.hello("zjut");
            lc.removeSession();
        }catch(NamingException e){
            e.printStackTrace();
        }
    }
}