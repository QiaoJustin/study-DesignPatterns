package com.designpatterns.structure.Builder;

/**
 * @Description 披萨类
 * @Author fuchen
 * @Date 2019/9/6 9:29
 * Version 1.0
 */
public class Pizza {

    private String parts;

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String toString() {
        return this.parts;
    }
}
