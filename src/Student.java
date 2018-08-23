import java.util.Scanner;

public class Student {
    public static String name;
    static float javaScore;
    static float attendaceScore;
    String isRanked;
    float avgScore;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public float getJavaScore() {
        return javaScore;
    }
    
    public void setJavaScore(float javaScore) {
        this.javaScore = javaScore;
    }
    
    public float getAttendaceScore() {
        return attendaceScore;
    }
    
    public void setAttendaceScore(float attendaceScore) {
        this.attendaceScore = attendaceScore;
    }
    
    public float getAvgScore() {
        return avgScore;
    }
    
    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
    
    public String getIsRanked() {
        return isRanked;
    }
    
    public void setIsRanked(String isRanked) {
        this.isRanked = isRanked;
    }
    
    public void scoreRanking() {
        avgScore = (javaScore * 2 + attendaceScore) / 3;
        System.out.println(avgScore);
    }
    
    public void raking() {
        if (avgScore > 9.0) {
            isRanked = ("Xuất sắc");
        } else if (avgScore > 8.0) {
            isRanked = ("Giỏi");
        } else if (avgScore > 7.0) {
            isRanked = ("Khá");
        } else if (avgScore > 5.0) {
            isRanked = ("Trung bình");
        } else if (avgScore > 3.0) {
            isRanked = ("Yếu");
        } else {
            isRanked = ("Kém");
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("Mời nhập số lượng sinh viên:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        Student st[] = new Student[n];
        
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            st[i] = new Student();
            System.out.println("Mời nhập tên sinh viên thứ " + (i + 1) + ":");
            name = sc.nextLine();
            st[i].setName(name);
            System.out.println("Mời nhập điểm Java sinh viên");
            javaScore = sc.nextFloat();
            st[i].setJavaScore(javaScore);
            System.out.println("Mời bạnh nhập điểm chuyên cần");
            attendaceScore = sc.nextFloat();
            st[i].setAttendaceScore(attendaceScore);
            st[i].raking();
            st[i].scoreRanking();
            
        }
        for (int u = 0; u < n; u++) {
            for (int v = u - 1; v >= u; v--) {
                if (st[v].getAvgScore() < st[u].getAvgScore()) {
                    Student temp = st[v];
                    st[v] = st[u];
                    st[u] = temp;
                }
            }
        }
        System.out.println("====================Thông tin SV sau khi sắp xếp điểm TB ============");
        for (int i = 0; i < n; i++) {
            System.out.println("Name:" + st[i].getName());
            System.out.println("Java Score:" + st[i].getJavaScore());
            System.out.println("Attendace Score:" + st[i].getAttendaceScore());
            System.out.println("Average Score:" + st[i].getAvgScore());
            
            
        }
    }
    
    
}
