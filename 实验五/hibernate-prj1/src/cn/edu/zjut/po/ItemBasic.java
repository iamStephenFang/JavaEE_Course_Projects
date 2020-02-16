package cn.edu.zjut.po;

public class ItemBasic {
    private String itemID;
    private String title;
    private String description;
    private Float cost;

    public ItemBasic() {
    }

    public ItemBasic(String itemID) {
        this.itemID = itemID;
    }

    public ItemBasic(String itemID, String title, String description, float cost) {
        this.itemID = itemID;
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
