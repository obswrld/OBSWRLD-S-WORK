package AirConditioner;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 16;
    }

    public boolean getStatus() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }

    public void increaseTemp(int value) {
        if(getTemperature() + value > 30){
            temperature = 30;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemp(int value) {
        if(getTemperature() + value > 16){
            temperature = 16;
        }
    }
}
