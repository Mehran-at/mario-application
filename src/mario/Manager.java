package mario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

public class Manager {

    boolean valid = false;

    public String printStar() {

        // Prompting the user until the condition is met
        while (!valid) {

            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();

            if (count != 0 && count > 0 && count < 23) {
                String output = "#";
                String space = " ";

                try {
                    // Create file
                    FileWriter fileWriter = new FileWriter("out.txt");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    for (int i = 0; i < count-1; i++) {
                        output += "#";

                        // Adding space behind the #
                        int minus = count - i - 2;
                        String repeat = space.repeat(minus);

                        System.out.println(repeat + output + "\n");
                        // Writing every line to the file.
                        bufferedWriter.write(repeat + output + "\n");

                    }
                    // Close the output
                    bufferedWriter.close();
                }
                    catch (Exception e) {//Catch exception if any
                        System.err.println("Error"  + e.getMessage());
                    }

                valid = true;
            }

            else {
                System.out.println("PLease enter a positive number bigger that zero and smaller tha 23.");
                }
        }
        return "Complete";
    }
}
