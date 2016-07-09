package com.owo.design.patterns.creational.builder;

public class BuilderPatternDemo {
    public static void main() {
        DeviceInfo info1 = DeviceInfo.newBuilder().imei("imei1").imsi("imsi1").build();
        DeviceInfo info2 = DeviceInfo.newBuilder().imei("imei2").imsi("imsi2").brand("branc2").build();
        System.out.println("info1:" + info1.imei() + " " + info1.imsi());
        System.out.println("info2:" + info2.imei() + " " + info2.imsi() + " " + info2.brand());
    }
}