package com.zwnop.patterns.static_factory;

import com.zwnop.beans.food.Food;

/**
 * Created by zhangwn on 2019/3/6.
 */
public class StaticFactoryClient {

    public static Food getFood(String food) throws ClassNotFoundException {
        if (food == null || food.isEmpty()){
            return null;
        }else if (food.equals("apple")){
            return FoodFactory.getApple();
            // 使用newInstance可以写入配置文件，较为灵活
            // return (Food)Class.forName("com.zwnop.beans.food.Apple").newInstance();
        }else if (food.equals("banana")){
            return FoodFactory.getBanana();
            // return (Food)Class.forName("com.zwnop.beans.food.Banana").newInstance();
        }else if (food.equals("bread")){
            return FoodFactory.getBread();
            // return (Food)Class.forName("com.zwnop.beans.food.Bread").newInstance();
        }
        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Food food = StaticFactoryClient.getFood("bread");
        food.eat();
    }
}
