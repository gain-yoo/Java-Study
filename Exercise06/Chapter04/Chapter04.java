package Exercise06.Chapter04;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class Chapter04 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./Exercise06/Chapter04/sample.txt", true);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        fw.write(String.format("%s\n", input));
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("./Exercise06/Chapter04/sample.txt"));
        while(true){
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line); 
        }
        br.close();
    }
}
