package com.example.flurfid.ui.supplier.entiey;

import androidx.annotation.NonNull;

public class SupplicerData {
    private String ordernumber;
    private String orderTime;
    private String orderinfo;
    private String goodsum;
    private String supplierName;
    private String orderdescribe;
    private String gooddescribe;
    private String goodfid;

    public SupplicerData() {
    }

    public SupplicerData(String ordernumber, String orderTime, String orderinfo, String goodsum, String supplierName, String orderdescribe, String gooddescribe, String goodfid) {
        this.ordernumber = ordernumber;
        this.orderTime = orderTime;
        this.orderinfo = orderinfo;
        this.goodsum = goodsum;
        this.supplierName = supplierName;
        this.orderdescribe = orderdescribe;
        this.gooddescribe = gooddescribe;
        this.goodfid = goodfid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderinfo() {
        return orderinfo;
    }

    public void setOrderinfo(String orderinfo) {
        this.orderinfo = orderinfo;
    }

    public String getGoodsum() {
        return goodsum;
    }

    public void setGoodsum(String goodsum) {
        this.goodsum = goodsum;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getOrderdescribe() {
        return orderdescribe;
    }

    public void setOrderdescribe(String orderdescribe) {
        this.orderdescribe = orderdescribe;
    }

    public String getGooddescribe() {
        return gooddescribe;
    }

    public void setGooddescribe(String gooddescribe) {
        this.gooddescribe = gooddescribe;
    }

    public String getGoodfid() {
        return goodfid;
    }

    public void setGoodfid(String goodfid) {
        this.goodfid = goodfid;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
