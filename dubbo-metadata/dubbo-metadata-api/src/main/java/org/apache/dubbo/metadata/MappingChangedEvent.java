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

<<<<<<< HEAD:dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/mesh/route/MeshRuleRouterFactoryTest.java
package org.apache.dubbo.rpc.cluster.router.mesh.route;

import org.apache.dubbo.common.URL;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MeshRuleRouterFactoryTest {

    @Test
    public void getRouter() {
        MeshRuleRouterFactory ruleRouterFactory = new MeshRuleRouterFactory();
        URL url = mock(URL.class);
        when(url.getServiceKey()).thenReturn("demoService");
        ruleRouterFactory.getRouter(url);
=======
import java.util.Set;

public class MappingChangedEvent {
    private String serviceKey;
    private Set<String> apps;

    public String getServiceKey() {
        return serviceKey;
    }

    public void setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
    }

    public Set<String> getApps() {
        return apps;
>>>>>>> dubbo-2.7.10:dubbo-metadata/dubbo-metadata-api/src/main/java/org/apache/dubbo/metadata/MappingChangedEvent.java
    }

    public void setApps(Set<String> apps) {
        this.apps = apps;
    }

}
