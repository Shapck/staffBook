package ru.skypro;

public class Employee {
    String fullName;
    int department;
    int salary;
    static int counter;
    int id;

    public Employee(String fullName, int department, int salary) {
        this.id = getCounter();
        counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public static void all(Employee emp[]){
        for(int i = 0; i < counter; i++ ) System.out.println(emp [i]);
    }

    public static void allFirstnames(Employee emp[]){
        for(int i = 0; i < counter; i++ ) System.out.println(emp[i].fullName);
    }

    public static void allSalary(Employee emp[]){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += emp[i].salary;
        }
        System.out.println(sum);
    }

    public static void averageSalary(Employee emp[]) {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += emp[i].salary;
        }
        System.out.println(sum/counter);
    }

    public static void minSalary(Employee emp[]) {
        int min = emp[0].salary;
        int minIndex = 0;
        for (int i = 1; i < counter; i++){
            if(emp[i].salary < min){
                min = emp[i].salary;
                minIndex = i;
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Employee emp[]) {
        int max = emp[0].salary;
        int maxIndex = 0;
        for (int i = 1; i < counter; i++) {
            if(emp[i].salary > max){
                max = emp[i].salary;
                maxIndex = i;
            }
        }
        System.out.println(max);
    }


    @Override
    public String toString() {
        return "Полное имя:" + fullName + "; " + "Отдел:" + department + "; " + "Зарпалата:" +salary+  "; " + "id:" + id;
    }

}