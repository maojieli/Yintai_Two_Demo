package com.jiyun.asus.yintai_two_demo.Beans;

import java.util.List;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */
//分类?右bean
public class ClassBean {

    /**
     * isSuccessful : true
     * statusCode : 200
     * description :
     * userId :
     * data : {"id":88,"name":null,"advertising":{"name":"分类广告管理","categoryadvertising":[]},"recommend":{"name":"推荐类目","categoryrecommend":[{"categoryid":135,"name":"男装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/35b8dd47-7a41-444e-944b-a796758b583d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001896&showtype=double"},{"categoryid":136,"name":"女包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/43919901-d9db-4461-a722-b99e5e18fddb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E5%8C%85&searchCondition=N%3D10001891&showtype=double"},{"categoryid":137,"name":"男装衬衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/f0ef662c-005d-43fa-ab56-739c58e4641d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85%E8%A1%AC%E8%A1%AB&searchCondition=N%3D10001898&showtype=double"},{"categoryid":143,"name":"男包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a6c33bad-c675-4736-9513-1ae47d6db6bc.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E5%8C%85&searchCondition=N%3D10001890&showtype=double"},{"categoryid":144,"name":"女裙","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/eab8e69e-e048-44ed-95ec-13c2e5c47250.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%99&searchCondition=N%3D10001907&showtype=double"},{"categoryid":147,"name":"女鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a13eb30f-bb48-4652-8eb3-2a1bd0528f75.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E9%9E%8B&searchCondition=N%3D10001889&showtype=double"},{"categoryid":146,"name":"男鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/91c33cc7-c37b-4988-bd70-286cc0c79ccb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E9%9E%8B&searchCondition=N%3D10001888&showtype=double"},{"categoryid":145,"name":"POLO衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/fd8812e6-cce9-4479-a33c-869312286b65.jpg","jumpurl":"yintaimobile://AutoProductList?title=POLO%E8%A1%AB&searchCondition=N%3D10001897&showtype=double"},{"categoryid":149,"name":"女装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/85571aa2-1c1f-476a-a53c-efea7383b9a2.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001902&showtype=double"}]},"brand":{"name":"推荐品牌","brandrecommend":[{"categoryid":224,"brandid":270,"name":"BURBERRY","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-270.jpg","jumpurl":"yintaimobile://AutoProductList?title=BURBERRY&showtype=double&searchCondition=N%3d50000270"},{"categoryid":226,"brandid":265,"name":"SALVATORE FERRAGAMO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-265.jpg","jumpurl":"yintaimobile://AutoProductList?title=%e8%8f%b2%e6%8b%89%e6%a0%bc%e6%85%95&showtype=double&searchCondition=N%3d50000265"},{"categoryid":227,"brandid":455,"name":"GUCCI","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-455.jpg","jumpurl":"yintaimobile://AutoProductList?title=GUCCI&showtype=double&searchCondition=N%3d50000455"},{"categoryid":228,"brandid":887,"name":"ARMANI JEANS","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-887.jpg","jumpurl":"yintaimobile://AutoProductList?title=ARMANI+JEANS&showtype=double&searchCondition=N%3d50000887"},{"categoryid":414,"brandid":1052,"name":"MAX MARA","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-1052.jpg","jumpurl":"yintaimobile://AutoProductList?title=Max+Mara&showtype=double&searchCondition=N%3d50001052"},{"categoryid":229,"brandid":369,"name":"VALENTINO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-369.jpg","jumpurl":"yintaimobile://AutoProductList?title=VALENTINO&showtype=double&searchCondition=N%3d50000369"}]}}
     */

