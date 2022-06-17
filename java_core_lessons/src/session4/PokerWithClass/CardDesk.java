package session4.PokerWithClass;

import java.util.Arrays;
import java.util.Random;

public class CardDesk {


    int[] cardDesk = new int[56];
    Random random = new Random();


    public void create() {
        for (int i = 0; i < cardDesk.length; i++) {
            cardDesk[i] = i + 1;
        }
    }

    public void shuffle() {
        int tempCard;
        int tempValue;
        for (int i = 0; i < cardDesk.length; i++) {
            tempCard = random.nextInt(cardDesk.length);
            tempValue = cardDesk[i];
            cardDesk[i] = cardDesk[tempCard];
            cardDesk[tempCard] = tempValue;
        }

    }

    public void printDesk() {
        System.out.println(Arrays.toString(cardDesk));
    }

    public void giveCard(int players, int cards) {
        int playerNumber = 1;

        if(cards*players>56){
            System.out.println( "too many cards for each player, desk is smaller");}
        else {
        for (int i = 0; i <= cards*players; i++) {

//            if(playerNumber==5){ playerNumber=1;}
                if (playerNumber > players) {
                    playerNumber = 1;
                }
                System.out.println("player " + playerNumber + " get the card " + CardPrint.getCardValue(cardDesk[i]) +
                        " of " + CardPrint.getSuit(cardDesk[i]));
                playerNumber++;
            }
        }
    }
}
