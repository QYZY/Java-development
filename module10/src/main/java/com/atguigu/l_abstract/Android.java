package com.atguigu.l_abstract;

public class Android extends Developer{
    public Android() {
    }

    public Android(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() + "的" + this.getName() + "员工，正在研发电商的手机客户端软件");
    }
}
