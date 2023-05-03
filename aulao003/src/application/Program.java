/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);//Config decimais padrão US
        Scanner sc = new Scanner(System.in); // Scanner para entrada

        List<Employee> list = new ArrayList<>();//lista tipo employee

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();

        // For para rodar N(quantidade que o usuário digitou) vezes
        for (int i = 0; i < N; i++) {

            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();//limpar o buffer
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            //Instanciando a classe com os dados recebidos
            Employee emp = new Employee(id, name, salary);
            //Guarda na lista
            list.add(emp);

        }
        //Pedir id que sofrerá aumento
        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exists! ");// Se não encontrar
        } else {
            System.out.println("Enter percentage: ");//Se encontrar porcentagem

            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list) {//for each
            System.out.println(emp);
        }

        sc.close();
    }//fim public static void main

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }

        return null;//mulo com wrapper Integer
    }
}
