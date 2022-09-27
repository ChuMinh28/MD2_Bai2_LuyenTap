package baitap;

import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        boolean check;
        do {
            System.out.println("================Menu================");
            System.out.println("1.in ra cac so chan va tinh tong");
            System.out.println("2.In ra cac so le va tinh tong");
            System.out.println("3.Kiem tra n co phai so nguyen to khong");
            System.out.println("4.Kiem tra n co phai so hoan hao khong");
            System.out.println("5.In ra cac so nguyen to trong khoang 0...n");
            System.out.println("6.In ra cac uoc so cua n va tinh tong");
            System.out.println("7.Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    sum = 0;
                    System.out.printf("cac co chan trong khoang tu 1 den %d la:\n",n);
                    for (int i = 1; i <=n; i++) {
                        if (i%2==0){
                            System.out.printf("%d\t",i);
                            sum += i;
                        }
                    }
                    System.out.printf("\nTong cac so chan la: %d\n",sum);
                    break;
                case 2:
                    sum = 0;
                    System.out.printf("cac so le trong khoang tu 1 den %d la:\n",n);
                    for (int i = 1; i <=n; i++) {
                        if (i%2!=0){
                            System.out.printf("%d\t",i);
                            sum += i;
                        }
                    }
                    System.out.printf("\nTong cac so le la: %d\n",sum);
                    break;
                case 3:
                    if (n>=2){
                        check = false;
                        for (int i = 2; i <= Math.sqrt(n); i++) {
                            if (n%i==0){
                                check = true;
                                break;
                            }
                        }
                        if (check){
                            System.out.printf("%d khong phai la so nguyen to\n",n);
                        }else {
                            System.out.printf("%d la so nguyen to\n",n);
                        }
                    }else {
                        System.out.printf("%d khong phai la so nguyen to\n",n);
                    }

                    break;
                case 4:
                    sum = 0;
                    for (int i = 1; i<n;i++){
                        if (n%i==0){
                            sum += i;
                        }
                    }
                    if (sum == n) {
                        System.out.printf("So %d la so hoan hao\n",n);
                    }else {
                        System.out.printf("So %d khong phai la so hoan hao\n",n);
                    }
                    break;
                case 5:
                    // duyet cac so tu 2 den n
                    if (n>=2){
                        System.out.printf("cac so nguyen to tu 0 den %d la\n",n);
                        for (int i = 2; i <=n ; i++) {
                            //kiem tra i co phai la so nguyen to hay k?
                            check = false;
                            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                                if (i%j==0){
                                    check = true;
                                    break;
                                }
                            }
                            if (!check){
                                System.out.printf("%d\t",i);
                            }
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 6:
                    sum = 0;
                    System.out.printf("cac uoc so cua %d la: ",n);
                    for (int i = 1 ; i <=n ; i++) {
                        if (n%i==0){
                            System.out.printf("%d\t",i);
                            sum +=i;
                        }
                    }
                    System.out.printf("\nTong cac uoc cua %d la:%d\n ",n,sum);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui long nhap tu 1 den 7");
                    break;
            }
        }while (true);
    }
}
