package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
import Interface.IPerimeter;

public class Triangle extends Figure implements IPerimeter {
    private double hide;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double hide, double sideA, double sideB, double sideC) {
        this.hide = hide;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        isTrue(hide, sideA, sideB, sideC);
    }

    private void isTrue(double hide, double sideA, double sideB, double sideC) {
        if (hide <= 0 || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new ErrorSide("Длина стороны не может быть отрицательная или равна нулю");
        }

        if (sideA >= sideB) {
            if (sideA >= sideC) {
                double ex = sideB + sideC;
                if (sideA >= ex) {
                    throw new ErrorSide("Сумма длин двух сторон должна быть больше длины третьей стороны");
                }
            } else {
                double ex = sideA + sideB;
                if (sideC >= ex) {
                    throw new ErrorSide("Сумма длин двух сторон должна быть больше длины третьей стороны");
                }
            }
        } else if (sideB >= sideC) {
            double ex = sideA + sideC;
            if (sideB > ex) {
                throw new ErrorSide("Сумма длин двух сторон должна быть больше длины третьей стороны");
            }

        } else {
            double ex = sideA + sideB;
            if (sideC >= ex) {
                throw new ErrorSide("Сумма длин двух сторон должна быть больше длины третьей стороны");
            }
        }
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        return 0.5 * sideA * hide;
    }

}
