import java.lang.Math;
public class Rhombus extends Quadrilateral{

    public Rhombus (double side, double angle1){
        if (side > 0 && angle1 < 180){
            super.side1 = side;
            super.side2 = side;
            super.side3 = side;
            super.side4 = side;
            super.angle1 = angle1;
            super.angle2 = (360-(2*angle1))/2;
            super.angle3 = angle1;
            super.angle4 = (360-(2*angle1))/2;
        }
        else{
            System.out.println("The side must be bigger than zero, and the angle must be less than 180");
        }
    }
    public void setSide(double side){
        if (side > 0){
            super.side1 = side;
            super.side2 = side;
            super.side3 = side;
            super.side4 = side;
        }
        else{
            System.out.println("The side must be bigger than zero, and the angle must be less than 180");
        }
    }
    public void setAngle(double angle1){
        if (angle1 < 180) {
            super.angle1 = angle1;
            super.angle2 = (360 - (2 * angle1)) / 2;
            super.angle3 = angle1;
            super.angle4 = (360 - (2 * angle1)) / 2;
        }
        else{
            System.out.println("The sides must be bigger than zero, and the angle must be less than 180");
        }
    }
    public double calculateArea(){
        double areaOfRhombus;
        double heightOfARhombus;
        double angle1Rad = Math.toRadians(angle1);
        heightOfARhombus = side1 * Math.sin(angle1Rad);
        areaOfRhombus = side1 * heightOfARhombus;
        System.out.println("Area of a rhombus equals: " +areaOfRhombus);
        return areaOfRhombus;
    }
}
