package entities;

import java.util.*;

public class Department
{
    private String name;
    private Integer payDay;
    private Adress adress;
    private List<Employee> employee = new ArrayList<>();

    public Department(){}

    public Department(String name, Integer payDay, Adress adress)
    {this.name = name; this.payDay = payDay; this.adress = adress;}

    public void setName(String name){this.name = name;}

    public void setPayDay(Integer payDay){this.payDay = payDay;}

    public void setAdress(Adress adress){this.adress = adress;}

    public void setEmployee(List<Employee> employee){this.employee = employee;}

    public String getName(){return name;}

    public Integer getPayDay(){return payDay;}

    public Adress getAdress(){return adress;}

    public List<Employee> getEmployee(){return employee;}

    public void addEmployee(Employee employee){this.employee.add(employee);}

    public void removeEmployee(Employee employee){this.employee.remove(employee);}

    public Double payroll()
    {Double res = 0.;
        for(Employee emp: employee)
            res += emp.getSalary();
        return res;
    }
}
