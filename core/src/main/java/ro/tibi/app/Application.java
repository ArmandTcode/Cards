package ro.tibi.app;

import ro.tibi.model.PokerCard;

import java.util.List;

public class Application {
    public static void main(String[] args) {
    }

    //Remove this later
    public static void showDeck(List<PokerCard> cards) {
        for (PokerCard pokerCard : cards)
            System.out.print(pokerCard.getValue() + " ");
    }
}
