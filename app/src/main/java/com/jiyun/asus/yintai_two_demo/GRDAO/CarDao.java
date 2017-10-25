package com.jiyun.asus.yintai_two_demo.GRDAO;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 今天的你，一定要比昨天厉害那么一丢丢；
 * 作者：小昭 on 2017/10/25 22:21；
 */
@Entity(nameInDb = "cardao")//设置表名
public class CarDao {
    @Id(autoincrement = true)//设置Id，id必须为Long类型，autoincrement设置id自增长
        private Long id;
        @Property(nameInDb = "shopname")//设置对应表中的字段名称
        private String shopname;
        @Property(nameInDb = "shopcontent")
         private String shopcontent;
        @Property(nameInDb = "shopprice")
        private int shopprice;
        @Property(nameInDb = "shopimg")
        private String shopimg;
        @Generated(hash = 793545035)
        public CarDao(Long id, String shopname, String shopcontent, int shopprice,
                String shopimg) {
            this.id = id;
            this.shopname = shopname;
            this.shopcontent = shopcontent;
            this.shopprice = shopprice;
            this.shopimg = shopimg;
        }
        @Generated(hash = 412582201)
        public CarDao() {
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getShopname() {
            return this.shopname;
        }
        public void setShopname(String shopname) {
            this.shopname = shopname;
        }
        public String getShopcontent() {
            return this.shopcontent;
        }
        public void setShopcontent(String shopcontent) {
            this.shopcontent = shopcontent;
        }
        public int getShopprice() {
            return this.shopprice;
        }
        public void setShopprice(int shopprice) {
            this.shopprice = shopprice;
        }
        public String getShopimg() {
            return this.shopimg;
        }
        public void setShopimg(String shopimg) {
            this.shopimg = shopimg;
        }

}
