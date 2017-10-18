package com.jiyun.asus.yintai_two_demo.Fragments.homepage.searchforgoods.bean;

import java.util.List;

/**
 * Created by asus on 2017/10/18.
 */

public class SearchBean {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : [{"title":"热门品牌","tags":[{"name":"ELLE","id":"50000464","style":"0","type":1},{"name":"新百伦","id":"50000125","style":"0","type":1},{"name":"FED","id":"50000155","style":"0","type":1},{"name":"大洋洲袋鼠","id":"50000859","style":"0","type":1},{"name":"外交官","id":"50000938","style":"0","type":1},{"name":"莱尔斯丹 ","id":"50000153","style":"0","type":1},{"name":"欧时力","id":"50000018","style":"0","type":1},{"name":"理肤泉","id":"50000258","style":"0","type":1},{"name":"Trendiano","id":"50002549","style":"0","type":1},{"name":"科颜氏","id":"50000596","style":"0","type":1},{"name":"兰蔻","id":"50000224","style":"0","type":1}]},{"title":"热门搜索","tags":[{"name":"短靴","id":"10000844","style":"0","type":1},{"name":"四件套","id":"10000990","style":"0","type":1},{"name":"西装","id":"10001044","style":"0","type":1},{"name":"针织衫","id":"10000719","style":"0","type":1},{"name":"雪地靴","id":"10002036","style":"0","type":1},{"name":"男外套","id":"10001216","style":"0","type":1},{"name":"秋水伊人","id":"50000061","style":"0","type":1},{"name":"阿迪达斯","id":"50000442","style":"0","type":1},{"name":"女士风衣","id":"10000724","style":"0","type":1},{"name":"ARMANI","id":"50000365","style":"0","type":1}]}]
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : 热门品牌
         * tags : [{"name":"ELLE","id":"50000464","style":"0","type":1},{"name":"新百伦","id":"50000125","style":"0","type":1},{"name":"FED","id":"50000155","style":"0","type":1},{"name":"大洋洲袋鼠","id":"50000859","style":"0","type":1},{"name":"外交官","id":"50000938","style":"0","type":1},{"name":"莱尔斯丹 ","id":"50000153","style":"0","type":1},{"name":"欧时力","id":"50000018","style":"0","type":1},{"name":"理肤泉","id":"50000258","style":"0","type":1},{"name":"Trendiano","id":"50002549","style":"0","type":1},{"name":"科颜氏","id":"50000596","style":"0","type":1},{"name":"兰蔻","id":"50000224","style":"0","type":1}]
         */

        private String title;
        private List<TagsBean> tags;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class TagsBean {
            /**
             * name : ELLE
             * id : 50000464
             * style : 0
             * type : 1
             */

            private String name;
            private String id;
            private String style;
            private int type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
