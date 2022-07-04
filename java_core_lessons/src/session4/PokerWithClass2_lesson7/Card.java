package session4.PokerWithClass2_lesson7;

public class Card extends Logger{

    public String suit;

    public String value;

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card(" + value + " of " + suit + ")";
    }
}
