package com.jiyun.asus.yintai_two_demo.entity;

import java.util.List;

/**
 * Created by asus on 2017/10/17.
 */

public class NewsEntity {

    /**
     * stat : 1
     * data : [{"uniquekey":"9336178f48f429125d75e26c5f6d6e2f","title":"市面上常见的这几种蔬菜不要吃了，含有大量的致癌物质！","date":"2017-09-21 14:41","category":"头条","author_name":"育儿微刊","url":"http://mini.eastday.com/mobile/170921144145607.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170921/20170921_f6c1bc2e26c1dc62289597f03bb8a0f8_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170921/20170921_eeefc4b47cc64d07ca29dae8ff122a38_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170921/20170921_087faded3b2dc696c1e6be39b5eb1eda_cover_mwpm_03200403.jpg"},{"uniquekey":"8a9e3e5d1c91802c250e092609f5ae5e","title":"\u201c果冻效应\u201d？墨西哥因强震受灾严重 建筑遇震即垮","date":"2017-09-21 15:11","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921151120456.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170921/20170921151120_e797a9d4f091dd08665abdfdbf23b996_1_mwpm_03200403.jpg"},{"uniquekey":"54df6ba2fb0b8565bc4066410cf1f5aa","title":"第三届中国国际化工过程安全研讨会在南京开幕","date":"2017-09-21 15:10","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170921151031462.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170921/20170921151031_2c47e1ba1a042f9ced138ab9b7f48f43_1_mwpm_03200403.jpg"},{"uniquekey":"e3a0855e6b3a95e7204b4dfb575b48ca","title":"花垣县十八洞村：精准扶贫到农家","date":"2017-09-21 15:10","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170921151031371.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170921/20170921151031_a9c5823fa839bdb230f54b65604f02b1_1_mwpm_03200403.jpg"},{"uniquekey":"f9846d08a1f46fafb2e09a3a7cd674fe","title":"埃尔多安访美期间安保团队与当地示威者发生冲突 特朗普致歉","date":"2017-09-21 14:50","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921145055761.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170921/20170921145055_09b83e38c78737d9bcf204cc3f191e36_1_mwpm_03200403.jpg"},{"uniquekey":"f4c3422d8994c5e665ec1c98613741f1","title":"意大利小镇发生惨剧：1岁女童被2条家犬活活咬死","date":"2017-09-21 14:40","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921144047886.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170921/20170921144047_3be25c03560d60b7ef66948e924b13e1_1_mwpm_03200403.jpg"},{"uniquekey":"bb79a8ce16316c890f9fea56a154c007","title":"马云：富有的缺点是没有时间花钱","date":"2017-09-21 14:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921143038010.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170921/20170921143038_9538f107849e00fbcd6787581a4044db_1_mwpm_03200403.jpg"},{"uniquekey":"d3a2957f018185ccbc1318b7e4f02ca5","title":"又有新进展！Waymo向优步寻求26亿美元赔偿","date":"2017-09-21 14:20","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921142029402.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170921/20170921142029_990a0dee3fcd84be02db503817cb2860_1_mwpm_03200403.jpg"},{"uniquekey":"022429697681532b2a7cdf722257ba1c","title":"压力山大！法国一位三星名厨退出米其林美食指南","date":"2017-09-21 14:20","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921142029095.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170921/20170921142029_999b575a6c63306fa92f77724b2f2cde_1_mwpm_03200403.jpg"},{"uniquekey":"ab851bfeaefa876f96949772ddeba282","title":"最快动车来了！京沪高铁今起提速至 350 公里 / 小时","date":"2017-09-21 14:00","category":"头条","author_name":"北京商报","url":"http://mini.eastday.com/mobile/170921140010018.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170921/20170921140010_97da85d0f39605efab29eb6c9f320634_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170921/20170921140010_97da85d0f39605efab29eb6c9f320634_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170921/20170921140010_97da85d0f39605efab29eb6c9f320634_3_mwpm_03200403.jpg"},{"uniquekey":"714bbf081278fd4fa8e1966ccdec8a6f","title":"美科学家预测全球气候环境将在2100年之前崩溃","date":"2017-09-21 14:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921140007823.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170921/20170921140007_40df0bf35e43980183c55a1ffe306204_1_mwpm_03200403.jpg"},{"uniquekey":"cbb1706bc95c859fc0190855d9138961","title":"快讯！日本石垣市拟把\u201c尖阁行政区划名改为石垣市尖阁\u201d","date":"2017-09-21 14:00","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921140007111.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170921/20170921140007_7b231118c44ccb33a323f8fa32b8d41d_1_mwpm_03200403.jpg"},{"uniquekey":"4bde8c6a8fa68b27d5ddad0601c362cb","title":"九寨沟全县预估因地震损失224.5亿，十个重点项目开复工","date":"2017-09-21 13:49","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170921134953913.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170921/20170921134953_bc64e584449a4bdb35765c55694e4f1a_1_mwpm_03200403.jpg"},{"uniquekey":"fd2da83ad83213fd871024a704937a1a","title":"古苇清润茶传人北京宣布：将在药姑山举行拜谒\u201c茶王\u201d古苇清活动","date":"2017-09-21 13:48","category":"头条","author_name":"楚北网","url":"http://mini.eastday.com/mobile/170921134813264.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170921/20170921134813_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170921/20170921134813_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170921/20170921134813_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg"},{"uniquekey":"c1e44cb8f2e8c666f963ae14c928f071","title":"历史上唯一死后被送回娘家的妃子，化妆只化半张脸，却惊为天人","date":"2017-09-21 13:40","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170921134051678.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170921/20170921134051_9bb57920f2d0582628825d937e9f0a96_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170921/20170921134051_9bb57920f2d0582628825d937e9f0a96_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170921/20170921134051_9bb57920f2d0582628825d937e9f0a96_3_mwpm_03200403.jpg"},{"uniquekey":"d3c463dfc59d5b990143826a5dc3e726","title":"《福布斯》杂志100周年活动：亿万富豪们的盛宴","date":"2017-09-21 13:39","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921133945106.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170921/20170921133945_5428fb7b796191243393a0d7e734d745_1_mwpm_03200403.jpg"},{"uniquekey":"36a499a8c024e83699860c6c73f3f20d","title":"2岁女婴性早熟, 医生强调这些食物都是诱因","date":"2017-09-21 13:39","category":"头条","author_name":"Q仔美食","url":"http://mini.eastday.com/mobile/170921133906698.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921_d2bcecb9c8456cfd8ba8fe9fbcadbc0c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170921/20170921_81c358859034a22b592057c920fe8e56_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170921/20170921_cd69debff688918befe0b57e4ac87a4e_cover_mwpm_03200403.jpg"},{"uniquekey":"8953bbac15d1c2f60e099f3fe95a06ca","title":"无人车之父特龙：世界将在两年内迎来飞行汽车","date":"2017-09-21 13:29","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921132935788.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170921/20170921132935_6ebe2fed55a752d053af2c047a6ffed5_1_mwpm_03200403.jpg"},{"uniquekey":"b5a60cd404b984ecf1c39703585388fa","title":"许家印登顶首富，房企规模越大越容易倒下吗？","date":"2017-09-21 13:28","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170921132850921.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170921/20170921132850_95f067c98e4dbbfe28d3b9e4e8f52bac_1_mwpm_03200403.jpg"},{"uniquekey":"09fcd2361887461cb0542c756c6dbe17","title":"黑曼巴重新归来，扒一扒NBA球星科比，平时是如何训练的！","date":"2017-09-21 13:19","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/170921131946455.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921_1ddab85a3d915aabc4b96051bfcdd2ae_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170921/20170921_aa85be7e9f3dabe12cc33a5a975a9729_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170921/20170921_96f7bc8206e5471c6938b36fdd074983_cover_mwpm_03200403.jpg"},{"uniquekey":"6ec61c55c7a2d8571780b6f39d5690c6","title":"希拉里亮相脱口秀 与主持人把酒言欢","date":"2017-09-21 13:19","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921131928276.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921131928_3dc26336e514fc371786795faad91cf0_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170921/20170921131928_3dc26336e514fc371786795faad91cf0_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170921/20170921131928_3dc26336e514fc371786795faad91cf0_1_mwpm_03200403.jpg"},{"uniquekey":"1a9510c93adb5827b7594e390d233287","title":"法律真相：儿媳没有赡养公婆的法定义务","date":"2017-09-21 13:18","category":"头条","author_name":"吴桥普法","url":"http://mini.eastday.com/mobile/170921131811648.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170921/20170921131811_ee662ddd3b731437b61c40e9472f66c9_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170921/20170921131811_ee662ddd3b731437b61c40e9472f66c9_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170921/20170921131811_ee662ddd3b731437b61c40e9472f66c9_2_mwpm_03200403.jpg"},{"uniquekey":"300bfb77ec783b4855dd6ad88f1e8b5d","title":"云南教育厅长：云南大学入选首批一流大学建设体现党中央重视","date":"2017-09-21 13:08","category":"头条","author_name":"教育部官网","url":"http://mini.eastday.com/mobile/170921130827948.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170921/20170921130827_13d843cc28e1de78569833759b3c2618_1_mwpm_03200403.jpg"},{"uniquekey":"c127aef08c58fcbb0d4b8e4bfda5d0d9","title":"朝鲜外相回应特朗普威胁彻底摧毁朝鲜：这是狗叫","date":"2017-09-21 12:57","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170921125745608.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921125745_e5599e187b7afda64f76d67a7faf9af9_1_mwpm_03200403.jpg"},{"uniquekey":"36dab4d205b7d8b03faed6d23111cf14","title":"未来中国的第一富豪会是谁？不是马云，王健林，而是他！","date":"2017-09-21 12:50","category":"头条","author_name":"精华聚集地","url":"http://mini.eastday.com/mobile/170921125024735.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170921/20170921125024_ec8d201d7a5140a4857dc978fbbffcef_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170921/20170921125024_ec8d201d7a5140a4857dc978fbbffcef_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170921/20170921125024_ec8d201d7a5140a4857dc978fbbffcef_1_mwpm_03200403.jpg"},{"uniquekey":"7ee8a22651b652331f1017b510e243ba","title":"中国航空发动机的制造技术离不开这个盛产美女的小国","date":"2017-09-21 12:46","category":"头条","author_name":"武器知识","url":"http://mini.eastday.com/mobile/170921124628029.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921_fb78c50e6a61c5072ffcea208ef40bcf_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170921/20170921_1a84252587e1d848363da3316d55cd7f_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170921/20170921_a317d68286d6a0190ce13449330af96e_cover_mwpm_03200403.jpg"},{"uniquekey":"d6ee709b2cbf9e16bb2041c14dae796e","title":"中国发射超级卫星 开启卫星通信新纪元","date":"2017-09-21 12:41","category":"头条","author_name":"前瞻网 已入驻财经号","url":"http://mini.eastday.com/mobile/170921124124590.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921124124_34f0a82dfe58aae437ea008d20ed5baa_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170921/20170921124124_34f0a82dfe58aae437ea008d20ed5baa_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170921/20170921124124_34f0a82dfe58aae437ea008d20ed5baa_1_mwpm_03200403.jpg"},{"uniquekey":"7e780781814e552734bc725f8b8e2ef1","title":"安倍承诺将推出\u201c大胆政策\u201d提振日本经济","date":"2017-09-21 12:38","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170921123854802.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170921/20170921123854_5ad30daf12ae253ff8eadf45b55cc5cd_1_mwpm_03200403.jpg"},{"uniquekey":"1cdbcf955cb3b676a498ad64f2a26044","title":"墨西哥大地震致5名台湾侨胞受困废墟 一名台商遇难","date":"2017-09-21 12:38","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170921123854603.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170921/20170921123854_a219e831f7f453e08fb72836029dc18a_1_mwpm_03200403.jpg"},{"uniquekey":"a0d95728ff3d8783db2e1ee8da8447a3","title":"万万没想到，不用油费和停车费的共享宝马，背后投资人竟是宋小宝","date":"2017-09-21 12:30","category":"头条","author_name":"小马话车","url":"http://mini.eastday.com/mobile/170921123045934.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170921/20170921123045_d87189a1ff87b223b1fe2f5d89e66ef7_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170921/20170921123045_d87189a1ff87b223b1fe2f5d89e66ef7_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170921/20170921123045_d87189a1ff87b223b1fe2f5d89e66ef7_2_mwpm_03200403.jpg"}]
     */

