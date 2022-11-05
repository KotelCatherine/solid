import AbstractClass.Figure;
import Figures.*;
import Interface.ICircumference;
import Interface.IPerimeter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 3, 3.5, 3.5);
        Figure circle = new Circle(2);
        Figure rectangle = new Rectangle(47, 13, 47, 13);
        Figure square = new Square(5, 5, 5, 5);

        List<Figure> figures = new ArrayList<>();

        addFigure(figures, triangle);
        addFigure(figures, circle);
        addFigure(figures, rectangle);
        addFigure(figures, square);

        setPerimeter(figures);
        setArea(figures);
    }

    private static void addFigure(List<Figure> figures, Figure figure) {
        figures.add(figure);
    }

    private static void setPerimeter(List<Figure> figures) {
        for (Figure figure : figures) {
            if (figure instanceof ICircumference) {
                ((ICircumference) figure).circumference();
            }
            if (figure instanceof IPerimeter) {
                ((IPerimeter) figure).perimeter();
            }
        }
    }

    private static void setArea(List<Figure> figures) {
        for (Figure figure : figures) {
            figure.area();
        }
    }
}