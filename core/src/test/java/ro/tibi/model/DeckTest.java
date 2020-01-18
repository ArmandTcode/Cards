package ro.tibi.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    List<PokerCard> cards;

    @Before
    public void setUp() {
        cards = new ArrayList<>();
        for (PokerCard pokerCard : PokerCard.values()) {
            for (int i = 0; i < 4; i++)
                cards.add(pokerCard);
        }
    }

    @Test
    public void whenGettingCardsFromDeck_thenExpectRightCards() {
        assertEquals(cards, Deck.getCards());
    }

    @After
    public void shutDown(){
        cards=null;
    }
}

