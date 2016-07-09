package com.owo.design.patterns.creational.builder;

/**
 * Created by wangli on 16-7-9.
 */
public class DeviceInfo {
    private String imei;
    private String imsi;
    private String brand;
    private String mode;
    private String size;

    private DeviceInfo() {
    }

    public String imei() {
        return imei;
    }

    public String imsi() {
        return imsi;
    }

    public String brand() {
        return brand;
    }

    public String mode() {
        return mode;
    }

    public String size() {
        return size;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static class Builder {
        private DeviceInfo info = new DeviceInfo();

        public Builder() {

        }

        public Builder imei(String value) {
            info.imei = value;
            return this;
        }

        public Builder imsi(String value) {
            info.imsi = value;
            return this;
        }

        public Builder brand(String value) {
            info.brand = value;
            return this;
        }

        public Builder mode(String value) {
            info.mode = value;
            return this;
        }


        public Builder size(String value) {
            info.size = value;
            return this;
        }

        DeviceInfo build() {
            return info;
        }
    }

}
