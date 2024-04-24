public class EquilateralTriangle extends Triangle{


    public void setTriangle(double angle, double side) {

            if (angle == 60 && side > 0) {
                System.out.println("Triangle exists");
                this.angleAdeg = angle;
                this.angleBdeg = angle;
                this.angleCdeg = angle;
                this.sideA = side;
                this.sideB = side;
                this.sideC = side;
            }
            else {
                System.out.println("Side must be bigger than zero and angle must be 60 degrees");
            }
    }
}
