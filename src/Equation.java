public class Equation {
    static void CalculateQuadratic(double x ,double y, double z){
        double delta = y*y - 4 * x * z;
        if (x == 0 && y == 0){
            System.out.println("\nPT vo nghiem");
        }
        if (x == 0){
            double nghiem1 = -z / y;
            System.out.printf("\nPT co 1 ngiem: %f", nghiem1);
        }
        if (delta < 0){
            System.out.println("\nPT vo nghiem");
        }
        if (delta > 0){
            double nghiem2 = (-y + Math.sqrt(delta)) / (2 * x);
            double nghiem3 = (-y - Math.sqrt(delta)) / (2 * x);
            System.out.printf("\nPhuong trinh co 2 nghiem");
            System.out.printf("\nx1 = %f", nghiem2);
            System.out.printf("\nx2 = %f", nghiem3);
        }
    }
}
