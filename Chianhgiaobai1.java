/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.time.LocalDate;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Chianhgiaobai1
{
    public static void hello()
    {
        System.out.println("Hello World");
    }
    public static void pheptinh(Scanner sc)
    {
    System.out.println("Nhap lua chon cua ban: ");
    System.out.println("1. Cong 2 so ");
    System.out.println("2. Tru 2 so ");
    System.out.println("3. Nhan 2 so ");
    System.out.println("4. Chia 2 so ");
    int luachon=sc.nextInt();
    if(luachon==1)
    {
        int a,b;
        System.out.println("Nhap so a: ");
        a=sc.nextInt();
         System.out.println("Nhap so b: ");
        b=sc.nextInt();
        System.out.println("Tong cua 2 so = "+(a+b));
    }else if (luachon==2)
    {
        
        int a,b;
        System.out.println("Nhap so a: ");
        a=sc.nextInt();
         System.out.println("Nhap so b: ");
        b=sc.nextInt();
        System.out.println("Hieu cua 2 so = "+(a-b));
    }else if(luachon==3)
    {
         int a,b;
        System.out.println("Nhap so a: ");
        a=sc.nextInt();
         System.out.println("Nhap so b: ");
        b=sc.nextInt();
        System.out.println("Tich cua 2 so = "+(a*b));
    }else if(luachon==4)
    {
         int a,b;
        System.out.println("Nhap tu so: ");
        a=sc.nextInt();
         System.out.println("Nhap mau so: ");
        b=sc.nextInt();
        if(b==0)
        {
            
        
        while(true)
        {
            System.out.println("Mau so khong duoc bang 0, vui long nhap lai");
            b=sc.nextInt();
            if(b!=0)
            {
                break;
            }
        }
            
        }
        System.out.println("Thuong cua 2 so = "+(a/b));
    }
    
    }
    
    public static boolean kiemtrachanle(int n)
    {
        if(n%2==0)
        {
            return true;
        }else{
            return false;
        }
    }
    public static int demtu(String s)
    {  String tam=s.trim();
    int dem=0;
        for(int i=0;i<tam.length();i++)
        {
            if(tam.charAt(i)==' ')
            {
                dem++;
            }
        }
        return dem+1;
    }
    public static void hinhtron(int bankinh)
    {
        System.out.println("Chu vi hinh tron = "+(2*3.14*bankinh));
        System.out.println("Dien tich hinh tron la = "+(3.14*bankinh*bankinh));
        
    }
    public  static void tinhtuoi(int namsinh)
    {
         int nam = LocalDate.now().getYear();
         int tuoi=nam-namsinh;
         if(tuoi>=18)
         {
             System.out.println("Du 18 tuoi");
         }else{
             System.out.println("Chua du 18 tuoi");
         }
    }
    public static void cuuchuong(int n)
    {   System.out.println("Bang cuu chuong "+n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(n*i);
        }
    }
    public static void indaonguoc(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
    public static void inchu(String s)
    {
        s=s.toUpperCase();
        System.out.println("In hoa: "+s);
        s=s.toLowerCase();
        System.out.println("In thuong "+s);
    }
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
	while (true) {
System.out.println("=================MENU===================");

System.out.println("1. Hello World "); 
System.out.println("2. Phep tinh 2 so ");
System.out.println("3. Kiem tra so chan le ");
System.out.println("4. Dem so tu trong chuoi ");
System.out.println("5. Tinh chu vi va dien tich hinh tron ");
System.out.println("6. Tinh tuoi ");
System.out.println("7. In bang cuu chuong ");
System.out.println("8. In dao nguoc mang ");
System.out.println("9. In hoa in thuong chuoi ");
System.out.println("10. Kiem tra so nguyen to ");
System.out.println("11. Thoat ");
System.out.println("Nhap lua chon cua ban: ");
int luachon=sc.nextInt();
            if(luachon==1)
        {
            hello();
        }else if(luachon==2)
        {
            pheptinh(sc);
        }else if(luachon==3)
        {
            System.out.println("Nhap mot so nguyen: ");
            int n=sc.nextInt();
           if( kiemtrachanle(n))
           {
               System.out.println(n+" la so chan");
            
        }else{
               System.out.println(n+" la so le");
           }
        
	    }else if(luachon==4)
        {   sc.nextLine();
            System.out.println("Nhap chuoi: ");
            String s=sc.nextLine();
            System.out.println("So tu trong chuoi la: "+demtu(s));
            System.out.println("So ky tu trong chuoi la: "+s.length());
            

        }else if(luachon==5)
        {
            System.out.println("Nhap ban kinh hinh tron: ");
            int r=sc.nextInt();
            hinhtron(r);
        }else if(luachon==6)
        {
            System.out.println("Nhap nam sinh: ");
            int namsinh=sc.nextInt();
            tinhtuoi(namsinh);
        }else if(luachon==7)
        {
            System.out.println("Nhap so can in bang cuu chuong: ");
            int n=sc.nextInt();
            while(n>10 || n<1)
            {
                System.out.println("Vui long nhap so tu 1 den 10: ");
                n=sc.nextInt();
            }
            cuuchuong(n);
        }else if (luachon==8)
        {
            System.out.println("Nhap so phan tu mang: ");
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Nhap phan tu thu "+(i+1)+": ");
                a[i]=sc.nextInt();
            }
            System.out.println("Mang dao nguoc la: ");
            indaonguoc(a);
            
        }else if(luachon==9)
        {
            System.out.println("Nhap chuoi: ");
            sc.nextLine();
            String s=sc.nextLine();
            inchu(s);
        } else if(luachon==10)
            {
                System.out.println("Nhap so nguyen: ");
                int n=sc.nextInt();
                if(kiemtrasonguyento(n))
                {
                    System.out.println(n+" la so nguyen to");
                }else{
                    System.out.println(n+" khong phai la so nguyen to");
                }
            }else if(luachon==11)
            {
                System.out.println("Thoat chuong trinh");
                break;
            }
            

}
    sc.close();
}
}