package lesson9.adapter;

public class UsbAdapter implements USB {
    private MicroUsbPhone microUsbPhone;
    private UsbPhone usbPhone;

    UsbAdapter(MicroUsbPhone microUsbPhone) {
        this.microUsbPhone = microUsbPhone;
    }

    UsbAdapter(UsbPhone usbPhone) {
        this.usbPhone = usbPhone;
    }

    @Override
    public void connectionWitUsbCable() {
        usbPhone.connectionWitUsbCable();
    }

    @Override
    public void connectionWithMicroUsbCable() {
        microUsbPhone.connectWithMicroUsbCable();
    }

    @Override
    public void connectionWithLightningCable() {

    }

}
