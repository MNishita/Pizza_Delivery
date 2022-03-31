package model.food;

public abstract class Item {
    String itemName;
    Integer preparationTimeInMins;

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Integer getPreparationTimeInMins() {
        return preparationTimeInMins;
    }
    public void setPreparationTimeInMins(Integer preparationTime) {
        this.preparationTimeInMins = preparationTime;
    }
    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", preparationTimeInMins=" + preparationTimeInMins +
                '}';
    }
}
