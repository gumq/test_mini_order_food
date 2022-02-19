package com.example.abhishek1147.foodorderapp;


public class Item {
    public int    iItemSeqNum;
    public String strItemName;
    public double dItemPrice;
    public int    iItemOrdNum;
    public int    iItemImgId;

    public Item(int iItemSeqNum, String strItemName, double dItemPrice, int iItemOrdNum, int iItemImgId){
        this.iItemSeqNum = iItemSeqNum;
        this.strItemName = strItemName;
        this.dItemPrice  = dItemPrice;
        this.iItemOrdNum = iItemOrdNum;
        this.iItemImgId  = iItemImgId;
    }

    public void setItemOrdNum(int iItemOrdNum){
        this.iItemOrdNum = iItemOrdNum;
    }
}