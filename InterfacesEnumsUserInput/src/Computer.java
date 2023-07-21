public class Computer implements CanPlay  {

    private RockPaperScissors constWeap;

    @Override
    public RockPaperScissors pickWeapon() {
     int max = 3;
     int min = 1;
     int random;
     random = min+(int)(Math.random()*((max-min))+1);
     if (random == 1){
         constWeap = RockPaperScissors.valueOf("ROCK");
        System.out.println("Computer Picked: " + constWeap);
        
     } if (random == 2){
         constWeap = RockPaperScissors.valueOf("PAPER");
        System.out.println("Computer Picked: " + constWeap);
        
     } if (random == 3){
         constWeap = RockPaperScissors.valueOf("SCISSORS");
        System.out.println("Computer Picked: " + constWeap);
        
     }
     
    return constWeap;
    }

    @Override
    public void systemMsg() {
        System.out.println("Computer's Turn to Choose: ");
    }



}