    private boolean isSuccessful;
    private int statusCode;
    private String description;
    private String userId;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 88
         * name : null
         * advertising : {"name":"分类广告管理","categoryadvertising":[]}
         * recommend : {"name":"推荐类目","categoryrecommend":[{"categoryid":135,"name":"男装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/35b8dd47-7a41-444e-944b-a796758b583d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001896&showtype=double"},{"categoryid":136,"name":"女包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/43919901-d9db-4461-a722-b99e5e18fddb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E5%8C%85&searchCondition=N%3D10001891&showtype=double"},{"categoryid":137,"name":"男装衬衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/f0ef662c-005d-43fa-ab56-739c58e4641d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85%E8%A1%AC%E8%A1%AB&searchCondition=N%3D10001898&showtype=double"},{"categoryid":143,"name":"男包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a6c33bad-c675-4736-9513-1ae47d6db6bc.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E5%8C%85&searchCondition=N%3D10001890&showtype=double"},{"categoryid":144,"name":"女裙","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/eab8e69e-e048-44ed-95ec-13c2e5c47250.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%99&searchCondition=N%3D10001907&showtype=double"},{"categoryid":147,"name":"女鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a13eb30f-bb48-4652-8eb3-2a1bd0528f75.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E9%9E%8B&searchCondition=N%3D10001889&showtype=double"},{"categoryid":146,"name":"男鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/91c33cc7-c37b-4988-bd70-286cc0c79ccb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E9%9E%8B&searchCondition=N%3D10001888&showtype=double"},{"categoryid":145,"name":"POLO衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/fd8812e6-cce9-4479-a33c-869312286b65.jpg","jumpurl":"yintaimobile://AutoProductList?title=POLO%E8%A1%AB&searchCondition=N%3D10001897&showtype=double"},{"categoryid":149,"name":"女装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/85571aa2-1c1f-476a-a53c-efea7383b9a2.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001902&showtype=double"}]}
         * brand : {"name":"推荐品牌","brandrecommend":[{"categoryid":224,"brandid":270,"name":"BURBERRY","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-270.jpg","jumpurl":"yintaimobile://AutoProductList?title=BURBERRY&showtype=double&searchCondition=N%3d50000270"},{"categoryid":226,"brandid":265,"name":"SALVATORE FERRAGAMO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-265.jpg","jumpurl":"yintaimobile://AutoProductList?title=%e8%8f%b2%e6%8b%89%e6%a0%bc%e6%85%95&showtype=double&searchCondition=N%3d50000265"},{"categoryid":227,"brandid":455,"name":"GUCCI","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-455.jpg","jumpurl":"yintaimobile://AutoProductList?title=GUCCI&showtype=double&searchCondition=N%3d50000455"},{"categoryid":228,"brandid":887,"name":"ARMANI JEANS","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-887.jpg","jumpurl":"yintaimobile://AutoProductList?title=ARMANI+JEANS&showtype=double&searchCondition=N%3d50000887"},{"categoryid":414,"brandid":1052,"name":"MAX MARA","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-1052.jpg","jumpurl":"yintaimobile://AutoProductList?title=Max+Mara&showtype=double&searchCondition=N%3d50001052"},{"categoryid":229,"brandid":369,"name":"VALENTINO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-369.jpg","jumpurl":"yintaimobile://AutoProductList?title=VALENTINO&showtype=double&searchCondition=N%3d50000369"}]}
         */

        private int id;
        private Object name;
        private AdvertisingBean advertising;
        private RecommendBean recommend;
        private BrandBean brand;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public AdvertisingBean getAdvertising() {
            return advertising;
        }

        public void setAdvertising(AdvertisingBean advertising) {
            this.advertising = advertising;
        }

        public RecommendBean getRecommend() {
            return recommend;
        }

        public void setRecommend(RecommendBean recommend) {
            this.recommend = recommend;
        }

        public BrandBean getBrand() {
            return brand;
        }

        public void setBrand(BrandBean brand) {
            this.brand = brand;
        }

        public static class AdvertisingBean  {
            /**
             * name : 分类广告管理
             * categoryadvertising : []
             */

            private String name;
            private List<?> categoryadvertising;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<?> getCategoryadvertising() {
                return categoryadvertising;
            }

            public void setCategoryadvertising(List<?> categoryadvertising) {
                this.categoryadvertising = categoryadvertising;
            }
        }

        public static class RecommendBean  {
            /**
             * name : 推荐类目
             * categoryrecommend : [{"categoryid":135,"name":"男装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/35b8dd47-7a41-444e-944b-a796758b583d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001896&showtype=double"},{"categoryid":136,"name":"女包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/43919901-d9db-4461-a722-b99e5e18fddb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E5%8C%85&searchCondition=N%3D10001891&showtype=double"},{"categoryid":137,"name":"男装衬衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/f0ef662c-005d-43fa-ab56-739c58e4641d.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85%E8%A1%AC%E8%A1%AB&searchCondition=N%3D10001898&showtype=double"},{"categoryid":143,"name":"男包","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a6c33bad-c675-4736-9513-1ae47d6db6bc.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E5%8C%85&searchCondition=N%3D10001890&showtype=double"},{"categoryid":144,"name":"女裙","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/eab8e69e-e048-44ed-95ec-13c2e5c47250.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%99&searchCondition=N%3D10001907&showtype=double"},{"categoryid":147,"name":"女鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/a13eb30f-bb48-4652-8eb3-2a1bd0528f75.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E9%9E%8B&searchCondition=N%3D10001889&showtype=double"},{"categoryid":146,"name":"男鞋","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/91c33cc7-c37b-4988-bd70-286cc0c79ccb.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E7%94%B7%E9%9E%8B&searchCondition=N%3D10001888&showtype=double"},{"categoryid":145,"name":"POLO衫","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/fd8812e6-cce9-4479-a33c-869312286b65.jpg","jumpurl":"yintaimobile://AutoProductList?title=POLO%E8%A1%AB&searchCondition=N%3D10001897&showtype=double"},{"categoryid":149,"name":"女装T恤","imageurl":"https://yrs.yintai.com/rs/img/AppCMS/images/85571aa2-1c1f-476a-a53c-efea7383b9a2.jpg","jumpurl":"yintaimobile://AutoProductList?title=%E5%A5%B3%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001902&showtype=double"}]
             */

