
package pokemon;


import java.util.*;

public class Pokemon {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Name your pokemon: ");
         String name = scan.nextLine();
         System.out.println("Select Pokemon Type:");
         System.out.println("\n 1. fire\n 2. water\n 3.rock");
         System.out.print("Select a number to choose: ");
         int choice = scan.nextInt();
         
         
         switch(choice){
            
             case 1:
            Fire f = new Fire(name);   
                f.getHealth();                
                f.getAttack();
            do{
        System.out.println("Please select");
        System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stats \n 4. Skill Test\n 5. Exit Game\n");
        choice = scan.nextInt();  
            switch(choice){
                case 1:
                    f.train();             
                    System.out.println("Health:"+f.getHealth());
                    System.out.println("Attack:"+f.getAttack());
                     break;
                    
                case 2:
                    f.rest();
                    break;
            
                case 3:
                    f.displayStats();
                    break;
            
                case 4: 
                    System.out.println("Choose a skill to test");
                    System.out.print("1.Heat Blast \n2.Raging Fury \n3.Ember \n4.normalAttack \n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        f.HeatBlast();
                        break;
                    
                    case 2:
                        f.RagingFury();
                        break;
                        
                    case 3:
                        f.ember();
                        break;
                        
                    case 4:
                        f.normalAttack();
                        break;    
                }
            }
            }
                    while(choice != 5);
                    System.out.println("Thank you for playing!");
                    break;
             
             
             
                case 2:

                    Water w = new Water(name);
                    w.getHealth();
                    w.getAttack();
            do{
                 System.out.println("Please select ");   
                 System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stat \n 4. Skill Test\n 5. Exit Game\n");
                choice = scan.nextInt(); 
            switch(choice){
                case 1:
                w.train();             
                    System.out.println("Health:"+w.getHealth());
                    System.out.println("Attack:"+w.getAttack());
                    break;
            
                case 2:
                w.rest();
                break;
            
                case 3:
                w.displayStats();
                break;
            
                case 4: 
                    System.out.println("Choose a skill to test");
                    System.out.print("1.Hydro Cannon  \n2.Muddy Water \n3.Hydro Pump \n4.normalAttack\n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        w.HydroCannon();
                        break;
                    
                    case 2:
                        w.MuddyWater();
                        break;
                        
                    case 3:
                        w.HydroPump();
                        break;
                        
                    case 4:
                        w.normalAttack();
                        break;    
                }
                
            }

        }       while(choice != 5);
                System.out.println("Thank you for playing!");
                break;
            
            case 3:
             Rock r = new Rock(name);
                r.getHealth();
                r.getAttack();
            do{
                System.out.println("Please select ");   
                System.out.print("\n 1. Train \n 2. Rest \n 3. Display Stat \n 4. Skill Test\n 5. Exit Game\n");
                choice = scan.nextInt(); 
            switch(choice){
                case 1:
                r.train();             
                    System.out.println("Health:"+r.getHealth());
                    System.out.println("Attack:"+r.getAttack());
                    break;
            
                case 2:
                    r.rest();
                    break;
            
                case 3:
                    r.displayStats();
                    break;
            
                case 4: 
                System.out.println("Choose a skill to test");
                    System.out.print("1.Head Smash \n2.Tar Shot \n3.Salt Cure \n4.normalAttack\n");
                    int Skill = scan.nextInt();
                    
                    switch(Skill){
                    
                    case 1:
                        r.HeadSmash();
                        break;
                    
                    case 2:
                        r.TarShot();
                        break;
                        
                    case 3:
                        r.SaltCure();
                        break;
                        
                    case 4:
                        r.normalAttack();
                        break;
            }
        }       
                }while(choice != 5);
                System.out.println("Thank you for playing!");
                break;
        }
    }
}
    
    


