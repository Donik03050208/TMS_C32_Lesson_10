package BankCard;

import java.util.Objects;

public class Card {
    private int cvv;
    private String cardNumber;
    private double cardAmount;

    public Card(String cardNumber, int cvv, double cardAmount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.cardAmount = cardAmount;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardNumber, card.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }

    public String toString() {
        return "Card{" +
                "amount=" + cardAmount +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
