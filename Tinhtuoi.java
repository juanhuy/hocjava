import java.time.LocalDate;
import java.util.Scanner;

public class Tinhtuoi {
    public static void Tinh(int var0) {
      int var1 = LocalDate.now().getYear();
      int var2 = var1 - var0;
      if (var2 >= 18) {
         System.out.println("Du 18 tuoi");
      } else {
         System.out.println("Chua du 18 tuoi");
      }

   }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Nhap nam sinh: ");
        int namsinh=sc.nextInt();
        Tinh(namsinh);
        sc.close();   
    }
}
