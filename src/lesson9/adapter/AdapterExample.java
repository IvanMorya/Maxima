package lesson9.adapter;

public class AdapterExample {

    public static void main(String[] args) {
        MicroUsbPhone phone = new MicroUsbPhone();
        USB adapter = new UsbAdapter(phone);
        adapter.connectionWithMicroUsbCable();

        UsbPhone usbPhone = new UsbPhone();
        USB adapter2 = new UsbAdapter(usbPhone);
        adapter2.connectionWitUsbCable();
        adapter2.connectionWithLightningCable();
    }
}
