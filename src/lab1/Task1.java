package lab1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        EmployeeManagementSystem system1=new EmployeeManagementSystem();
        EmployeeManagementSystem.Employee A=new EmployeeManagementSystem.Employee("A",23);
        EmployeeManagementSystem.Employee B=new EmployeeManagementSystem.Employee("B",24);
        EmployeeManagementSystem.Employee C=new EmployeeManagementSystem.Employee("C",25);
        EmployeeManagementSystem.Employee D=new EmployeeManagementSystem.Employee("D",26);
        system1.addEmployee(A);
        system1.addEmployee(B);
        system1.addEmployee(C);
        system1.getEmployees();
        System.out.println();
        system1.deleteEmployee(B);
        system1.addEmployee(D);
        system1.getEmployees();
        System.out.println();
        system1.addEmployee(A);
        system1.getEmployees();
    }

    public static class EmployeeManagementSystem {
        private ArrayList<Employee> Employees;
        public EmployeeManagementSystem(){
            this.Employees=Employees=new ArrayList<Employee>();
        }

        public void addEmployee(Employee e){
            if(!Employees.contains(e)){
                Employees.add(e);
            }
        }

        public void deleteEmployee(Employee e){
            if(Employees.contains(e)){
                Employees.remove(e);
            }
        }

        public void getEmployees(){
            for (Employee e:
                    Employees) {
                System.out.println("Name: "+e.Name+"  "+"Age: "+e.age);
            }
        }

        public static class Employee{
            private String Name;
            private int age;
            public Employee(String Name,int age){
                this.Name=Name;
                this.age=age;
            }

            public String getName() {
                return Name;
            }
            public int getAge(){
                return age;
            }
        }


    }
}
