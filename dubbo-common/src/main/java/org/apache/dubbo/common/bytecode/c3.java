package org.apache.dubbo.common.bytecode;

/**
 * @author lihaodong
 * @author 2021/10/17 12:21 下午
 */
public class c3 {

   /* public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
        org.apache.dubbo.config.api.DemoService w;
        try {
            w = ((org.apache.dubbo.config.api.DemoService) $1);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("getUsers".equals($2) && $3.length == 1) {
                return ($w) w.getUsers((java.util.List) $4[0]);
            }
            if ("echo".equals($2) && $3.length == 1) {
                return ($w) w.echo(((Number) $4[0]).intValue());
            }
            if ("getBox".equals($2) && $3.length == 0) {
                return ($w) w.getBox();
            }
            if ("throwDemoException".equals($2) && $3.length == 0) {
                w.throwDemoException();
                return null;
            }
            if ("sayName".equals($2) && $3.length == 1) {
                return ($w) w.sayName((java.lang.String) $4[0]);
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class org.apache.dubbo.config.api.DemoService.");
    }*/
}
