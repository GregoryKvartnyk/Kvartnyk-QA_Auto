import java.lang.Math;
public class Trapezoid extends Quadrilateral{

    public Trapezoid (double side1, double side4, double angle1, double angle4){
        if (side1 > 0 && side4 > 0 && angle1 < 90 && angle4 <= 90){
            super.side1 = side1;
            super.side4 = side4;
            super.angle1 = angle1;
            super.angle2 = (180 - angle1);
            super.angle3 = (180 - angle4);
            super.angle4 = angle4;
        }
        else{
            System.out.println("The sides must be bigger than zero, angle1 must be less than 90 and angle4 must be less than 90 or equal to 90");
        }
    }

    public void setSides(double side1, double side4){
        if (side1 > 0 && side4 > 0) {
            super.side1 = side1;
            super.side4 = side4;
        }
        else{
            System.out.println("The sides must be bigger than zero");
        }
    }
    public void setAngles(double angle1, double angle4){
        if (angle1 < 90 && angle4 <= 90) {
            super.angle1 = angle1;
            super.angle2 = (180 - angle1);
            super.angle3 = (180 - angle4);
            super.angle4 = angle4;
        }
        else {
            System.out.println("angle1 must be less than 90 and angle4 must be less than 90 or equal to 90");
        }
    }
    public double calculateHeight(){
        double heightOfATrapezoid;
        double angle1Rad = Math.toRadians(angle1);
        heightOfATrapezoid = side1 * Math.sin(angle1Rad);
        System.out.println("Height of a trapezoid equals:" +heightOfATrapezoid);
        return heightOfATrapezoid;
    }
    public double calculateSide3(){
        double heightOfATrapezoid = calculateHeight();
        double angle5 = 90 - angle4;
        double angle5Rad = Math.toRadians(angle5);
        super.side3 = heightOfATrapezoid/Math.cos(angle5Rad);
        System.out.println("Side 3 equals:" +side3);
        return side3;
    }
    public double calculateSide2(){
        double heightOfATrapezoid = calculateHeight();
        double side3 = calculateSide3();
        double offsetFromAngle1 = Math.sqrt((Math.pow(side1, 2)) - (Math.pow(heightOfATrapezoid, 2)));
        double offsetFromAngle4 = Math.sqrt((Math.pow(side3, 2)) - (Math.pow(heightOfATrapezoid, 2)));
        super.side2 = side4 - (offsetFromAngle1 + offsetFromAngle4);
        System.out.println("Side 2 equals:" +side2);
        return side2;
    }
    public double calculateArea(){
        double areaOfATrapezoid;
        double side2 = calculateSide2();
        double heightOfATrapezoid = calculateHeight();
        areaOfATrapezoid = ((side2 + side4) * heightOfATrapezoid)/2;
        System.out.println("Area of a trapezoid equals:" +areaOfATrapezoid);
        return areaOfATrapezoid;
    }
}
