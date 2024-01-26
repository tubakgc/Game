
public class SafeHouse extends Normalloc{
    public SafeHouse(Player player) {
        super(player, "GÜVENLİ EV");
    }
    @Override
   public boolean onLocation() {
        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız yenilendi !");
        this.getPlayer().setHealth(getPlayer().getOrjinalHealth());
        return true;
    }
}
