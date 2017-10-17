package com.jiyun.asus.yintai_two_demo.Beans;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */
//分类左侧bean对象
public class ClassLeftBean {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : {"data":[{"id":88,"name":"时尚名品"},{"id":150,"name":"潮流女装"},{"id":257,"name":"精品男装"},{"id":245,"name":"品质内衣"},{"id":151,"name":"护肤彩妆"},{"id":2,"name":"品质鞋靴"},{"id":5,"name":"时尚箱包"},{"id":242,"name":"运动户外"},{"id":1,"name":"珠宝饰品"},{"id":3,"name":"母婴精选"},{"id":4,"name":"家居家纺"}]}
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private DataBeanX data;

    public boolean isIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 88
             * name : 时尚名品
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
