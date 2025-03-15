public class Main{
    public static void main(String[] args){
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));

        System.out.println();

        w = new WordMatch("aaaabb");
        System.out.println(w.scoreGuess("a"));
        System.out.println(w.scoreGuess("aa"));
        System.out.println(w.scoreGuess("aaa"));
        System.out.println(w.scoreGuess("aabb"));
        System.out.println(w.scoreGuess("c"));

        System.out.println();
        System.out.println();
        
        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
    }
}