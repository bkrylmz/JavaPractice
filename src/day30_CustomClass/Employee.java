package day30_CustomClass;

public class Employee {
    public String name;
    public int ID;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int ID, int age, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "EmployeeClass{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(name+ " is working");
    }





}
