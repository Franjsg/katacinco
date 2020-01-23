package katacinco;

public class MockMailLoader implements MailLoader{

    @Override
    public Mail[] load() {
        Mail[] mails = new Mail[5];
        mails[0]= new Mail("hola@yahoo.com");
        mails[1]= new Mail("hola@gmail.com");
        mails[2]= new Mail("hola@google.com");
        mails[3]= new Mail("hola@facebook.com");
        mails[4]= new Mail("hola@gmail.com");
        return mails;
    }
    
    
}
