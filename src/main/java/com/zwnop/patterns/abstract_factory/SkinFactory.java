package com.zwnop.patterns.abstract_factory;

import com.zwnop.beans.skin.Button;
import com.zwnop.beans.skin.CheckBox;
import com.zwnop.beans.skin.TextField;

/**
 * Created by zhangwn on 2019/3/6.
 */
public interface SkinFactory {
    public Button createButton();
    public CheckBox createCheckBox();
    public TextField createTextField();
}
