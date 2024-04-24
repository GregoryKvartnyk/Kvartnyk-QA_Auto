public class Square extends Quadrilateral{

    public Square (double side){
        if (side > 0){
            super.side1 = side;
            super.side2 = side;
            super.side3 = side;
            super.side4 = side;
            super.angle1 = 90;
            super.angle2 = 90;
            super.angle3 = 90;
            super.angle4 = 90;
        }
        else{
            System.out.println("The side must be bigger than zero");
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
            System.out.println("The side must be bigger than zero");
        }
    }

    public double calculateArea(){
        double areaOfSquare;
        areaOfSquare = side1 * side1;
        System.out.println("Area of a square equals: " +areaOfSquare);
        return areaOfSquare;
    }

}
