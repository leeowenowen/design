package com.owo.design.patterns.creational.abstract_factory;

/**
 * Created by wangli on 7/8/16.
 */
public class HuaweiPhoneFactory implements DeviceFactory {
    @Override
    public Brand createBrand() {
        return new Huawei();
    }

    @Override
    public Type createType() {
        return new Phone();
    }
}
