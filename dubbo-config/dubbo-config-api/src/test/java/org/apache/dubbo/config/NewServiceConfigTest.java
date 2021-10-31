package org.apache.dubbo.config;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.config.api.DemoService;
import org.apache.dubbo.config.provider.impl.DemoServiceImpl;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * @author lihaodong
 * @author 2021/10/17 5:33 下午
 */
public class NewServiceConfigTest {

     Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
     ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();


    @Test
    public void testServiceExport(){
        URL url = URL.valueOf("dubbp://127.0.0.1");
        DemoService demoService = new DemoServiceImpl();
        Invoker<DemoService> invoker = proxyFactory.getInvoker(demoService, DemoService.class, url);
        protocol.export(invoker);
    }
}
