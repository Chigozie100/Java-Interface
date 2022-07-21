package Telecomm;

public class DeskPhone implements Telephone{
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }


    @Override
    public void powerOn() {
        System.out.println("Desktop phone is powered");
    }

    @Override
    public void dail(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        } else
            System.out.println("Phone is not Ringing");

    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Phone is Ringing");
        }else{
            isRinging = true;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
