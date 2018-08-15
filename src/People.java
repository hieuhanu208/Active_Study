import java.util.Scanner;

public class People{
    String name;
    int dateOfBirth;
    int monthOfBirth;
    int yearOfBirth;
    double height;
    double weight;
    double distance;
    double balance;

    public static void main(String[] args) {
        People ppl = new People();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        ppl.setName(name);
        System.out.println("Nhập số tiền");
        double balance = sc.nextDouble();
        ppl.setBalance(balance);
        System.out.println("Nhập quãng đường");
        double distance  = sc.nextDouble();
        ppl.setDistance(distance);
        System.out.println("Nhập cân nặng");
        double weight = sc.nextDouble();
        ppl.setWeight(weight);
        ppl.running();
        ppl.eating();
        ppl.working();
        ppl.shopping();


    }

    public People() {
        //Constructors
    }

    public void running(){
        this.setDistance(distance+2);
        this.setWeight(weight-0.1);
        System.out.println("=================================");
        System.out.println("");
        System.out.println("Quãng đường mới sau khi chạy là :"+ this.getDistance());
        System.out.println("Cân nặng mới sau khi chạy là:"+this.getWeight());
    }

    public void eating(){
        this.setBalance(balance-100);
        this.setWeight(weight+0.2);
        System.out.println("Số tiền còn lạilà sau khi ăn là:"+ this.getBalance());
        System.out.println("Cân nặng mới sau khi ăn là :"+this.getWeight());
    }

    public void working(){
        this.setBalance(balance+500);
        System.out.println("Tổng số tiền dư hiện tại sau khi làm việc là: "+ this.getBalance());
    }

    public void shopping(){
        this.setBalance(balance-800);
        if(this.getBalance() <0){
            System.out.println("HẾT TIỀN ");
        }else {
            System.out.println("Tổng số tiền dư hiện tại sau khi chi tiêu là: "+ this.getBalance());
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
