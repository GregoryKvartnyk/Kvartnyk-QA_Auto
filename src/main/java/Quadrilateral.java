public class Quadrilateral {

    // нумерація сторін та кутів починається зліва (зліва зверху у випадку ромба) і далі за годинниковою стрілкою, ось картинка https://ibb.co/jwWgyg2
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    protected double angle1;
    protected double angle2;
    protected double angle3;
    protected double angle4;

    public Quadrilateral() {}

    public Quadrilateral (double side1, double side2, double side3, double side4){
        if (side1 > 0 && side2 > 0 && side3 > 0 && side4 > 0 && ((side1 + side2 + side3) > side4 || (side2 + side3 + side4) > side1 || (side3 + side4 + side1) > side2 || (side1 + side2 + side4) > side3)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
        }
        else{
            System.out.println("All of the sides must be bigger than zero and the sum of three of the sides must be bigger than 4th side");
        }
    }


    public double getSide1(){
        System.out.println("Side1 equals: " +side1);
        return side1;
    }
    public double getSide2(){
        System.out.println("Side2 equals: " +side2);
        return side2;
    }
    public double getSide3(){
        System.out.println("Side3 equals: " +side3);
        return side3;
    }
    public double getSide4(){
        System.out.println("Side4 equals: " +side4);
        return side4;
    }
    public double getAngle1(){
        System.out.println("Angle1 equals: " +angle1);
        return angle1;
    }
    public double getAngle2(){
        System.out.println("Angle2 equals: " +angle2);
        return angle2;
    }
    public double getAngle3(){
        System.out.println("Angle3 equals: " +angle3);
        return angle3;
    }
    public double getAngle4(){
        System.out.println("Angle4 equals: " +angle4);
        return angle4;
    }
    public double calculatePerimeter(){
        double perimeter;
        perimeter = side1 + side2 + side3 + side4;
        System.out.println("Perimeter equals: " +perimeter);
        return perimeter;
    }

}
