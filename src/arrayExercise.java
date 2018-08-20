import java.util.Scanner;

import java.util.Arrays;

public class arrayExercise {

    public static  int checkInput(){
        Scanner sc = new Scanner(System.in);
        boolean isChecked = false;
        int n = 0;
        while (!isChecked){
            try {
                n = sc.nextInt();
                isChecked = true;
            } catch (Exception ex){
                System.out.println("Vui lòng nhập lại ");
                sc.nextLine();
            }
        }
        return n;
    }

    public static int viTriMaxInt(int a[], int n){
        int max= a[0];
        int key= 0;
        for(int j=0 ; j<n ; j++){
            if(max<a[j]){
                max= a[j];
                key= j;

            }

        }
        return (key);
    }
    public static void inArray(int[] a, int begin , int end){
        System.out.println();
        int i;
        for(i=begin ; i<end ; i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
    }
    public static int viTriMax2(int[] a,int n){
        int i,key=0,Max2=0;
        for(i=0 ; i<n ; i++){
            if(a[i]>Max2 && a[i]!= a[viTriMaxInt(a, n)]){
                Max2= a[i];key= i;
            }
        }return (key);
    }
    public static void themPhanTu(int[] a,int n,int pt){
        a[0]= pt;
        Arrays.sort(a);
    }


    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng= ");
        int n= checkInput();
        int[] a= new int[n+1];
        int i;
        for(i=0 ; i<n ; i++){
            System.out.print("\n Nhập phần tử thứ "+i+ "của mảng "+" = ");
            a[i]= checkInput();
        }
        for(i=0 ; i<n ; i++){

            if(a[i]== a[viTriMaxInt(a, n)]) System.out.println(" Phần tử lớn thứ nhất trong mảng là : a["+i+"]= "+a[i]);
            if(a[i]== a[viTriMax2(a, n)]) System.out.println(" Phần tử lớn thứ hai trong mảng là : a["+i+"]= "+a[i]);
        }
        Arrays.sort(a); inArray(a,1,n+1);
        System.out.print("Nhap phan tu muon them pt= "); int pt= checkInput();
        themPhanTu(a,n+1,pt); inArray(a,0,n);
    }
}
