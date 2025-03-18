public class Passager {
    private String name,surname,phoneNr,email,securityCode,language;
    private double rating,appBalance;
    private Card card;

    public Passager(String name,String surname,String phoneNr,String email,String securityCode,String language,double rating,double balance,Card card)
    {
        this.name=name;
        this.surname=surname;
        this.phoneNr=phoneNr;
        this.email=email;
        this.securityCode=securityCode;
        this.language=language;
        this.rating=rating;
        this.appBalance=balance;
        this.card=card;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBalance() {
        return appBalance;
    }

    public boolean addFundsFromCard(double amount) {
        if (card != null && card.withdraw(amount)) { // Verifică dacă sunt destui bani
            this.appBalance += amount; // Adaugă banii în balanța aplicației
            return true;
        }
        return false;
    }

    public void addBalance(double balance) {
        this.appBalance += balance;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", email='" + email + '\'' +
                ", securityCode='" + securityCode + '\'' +
                ", language='" + language + '\'' +
                ", rating=" + rating +
                ", balance=" + appBalance +
                ", card=" + (card != null ? card.toString() : "No Card") +
                " }";
    }
}
