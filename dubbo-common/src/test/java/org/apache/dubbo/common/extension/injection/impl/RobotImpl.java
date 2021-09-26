package org.apache.dubbo.common.extension.injection.impl;

import org.apache.dubbo.common.extension.injection.Robot;

/**
 * @author lihaodong
 * @author 2021/8/8 5:15 下午
 */
public class RobotImpl implements Robot {
    @Override
    public String sayHello() {
        System.out.println("hello world");
        return "hello world";
    }
}
