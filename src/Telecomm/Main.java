package Telecomm;

public class Main {
    public static void main(String[] args) {
        DeskPhone deskPhone = new DeskPhone("0182334");
        deskPhone.powerOn();
        deskPhone.callPhone("208223");
        deskPhone.answer();

    }

}
