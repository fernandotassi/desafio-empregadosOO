package application;

import entities.Adress;
import entities.Department;
import entities.Employee;
import java.util.*;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Date d = new Date();
        System.out.println(d);
        int i, n;

        System.out.print("Nome do departamento:");
        String name = scan.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = scan.nextInt();
        System.out.print("Email: ");
        scan.nextLine();
        String email = scan.nextLine();
        System.out.print("Telefone: ");
        String phone = scan.nextLine();
        Adress adress = new Adress(email, phone);
        Department department = new Department(name, payDay, adress);
        System.out.print("Quantos funcionários tem o departamento? ");
        n = scan.nextInt();
        for(i = 0; i < n; i++)
        {
            System.out.println("Dados do funcionário " + (i + 1) + ":");
            System.out.print("Nome: ");
            scan.nextLine();
            String employeeName = scan.nextLine();
            System.out.print("Salário: ");
            Double salary = scan.nextDouble();
            Employee employee = new Employee(employeeName, salary);
            department.addEmployee(employee);
        }
        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println(department);












        scan.close();
    }
}
