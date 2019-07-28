package structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author MCC
 * @Create 2019/7/28 10:59
 * JDK 自带的动态代理
 * java.lang.reflect.Proxy:生成动态代理类和对象；
 * java.lang.reflect.InvocationHandler（处理器接口）：可以通过invoke方法实现
 * 对真实角色的代理访问。
 * 每次通过 Proxy 生成的代理类对象都要指定对应的处理器对象。
 */
public class MyInvocationHandler implements InvocationHandler {

    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")) {
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        } else {
            String string = (String) method.invoke(realSubject, args);
            System.out.println("调用的是说话的方法");
            return string;
        }
    }
}
