package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
public class Square extends Figure {
    private int sideA = 0;

    public Square(int sideA) {
        this.sideA = sideA;

        if (sideA <= 0) {
            throw new ErrorSide("Длина стороны не может быть отрицательная или равна нулю");
        }
    }

    @Override
    public void perimeter() {
        int p = 4 * sideA;
    }

    @Override
    public void area() {
        int ar = sideA * sideA;
    }
}
