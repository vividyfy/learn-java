import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Card {
    public String suit;
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("(%s%s)",suit,rank);
    }
}
public class Poker {
   static List<Card> buyPoker() {
       List<Card> poker = new ArrayList<>();
       String[] suits = {"♠","♥","♣","♦"};
       for (int i = 0; i < 4; i++) {
           for (int j = 2; j < 11; j++) {
               Card card = new Card(suits[i],String.valueOf(j));
               poker.add(card);
           }
           poker.add(new Card(suits[i],"A"));
           poker.add(new Card(suits[i],"J"));
           poker.add(new Card(suits[i],"Q"));
           poker.add(new Card(suits[i],"K"));
       }
       return poker;
   }
   public static void shuffle(List<Card> poker) {
       //Collections.shuffle(poker);
       Random random = new Random();
       for (int i = poker.size()-1; i > 0; i--) {
           int r = random.nextInt(i);
           swap(poker,i,r);
       }
   }
   public static void swap(List<Card> poker, int i,int j) {
       Card tmp = poker.get(i);
       poker.set(i,poker.get(j));
       poker.set(j,tmp);
   }

    public static void main(String[] args) {
        List<Card> poker = buyPoker();
        shuffle(poker);
        System.out.println(poker);
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int cardIndex = 0; cardIndex < 5; cardIndex++) {
            for (int playerIndex = 0; playerIndex < 3; playerIndex++) {
                List<Card> player = players.get(playerIndex);
                Card topCard = poker.remove(cardIndex);
                player.add(topCard);
            }
        }

        System.out.println("玩家1手中的牌：");
        System.out.println(players.get(0));
        System.out.println("玩家2手中的牌：");
        System.out.println(players.get(1));
        System.out.println("玩家3手中的牌：");
        System.out.println(players.get(2));
    }
}
