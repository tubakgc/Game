import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner input= new Scanner(System.in);
    private Inventory inventory;

    public Player(String name){
       this.name=name;
       this.inventory=new Inventory();
    }
    public void selectChar(){
        GameChar[] charlist ={new Samurai(), new Archer(), new Knight()};
        System.out.println("Karakterler: ");
        System.out.println("--------------------------------------------");
        for (GameChar gamechar : charlist){
            System.out.println("ID:"+gamechar.getId()
                             +"\tKarakter :  "+gamechar.getName()
                             +"\t Hasar : " +gamechar.getDamage()
                             +" \t Sağlık : "+gamechar.getHealth()
                              +" \t Para : " + gamechar.getMoney());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Lütfen bir karakter giriniz!");
        int selectChar= input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer( new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer( new Samurai());
        }
        System.out.println("Karakter:" + this.getCharName()
                          +"\t Hasar:" + this.getDamage()
                         +"\t Sağlık:" + this.getHealth()
                         +"\t Para:" +this.getMoney());
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Silahlarınız : " + this.getInventory().getWeapon().getName()+
                " , zırh :" +this.getInventory().getArmor().getName()+
                " , Bloklama :" +this.getInventory().getArmor().getBlock()+
                " , Hasarınız : " +this.getTotalDamage() +
                " , Sağlık :" +this.getHealth() +
                " , Para : " +this.getMoney());
    }
    public int getTotalDamage(){
        return getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage ;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }
}
