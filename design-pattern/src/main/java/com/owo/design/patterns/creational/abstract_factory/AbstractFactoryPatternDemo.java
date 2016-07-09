package com.owo.design.patterns.creational.abstract_factory;

import javax.xml.soap.Text;

/**
 * Created by wangli on 16-7-9.
 */
public class AbstractFactoryPatternDemo {
    public static void main(){
        {
            LinuxWidgetFactory factory = new LinuxWidgetFactory();
            Button btn = factory.createButton();
            TextView tv = factory.createTextView();
            btn.show();
            tv.show();
        }

        {
            WinWidgetFactory factory = new WinWidgetFactory();
            Button btn = factory.createButton();
            TextView tv = factory.createTextView();
            btn.show();
            tv.show();
        }
    }
}
