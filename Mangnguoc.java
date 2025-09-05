import java.util.Scanner;

public class Mangnguoc {
      public static void indaonguoc(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu mang: ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("Mang dao nguoc la: ");
        indaonguoc(a);
        sc.close();
    }
}
