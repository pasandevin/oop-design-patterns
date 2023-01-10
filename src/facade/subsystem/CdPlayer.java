package facade.subsystem;

public class CdPlayer {
    public void on() {
        System.out.println("CD Player on");
    }

    public void play(String movie) {
        System.out.println("CD Player playing \"" + movie + "\"");
    }

    public void stop(String movie) {
        System.out.println("CD Player stopped \"" + movie + "\"");
    }

    public void eject() {
        System.out.println("CD Player eject");
    }

    public void off() {
        System.out.println("CD Player off");
    }
}
