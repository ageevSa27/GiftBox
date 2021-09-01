import java.util.ArrayList;

public class Box {
    private ArrayList<Candy> gift = new ArrayList<>();

    // не вдуплил piont
    public void add(Candy point) {
        gift.add(point);
    }

    private int weightBox() {
        int i = 0;
        for (Candy candy : gift) {
            i += candy.weight;
        }
        return i;
    }

    private int costBox() {
        int i = 0;
        for (Candy candy : gift) {
            i += candy.cost;
        }
        return i;
    }

    public void info() {
        System.out.println("Общий вес подарка: " + weightBox());
        System.out.println("Общая стоимость: " + costBox());
    }
}
