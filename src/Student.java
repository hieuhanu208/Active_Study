package nhapdssinhvien;

public class Student {
    
    private String mssv;
    float diemTin;
    float diemJava;
    float diemChuyenCan;
    float diemTB;
    String xepLoai;
    
    public void setMSSV(String mssv) {
        this.mssv = mssv;
    }
    public String getMSSV() {
        return (mssv);
    }
    public void setDiemTin(float diemTin) {
        this.diemTin = diemTin;
    }
    public float getDiemTin() {
        return (diemTin);
    }
    public void setDiemJava(float diemJava) {
        this.diemJava = diemJava;
    }
    public float getDiemJava() {
        return (diemJava);
    }
    public void setDiemChuyenCan(float diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }
    public float getDiemChuyenCan() {
        return (diemChuyenCan);
    }
    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public float getDiemTB() {
        return (diemTB);
    }
    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }
    public String getXepLoai() {
        return (xepLoai);
    }
    
    public void tinhDiemTB() {
        diemTB=((diemTin * 2 + diemChuyenCan + diemJava * 3) / 6);
    }
    
    public void xepLoai() {
        if (diemTB > 9) {
            xepLoai=("Xuất sắc");
        } else if (diemTB > 8) {
            xepLoai=("Giỏi");
        } else if (diemTB > 7) {
            xepLoai=("Khá");
        } else if (diemTB > 5) {
            xepLoai=("Trung bình");
        } else if (diemTB > 3) {
            xepLoai=("Yếu");
        } else {
            xepLoai=("Kém");
        }
        System.out.println("Loại: " + xepLoai);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        
        int n = sc.nextInt();
        
        SinhVien[] q = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            q[i] = new SinhVien();
            System.out.print("Nhập MSSV: ");
            String mssv = sc.nextLine();
            q[i].setMSSV(mssv);
            System.out.print("Nhập điểm Chuyên cần : ");
            q[i].diemChuyenCan = sc.nextFloat();
            System.out.print("Nhập điểm Java : ");
            q[i].diemJava = sc.nextFloat();
            System.out.print("Nhập điểm Tin : ");
            q[i].diemTin = sc.nextFloat();
            q[i].tinhDiemTB();
            q[i].xepLoai();
            System.out.println(q[i].getDiemTB() + "\n");
        }
        
        for (int u = 0; u < n; u++) {
            for (int v = n - 1; v >= u; v--) {
                if (q[v].diemTB < q[u].diemTB) {
                    SinhVien temp = q[v];
                    q[v] = q[u];
                    q[u] = temp;
                }
            }
        }
        // vòng lặp dùng for(<variable> : <collection>)
        for (SinhVien u : q) {
            System.out.printf("%3s %10s %4f \n", u.getMSSV(), u.getXepLoai(), u.getDiemTB());
            
        }
        
    }
}

