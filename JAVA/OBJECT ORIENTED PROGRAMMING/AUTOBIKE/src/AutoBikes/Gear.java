package AutoBikes;

public class Gear{

        private int gearPosition = 1;
        private boolean isOn;
        private int speed;

        public void upShift() {
            gearPosition++;
        }
        public void downShift() {
            if(gearPosition == 1){
                throw new RuntimeException("Only four positions available");
            }
            gearPosition--;

        }
        public int getGearPosition() {
            return gearPosition;
        }
        public boolean isOn() {
            return isOn;
        }
        public void toggle() {
            isOn = !isOn;
        }
        public void accelerate(){
            if(gearPosition == 2){
                speed += 2;
            }else {
                speed++;
            }
        }
        public int getSpeed(){
            return speed;
        }
}