    private String stat;
    private List<DataBean> data;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NewsEntity{" +
                "stat='" + stat + '\'' +
                ", data=" + data +
                '}';
    }

    public static class DataBean {
        /**
         * uniquekey : 9336178f48f429125d75e26c5f6d6e2f
         * title : 市面上常见的这几种蔬菜不要吃了，含有大量的致癌物质！
         * date : 2017-09-21 14:41
         * category : 头条
         * author_name : 育儿微刊
         * url : http://mini.eastday.com/mobile/170921144145607.html
         * thumbnail_pic_s : http://01.imgmini.eastday.com/mobile/20170921/20170921_f6c1bc2e26c1dc62289597f03bb8a0f8_cover_mwpm_03200403.jpg
         * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20170921/20170921_eeefc4b47cc64d07ca29dae8ff122a38_cover_mwpm_03200403.jpg
         * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20170921/20170921_087faded3b2dc696c1e6be39b5eb1eda_cover_mwpm_03200403.jpg
         */

        private String uniquekey;
        private String title;
        private String date;
        private String category;
        private String author_name;
        private String url;
        private String thumbnail_pic_s;
        private String thumbnail_pic_s02;
        private String thumbnail_pic_s03;

        public String getUniquekey() {
            return uniquekey;
        }

        public void setUniquekey(String uniquekey) {
            this.uniquekey = uniquekey;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public void setAuthor_name(String author_name) {
            this.author_name = author_name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail_pic_s() {
            return thumbnail_pic_s;
        }

        public void setThumbnail_pic_s(String thumbnail_pic_s) {
            this.thumbnail_pic_s = thumbnail_pic_s;
        }

        public String getThumbnail_pic_s02() {
            return thumbnail_pic_s02;
        }

        public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
            this.thumbnail_pic_s02 = thumbnail_pic_s02;
        }

        public String getThumbnail_pic_s03() {
            return thumbnail_pic_s03;
        }

        public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
            this.thumbnail_pic_s03 = thumbnail_pic_s03;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "uniquekey='" + uniquekey + '\'' +
                    ", title='" + title + '\'' +
                    ", date='" + date + '\'' +
                    ", category='" + category + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", url='" + url + '\'' +
                    ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                    ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                    ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                    '}';
        }
    }
}
