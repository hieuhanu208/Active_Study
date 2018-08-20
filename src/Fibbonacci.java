import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử của dãy:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(fibo(i) + "-");
        }

    }

    public static int fibo (int n) {
        if(n<0) {
            return -1;

        } else if (n ==0 ||n ==1 ){
            return n;

        } else {
            return fibo(n-1) +fibo(n-2);
        }
    }
}
