import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số giây");
        int seconds = sc.nextInt();
        do {
            System.out.println("Nhập lại số giây lớn hơn 60");
            System.out.println("Mời bạn nhập vào số giây");
            seconds = sc.nextInt();
            if(seconds >60 ){
                if(seconds % 60 ==0){
                    System.out.println("Số phút là: " + seconds / 60 + " phút");
                }else {
                    System.out.println("Số phút là: " + seconds / 60 + "phút" + "," + seconds % 60 + "giây");
                }
            }

        } while (seconds < 60);


    }
}


