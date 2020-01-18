package ro.tibi.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private static List<PokerCard> cards;

    static {
        cards = new ArrayList<>();
        for (PokerCard pokerCard : PokerCard.values()) {
            for (int i = 0; i < 4; i++)
                cards.add(pokerCard);
        }
    }

    private Deck() {
    }

    public static List<PokerCard> getCards() {
        return cards;
    }

}



