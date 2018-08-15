import java.util.Scanner;

public class Unit4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        int n = sc.nextInt();
        int i = 2;

        System.out.print("Số" +n + "=");
        while(n>1){
            if(n%i == 0){
                System.out.print(i + "x");
                n/=2;
            }else{
                i++;
            }
        }
    }
}


//  CÁCH 2 :
//    int n;
//    Scanner nhap = new Scanner(System.in);
//    System.out.println("Nhap so nguyen: ");
//            n = nhap.nextInt();
//            while(n<2)
//        {
//        System.out.println("Ban vua nhap mot so khong hop le.Vui long nhap lai: ");
//        n = nhap.nextInt();
//        }
//        for(int i=2; i<=n;i++)
//        {
//        while(n%i==0)
//        {
//        n=n/i;
//        if(n==1)
//        System.out.print(i);
//        else
//        System.out.print(i+" x ");
//        }
//        if (n==1)
//        break;
//        }
