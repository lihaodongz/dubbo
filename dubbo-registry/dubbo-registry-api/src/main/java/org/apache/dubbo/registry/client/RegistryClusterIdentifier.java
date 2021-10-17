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
package org.apache.dubbo.registry.xds;

import org.apache.dubbo.common.URL;
<<<<<<< HEAD:dubbo-registry/dubbo-registry-xds/src/main/java/org/apache/dubbo/registry/xds/XdsRegistry.java
import org.apache.dubbo.registry.NotifyListener;
import org.apache.dubbo.registry.support.FailbackRegistry;

/**
 * Empty implements for xDS <br/>
 * xDS only support `Service Discovery` mode register <br/>
 * Used to compat past version like 2.6.x, 2.7.x with interface level register <br/>
 * {@link XdsServiceDiscovery} is the real implementation of xDS
 */
public class XdsRegistry extends FailbackRegistry {
    public XdsRegistry(URL url) {
        super(url);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public void doRegister(URL url) {

    }

    @Override
    public void doUnregister(URL url) {

    }

    @Override
    public void doSubscribe(URL url, NotifyListener listener) {

    }

    @Override
    public void doUnsubscribe(URL url, NotifyListener listener) {

    }
=======
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.extension.SPI;

import static org.apache.dubbo.common.constants.RegistryConstants.REGISTRY_CLUSTER_TYPE_KEY;

@SPI
public interface RegistryClusterIdentifier {
    String providerKey(URL url);

    String consumerKey(URL url);

    static RegistryClusterIdentifier getExtension(URL url) {
        ExtensionLoader<RegistryClusterIdentifier> loader
                = ExtensionLoader.getExtensionLoader(RegistryClusterIdentifier.class);
        return loader.getExtension(url.getParameter(REGISTRY_CLUSTER_TYPE_KEY, "default"));
    }
>>>>>>> dubbo-2.7.10:dubbo-registry/dubbo-registry-api/src/main/java/org/apache/dubbo/registry/client/RegistryClusterIdentifier.java
}
