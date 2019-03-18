package com.zwnop.patterns.static_factory;

import com.zwnop.beans.food.Apple;
import com.zwnop.beans.food.Banana;
import com.zwnop.beans.food.Bread;
import com.zwnop.beans.food.Food;

/**
 * Created by zhangwn on 2019/3/6.
 */
public class FoodFactory {

    public static Food getApple(){
        return new Apple();
    }

    public static Food getBanana(){
        return new Banana();
    }

    public static Food getBread(){
        return new Bread();
    }
}
