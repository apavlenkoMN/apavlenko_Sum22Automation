package session4.PokerWithClass;

public class CardPrint {



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
