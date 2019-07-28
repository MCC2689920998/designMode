package structural.proxy.cglib;

import org.junit.Test;

import static org.junit.Assert.*;

public class CglibProxyTest {
    @Test
    public void interceptTest() throws Exception {
        // 生成 Cglib 代理类
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 调用相关方法
        engineerProxy.eat();


        engineerProxy.work();

    }

}