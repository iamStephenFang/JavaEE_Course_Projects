package cn.edu.zjut.po;

import java.sql.Blob;

public class ItemDetail extends ItemBasic {
    private Blob image;

    public ItemDetail() {
    }

    public ItemDetail(String itemID, String title, String description, float cost, Blob image) {
        super(itemID, title, description, cost);
        this.image = image;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}