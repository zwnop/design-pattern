package com.zwnop.patterns.abstract_factory;

import com.zwnop.beans.skin.*;

/**
 * Created by zhangwn on 2019/3/6.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new SummerCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
