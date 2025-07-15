package org.Example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.Example.model.Expense;

import java.util.List;

public class ExpenseDAO {

    public static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExpenseTracker");

    public void addExpense(Expense e){
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();

        try{
            t.begin();
            em.persist(e);
            t.commit();
        }catch(Exception ex)  {
            if(t.isActive()) t.rollback();
        }finally {
            em.close();
        }
    }

    public List<Expense> getAllExpense(){
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("FROM Expense",Expense.class).getResultList();
        }finally {
            em.close();
        }
    }

    public void deleteExpense(int id){
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();

        try{
            t.begin();
            Expense e = em.find(Expense.class,id);
            if(e != null){
                em.remove(e);
            }
            t.commit();
        }catch (Exception ex){
            if (t.isActive()) t.rollback();
            ex.printStackTrace();
        }finally {
            em.close();
        }
    }
}
