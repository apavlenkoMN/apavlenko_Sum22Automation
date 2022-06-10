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

        int[] cardPool = new int[52]; //общая колода

        int[] cardInHandPool = new int[20];

        int cardCounter;
        String cardSuit;

        int randStorage = 0;
        for (int i = 0; i < cardInHandPool.length; i++) {
            cardInHandPool[i] = 0; // заполнить нулями, пустые руки
        }

        System.out.println(Arrays.toString(cardInHandPool));

        boolean alreadyExist = false;

        for (int i = 0; i < cardInHandPool.length;) {

            do {
                randStorage = random.nextInt(52) + 1;
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
                    i++;
                    break;
                }
            } while (alreadyExist == false);
            // cardInHandPool[i]=randStorage;


            System.out.println(Arrays.toString(cardInHandPool));
        }
    }
}


//
//
//        cardInHandPool[j] = randStorage;
////
////            if(cardInHandPool[j] >0 && cardInHandPool[j] < 13){
////                cardSuit = "Diamonds";
////                if(cardInHandPool[j] >0 && cardInHandPool[j] < 8){
////
////                }
////
////            }
////            else if (cardInHandPool[j] >0 && cardInHandPool[j] < 13)
//            System.out.println();
//            System.out.println(Arrays.toString(cardInHandPool));
//        }

     //   System.out.println(Arrays.toString(cardInHandPool));

//        for (int k=1;k<cardInHandPool.length;k++){
//            System.out.println(cardInHandPool[k]);
//        }




//
//        int j=1;
//        do {
//            randStorage = random.nextInt(100);
//        } while (cardInHandPool[j] != randStorage);

//        for (int i=1;i<=cardInHandPool.length;){
//            randStorage = random.nextInt(100);
//            for (int j=1;j<=cardInHandPool.length;j++){
//                if (cardInHandPool[j] == randStorage){
//                    break;
//                }
//                else {
//                    cardInHandPool[i] = randStorage;
//                    i++;
//                }
//
//            }

//        }








