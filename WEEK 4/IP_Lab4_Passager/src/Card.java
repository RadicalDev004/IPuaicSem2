public class Card {
    private String holderName, cvv, expiryDate;
    private double cardBalance;
    public Card(String holderName, String cvv, String expiryDate,double cardBalance) {
        this.holderName = holderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.cardBalance=cardBalance;
    }
    public boolean canWithdraw(double amount) {
        return cardBalance >= amount;
    }

    public boolean withdraw(double amount) {
        if (canWithdraw(amount)) {
            cardBalance -= amount;
            return true;
        }
        return false;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderName='" + holderName + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
}
