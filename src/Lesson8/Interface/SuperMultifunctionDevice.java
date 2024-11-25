package Lesson8.Interface;

import Lesson8.multipleimlementarion.MultiFunctionDevice;

public class SuperMultifunctionDevice extends MultiFunctionDevice {

    public void someMethod() {
        SuperMultifunctionDevice multiFunctionDevice = new SuperMultifunctionDevice();
        multiFunctionDevice.c = "";
    }

    public static void main(String[] args) {
        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
    }
}
