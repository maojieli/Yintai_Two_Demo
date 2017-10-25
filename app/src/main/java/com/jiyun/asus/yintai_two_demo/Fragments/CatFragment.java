package com.jiyun.asus.yintai_two_demo.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jiyun.asus.yintai_two_demo.Adapters.ShoppingCartAdapter;
import com.jiyun.asus.yintai_two_demo.Beans.ShoppingCartBean;
import com.jiyun.asus.yintai_two_demo.GRDAO.CarDao;
import com.jiyun.asus.yintai_two_demo.GRDAO.DaoManager;
import com.jiyun.asus.yintai_two_demo.R;

import java.util.ArrayList;
import java.util.List;

import static com.jiyun.asus.yintai_two_demo.R.id.rl_bottom;

/**
 * 当你的才华满足不了你的野心的时候，那么你应该静下心来学习.
 */

public class CatFragment extends Fragment implements
        View.OnClickListener
        , ShoppingCartAdapter.CheckInterface,
        ShoppingCartAdapter.ModifyCountInterface{

    public TextView tv_settlement, tv_show_price,sfby;
    private TextView tv_all_check;
    private CheckBox ck_all;
    private ListView list_shopping_cart;
    private ShoppingCartAdapter shoppingCartAdapter;
    private TextView tv_edit;
    private boolean flag = false;
    private List<ShoppingCartBean> shoppingCartBeanList = new
            ArrayList<>();
    private boolean mSelect;
    private double totalPrice = 0.00;// 购买的商品总价
    private int totalCount = 0;//
    private RelativeLayout rl;
    private ShoppingCartBean shoppingCartBean;
    private ImageView kct;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle
                                     savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_shopping_cart_activity, null);

        list_shopping_cart = view.findViewById(R.id.list_shopping_cart);
//        list_shopping_cart.setOnItemClickListener(this);
        ck_all = view.findViewById(R.id.ck_all);
        ck_all.setOnClickListener(this);
        sfby = view.findViewById(R.id.sfby);
//        ck_all.setOnCheckedChangeListener(this);
        tv_show_price = view.findViewById(R.id.tv_show_price);
        tv_settlement = view.findViewById(R.id.tv_settlement);
        rl = view.findViewById(rl_bottom);
        tv_settlement.setOnClickListener(this);
        tv_edit = view.findViewById(R.id.tv_edit);
        tv_edit.setOnClickListener(this);
        kct = view.findViewById(R.id.kcy);



        shoppingCartAdapter = new ShoppingCartAdapter(getContext());
        shoppingCartAdapter.setCheckInterface(this);
        shoppingCartAdapter.setModifyCountInterface(this);
        list_shopping_cart.setAdapter(shoppingCartAdapter);
        shoppingCartAdapter.setShoppingCartBeanList(shoppingCartBeanList);
        initData();


        return view;
    }



    protected void initData() {
        List<CarDao> list = DaoManager.getInstance(getContext()).getDao().queryBuilder().list();
        for (int i = 0; i < list.size(); i++) {
            shoppingCartBean = new ShoppingCartBean();
            shoppingCartBean.setShoppingName(list.get(i).getShopname());
            shoppingCartBean.setFabric(list.get(i).getShopcontent());
            shoppingCartBean.setPrice(list.get(i).getShopprice());
            shoppingCartBean.setCount(1);
            shoppingCartBean.setImageUrl(list.get(i).getShopimg());
            shoppingCartBeanList.add(shoppingCartBean);
        }



    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //全选按钮
            case R.id.ck_all:
                if (shoppingCartBeanList.size() != 0) {
                    if (ck_all.isChecked()) {
                        for (int i = 0; i <
                                shoppingCartBeanList.size(); i++) {
                            shoppingCartBeanList.get
                                    (i).setChoosed(true);
                        }

                        shoppingCartAdapter.notifyDataSetChanged();
                    } else {
                        for (int i = 0; i <
                                shoppingCartBeanList.size(); i++) {
                            shoppingCartBeanList.get
                                    (i).setChoosed(false);
                        }

                        shoppingCartAdapter.notifyDataSetChanged();
                    }
                }
                statistics();
                break;
            case R.id.tv_edit:
                flag = !flag;
                if (flag) {
                    tv_edit.setText("完成");
                    shoppingCartAdapter.isShow(false);
                } else {
                    tv_edit.setText("编辑");
                    shoppingCartAdapter.isShow(true);
                }
                break;
        }
    }

    @Override
    public void checkGroup(int position, boolean isChecked) {
        shoppingCartBeanList.get(position).setChoosed
                (isChecked);

        if (isAllCheck())
            ck_all.setChecked(true);
        else
            ck_all.setChecked(false);

        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }
    private boolean isAllCheck() {

        for (ShoppingCartBean group : shoppingCartBeanList) {
            if (!group.isChoosed())
                return false;
        }
        return true;
    }
    public void statistics() {
        totalCount = 0;
        totalPrice = 0.00;
        for (int i = 0; i < shoppingCartBeanList.size(); i++)
        {
            ShoppingCartBean shoppingCartBean =
                    shoppingCartBeanList.get(i);
            if (shoppingCartBean.isChoosed()) {
                totalCount++;
                totalPrice += shoppingCartBean.getPrice() *
                        shoppingCartBean.getCount();
            }
        }
        tv_show_price.setText("合计:" + totalPrice);
        tv_settlement.setText("结算(" + totalCount + ")");
        if(totalPrice<199){
            sfby.setText("价格小于199,请掏15的邮费");
        }else{
            sfby.setText("价格大于199,邮费不用");
        }

    }
    @Override
    public void doIncrease(int position, View showCountView,
                           boolean isChecked) {
        ShoppingCartBean shoppingCartBean =
                shoppingCartBeanList.get(position);
        int currentCount = shoppingCartBean.getCount();
        currentCount++;
        shoppingCartBean.setCount(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }

    @Override
    public void doDecrease(int position, View showCountView,
                           boolean isChecked) {
        ShoppingCartBean shoppingCartBean =
                shoppingCartBeanList.get(position);
        int currentCount = shoppingCartBean.getCount();
        if (currentCount == 1) {
            return;
        }
        currentCount--;
        shoppingCartBean.setCount(currentCount);
        ((TextView) showCountView).setText(currentCount + "");
        shoppingCartAdapter.notifyDataSetChanged();
        statistics();
    }

    @Override
    public void childDelete(int position) {
        shoppingCartBeanList.remove(position);
        if(shoppingCartBeanList.size()==0){
            rl.setVisibility(View.GONE);
            tv_edit.setVisibility(View.GONE);
            kct.setVisibility(View.VISIBLE);
        }else{
            rl.setVisibility(View.VISIBLE);
            tv_edit.setVisibility(View.VISIBLE);
            kct.setVisibility(View.GONE);
        }

        shoppingCartAdapter.notifyDataSetChanged();
        statistics();

    }


}

