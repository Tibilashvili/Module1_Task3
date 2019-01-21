package ruslan.module;

public class Main {

    public static void main(String[] args) {

        TriangleArea(3, 5, 4);


    }

    public static void TriangleArea(double A, double B, double C){
        double P = (A + B + C) / 2;
        double S = Math.sqrt(P * (P-A) * (P-B) * (P-C));
        System.out.println("Площадь треугольника = " + S);
    }
}
