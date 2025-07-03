package Television;

public class Television {
    private boolean isOn;


    public Television() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn;
    }
}
