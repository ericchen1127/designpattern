package com.eric.designpattern.structural.bridge;

/**
 * @author eric
 * 采用桥接模式处理形状和颜色的组合
 * AbstractShape
 *      Circle
 *      Square
 * IColorable   方法：getColor()
 *      Red
 *      Blue
 * AbstractShape 中有 IColorable 的引用
 *      getColor4Shape() 封装 IColorable.getColor()
 *      getDesc() 由子类实现，返回颜色和形状组合后的描述
 */
public abstract class AbstractShape {
    private IColorable color;

    public AbstractShape(IColorable color){
        this.color = color;
    }

    public String getColor4Shape() {
        return color.getColor();
    }

    public abstract String getDesc();
}
