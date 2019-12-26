package bm.app.repository;

import bm.app.model.Food;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodRepository {

    @Autowired
    HibernateSessionFactoryService hsfs;

    public void addNewFood(Food food){
        Session session = hsfs.getSession();
        Transaction tran = session.beginTransaction();
        session.save(food);
        tran.commit();
        session.close();
    }

    public Food getAllRecords(){

        Session session2 = this.hsfs.getSession();
        Food foods = (Food) session2.createQuery("SELECT * FROM bm.app.model.Food", Food.class).list();
        session2.close();
        return foods;

    }

    /*public Food doYouEatWell(){
        int numberOfHealthy = 0;
        int numerOfUnhealthy = 0;
        Session session3 = this.hsfs.getSession();
        Food food1 = (Food) session3.createQuery("* FROM bm.app.model.Food WHERE ifHealthy IS 'Yes'");
        Food food2 = (Food) session3.createQuery("* FROM bm.app.model.Food WHERE ifHealthy IS 'No'");

        session3.close();
        return ;

    }*/
}
