package session4.PokerWithClass;

public class PokerProcess {


    public static void main(String[] args) {

        CardDesk cardDesk = new CardDesk();
        cardDesk.create();
        cardDesk.printDesk();
        cardDesk.shuffle();
        cardDesk.printDesk();

        cardDesk.giveCard(4, 5);

    }
}
