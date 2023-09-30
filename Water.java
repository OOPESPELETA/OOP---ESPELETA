package pokemon;
import java.util.Random;
public class Water {
    
    private String name;
    private int health;
    private int attack;
    private Random random = new Random();
    
    public Water(String name) {
        this.name = name;
        this.health = 100;
        this.attack = 20;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void HydroCannon() {
        int damage = random.nextInt(10) + 15; 
        System.out.println(name + " used Hydro Cannon " + damage  );
        
    }

    public void MuddyWater() {
        int weaken = random.nextInt(4) + 1; 
        System.out.println(name + " used Muddy Water minus " + weaken + "defense to the enemy");
        
    }

    public void HydroPump() {
    int healed = random.nextInt(10) + 10;
        System.out.println(name + " Healed " + healed + "!");
        
    }

    public void normalAttack() {
        int damage = random.nextInt(8) + 18;
        System.out.println(name + " used Normal Attack " + damage + "damage"); 
    }
       public void rest(){
        health += 3;

        
    System.out.println("Your pokemon gained health!");
        
   
    }
    public void train(){
        attack += 3;
        health-= 5;
    System.out.println("Your pokemon gained attack power but loose 1 health");
    }
    public void displayStats() {
        System.out.println("Pokemon: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
    }}
