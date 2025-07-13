package org.Example.dao;

import org.Example.HibernateUtil;
import org.Example.model.Expense;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ExpenseDAO {

    public void addExpense(Expense e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();
    }

    public List<Expense> getAllExpense(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Expense",Expense.class).list();
        }
    }

    public void deleteExpense(int id){

        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Expense e = session.find(Expense.class,id);
            if(e != null) {
                session.remove(e);
                tx.commit();
                System.out.println("Expense deleted with id " + id );
            } else {
                System.out.println("Id not found");
                tx.rollback();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
