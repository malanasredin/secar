import java.io.*;
import java.util.Scanner;

public class Cesar { // сам Цезарь


    public static String getS2() {
        return s2;
    }

    public static void setS2(String s2) {
        Cesar.s2 = s2;
    }

    private static String s2;






    private static Scanner s;

    static {
        try {
            s = new Scanner(new File("in.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static String s1 = s.nextLine();

    public static String getString() {
        return string;
    }

    private static String string = s1;



    public static int getKey(String next) {
        return key;
    }


    public static void setKey(int key) {
        Cesar.key = key;
    }

    private  static int key;
    //vsc tet

                char [] symbol =  new char[s1.length()];
                public void runCrypto () throws IOException {
               for (int i = 0; i < s1.length(); i++)
               {
                    if (Character.isLetter(s1.charAt(i)) && Character.isUpperCase(s1.charAt(i)))
                        symbol[i] = (char) (((int)s1.charAt(i)-'А'+key)%32+'А');
                    else if (Character.isLetter(s1.charAt(i)) && Character.isLowerCase(s1.charAt(i)))
                        symbol[i] = (char) (((int)s1.charAt(i)-'а'+key)%32+'а');
                    else
                        symbol[i]= s1.charAt(i);
               }


                 s2 = String.copyValueOf(symbol);


                BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));


                 writer.write(s2);
                writer.close();





            }



        }






