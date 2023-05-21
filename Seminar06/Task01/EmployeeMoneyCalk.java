package Seminar06.Task01;

public class EmployeeMoneyCalk {
    private int baseSalary;

    public EmployeeMoneyCalk(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
}