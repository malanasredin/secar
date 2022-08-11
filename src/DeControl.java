import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class DeControl { // дешифратор





    public static void main(String[] args) throws IOException {






        Scanner s;

            try {
                 s = new Scanner(new File("out.txt"));
            }
            catch (IOException e) {
                throw new IOException(e);
            }

        System.out.println("Ведите код шифра");

         String s1 = s.nextLine();
        System.out.println(s1);


         String string = s1;

         Scanner scanner = new Scanner(System.in);

         int key = scanner.nextInt();


        char[] symbol = new char[s1.length()];

            for (int i = 0; i < s1.length(); i++) {
                if (Character.isLetter(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i)))
                    symbol[i] = (char) (((int) s1.charAt(i) - 'А' - key) % 32 + 'А');
                else if (Character.isLetter(s1.charAt(i)) && Character.isLowerCase(s1.charAt(i)))
                    symbol[i] = (char) (((int) s1.charAt(i) - 'а' - key) % 32 + 'а');
                else
                    symbol[i] = s1.charAt(i);
            }

            String s2;
            s2 = String.copyValueOf(symbol);


            BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt"));


            writer.write(s2);
        System.out.println(s2);
            writer.close();


        }

    }















