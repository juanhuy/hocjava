import java.util.Scanner;

public class Bangcuuchuong {
      public static void cuuchuong(int n)
    {   System.out.println("Bang cuu chuong "+n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap bang cuu chuong can in: ");
        int n=sc.nextInt();
        cuuchuong(n);
        sc.close();
    }
}
