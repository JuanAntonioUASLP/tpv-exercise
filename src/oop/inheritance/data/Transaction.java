package oop.inheritance.data;

import java.time.LocalDateTime;

public final class Transaction {
    private final int amountInCents;
    private final Card card;
    private final LocalDateTime localDateTime;

    public Transaction(int amountInCents, Card card,LocalDateTime localDateTime) {
        this.amountInCents = amountInCents;
        this.card = card;
        this.localDateTime = localDateTime;
    }

    public int getAmountInCents() {
        return amountInCents;
    }

    public void setAmountInCents(int amountInCents) {
    }

    public Card getCard() {

        return card;
    }

    public void setCard(Card card) {

    }


    public  LocalDateTime getLocalDateTime() {

        return localDateTime;
    }


    public void setLocalDateTime(LocalDateTime localDateTime) {

    }

    public static TransactionBuilder builder() {
         return new TransactionBuilder();
    }
}
