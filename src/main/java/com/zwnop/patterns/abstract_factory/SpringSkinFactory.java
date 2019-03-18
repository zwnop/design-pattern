package com.zwnop.patterns.abstract_factory;

import com.zwnop.beans.skin.*;

/**
 * Created by zhangwn on 2019/3/6.
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new SpringCheckBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
