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
        for (int i = 1; i < counter; i++) {
            if(emp[i].salary > max){
                max = emp[i].salary;
            }
        }
        System.out.println(max);
    }

    public static void indexSalary(int department, Employee emp[]) {
        for (int i = 0; i < counter; i++) {
            emp[i].salary = (emp[i].salary * department) + emp[i].salary;
        }
    }

    public static void departmentSalaryMin(int department, Employee emp[]) {
        int min = 1000000000;
        for (int i = 0; i < counter; i++) {
            if(emp[i].department == department){
                if(emp[i].salary < min){
                    min = emp[i].salary;
                }
            }
        }
        System.out.println(min);
    }

    public static void departmentSalaryMax(int department, Employee emp[]) {
        int max = 0;
        for (int i = 0; i < counter; i++) {
            if(emp[i].department == department){
                if(emp[i].salary > max){
                    max = emp[i].salary;
                }
            }
        }
        System.out.println(max);
    }

    public static void departmentSalaryAll(int department, Employee emp[]) {
        int salary = 0;
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department){
                salary += emp[i].salary;
            }
        }
        System.out.println(salary);
    }



    public static void departmentSalaryMean(int department, Employee emp[]) {
        int salary = 0;
        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department){
                salary += emp[i].salary;
                count++;
            }
        }
        System.out.println(salary/count);
    }

    public static void departmentSalaryIndex(int percent,int department, Employee emp[]) {
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department) {
                emp[i].salary = (emp[i].salary * percent) + emp[i].salary;
            }
        }
    }

    public static void departmentAllStaff(int department, Employee emp[]) {
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department) {
                System.out.println("Полное имя:" + emp[i].fullName+ "; " + "Зарпалата:"+ emp[i].salary +"; " + "id:" + emp[i].id);
            }
        }
    }

    public static void findMinDepartmentSalary(int department, int salary, Employee emp[]) {
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department && emp[i].salary < salary) {
                    System.out.println("Полное имя:" + emp[i].fullName + "; " + "Зарпалата:" + emp[i].salary + "; " + "id:" + emp[i].id);
            }
        }
    }

    public static void findMaxDepartmentSalary(int department, int salary, Employee emp[]) {
        for (int i = 0; i < counter; i++) {
            if (emp[i].department == department && emp[i].salary > salary) {
                System.out.println("Полное имя:" + emp[i].fullName + "; " + "Зарпалата:" + emp[i].salary + "; " + "id:" + emp[i].id);
            }
        }
    }




    @Override
    public String toString() {
        return "Полное имя:" + fullName + "; " + "Отдел:" + department + "; " + "Зарпалата:" +salary+  "; " + "id:" + id;
    }

}