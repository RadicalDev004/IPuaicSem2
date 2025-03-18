
public class Main {
    public static void main(String[] args) {
        Card myCard = new Card("Anton Cosmin", "123", "12/26", 500);
        Passager cl = new Passager("Anton", "Cosmin", "0712345678", "anton@gmail.com", "A9182ie", "romanian", 5, 100, myCard);

        System.out.println("Inainte de transfer\n" + cl);

        if (cl.addFundsFromCard(200)) {
            System.out.println("\nTransfer reusit!");
        } else {
            System.out.println("\nFonduri insuficiente!");
        }

        System.out.println("\nDupa transfer:\n" + cl);
    }
}

