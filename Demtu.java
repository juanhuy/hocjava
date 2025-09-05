import java.util.Scanner;

public class Demtu {
    public static int demtu(String var0) {
      String var1 = var0.trim();
      int var2 = 0;

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         if (var1.charAt(var3) == ' ') {
            ++var2;
         }
      }

      return var2 + 1;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("So tu trong chuoi la: "+demtu(s));
        System.out.println("So ky tu trong chuoi la: "+s.length());
        sc.close();
    }
}
