package structural.proxy.jdk;

import org.junit.Test;
import structural.proxy.jdk.impl.RealSubject;

import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

public class MyInvocationHandlerTest {
    @Test
    public void invokeTest() throws Exception {
        //真实对象
        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();
        proxyClass.speak();
    }

}