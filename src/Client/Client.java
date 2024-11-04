package Client;

import BankCard.Card;

public class Client {
    private Card[] cards;
    private int cardCount;

    public Client(int maxCardCount) {
        this.cards = new Card[maxCardCount];
        this.cardCount = 0;
    }

    public void addCard(int cvv, String cardNumber, double cardAmount){
        if (cardCount < cards.length){
            cards[cardCount] = new Card(cardNumber,cvv, cardAmount);
            cardCount++;
        }else {
            System.out.println("You can't add more cards.");
        }
    }

    public void countSameCards() {

        int count = 0;

        if (cardCount == 0) {
            System.out.println("Client doesn't have a bank card.");
        } else {
            for (int i = 0; i < cards.length; i++) {
                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[i].equals(cards[j])) {
                        System.out.println(cards[i] + " is a duplicate of " + cards[j] + " cards.");
                        count++;
                    }
                }
            }
        }

        if (count < 0) {
            System.out.println("You don't have duplicate cards");
        } else {
            System.out.println("Client has " + count + " same cards.");
        }

    }


    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public int getCardCount() {
        return cardCount;
    }

    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }
}

