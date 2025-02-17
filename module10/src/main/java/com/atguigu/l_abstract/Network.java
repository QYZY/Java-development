package com.atguigu.l_abstract;

public class Network extends Maintainer{
    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在检查网络是否畅通");
    }
}
