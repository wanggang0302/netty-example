package com.luwak.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;


/**
 * @author ChenXc
 * @version V1.0
 * @Date 2018/4/22 下午11:20
 * @Description TODO(初始化连接时的各个组件)
 */
public class MyWebSocketChannelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel e) throws Exception {
        e.pipeline().addLast("http-codec", new HttpServerCodec());
        e.pipeline().addLast("aggregator", new HttpObjectAggregator(65536));
        e.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
        e.pipeline().addLast("handler", new MyWebSocketHandler());
    }
}
