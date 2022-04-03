package ru.skypro;

public class Main {

    public static void main(String[] args) {
       Employee[] employees = new Employee[10];
       employees[0] = new Employee("Иванов Михаил Юрьевич",2,50000);
       employees[1] = new Employee("Петров Евгений Михайлович",1,85000);
       employees[2] = new Employee("Григорьев Дмитрий Васильевич",3,100000);
       Employee.all(employees);
       Employee.allSalary(employees);
       Employee.minSalary(employees);
       Employee.maxSalary(employees);
       Employee.averageSalary(employees);
       Employee.allFirstnames(employees);
    }
}
