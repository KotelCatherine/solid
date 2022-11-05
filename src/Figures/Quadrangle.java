package Figures;

import AbstractClass.Figure;
import Interface.IPerimeter;
import Error.ErrorSide;

public class Quadrangle extends Figure implements IPerimeter {

    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Quadrangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;

        isTrueQuadr(sideA, sideB, sideC, sideD);
    }

    private void isTrueQuadr(int sideA, int sideB, int sideC, int sideD) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideD <= 0) {
            throw new ErrorSide("Длина стороны не может быть отрицательная или равна нулю");
        }
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC + sideD;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }
}
