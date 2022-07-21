package Telecomm;

public interface Telephone {
    void powerOn();
    void dail(String PhoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
