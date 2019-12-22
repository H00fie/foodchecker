package bm.app.repositories;

import bm.app.model.Food;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
