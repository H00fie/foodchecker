package bm.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String kindOfFood;
    private String nameOfFood;
    private int amount;
    private String ifHealthy;

    public Food(){

    }

    public Food(String kindOfFood, String nameOfFood, int amount, String ifHealthy) {
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

    public String isIfHealthy() {
        return ifHealthy;
    }

    public void setIfHealthy(String ifHealthy) {
        this.ifHealthy = ifHealthy;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", kindOfFood='" + kindOfFood + '\'' +
                ", nameOfFood='" + nameOfFood + '\'' +
                ", amount=" + amount +
                ", ifHealthy='" + ifHealthy + '\'' +
                '}';
    }
}
