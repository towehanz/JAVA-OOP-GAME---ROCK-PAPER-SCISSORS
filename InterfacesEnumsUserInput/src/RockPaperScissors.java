public enum RockPaperScissors {

    ROCK {
        @Override
        public void result(RockPaperScissors rps) {
         
            System.out.println("ROCK");
           
           switch (rps){
               case ROCK:
                   System.out.println("Draw!");
                   break;
               case PAPER:
                   System.out.println("Opponent win!");
                   break;
               case SCISSORS:
                   System.out.println("You win!");
                    break;   
                   
           }
        }
    },

    PAPER  {
        @Override
        public void result(RockPaperScissors rps) {

            System.out.println("PAPER");
            switch (rps){
               case ROCK:
                   System.out.println("You win!");
                   break;
               case PAPER:
                   System.out.println("Draw!");
                   break;
               case SCISSORS:
                   System.out.println("Opponent win!");
                    break;   
                   
           }
        }
    },

    SCISSORS  {
        @Override
        public void result(RockPaperScissors rps) {

            System.out.println("SCISSORS");
            switch (rps){
               case ROCK:
                   System.out.println("Opponent Win!");
                   break;
               case PAPER:
                   System.out.println("You win!");
                   break;
               case SCISSORS:
                   System.out.println("Draw!");
                    break;   
                   
           }
        }
    };
    
   

    public abstract void result(RockPaperScissors rcp);

}