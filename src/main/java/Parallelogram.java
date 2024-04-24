import java.lang.Math;
public class Parallelogram extends Quadrilateral{

    public Parallelogram (double side1, double side2, double angle1){
        if (side1 > 0 && side2 > 0 && angle1 < 180){
            super.side1 = side1;
            super.side2 = side2;
            super.side3 = side1;
            super.side4 = side2;
            super.angle1 = angle1;
            super.angle2 = (360-(2*angle1))/2;
            super.angle3 = angle1;
            super.angle4 = (360-(2*angle1))/2;
        }
        else{
            System.out.println("The sides must be bigger than zero, and the angle must be less than 180");
        }
    }
    public void setSide1(double side1){
        if (side1 > 0){
            super.side1 = side1;
            super.side3 = side1;
        }
        else{
            System.out.println("Two sides must be bigger than zero");
        }
    }
    public void setSide2(double side2){
        if (side2 > 0){
            super.side2 = side2;
            super.side4 = side2;
        }
        else{
            System.out.println("Two sides must be bigger than zero");
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
        double areaOfParallelogram;
        double heightOfAParallelogram;
        double angle1Rad = Math.toRadians(angle1);
        heightOfAParallelogram = side1 * Math.sin(angle1Rad);
        areaOfParallelogram = side2 * heightOfAParallelogram;
        System.out.println("Area of a parallelogram equals: " +areaOfParallelogram);
        return areaOfParallelogram;
    }
}
