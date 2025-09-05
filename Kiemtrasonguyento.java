import static java.lang.Math.sqrt;

import java.util.Scanner;
public class Kiemtrasonguyento {
    public static boolean kiemtrasonguyento(int n)
    {
        if(n==2)
        {
            return true;
            
        }
        if(n%2==0)
        {
            return false;
            
        }
        if(n<2)
        {
            return false;
        }
        for (int i=3;i<=sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                return false;
                
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int n=sc.nextInt(); 
        if(kiemtrasonguyento(n))
        {
            System.out.println(n+" la so nguyen to");
    }else{
        System.out.println(n+" khong phai la so nguyen to");
    }
        sc.close();
    }
}
