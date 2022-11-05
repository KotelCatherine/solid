package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
import Interface.ICircumference;

public class Circle extends Figure implements ICircumference {
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        if (radius <= 0) {
            throw new ErrorSide("Длина радиуса не может быть отрицательная или равна нулю");
        }
    }

    @Override
    public double circumference() {
        return 2.0 * pi * radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }
}
