import java.util.Scanner;
public class kiemtrachanle {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" la so chan");
        }else{
            System.out.println(n+" la so le");
        }
        sc.close();
    }
}
