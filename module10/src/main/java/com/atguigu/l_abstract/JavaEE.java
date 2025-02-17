package com.atguigu.l_abstract;

public class JavaEE extends Developer {
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在研发电商网站");
    }
}
