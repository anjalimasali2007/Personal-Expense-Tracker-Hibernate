package org.Example;

import org.Example.dao.ExpenseDAO;
import org.Example.model.Expense;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseDAO dao = new ExpenseDAO();
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("***** Expense Tracker Menu *****");
            System.out.println("1. Add Expense");
            System.out.println("2.View All Expense");
            System.out.println("3.Delete Expense");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Date: ");
                    LocalDate date = LocalDate.parse(sc.nextLine());
                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    Expense expense = new Expense(LocalDate.now(), amount, category, description);
                    dao.addExpense(expense);
                    System.out.println("Expense Added.");
                    break;
                }
                case 2: {
                    List<Expense> list = dao.getAllExpense();
                    System.out.println("ID | Date | Amount | Description | Category ");
                    list.forEach(e -> System.out.println(
                            e.getId() + " | " + e.getDate() + " | " +
                                    e.getAmount() + " | " + e.getCategory() + " | " + e.getDescription()));
                    break;
                }
                case 3: {
                    System.out.print("Enter Expense ID to delete:");
                    int id = sc.nextInt();
                    dao.deleteExpense(id);
                    break;
                }
                case 4: {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}