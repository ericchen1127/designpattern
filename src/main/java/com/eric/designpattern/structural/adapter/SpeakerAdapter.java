package com.eric.designpattern.structural.adapter;

import com.eric.designpattern.structural.proxy.IReadable;

/**
 * @author eric
 * 将 IReadable 转换成 ISpeakable
 * 与代理模式不同，适配器模式可以将被适配的对象交给客户端传入，无需对客户端隐藏
 */
public final class SpeakerAdapter implements ISpeakable {
    private IReadable reader;

    public SpeakerAdapter(IReadable reader) {
        this.reader = reader;
    }

    @Override
    public void speak() {
        System.out.println("IReadable is adapted to ISpeakable");
        reader.read();
    }
}
