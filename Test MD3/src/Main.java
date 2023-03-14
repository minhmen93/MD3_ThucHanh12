import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = -1;

        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        while (choice != 0) {
            System.out.println(
                    "1 : In ra các số chẵn và tính tổng tu 0 ->  n \n"
                            + "2 : In ra các số lẻ và tính tổng tu 0 ->  n  \n"
                            + "3 : Kiểm tra xem n có phải là so nguyên tố không?  \n"
                            + "4 : Kiểm tra xem n có phải là sô hoàn hao không ?  \n"
                            + "5 : In ra các số nguyên tố từ 0...n  \n"
                            + "6 : In ra các ước của n và tính tổng  \n"
                            + "0 : Exit \n");
            System.out.println(" Chọn 1 mục trong menu \n");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    isQuit = true;
                    System.out.println(" Bạn đã thoát khỏi chương trinh ");
                    System.out.println("\n------------------------------------");
                    break;
                case 1:
                    // tổng của case nào thì nên đặt biến riêng cho case đó
                    int sumOdd = 0;
                    int n = 0;
                    System.out.print("Nhập số nguyên n: ");
                    n = scanner.nextInt();
                    System.out.print(" Các số chẵn từ 0 đến " + n + " là : ");
                    for (int i = 0; i <= n; i++) {
                        // đã xét i += 2 tức là tăng lên 2 sau mỗi lần lặp, thì i luôn chẵn ,ko cần if bên dưới nữa
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                            sumOdd += i;

                        }
                    }
                    // kết thúc vòng lặp mới in tổng
                    System.out.print(" \n Tổng các số chẵn từ 0 đến " + n + " là : " + sumOdd);
                    System.out.println("\n------------------------------------");

                    break;
                case 2:
                    int sumEven = 0;
                    System.out.println("Nhập so nguyên n : ");
                    n = scanner.nextInt();
                    System.out.print(" In ra các số lẻ từ 0  đến " + n + " là : ");
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 1) {
                            System.out.print(i + " ");
                            sumEven += i;
                        }
                    }
                    System.out.println("\n Tổng các số từ 0 đến " + n + " là : " + sumEven);
                    System.out.println("\n------------------------------------");
                    break;

                case 3:
                    int temp;
                    boolean isPrime = true;
                    System.out.print("Nhập vào số cần kiểm tra : ");
                    int num = scanner.nextInt();
                    for (int i = 2; i <= num / 2; i++) {
                        temp = num % i;
                        if (temp == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime)
                        System.out.print(num + " là số nguyên tố . \n");
                    else
                        System.out.print(num + " không phải là số nguyên tố . \n");
                    System.out.println("\n------------------------------------");
                case 4:
                    int sum = 0, a;
                    System.out.print("Nhập số cần kiểm tra : ");
                    a = scanner.nextInt();
                    for (int i = 1; i <= a; i++) {
                        if (a % i == 0) ;
                        // Tổng các ước số của a
                        sum += i;

                    }
                    // Nêu tổng ước số sum = a thì a là số hoàn hảo
                    if (sum == a) {
                        System.out.print(a + " là số hoàn hảo ");
                    } else {
                        System.out.print(a + " không phải là số hoàn hảo ");
                    }
                    System.out.println("\n------------------------------------");
                case 5:
                    int i = 0;
                    int num2 = 0;
                    String primeNumbers = "";
                    System.out.println("Nhập vào số n:");
                    int n2 = scanner.nextInt();
                    for (i = 0; i <= n2; i++) {
                        int counter = 0;
                        for (num = i; num >= 1; num--) {
                            if (i % num == 0) {
                                counter = counter + 1;
                            }
                        }
                        if (counter == 2) {
                            primeNumbers = primeNumbers + i + " ";
                        }
                    }
                    System.out.println("Các số nguyên tố từ 0 đến " + n2 + " là:");
                    System.out.println(primeNumbers);
                    System.out.println("\n------------------------------------");


                case 6:

                    Scanner input = new Scanner(System.in);
                    System.out.println(" Nhập vào số nguyên n : ");
                    int n3 = input.nextInt();
                    int tongUocSo = 0;
                    System.out.println(" Các ước số của n là : " + n3);
                    for (int j = 0; j <= n3; j++) {
                        if (n3 % j == 0) {
                            System.out.println(j + " ");
                            tongUocSo += j;
                        }
                    }
                    System.out.println(" Tổng các ước số của n là : " + tongUocSo);
                    System.out.println("\n------------------------------------");


            }
        }
    }
}


