package session4.PokerWithClass2_lesson7;

import java.util.logging.Level;

public class Deck {

    private Card[] deck;

//
//    final static java.util.logging.Logger LOGGER =
//            java.util.logging.Logger.getLogger(Logger.class.getName());

    public Deck() {
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


        deck = new Card[53];
        int count = 0;
        //LOGGER.log(Level.INFO, "Deck creation");
        Logger.log(Logger.Levels.INFO, "Deck creation");
        for (String suit : suits) {
            for (String value : values) {
                Card card = new Card();
                card.setSuit(suit);
                card.setValue(value);
                deck[count++] = card;
                //System.out.println(card);


            }
        }
    }

        public Card getCard(int cardIndex)
            {
                //LOGGER.log(Level.INFO, "getCard");
                return deck[cardIndex];}
            
        public void setCard(Card card, int cardIndex){
            //LOGGER.log(Level.INFO, "setCard");
            deck[cardIndex] = card;

        }
    }

