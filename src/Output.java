

import java.util.Scanner;

public class Output {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinate X for dot A");
        double xA = scanner.nextDouble();

        System.out.println("Enter coordinate Y for dot A");
        double yA = scanner.nextDouble();

        System.out.println("Enter coordinate X for dot B");
        double xB = scanner.nextDouble();

        System.out.println("Enter coordinate Y for dot B");
        double yB = scanner.nextDouble();

        System.out.println("Enter coordinate X for dot C");
        double xC = scanner.nextDouble();

        System.out.println("Enter coordinate Y for dot C");
        double yC = scanner.nextDouble();


        Triangle t = new Triangle(xA, yA, xB, yB, xC, yC);

        System.out.println("Length AB is: " + t.getLengthAB());
        System.out.println("Length BC  is: " + t.getLengthBC());
        System.out.println("Length AC is: " + t.getLengthAC());

        t.triangleIsEquilateral();
        t.triangleIsIsosceles();

        System.out.println("Triangle perimeter is: " + t.getPerimeter());


        t.defineRightTriangle();
        t.evenNumbers();





    }
}
