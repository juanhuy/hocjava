import java.util.Scanner;

public class Pheptinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a=sc.nextInt();
        System.out.print("Nhap so b: ");
        int b=sc.nextInt();
        System.out.println("Tong a+b= "+(a+b));
        System.out.println("Tich a*b= "+(a*b));
        System.out.println("Hieu a-b= "+(a-b));
        if(b!=0)
        {
        System.out.println("Thuong a/b= "+(a/b));
        }
        else{
            System.out.println("Mau so khong the bang 0");
        }
        sc.close();
    }
}
