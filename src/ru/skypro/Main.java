package ru.skypro;

public class Main {

    public static void main(String[] args) {
       Employee[] employees = new Employee[10];
       employees[0] = new Employee("Иванов Михаил Юрьевич",1,50000);
       employees[1] = new Employee("Петров Евгений Михайлович",1,85000);
       employees[2] = new Employee("Григорьев Дмитрий Васильевич",1,100000);
       employees[3] = new Employee("Егоров Василий Васильевич",1,150000);
       Employee.all(employees);
       Employee.allSalary(employees);
       Employee.minSalary(employees);
       Employee.maxSalary(employees);
       Employee.averageSalary(employees);
       Employee.allFirstnames(employees);
       Employee.departmentSalaryMax(1,employees);
       Employee.departmentSalaryMin(1,employees);
       Employee.departmentSalaryMean(1,employees);
       Employee.departmentSalaryAll(1,employees);
       Employee.findMinDepartmentSalary(1,100000,employees);
       Employee.findMaxDepartmentSalary(1,100000,employees);
    }
}
