package com.owo.design.patterns.behavioral.template;

/**
 * Created by wangli on 16-7-10.
 */
public abstract class UnitTest {
    public void test() {
        before();
        doTest();
        after();
    }

    protected abstract void before();

    protected abstract void doTest();

    protected abstract void after();
}
