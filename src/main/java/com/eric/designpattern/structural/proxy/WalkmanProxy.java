package com.eric.designpattern.structural.proxy;

/**
 * @author eric
 * WalkmanProxy 和 Walkman 均实现 IReadable 接口
 * WalkmanProxy 重写 read 方法时，可加入额外功能，如 readBefore 和 readAfter 方法
 * WalkmanProxy 引用 Walkman 类，使客户端能够隔离 Walkman 类
 * 如通过 WalkmanProxy 的构造方法传入实现 IReadable 接口的被代理类，可扩展性更好
 * 但客户端将无法与被代理类解耦，违背代理模式的初衷
 */
public final class WalkmanProxy implements IReadable {

    private Walkman walkman;

    public WalkmanProxy() {
        this.walkman = new Walkman();
    }

    @Override
    public void read() {
        readBefore();
        walkman.read();
        readAfter();
    }

    private void readBefore() {
        System.out.println("walkman is turned on");
    }

    private void readAfter() {
        System.out.println("walkman is turned off");
    }
}
