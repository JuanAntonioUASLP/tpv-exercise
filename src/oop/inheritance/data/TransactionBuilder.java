package oop.inheritance.data;

import java.time.LocalDateTime;

public class TransactionBuilder {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    TransactionBuilder(){
    }

    public void amountInCents(int amountInCents){
        this.amountInCents = amountInCents;
    }

    public void card(Card card){
        this.card = card;

    }

    public void localDateTime(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;

    }

    public Transaction build(){
       return new Transaction(amountInCents, card, localDateTime);
    }

}
