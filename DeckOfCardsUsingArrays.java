public class DeckOfCardsUsingArrays {
    public static void main(String[] args) {
        String[] symbol = {"♠", "♦", "♣", "♥"};
        String[] rank = {"7", "8",
        "9", "10", "J", "Q", "K", "A"};
        String[] deck = new String[32];

        for (int i = 0; i < deck.length; i++) {
                deck[i] = rank[i % 8]  + symbol[i / 8];

            //System.out.println(deck[i]); - Print the deck not in random order
        }
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);       //Shuffle the deck /random order/

            String temporary = deck[i];
            deck[i] = deck[index];
            deck[index] = temporary;
        }
        for (String randomOrder: deck) {
            System.out.println(randomOrder);         //Print the shuffled deck /random order/
        }
    }
}