package HW_6_FirstClasses;

import java.lang.Math;
public class Triangle {

    private double angleAdeg;
    private double angleBdeg;
    private double angleCdeg;
    private double sideA;
    private double sideB;
    private double sideC;


    public void setTriangle(double aAdeg, double aBdeg, double aCdeg, double siA, double siB, double siC) {

        /* Тут програма рахує чи може існувати заданий трикутник за теоремою синусів. Синуси рахуються дуже дивно, тому
         було вирішено додати похибку ~0.01 при розрахунках.
         Сторони названі відповідно до протилежних їм кутів, тобто sideA(siA) протилежна до кута angleAdeg(aAdeg).

         Рекомендую користуватись калькулятором трикутників: https://planetcalc.ru/534/ або https://www.calc.ru/raschet-treugolnika.html
        */

        double angleArad = Math.toRadians(aAdeg); // синуси рахуються лише коли кути у радіанах
        double angleBrad = Math.toRadians(aBdeg);
        double angleCrad = Math.toRadians(aCdeg);

        String sangleArad = String.format("%.3f",angleArad); // обрізаємо значення у радіанах до 3 знаків після крапки
        String sangleBrad = String.format("%.3f",angleBrad);
        String sangleCrad = String.format("%.3f",angleCrad);
        String sangleAradF = sangleArad.replace(",", "."); // після обрізання значення чомусь розділяються комою
        String sangleBradF = sangleBrad.replace(",", ".");
        String sangleCradF = sangleCrad.replace(",", ".");

        double rangleArad = Double.parseDouble(sangleAradF); // парсимо стрінг у дабл
        double rangleBrad = Double.parseDouble(sangleBradF);
        double rangleCrad = Double.parseDouble(sangleCradF);

        double sintheA = (siA / Math.sin(rangleArad)); // рахуємо співвідношення для теореми синусів
        double sintheB = (siB / Math.sin(rangleBrad));
        double sintheC = (siC / Math.sin(rangleCrad));

        System.out.println(sintheA);
        System.out.println(sintheB);
        System.out.println(sintheC);

        boolean triangleExists = (sintheA - sintheB) < 0.005 && (sintheB - sintheC) < 0.005 && (sintheA - sintheC) < 0.005 && aAdeg > 0 && aBdeg > 0 && aCdeg > 0 && (aAdeg + aBdeg + aCdeg) == 180 && (sintheA - sintheB) > -0.005 && (sintheB - sintheC) > -0.005 && (sintheA - sintheC) > -0.005;

        /*
        Булеан вище це перевірка за теоремою синусів (замість перевірки рівності співвідношень довжини сторони до
        синуса протилежного кута, перевіряємо що вони відрізняються не більше ніж на 0.01),
        також перевіряємо що кути більше нуля та сума кутів дорівнює 180
         */

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
        double halfperimeter = (sideA + sideB + sideC)/2; // рахуємо площу за формулою Герона
        double areaOfTriangle = Math.sqrt(halfperimeter * ((halfperimeter - sideA) * (halfperimeter - sideB) * (halfperimeter - sideC)));
        System.out.println("Area of your triangle equals: " +areaOfTriangle);
        return areaOfTriangle;
    }

}
