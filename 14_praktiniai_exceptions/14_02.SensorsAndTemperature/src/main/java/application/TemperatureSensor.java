package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean inOn;

    public TemperatureSensor() {
        this.inOn = false;
    }

    @Override
    public boolean isOn() {
        return this.inOn;
    }

    @Override
    public void setOn() {
        this.inOn = true;
    }

    @Override
    public void setOff() {
        this.inOn = false;
    }

    @Override
    public int read() {
        if(isOn()) {
            return new Random().nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }
}
