package com.zwnop.patterns.abstract_factory;

/**
 * Created by zhangwn on 2019/3/7.
 */
public class AbstractFactoryClient {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.zwnop.patterns.abstract_factory.SpringSkinFactory");
        SkinFactory factory = (SkinFactory) aClass.newInstance();
        factory.createButton().display();
        factory.createCheckBox().display();
        factory.createTextField().display();
    }
}
