package acme.bean;

public class Contact {
    public Contact() {
        super();
    }
    
    private String name;
    private String mail;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public Contact(String name, String mail) {
      this.name = name;
      this.mail = mail;
    }
}
