package session4.PokerWithClass2_lesson7;

public class PokerOOP {

    public static void main(String[] args) {
//        Deck deck = new Deck();
//
//        System.out.println("check");
//
//        System.out.println(deck.getCard(2));
//        System.out.println(deck.getCard(3));

        PokerMachine pokerMachine = new PokerMachine();
        Deck deck = pokerMachine.createDeck();
        pokerMachine.shuffleDeck(deck);
        pokerMachine.serveCardToPlayers(deck, 4);

        Deck deck2 = pokerMachine.createDeck();
        pokerMachine.shuffleDeck(deck2);

        System.out.println(deck.getCard(2));
        System.out.println(deck2.getCard(2));

        Logger.log(Logger.Levels.ERROR,"just check the error message in main class");

    }
}
