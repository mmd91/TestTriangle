

public class Triangle {
    static double xA;
    static double xB;
    static double xC;
    static double yA;
    static double yB;
    static double yC;

    static double lengthAB;
    static double lengthBC;
    static double lengthAC;


    public Triangle (double xA, double yA, double xB, double yB, double xC, double yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;

        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
    }

    //- длину сторон треугольника;
    public double getLengthAB(){
        lengthAB = Math.sqrt(Math.pow((xB-xA), 2) +
                (Math.pow((yB-yA), 2)));
        return lengthAB;
    }
    public double getLengthBC(){
        lengthBC = Math.sqrt(Math.pow((xC-xB), 2) +
                (Math.pow((yC-yB), 2)));
        return lengthBC;
    }
    public double getLengthAC(){
        lengthAC = Math.sqrt(Math.pow((xA-xC), 2) +
                (Math.pow((yA-yC), 2)));
        return lengthAC;
    }

//- является ли треугольник равносторонним;
    public static void triangleIsEquilateral(){
        if (lengthAB ==lengthBC && lengthAB==lengthAC && lengthBC==lengthAC){
            System.out.println("Triangle is Equilateral");
        }else {
            System.out.println("Triangle is not Equilateral");
        }
    }

//- является ли треугольник равнобедренным;
    public static void triangleIsIsosceles(){
        if (lengthAB ==lengthBC || lengthAB==lengthAC || lengthBC==lengthAC){
            System.out.println("Triangle is Isosceles");
        }else {
             System.out.println("Triangle is not Isosceles");
        }
    }
//- является ли треугольник прямоугольным;
    public static void defineRightTriangle(){
        double sum1 = Math.pow((lengthAB), 2) + Math.pow((lengthAC), 2);
        double sum2 = Math.pow(lengthBC,2);
        if(Math.round(sum1)==Math.round(sum2)){
            System.out.println("Triangle is Right");
        }else {
            System.out.println("Triangle is not Right");
        }
    }

//- периметр треугольника;
    public double getPerimeter(){
        double perimeter = lengthAB + lengthBC + lengthAC;
        return perimeter;
    }
//- все чётные числа от 0 до величины периметра треугольника включительно.

    public void evenNumbers (){
        System.out.print("Even Numbers: ");

        for (int i =1; i<=getPerimeter(); i++){
            if(i%2==0){
                System.out.print(i + " ");
            }

        }
    }
}
