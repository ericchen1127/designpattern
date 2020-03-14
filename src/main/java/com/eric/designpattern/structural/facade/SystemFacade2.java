package com.eric.designpattern.structural.facade;

/**
 * @author eric
 */
public final class SystemFacade2 extends AbstractFacade{
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public SystemFacade2() {
        this.subSystem1 = new SubSystem1();
        this.subSystem2 = new SubSystem2();
        this.subSystem3 = new SubSystem3();
    }

    @Override
    public void facadeMethod() {
        System.out.println("SystemFacade2.facadeMethod");
        subSystem1.method1();
        subSystem2.method2();
        subSystem3.method3();
    }
}
