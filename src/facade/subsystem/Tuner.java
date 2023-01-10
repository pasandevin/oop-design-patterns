package facade.subsystem;

public class Tuner {
    public void on() {
        System.out.println("Tuner on");
    }

    public void off() {
        System.out.println("Tuner off");
    }

    public void setFrequency() {
        System.out.println("Tuner setting frequency");
    }

    public void setAm() {
        System.out.println("Tuner setting AM mode");
    }

    public void setFm() {
        System.out.println("Tuner setting FM mode");
    }
}
