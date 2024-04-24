import java.lang.Math;

public class Triangle {
    protected double angleAdeg;
    protected double angleBdeg;
    protected double angleCdeg;
    protected double sideA;
    protected double sideB;
    protected double sideC;


    public void setTriangle(double aAdeg, double aBdeg, double aCdeg, double siA, double siB, double siC) {

        double angleArad = Math.toRadians(aAdeg);
        double angleBrad = Math.toRadians(aBdeg);
        double angleCrad = Math.toRadians(aCdeg);

        String sangleArad = String.format("%.3f",angleArad);
        String sangleBrad = String.format("%.3f",angleBrad);
        String sangleCrad = String.format("%.3f",angleCrad);
        String sangleAradF = sangleArad.replace(",", ".");
        String sangleBradF = sangleBrad.replace(",", ".");
        String sangleCradF = sangleCrad.replace(",", ".");

        double rangleArad = Double.parseDouble(sangleAradF);
        double rangleBrad = Double.parseDouble(sangleBradF);
        double rangleCrad = Double.parseDouble(sangleCradF);

        double sintheA = (siA / Math.sin(rangleArad));
        double sintheB = (siB / Math.sin(rangleBrad));
        double sintheC = (siC / Math.sin(rangleCrad));

        System.out.println(sintheA);
        System.out.println(sintheB);
        System.out.println(sintheC);

        boolean triangleExists = (sintheA - sintheB) < 0.005 && (sintheB - sintheC) < 0.005 && (sintheA - sintheC) < 0.005 && aAdeg > 0 && aBdeg > 0 && aCdeg > 0 && (aAdeg + aBdeg + aCdeg) == 180 && (sintheA - sintheB) > -0.005 && (sintheB - sintheC) > -0.005 && (sintheA - sintheC) > -0.005;

        if (triangleExists) {
            System.out.println("Entered parameteres satisfy the sine theorem with error of ~0.01, your triangle exists");
            this.angleAdeg = aAdeg;
            this.angleBdeg = aBdeg;
            this.angleCdeg = aCdeg;
            this.sideA = siA;
            this.sideB = siB;
            this.sideC = siC;
        } else {
            System.out.println("Entered parameters do not satisfy the sine theorem, your triangle cannot exist");
        }

    }
    public double getSideA() {
        System.out.println("Side A: " +sideA);
        return sideA;
    }

    public double getSideB() {
        System.out.println("Side B: " +sideB);
        return sideB;
    }

    public double getSideC() {
        System.out.println("Side C: " +sideC);
        return sideC;
    }

    public double getAngleA() {
        System.out.println("Angle A: " +angleAdeg);
        return angleAdeg;
    }

    public double getAngleB() {
        System.out.println("Angle B: " +angleBdeg);
        return angleBdeg;
    }

    public double getAngleC() {
        System.out.println("Angle C: " +angleCdeg);
        return angleCdeg;
    }

    public double calculatePerimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of your triangle equals: " +perimeter);
        return perimeter;
    }

    public double calculateArea() {
        double halfperimeter = (sideA + sideB + sideC)/2;
        double areaOfTriangle = Math.sqrt(halfperimeter * ((halfperimeter - sideA) * (halfperimeter - sideB) * (halfperimeter - sideC)));
        System.out.println("Area of your triangle equals: " +areaOfTriangle);
        return areaOfTriangle;
    }

}
