package com.zwnop.beans.food;

/**
 * Created by zhangwn on 2019/3/6.
 */
public class Bread implements Food{

    @Override
    public void eat() {
        System.out.println("eating bread~");
    }
}
