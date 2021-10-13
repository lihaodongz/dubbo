package org.apache.dubbo.common.extension.injection;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author lihaodong
 * @author 2021/8/8 5:14 下午
 */
@SPI
public interface Robot {

    String sayHello();
}
