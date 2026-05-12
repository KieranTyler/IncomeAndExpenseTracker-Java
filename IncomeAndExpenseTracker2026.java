/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incomeandexpensetracker2026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kieran.gordon
 */
class Income
{
    String incomeName;
    double incomeAmount;
    
    Income(String incomeName, double incomeAmount)
    {
        this.incomeName = incomeName;
        this.incomeAmount = incomeAmount;
    }
}

class Expense 
{
    String name;
    double amount;

    Expense(String name, double amount) 
    {
        this.name = name;
        this.amount = amount;
    }
}

public class IncomeAndExpenseTracker2026 
{

    static ArrayList<Expense> expenses = new ArrayList<>();
    static ArrayList<Income> incomes = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    double netProfit;
    

    public static void main(String[] args) 
    {

        while (true) 
        {
            System.out.println("Choose below: ");
            System.out.println("1. Add an expense");
            System.out.println("2. View your expenses");
            System.out.println("3. Total of expenses");
            System.out.println("4. Add income");
            System.out.println("5. View your income");
            System.out.println("6. Total income");
            System.out.println("7. View your net profit");
            System.out.println("8. Exit");
            

            int choice = input.nextInt();
            input.nextLine();

            if(choice == 1) 
            {
                addExpense();
            } 
            else if(choice == 2) 
            {
                viewExpenses();
            } 
            else if(choice == 3) 
            {
                showTotal();
            }
            else if(choice == 4)
            {
                addIncome();
            }
            else if(choice == 5)
            {
                viewIncome();
            }
            else if(choice == 6)
            {
                incomeTotal();
            }
            else if(choice == 7)
            {
                double totalExpenses = 0;
                double totalIncome = 0;
                
                for(Expense e: expenses)
                {
                    totalExpenses = totalExpenses + e.amount;
                }
                
                for(Income i: incomes)
                {
                    totalIncome = totalIncome + i.incomeAmount;
                }
                double difference =  totalIncome - totalExpenses;
                System.out.println("Income less expenses is " + difference);
            }
            else if(choice == 8) 
            {
                break;
            }
        }
    }

    static void addExpense() 
    {
        System.out.print("Enter a name for the expense: ");
        String name = input.nextLine();

        System.out.print("Enter an amount for the expense: ");
        double amount = input.nextDouble();
        input.nextLine();

        expenses.add(new Expense(name, amount));
    }

    static void viewExpenses() 
    {
        for (Expense e : expenses) 
        {
            System.out.println(e.name + " - R" + e.amount);
        }
    }

    static void showTotal() 
    {
        double total = 0;

        for (Expense e : expenses) 
        {
            total = total + e.amount;
        }

        System.out.println("Total of expenses: R" + total);
    }
    
    static void addIncome()
    {
        System.out.print("Enter a name for the income: ");
        String incomeName = input.nextLine();
        
        System.out.print("Enter the income amount: ");
        Double incomeAmount = input.nextDouble();
        
        incomes.add(new Income(incomeName, incomeAmount));
        
        
    }
    
    static void viewIncome()
    {
        for (Income i: incomes)
        {
            System.out.println(i.incomeName + " - R" + i.incomeAmount);
        }
    }
    
    static void incomeTotal() 
    {
        double total = 0;

        for (Income i: incomes) 
        {
            total = total + i.incomeAmount;
        }

        System.out.println("Total income: R" + total);
    }
}

