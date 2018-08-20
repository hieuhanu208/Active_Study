import java.util.Scanner;

public class numberChecking {
    public static void main(String[] args) {
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập mảng:");
//
//        a = sc.nextInt();
//
//        int b[] = new int[a];
//        int key = a -1;
//
//        for (int i = 0; i <a ; i++) {
//            System.out.print("Nhập phần tử thứ a" + "[" + i + "]" + ":");
//
//            b[i] = sc.nextInt();
//            while (b[i] < 0) {
//                System.out.print("Mời bạn nhập lại phần tử thứ a" + "[" + i + "]" + ":");
//                b[i] = sc.nextInt();
//            }
//        }



        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng :");
            n = sc.nextInt();

        } while (n < 0);

        int a[] = new int[n];
        System.out.println("Nhập vào phần tử của mảng :");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ a" + "[" + i + "]" + ":");

            a[i] = sc.nextInt();
            while (a[i] < 0) {
                System.out.print("Mời bạn nhập lại phần tử thứ a" + "[" + i + "]" + ":");
                a[i] = sc.nextInt();
            }
        }

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
