public class GameTest {

    public static void main (String[] args) {

        Computer com1 = new Computer();
        User us1 = new User();

           
            us1.systemMsg();
            us1.pickWeapon().result(com1.pickWeapon());
          
    }
}