package baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msv = "",name = "",phone="",address="";
        int born=0,year = 2022;
        boolean sex=true;

        do {
            System.out.println("1.Enter your information");
            System.out.println("2.Display information");
            System.out.println("3.Age?");
            System.out.println("4.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter ID:");
                    msv = scanner.nextLine();
                    System.out.println("Enter name:");
                    name = scanner.nextLine();
                    System.out.println("Date of Birth(year)");
                    born = Integer.parseInt(scanner.nextLine());
                    System.out.println("Sex?");
                   sex = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Phone?");
                     phone = scanner.nextLine();
                    System.out.println("Address?");
                       address = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Id: "+msv);
                    System.out.println("Name: "+name);
                    System.out.println("Date of birth: "+born);
                    System.out.println("Gender: "+sex);
                    System.out.println("Phone: "+phone);
                    System.out.println("Address: "+address);
                    break;
                case 3:
                    int age = year - born;
                    System.out.printf("Tuoi cua ban la: %d\n",age);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }
}
