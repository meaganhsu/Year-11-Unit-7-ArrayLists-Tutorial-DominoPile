import java.lang.reflect.Array;
import java.util.*;
public class DominoPile {
    private ArrayList<Domino> pile;
    public DominoPile() {
        pile = new ArrayList<Domino>();
    }
    public ArrayList<Domino> getPile() {
        return pile;
    }
    public void newStack6() {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                pile.add(new Domino(i,j));
            }
        }
    }
    public void shuffle() {
        ArrayList<Domino> p = new ArrayList<Domino>();
        newStack6();
        Random rand = new Random();

        for (int i = 0; i < pile.size(); i++) {
            int y = rand.nextInt(pile.size());
            p.add(pile.get(y));
        }
    }
}
