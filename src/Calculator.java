import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
        for(int i =n;i >0;i = i/10){
            total = total+i%10;

        }
        System.out.println("Tổng các chữ số của n là:" +total);
    }
}
