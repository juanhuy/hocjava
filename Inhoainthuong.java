import java.util.Scanner;

public class Inhoainthuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         s=s.toUpperCase();
        System.out.println("In hoa: "+s);
        s=s.toLowerCase();
        System.out.println("In thuong "+s);
        sc.close();
    }
}
