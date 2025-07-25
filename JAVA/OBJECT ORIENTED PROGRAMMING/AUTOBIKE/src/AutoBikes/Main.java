package AutoBikes;
import AutoBikes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Gear myGear = new Gear();
        /*
        System.out.println(myGear.getGearPosition());
        myGear.upShift();
        System.out.println(myGear.getGearPosition());
        myGear.downShift();
        System.out.println(myGear.getGearPosition());
        try {
            myGear.downShift();
            System.out.println(myGear.getGearPosition());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myGear.isOn());
        myGear.toggle();
        System.out.println(myGear.isOn());
        myGear.toggle();
        System.out.println(myGear.isOn());
        myGear.accelerate();
        System.out.println(myGear.getSpeed());

         */
        myGear.upShift();
        myGear.accelerate();
        System.out.println(myGear.getSpeed());
        myGear.accelerate();
        System.out.println(myGear.getSpeed());

    }
}
