import java.util.Scanner;

public class MainTroll {
    public static void main(String[] args) {
        int hp, trollhp, atk, trollatk, def, trolldef, choice;
        boolean check = true;
        String[] races = {"Grappler", "Mage", "Assassin", "Swordsman", "Archer"};
        Troll troll = null;
        Player p1 = null;

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome in War RPG. Choose your class before starting (The gameplay will not be affected at the moment): ");
        System.out.println("1)" + races[0] + "\n2)" + races[1] + "\n3)" + races[2] + "\n4)" + races[3] +"\n5)" + races[4]);

        do {
            choice = input.nextInt();
        }while(choice>0 && choice<6);

        do{
            try {
                System.out.print("\nInserisci i tuoi punti salute: ");
                hp = input.nextInt();
                System.out.print("\nInserisci i tuoi punti attacco: ");
                atk = input.nextInt();
                System.out.print("\nInserisci i tuoi punti difesa: ");
                def = input.nextInt();
                System.out.print("\nInserisci i punti salute del nemico: ");
                trollhp = input.nextInt();
                System.out.print("\nInserisci i punti attacco del nemico: ");
                trollatk = input.nextInt();
                System.out.print("\nInserisci i punti difesa del nemico: ");
                trolldef = input.nextInt();
            }catch(Exception e){
                System.out.println(e.getMessage());
                check = false;
            }
        }while(!check);



    }
}