package com.mytsai.springbootmall.dto;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class CreateOrderRequest {

    @NotEmpty
    private List<BuyItem> BuyItemList;

    public List<BuyItem> getBuyItemList() {
        return BuyItemList;
    }

    public void setBuyItemList(List<BuyItem> buyItemList) {
        BuyItemList = buyItemList;
    }
}
