package online.nonamelab;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
//        super.setWidth(side);
//        super.setLength(side);
        super.setSide(side);
    }

    @Override
    public void setLength(double side) {
//        super.setWidth(side);
//        super.setLength(side);
        super.setSide(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + super.getWidth() + ", which is a subclass of " + super.toString();
    }
}
