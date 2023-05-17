package javaQuiz2;

public class Employee {

    String firstName;
    String lastName;
    float salary;
    int age;
    public void printInfo(){
        System.out.println("Employee info\n" +
                firstName +"\n" +
                lastName + "\n" +
                age + "\n"+
                salary);
    }
    public void calculateBonus(){
        float bonus = salary*0.05f;
        System.out.println ("Monthly salary after 5% bonus is " + (salary + bonus));

    }
    public static void main(String[] args) {

        Employee employeeInfo = new Employee ();

        employeeInfo.firstName = "Mark";
        employeeInfo.lastName ="Chen";
        employeeInfo.age = (27);
        employeeInfo.salary = 5000f;

        employeeInfo.printInfo ();
        employeeInfo.calculateBonus ();
    }

}
