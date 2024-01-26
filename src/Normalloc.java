public abstract class Normalloc extends Location{
    public Normalloc(Player player, String name) {
        super(player, name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
