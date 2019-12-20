package bm.app.model;

public class Food {

    private String kindOfFood;
    private String nameOfFood;
    private int amount;
    private boolean ifHealthy;

    public Food(){

    }

    public Food(String kindOfFood, String nameOfFood, int amount, boolean ifHealthy) {
        this.kindOfFood = kindOfFood;
        this.nameOfFood = nameOfFood;
        this.amount = amount;
        this.ifHealthy = ifHealthy;
    }

    public String getKindOfFood() {
        return kindOfFood;
    }

    public void setKindOfFood(String kindOfFood) {
        this.kindOfFood = kindOfFood;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public void setNameOfFood(String nameOfFood) {
        this.nameOfFood = nameOfFood;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isIfHealthy() {
        return ifHealthy;
    }

    public void setIfHealthy(boolean ifHealthy) {
        this.ifHealthy = ifHealthy;
    }
}
