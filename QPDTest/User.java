package QPDTest;

public class User implements GMail,Whatsapp{
    @Override
    public void sendEmail() {
        System.out.println("USER SENDING AN EMAIL");
    }

    @Override
    public void messaging() {
        System.out.println("USER SENDING MESSAGES");
    }
}
