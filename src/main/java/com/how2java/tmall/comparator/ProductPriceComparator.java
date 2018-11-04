package com.how2java.tmall.comparator;

import com.how2java.tmall.pojo.Product;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product>{
    @Override
    public int compare(Product p1, Product p2) {
        double result = p1.getPromotePrice() - p2.getPromotePrice();
        return (int) (result < 0 ? Math.floor(result) : Math.ceil(result));
    }
}
