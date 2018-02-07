package com.thelosers.internshiptrail.Model;

/**
 * Created by deepak on 07/02/18.
 */

public class Product {
    String mTitle;

    public String getProduct() {
        return mProduct;
    }

    public void setProduct(String mProduct) {
        this.mProduct = mProduct;
    }

    String mProduct;
    int mDrawable;


    public Product(String mProduct) {
        this.mProduct = mProduct;

    }
    public Product(String mTitle, int mDrawable) {
        this.mTitle = mTitle;

        this.mDrawable = mDrawable;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public int getDrawable() {
        return mDrawable;
    }

    public void setDrawable(int mDrawable) {
        this.mDrawable = mDrawable;
    }
}
