import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months;
        double money;
        double a;


        do{
            System.out.println("Mời bạn nhập vào số tháng lớn hơn 0");
            months = sc.nextInt();
        }while(months<=0);

        do{
            System.out.println("Mời bạn nhập vào số tiền:");
            money = sc.nextDouble();
        }while(money<=0);

        for (int i = 0; i <months ; i++) {
           money = money + (money*0.3/100);

        }
        System.out.println("Tổng số tiền bạn nhận được sau khi đầu tư "+ months + "tháng" + " là "+money);










    }
}
