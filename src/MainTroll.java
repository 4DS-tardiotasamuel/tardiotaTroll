import java.util.Scanner;

public class MainTroll {
    public static void main(String[] args) {
        int hp, atk, choice;
        String[] races = {"Grappler", "Mage", "Assassin", "Swordsman", "Archer"};

        Scanner input = new Scanner(System.in);

        System.out.print("Welcome in War RPG. Choose your class before starting (The gameplay will not be affected at the moment): ");
        System.out.println("1)" + races[0] + "\n2)" + races[1] + "\n3)" + races[2] + "\n4)" + races[3] +"\n5)" + races[4]);

        do {
            choice = input.nextInt();
        }while(choice>0 && choice<6);

    }
}