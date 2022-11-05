package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
public class Triangle extends Figure {
    private double hide = 0;
    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;

    public Triangle(double hide, double sideA, double sideB, double sideC) {
        this.hide = hide;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

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
    public void perimeter() {
        double p = sideA + sideB + sideC;
    }

    @Override
    public void area() {
        double ar = 0.5 * sideA * hide;
    }

}
