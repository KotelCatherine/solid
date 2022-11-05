package Figures;

import Interface.IPerimeter;

public class Rectangle extends Quadrangle implements IPerimeter {

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        super(sideA, sideB, sideC, sideD);
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double area() {
        return super.area();
    }
}
