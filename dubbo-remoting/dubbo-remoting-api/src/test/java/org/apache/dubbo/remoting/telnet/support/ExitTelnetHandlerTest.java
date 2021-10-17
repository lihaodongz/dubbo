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
<<<<<<< HEAD:dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/mesh/rule/virtualservice/match/BoolMatchTest.java

package org.apache.dubbo.rpc.cluster.router.mesh.rule.virtualservice.match;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoolMatchTest {
=======
package org.apache.dubbo.remoting.telnet.support;

import org.apache.dubbo.remoting.Channel;
import org.apache.dubbo.remoting.telnet.support.command.ExitTelnetHandler;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
>>>>>>> dubbo-2.7.10:dubbo-remoting/dubbo-remoting-api/src/test/java/org/apache/dubbo/remoting/telnet/support/ExitTelnetHandlerTest.java

public class ExitTelnetHandlerTest {
    @Test
<<<<<<< HEAD:dubbo-cluster/src/test/java/org/apache/dubbo/rpc/cluster/router/mesh/rule/virtualservice/match/BoolMatchTest.java
    public void isMatch() {
        BoolMatch boolMatch =  new BoolMatch();
        boolMatch.setExact(true);


        assertTrue(BoolMatch.isMatch(boolMatch,true));
        assertFalse(BoolMatch.isMatch(boolMatch,false));

        boolMatch.setExact(false);
        assertFalse(BoolMatch.isMatch(boolMatch,true));
        assertTrue(BoolMatch.isMatch(boolMatch,false));

=======
    public void test() {
        Channel channel = Mockito.mock(Channel.class);

        ExitTelnetHandler exitTelnetHandler = new ExitTelnetHandler();
        exitTelnetHandler.telnet(channel, null);

        verify(channel, times(1)).close();
>>>>>>> dubbo-2.7.10:dubbo-remoting/dubbo-remoting-api/src/test/java/org/apache/dubbo/remoting/telnet/support/ExitTelnetHandlerTest.java
    }
}
