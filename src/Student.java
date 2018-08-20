import java.util.Scanner;

public class Student {
    static String name ;
    double javaScore;
    double attendaceScore;
    double avgScore = (javaScore *2 + attendaceScore)/3;

    public static void main(String[] args) {
        System.out.println("Mời nhập số lượng sinh viên:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Student st[] = new Student[k];

        String name ;
        double javaScore = 0 ;
        double attendaceScore = 0 ;
        double avgScore = (javaScore *2 + attendaceScore)/3;

        for (int i = 0; i < k; i++) {
            System.out.println("Mời nhập tên sinh viên");
            name = sc.nextLine();
            st[k].setName(name);
            System.out.println("Mời nhập điểm chuyên cần sinh viên");
            javaScore = sc.nextDouble();
            st[k].setJavaScore(javaScore);
            System.out.println("Mời nhập tên sinh viên");
            attendaceScore = sc.nextDouble();
            st[k].setAttendaceScore(attendaceScore);
            System.out.println("Mời nhập tên sinh viên");
            st[k].setAvgScore(avgScore);


        }
    }

    public String getName() {
        return name;
    }

    public double getJavaScore() {
        return javaScore;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public double getAttendaceScore() {
        return attendaceScore;
    }

    public void setAttendaceScore(double attendaceScore) {
        this.attendaceScore = attendaceScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }

    public void setName(String name) {
        this.name = name;
    }
}
