/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
<<<<<<< HEAD:dubbo-rpc/dubbo-rpc-triple/src/main/java/org/apache/dubbo/rpc/protocol/tri/TripleClientInboundHandler.java
package org.apache.dubbo.rpc.protocol.tri;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
=======
package org.apache.dubbo.registry.consul;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.registry.client.AbstractServiceDiscoveryFactory;
import org.apache.dubbo.registry.client.ServiceDiscovery;

public class ConsulServiceDiscoveryFactory extends AbstractServiceDiscoveryFactory {
>>>>>>> dubbo-2.7.10:dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscoveryFactory.java

public class TripleClientInboundHandler extends ChannelInboundHandlerAdapter {
    @Override
<<<<<<< HEAD:dubbo-rpc/dubbo-rpc-triple/src/main/java/org/apache/dubbo/rpc/protocol/tri/TripleClientInboundHandler.java
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        final AbstractClientStream clientStream = TripleUtil.getClientStream(ctx);

        final byte[] data = (byte[]) msg;
        if (clientStream != null) {
            clientStream.asTransportObserver()
                    .tryOnData(data, false);
        }
=======
    protected ServiceDiscovery createDiscovery(URL registryURL) {
        return new ConsulServiceDiscovery();
>>>>>>> dubbo-2.7.10:dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulServiceDiscoveryFactory.java
    }

}
