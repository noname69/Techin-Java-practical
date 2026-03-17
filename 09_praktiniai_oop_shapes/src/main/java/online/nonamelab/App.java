package online.nonamelab;

import java.util.ArrayList;

public class App {
    static void main() {
        Circle circle = new Circle(1.5, "blue", false);
        Rectangle rectangle = new Rectangle(10, 50);
        Square square = new Square(12);
        Square square2 = new Square(0.8);
        RegularPentagon pentagon = new RegularPentagon(5);

//        System.out.println(pentagon);
//        System.out.println(pentagon.getArea());

        ArrayList<Shape> figures = new ArrayList<>();

        figures.add(circle);
        figures.add(rectangle);
        figures.add(square);
        figures.add(pentagon);
        figures.add(square2);

        for (Shape figure : figures) {
            System.out.println(figure);
        }


        double figuresAreasSum = 0;

        for (Shape figure : figures) {
            figuresAreasSum += figure.getArea();
        }
        System.out.println("Figures area sum: " + figuresAreasSum);

        double figurePerimeter = 0;
        Shape f = new Shape();

        for (Shape figure : figures) {
            if (figurePerimeter < figure.getPerimeter()) {
                figurePerimeter = figure.getPerimeter();
                f = figure;
            }
        }
        System.out.println("Figure with biggest perimeter is: " + f.getClass().getSimpleName());

        int i = 0;
        System.out.println("Squeres sides:");
        for (Shape figure : figures) {

            if (figure instanceof Square) {
                System.out.print(++i + ". ");
                System.out.println(((Square) figure).getSide());
            }
        }

    }
}
