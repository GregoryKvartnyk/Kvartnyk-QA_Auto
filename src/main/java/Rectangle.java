public class Rectangle extends Quadrilateral{

    public Rectangle (double side1, double side2){
        if (side1 > 0 && side2 > 0){
            super.side1 = side1;
            super.side2 = side2;
            super.side3 = side1;
            super.side4 = side2;
            super.angle1 = 90;
            super.angle2 = 90;
            super.angle3 = 90;
            super.angle4 = 90;
        }
        else{
            System.out.println("Two sides must be bigger than zero");
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

    public double calculateArea(){
        double areaOfRectangle;
        areaOfRectangle = side1 * side2;
        System.out.println("Area of a rectangle equals: " +areaOfRectangle);
        return areaOfRectangle;
    }

}
