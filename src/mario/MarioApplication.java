package mario;

import java.io.IOException;

public class MarioApplication {
    public static void main(String[] args) throws IOException {
        Manager manager =new Manager();
        String printingHashes = manager.printStar();
        System.out.println(printingHashes);


    }
}
