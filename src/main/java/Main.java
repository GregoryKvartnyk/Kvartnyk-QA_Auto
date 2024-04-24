public class Main {
    public static void main(String[] args) {

        Trapezoid trapezoid = new Trapezoid(10,40, 30, 45);
        trapezoid.calculateArea();
        trapezoid.setSides(20,60);
        trapezoid.setAngles(45,90);
        trapezoid.calculateArea();
        trapezoid.getAngle1();
        trapezoid.getSide4();
        trapezoid.getAngle2();
        trapezoid.getAngle4();

    }
}
