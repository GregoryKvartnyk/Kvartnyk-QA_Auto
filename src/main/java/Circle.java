import java.lang.Math;
public class Circle {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public void setRadius(double rad){
        this.radius = rad;
    }

    public double getRadius(){
        System.out.println("Radius of the circle equals: " +radius);
        return radius;
    }

    public double calculateLength(){
        double lengthOfCircle;
        lengthOfCircle = 2 * Math.PI * radius;
        System.out.println("Length of a circle: " + lengthOfCircle);
        return lengthOfCircle;
    }

    public double calculateArea(){
        double areaOfCircle;
        areaOfCircle = Math.PI * (radius * radius);
        System.out.println("Area of a circle: " +areaOfCircle);
        return areaOfCircle;
    }
}
