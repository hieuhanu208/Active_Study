import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào hệ số a:");
        double a=sc.nextDouble();
        System.out.println("Vui lòng nhập vào hệ số b:");
        double b=sc.nextDouble();
        System.out.println("Vui lòng nhập vào hệ số c:");
        double c=sc.nextDouble();

        double delta = b*b - 4*a*c;

        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô nghiệm");
            }else  {
                System.out.println("Phương trình có một nhiệm:x= " + (-c/b));
            }
        }else{
            if (delta<0){
                System.out.println("Phương trình vô nghiệm");
            } else if(delta==0){
                System.out.println("Phương trình có nghiệm kép:x1=x2="+(-b/2*a));
            }else {
                double x1= (-b-Math.sqrt(delta))/2*a;
                double x2= (-b+Math.sqrt(delta))/2*a;
                System.out.println("Phương trình có hai nghiệm lần lượt là: x1 = " +x1 +"và "+ "x2 = "+x2);
            }
        }
    }
}
