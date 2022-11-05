package Figures;

import AbstractClass.Figure;
import Error.ErrorSide;
public class Circle extends Figure {
    private double radius = 0;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        if (radius <= 0) {
            throw new ErrorSide("Длина радиуса не может быть отрицательная или равна нулю");
        }
    }

    @Override
    public void perimeter() {
        double p = 2.0 * pi * radius;
    }

    @Override
    public void area() {
        double ar = pi * radius * radius;
    }
}
