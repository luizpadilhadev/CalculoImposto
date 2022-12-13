import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of taxpayers: ");
                int n = sc.nextInt();
                List<TaxPayer> list = new ArrayList<TaxPayer>();
                for (int i = 1; i<=n; i++){
                    System.out.println("Taxpayer #" + i + " data:");
                    System.out.print("Individual or company (i/c)? ");
                    char ch = sc.next().charAt(0);
                    System.out.print("Name: ");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.print("Anual income: ");
                    double anualincome = sc.nextDouble();
                    if (ch == 'i'){
                        System.out.print("Health expenditures: ");
                        double he = sc.nextDouble();
                        Individual x = new Individual(name, anualincome, he);
                        list.add(x);
                    }
                    else{
                        System.out.print("Number of employees: ");
                        Integer numberOfEmployees = sc.nextInt();
                        list.add(new Company(name, anualincome, numberOfEmployees));
                    }
                }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}