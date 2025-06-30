package AutoBikes;

public class AutoBike {
    private boolean itsOn;
    private int accelerate;

    public AutoBike(){
        this.itsOn = false;
        this.accelerate = 1;
    }

    public boolean getStatus(){
        return itsOn;
    }

    public void setOn(){
        itsOn = true;
    }

    public void setOff() {
        itsOn = false;
    }


    public int getAccelerate() {
        return accelerate;
    }

    public void increaseGear1(int value) {
        if(value > 0 && value < 20){
            accelerate = value + 1;
        }
    }

    public void increaseGear2(int value) {
        if(value > 20 && value < 30){
            accelerate = value + 2;
        }
    }

    public void increaseGear3(int value) {
        if(value > 30 && value < 40){
            accelerate = value + 3;
        }
    }

    public void increaseGear4(int value) {
        if(value > 40 && value < 120){
            accelerate = value + 4;
        }
    }

    public void decreaseGear1(int value) {
        if(value > 0 && value < 20){
            accelerate = value - 1;
        }
    }

    public void decreaseGear2(int value) {
        if(value > 20 && value < 30){
            accelerate = value - 2;
        }
    }

    public void decreaseGear3(int value) {
        if(value > 30 && value < 40){
            accelerate = value - 3;
        }
    }

    public void decreaseGear4(int value) {
        if(value > 40 && value < 120){
            accelerate = value - 4;
        }
    }
}
