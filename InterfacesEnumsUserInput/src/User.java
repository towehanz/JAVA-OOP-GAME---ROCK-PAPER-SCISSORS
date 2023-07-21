import java.util.Scanner;

public class User implements CanPlay{

    private Scanner weapScan = new Scanner(System.in);
    private RockPaperScissors constWeap;

    @Override
    public RockPaperScissors pickWeapon() {
       try {
        String input = weapScan.nextLine();
        String upperCase = input.toUpperCase();
        constWeap = RockPaperScissors.valueOf(upperCase);
           
       }catch (Exception error){
             System.out.print("Enter Your Choice: ");
               pickWeapon();
       }
       return constWeap;
         
         
    }
   
    @Override
    public void systemMsg() {
        System.out.println("Your Turn to Choose: ROCK, PAPER, SCISSORS");

    }
}