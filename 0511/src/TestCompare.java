
class Card {
    String rank;
    String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank='" + rank + '\'' +
                ", suit='" + suit + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) {
            return true;
        }
        if (o==null) {
            return false;
        }
        Card other = (Card) o;
        return this.rank.equals(other.rank);
    }
}

public class TestCompare {
    public static void main(String[] args) {
        Card card1 = new Card("10","♥");
        Card card2 = new Card("10","♠");
        Card card3 = card1;
        System.out.println(card1==card2);//比较身份，地址
        System.out.println(card1==card3);
//        System.out.println(card1);
//        System.out.println(card2);
        System.out.println(card1.equals(card2));
        System.out.println(card1.equals(card3));

    }
}