            private String name;
            private List<CategoryrecommendBean> categoryrecommend;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<CategoryrecommendBean> getCategoryrecommend() {
                return categoryrecommend;
            }

            public void setCategoryrecommend(List<CategoryrecommendBean> categoryrecommend) {
                this.categoryrecommend = categoryrecommend;
            }

            public static class CategoryrecommendBean {
                /**
                 * categoryid : 135
                 * name : 男装T恤
                 * imageurl : https://yrs.yintai.com/rs/img/AppCMS/images/35b8dd47-7a41-444e-944b-a796758b583d.jpg
                 * jumpurl : yintaimobile://AutoProductList?title=%E7%94%B7%E8%A3%85T%E6%81%A4&searchCondition=N%3D10001896&showtype=double
                 */

                private int categoryid;
                private String name;
                private String imageurl;
                private String jumpurl;

                public int getCategoryid() {
                    return categoryid;
                }

                public void setCategoryid(int categoryid) {
                    this.categoryid = categoryid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImageurl() {
                    return imageurl;
                }

                public void setImageurl(String imageurl) {
                    this.imageurl = imageurl;
                }

                public String getJumpurl() {
                    return jumpurl;
                }

                public void setJumpurl(String jumpurl) {
                    this.jumpurl = jumpurl;
                }
            }
        }

        public static class BrandBean  {
            /**
             * name : 推荐品牌
             * brandrecommend : [{"categoryid":224,"brandid":270,"name":"BURBERRY","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-270.jpg","jumpurl":"yintaimobile://AutoProductList?title=BURBERRY&showtype=double&searchCondition=N%3d50000270"},{"categoryid":226,"brandid":265,"name":"SALVATORE FERRAGAMO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-265.jpg","jumpurl":"yintaimobile://AutoProductList?title=%e8%8f%b2%e6%8b%89%e6%a0%bc%e6%85%95&showtype=double&searchCondition=N%3d50000265"},{"categoryid":227,"brandid":455,"name":"GUCCI","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-455.jpg","jumpurl":"yintaimobile://AutoProductList?title=GUCCI&showtype=double&searchCondition=N%3d50000455"},{"categoryid":228,"brandid":887,"name":"ARMANI JEANS","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-887.jpg","jumpurl":"yintaimobile://AutoProductList?title=ARMANI+JEANS&showtype=double&searchCondition=N%3d50000887"},{"categoryid":414,"brandid":1052,"name":"MAX MARA","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-1052.jpg","jumpurl":"yintaimobile://AutoProductList?title=Max+Mara&showtype=double&searchCondition=N%3d50001052"},{"categoryid":229,"brandid":369,"name":"VALENTINO","imageurl":"https://p10.ytrss.com/brand/brandstore/brand-369.jpg","jumpurl":"yintaimobile://AutoProductList?title=VALENTINO&showtype=double&searchCondition=N%3d50000369"}]
             */

            private String name;
            private List<BrandrecommendBean> brandrecommend;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<BrandrecommendBean> getBrandrecommend() {
                return brandrecommend;
            }

            public void setBrandrecommend(List<BrandrecommendBean> brandrecommend) {
                this.brandrecommend = brandrecommend;
            }

            public static class BrandrecommendBean {
                /**
                 * categoryid : 224
                 * brandid : 270
                 * name : BURBERRY
                 * imageurl : https://p10.ytrss.com/brand/brandstore/brand-270.jpg
                 * jumpurl : yintaimobile://AutoProductList?title=BURBERRY&showtype=double&searchCondition=N%3d50000270
                 */

                private int categoryid;
                private int brandid;
                private String name;
                private String imageurl;
                private String jumpurl;

                public int getCategoryid() {
                    return categoryid;
                }

                public void setCategoryid(int categoryid) {
                    this.categoryid = categoryid;
                }

                public int getBrandid() {
                    return brandid;
                }

                public void setBrandid(int brandid) {
                    this.brandid = brandid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getImageurl() {
                    return imageurl;
                }

                public void setImageurl(String imageurl) {
                    this.imageurl = imageurl;
                }

                public String getJumpurl() {
                    return jumpurl;
                }

                public void setJumpurl(String jumpurl) {
                    this.jumpurl = jumpurl;
                }
            }
        }
    }
}
