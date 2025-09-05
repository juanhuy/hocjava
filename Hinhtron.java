public class Hinhtron {
    public static double Dientich(double r)
    {
        return Math.PI*r*r;
    }
    public static double Chuvi(double r)
    {
        return 2*Math.PI*r;
    }
    public static void main(String[] args) {
        double r=5;
        System.out.println("Dien tich hinh tron ban kinh "+r+" la: "+Dientich(r));
        System.out.println("Chu vi hinh tron ban kinh "+r+" la: "+Chuvi(r));
    }
}
