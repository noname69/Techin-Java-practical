package online.nonamelab;

public class RegularPentagon extends Shape{
    private double side;

    public RegularPentagon() {
        this.side = 1.0;
    }

    public RegularPentagon(double side) {
        this.side = side;
    }

    public RegularPentagon( double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (5*Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5)));
    }


    public double getPerimeter() {
        return 5 * side;
    }

    @Override
    public String toString() {
        return "A Regular Pentagon with side="+side+", which is a subclass of " + super.toString();
    }
}
