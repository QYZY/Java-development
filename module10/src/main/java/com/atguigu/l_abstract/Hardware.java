package com.atguigu.l_abstract;

public class Hardware extends Maintainer{
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在修复电脑主板");
    }
}
