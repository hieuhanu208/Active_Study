import java.util.Scanner;

public class Unit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tên của bạn:");
        String fullName = sc.nextLine();
        System.out.println("Tiếp theo, hãy nhập vào chiều cao của bạn");
        double height = sc.nextDouble();
        System.out.println("Tiếp theo, hãy nhập vào cân  của bạn");
        double weight = sc.nextDouble();
        double BMI = weight/(Math.pow(height,2));

        if(BMI<18.5){
            System.out.println("THIẾU CÂN ");
        }else if (BMI>= 18.5 &&BMI<=25) {
            System.out.println("LÝ TƯỞNG ");
        }else if (BMI>= 25 &&BMI<=30) {
            System.out.println("THỪA CÂN ");
        }else if (BMI >= 30.0) {
            System.out.println("BÉO PHÌ ");
        }

    }
}
