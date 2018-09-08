package com.breeze.rain.admin.model.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

public enum Gender implements IEnum {
    MAN(1, "男"), WOMAN(2, "女");

    private Integer index;
    private String name;

    private Gender(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public Serializable getValue() {
        return null;
    }
}
