package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
public class Rectangle extends Figure {
    private int sideA = 0;
    private int sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

        if (sideA <= 0 || sideB <= 0) {
            throw new ErrorSide("Длина стороны не может быть отрицательная или равна нулю");
        }
    }

    @Override
    public void perimeter() {
        int p = sideA + sideB;
    }

    @Override
    public void area() {
        int ar = sideA * sideB;
    }
}
