public class Util {

    public static void Takeit(){
        Box gifts = new Box();
        gifts.add(new Caramel("Carame1l", 1, 2, "tasty"));
        gifts.add(new Caramel("Caramel2", 2, 5, "tasty"));
        gifts.add(new Haribo("Haribo1", 3, 4, "yellow"));
        gifts.add(new Haribo("Haribo2", 5, 5, "yellow"));
        gifts.add(new Lacrica("Lacrica1", 1, 3, "dark"));
        gifts.add(new Lacrica("Lacrica2", 1, 3, "dark"));
        gifts.add(new Lacrica("Lacrica3", 1, 3, "dark"));
        gifts.info();
    }
}
