package com.owo.design.patterns.behavioral.template;

/**
 * Created by wangli on 16-7-10.
 */
public class StringUnitTest extends UnitTest {
    @Override
    public void before() {
        System.out.println("StringUnitTest.before");
    }

    @Override
    public void doTest() {
        System.out.println("StringUnitTest.doTest");
    }

    @Override
    public void after() {
        System.out.println("StringUnitTest.after");
    }
}
