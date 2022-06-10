package session4;

import java.util.Arrays;
import java.util.Random;

public class AdvancedTask_HT4 {

    public static void main(String[] args) {

//        Написать программу, которая должна имитировать раздачу карт для игры в покер.
//        За столом сидят 4 игрока, каждый из них получает на руки 5 карт.
//        Карты должны быть случайными и не повторяться. Формат вывода на экран:
//        “Игрок N получает карту <НАЗВАНИЕ КАРТЫ>”

        // 4 масти, от 2 до туза
        // 2-10, валет дама король туз (13) 13*4
//        Diamonds (Бубы
//        Hearts (Черви
//        Clubs (Трефы
//        Spades (Пики

        Random random = new Random();

        int[] cardPool = new int[56]; //общая колода

        int[] cardInHandPool = new int[20];

        int cardCounter;
        String cardSuit;
        int playerNumber = 1;

        int randStorage = 0;
        for (int i = 0; i < cardInHandPool.length; i++) {
            cardInHandPool[i] = 0; // заполнить нулями, пустые руки
        }

  //      System.out.println(Arrays.toString(cardInHandPool));

        boolean alreadyExist = false;

        for (int i = 0; i < cardInHandPool.length;) {

            do {
                randStorage = random.nextInt(52) + 2;
                for (int j = 0; j < cardInHandPool.length; j++) {
                    if (cardInHandPool[j] == randStorage) {
                        alreadyExist = true;
                        break;
                    } else {
                        alreadyExist = false;
                    }
                }
                if (alreadyExist == false) {
                    cardInHandPool[i] = randStorage;


                    if(playerNumber==5){ playerNumber=1;}
  //                  System.out.println("player " + playerNumber + " , Suit is : " + getSuit(cardInHandPool[i]) + " , and card is " + getCardValue(cardInHandPool[i]));
                    System.out.println("player " + playerNumber + " get the card " + getCardValue(cardInHandPool[i]) + " of " + getSuit(cardInHandPool[i]));
                    playerNumber++;
                    i++;
                    break;
                }
            } while (alreadyExist == false);
            // cardInHandPool[i]=randStorage;


         //   System.out.println(Arrays.toString(cardInHandPool));
        }


        System.out.println(Arrays.toString(cardInHandPool));


    }


    static String getSuit(int num) {
        if (num > 0 && num <= 14) {
            return "Diamond";
        } else if (num > 14 && num <= 28) {
            return "Hearts";
        } else if (num > 28 && num <= 42) {
            return "Clubs";
        } else if (num > 42 && num <= 56) {
            return "Spades";
        } else {
            return "wrong operation logic";
        }
    }

    // 2-10, 11v 12d 13k 14t, 15=2, 15++18
    static String getCardValue(int numb) {
        if (numb > 0 && numb <= 10) {
            return Integer.toString(numb);
        } else if (numb >= 15 && numb <= 24) {
            return Integer.toString(numb-14);
        } else if (numb >= 29 && numb <= 37) {
            return Integer.toString(numb-28);
        } else if (numb >= 43 && numb <= 52) {
            return Integer.toString(numb-41);
        } else if (numb ==11 || numb ==25 || numb ==39 || numb == 53) {
            return "V";
        } else if (numb ==12 || numb ==26 || numb ==40 || numb == 54) {
            return "D";
        } else if (numb ==13 || numb ==27 || numb ==41 || numb == 55) {
            return "K";
        } else if (numb ==14 || numb ==28 || numb ==42 || numb == 56) {
            return "T";
        } else{
            return "wrong operation logic";
        }
    }



}










