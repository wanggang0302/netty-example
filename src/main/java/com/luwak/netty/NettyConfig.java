package com.luwak.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @author ChenXc
 * @version V1.0
 * @Date 2018/4/22 下午10:09
 * @Description TODO(存储整个工程的全局配置)
 */
public class NettyConfig {

    /**
     * 存储每一个客户端接入进来的时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
