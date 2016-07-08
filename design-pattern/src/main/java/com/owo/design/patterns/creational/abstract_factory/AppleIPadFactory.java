package com.owo.design.patterns.creational.abstract_factory;

/**
 * Created by wangli on 7/8/16.
 */
public class AppleIPadFactory implements DeviceFactory {
    @Override
    public Brand createBrand() {
        return new Apple();
    }

    @Override
    public Type createType() {
        return new Pad();
    }
}
