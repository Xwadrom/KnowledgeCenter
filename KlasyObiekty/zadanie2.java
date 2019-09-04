class Game {
    String title;
    int rating;
}

public class zadanie2 {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.title = "Witcher 3";
        game1.rating = 10;

        Game game2 = new Game();
        game2.title = "Starcraft";
        game2.rating = 8;
        //1 diagram

        Game game3 = game2;
        game2 = null;// pomimo tego, że game2 ma teraz wartosci domyslne to game3 dalej posiada wartosci game2
        //2 diagram

        System.out.println(game1.title);
        System.out.println(game3.title);
        System.out.println(game2.title);
    }
}