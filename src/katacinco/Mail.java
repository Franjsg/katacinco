package katacinco;

public class Mail {
    
    private String adress;

    public Mail(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }
    
    public String getDomain() {
        return adress.split("@")[1];
    }
}
