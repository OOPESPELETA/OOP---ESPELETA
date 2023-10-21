package deposit;

public class DEPOSIT {
private String details;
private int dep;
private int withdrawal;

    public DEPOSIT(String details){
        this.details = details;
       
    }
    
    public DEPOSIT(int dep){
        this.dep = dep;
    }
//    public DEPOSIT(double withdrawal){
//        this.withdrawal = withdrawal;
//    }
    public DEPOSIT (String details, int dep, int withdrawal){
        this.details = details;
        this.dep = dep;
        this.withdrawal = withdrawal;
    }
    public static void main (String[] args){
        DEPOSIT det = new DEPOSIT (" ");
        DEPOSIT newDet = new DEPOSIT ("Troy Espeleta");
        DEPOSIT bal = new DEPOSIT ("1000");
        
        DEPOSIT depo = new DEPOSIT (500);
        DEPOSIT newbal = new DEPOSIT ("1500");
        
        DEPOSIT with = new DEPOSIT ("1000");
        DEPOSIT newbal2 = new DEPOSIT ("500");
        
        System.out.println ("Your Details is: " + det);
        System.out.println("NAME: " + newDet.details);
        System.out.println ("Your Balance is: " + bal.details);
        System.out.println ("____________________________________________________");
        System.out.println ("You Deposit: " + depo.dep);
        System.out.println ("____________________________________________________");
        System.out.println ("Your details is: " + det);
        System.out.println("NAME: " + newDet.details);
        System.out.println ("Yur balance is: " + newbal.details); 
        System.out.println ("____________________________________________________");
        System.out.println ("Your Withdraw: " + with.details);
        System.out.println ("____________________________________________________");
        System.out.println ("Your details is: " + det);
        System.out.println("NAME: " + newDet.details);
        System.out.println ("Yur balance is: " + newbal2.details); 
    }
    
}
