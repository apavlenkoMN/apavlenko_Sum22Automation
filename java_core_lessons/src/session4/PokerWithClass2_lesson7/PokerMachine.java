package session4.PokerWithClass2_lesson7;

import java.util.Random;

public class PokerMachine {

    public Deck createDeck() {
        Logger.log(Logger.Levels.DEBUG,"debugging create deck call");
        return new Deck();

    }


    public void shuffleDeck(Deck deck) {
        Random random = new Random();
        Logger.log(Logger.Levels.WARN,"shuffling the deck");
        for (int i = 0; i < 100; i++){
            int in = random.nextInt(52);
            int out = random.nextInt(52);

            Card tempCard = deck.getCard(in);
            deck.setCard(deck.getCard(out), in);
            deck.setCard(tempCard, out);
        }

    }
    public void serveCardToPlayers(Deck deck, int players){
        int count = 0;
        for (int round=1; round <=5; round++){
            Logger.log(Logger.Levels.INFO,"starting new round " + round + ":");
            System.out.println("=== ROUND " + round + " ===");
            for (int player=1; player <=players; player++){
                System.out.printf("Player %d gets card: %s%n", player, deck.getCard(count++));
            }
            System.out.println();
        }
    }
}
