public class convertDate {
    public static void main(String[] args) {
        //Lấy ra một ngày có bao nhiêu Millisecond
        long X= 24*60*60*1000;
        //Lấy ra số millisecond từ năm 1970
        long Y = System.currentTimeMillis();
        // Lấy số phần dư milisecond của X và Y
        long Z = Y%X;
    // Tính xem một giờ có bao nhiêu milisecond
        long A = 60*60*1000;
        //Tính ra số giờ hiện tại
        long H = (int) Z/A;
        // Lấy phần dư của phút
        Z = Z%A;

        long B = 60*1000;
        long M = (int) Z/B;

         Z = Z%B;
         //Lấy phần dư của giây
        long S = (int)Z/1000;

        System.out.println("The current time is:" + " " +H+":"+M + ":"+S+ " "+ "GMT");

    }
}
