package application;

public class StandardSensor implements Sensor{

    private int parameter;

    public StandardSensor(int p) {
        this.parameter = p;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return parameter;
    }
}
