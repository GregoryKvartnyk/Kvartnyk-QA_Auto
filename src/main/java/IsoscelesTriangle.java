public class IsoscelesTriangle extends Triangle{

    @Override
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

// Теорема синусів рахується криво у даному випадку, тому було вирішено збільшити похибку
        boolean triangleExists = (sintheA - sintheB) < 0.02 && (sintheB - sintheC) < 0.02 && (sintheA - sintheC) < 0.02 && aAdeg > 0 && aBdeg > 0 && aCdeg > 0 && (aAdeg + aBdeg + aCdeg) == 180 && (sintheA - sintheB) > -0.02 && (sintheB - sintheC) > -0.02 && (sintheA - sintheC) > -0.02;
        boolean isoscelesTriangle = (siA == siB && siA != siC) || (siB == siC && siB != siA) || (siC == siA && siC != siB); // Умова, що дві сторони рівні

        if (triangleExists) {
            if (isoscelesTriangle) { // Додаємо умову, що дві сторони рівні
                System.out.println("Entered parameteres satisfy the sine theorem with error of ~0.04, your triangle exists");
                this.angleAdeg = aAdeg;
                this.angleBdeg = aBdeg;
                this.angleCdeg = aCdeg;
                this.sideA = siA;
                this.sideB = siB;
                this.sideC = siC;
            }
            else {
                System.out.println("Two of the sides and angles between them and the base must be equal to each other");
            }
        } else {
            System.out.println("Entered parameters do not satisfy the sine theorem, your triangle cannot exist");
        }

    }
}
