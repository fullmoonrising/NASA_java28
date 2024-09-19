package core;

public class AnusAdapter implements Anus {
    private final Hairbrush hairbrush;

    public AnusAdapter(Hairbrush hairbrush) {
        this.hairbrush = hairbrush;
    }

    @Override
    public void poop() {
        System.out.println("Dog says woof!");
    }

    @Override
    public void insert() {
        this.hairbrush.tickle();
    }

}
