package Lesson8.Interface;

import Lesson8.multipleimlementarion.MultiFunctionDevice;

public class SuperMultifunctionDevice extends MultiFunctionDevice {


    public void someMethod() {
        SuperMultifunctionDevice multiFunctionDevice = new SuperMultifunctionDevice();
        multiFunctionDevice.string = "";
    }

    public static void main(String[] args) {
        SuperMultifunctionDevice superMultifunctionDevice = new SuperMultifunctionDevice();
        System.out.println(superMultifunctionDevice.string);
    }
}
