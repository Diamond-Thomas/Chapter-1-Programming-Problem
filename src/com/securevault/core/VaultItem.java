public class VaultItem {
    private String itemName;
    private Double itemValue;

    public VaultItem(String itemName,Double itemValue){
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public String getItemName(){return itemName;}
    public Double getItemValue(){return itemValue;}

    public String toString(){
        return String.format("Item: %s, Value: $%.2f" , itemName, itemValue);

    }


}

public void main(String[] args) {

}
