package org.apache.dubbo.rpc.protocol.injvm;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Protocol;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * @author lihaodong
 * @author 2021/10/14 9:55 下午
 */
public class InjvmTestInit {


    @Test
    public void protopolInit(){
        ExtensionLoader<Protocol> protocolExtensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
        Protocol adaptiveExtension = protocolExtensionLoader.getExtension("injvm",false);
        InjvmProtocol injvmProtocol = (InjvmProtocol) adaptiveExtension;
        Map<String, Exporter<?>> exporterMap = injvmProtocol.getExporterMap();
        System.out.println(exporterMap);
    }
}
