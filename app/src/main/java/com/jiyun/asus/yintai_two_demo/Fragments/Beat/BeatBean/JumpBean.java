package com.jiyun.asus.yintai_two_demo.Fragments.Beat.BeatBean;

import java.util.List;

/**
 * 我与世界
 * 格格不入
 * <p>
 * 我只与你
 * 惺惺相惜.
 */

public class JumpBean {
    private int id;
    private List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> list;

    public JumpBean(int id, List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> list) {
        this.id = id;
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> getList() {
        return list;
    }

    public void setList(List<BeatBean.DataBean.ActivityinfoBean.ActivitylistBean> list) {
        this.list = list;
    }
}
