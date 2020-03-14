package com.eric.designpattern.structural.facade;

/**
 * @author eric
 */
public final class SystemFacade1 extends AbstractFacade{
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public SystemFacade1() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
    }

    @Override
    public void facadeMethod() {
        System.out.println("SystemFacade1.facadeMethod");
        subSystem1.method1();
        subSystem2.method2();
    }
}
