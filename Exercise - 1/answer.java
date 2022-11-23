import java.util.*;

public class App {
    public static void main(String[] args) {
    
        while (true) {

            System.out.println("1.Count number of characters");
            System.out.println("2.Find common characters between two words");
            System.out.println("3.Convert sentence to ArrayList");
            System.out.println("4.Exit");
            System.out.print("Please select the action you want to do : ");
            int number;
            Scanner keyboard = new Scanner(System.in);
            number = keyboard.nextInt();
            switch (number) {
                case 1:
                    System.out.print("Please enter a sentence : ");
                    String sentence;
                    keyboard.nextLine();
                    sentence = keyboard.nextLine();
                    System.out.println("Number of characters : " + sentence.length());
                    break;
                case 2:
                    System.out.print("Please enter two words : ");
                    String word1, word2;
                    word1 = keyboard.next();
                    word2 = keyboard.next();
                    char[] word1Arr = word1.toCharArray();
                    char[] word2Arr = word2.toCharArray();
                    char[] sameChArr = new char[100];
                    int indexSameChArr = 0;

                    for (int i = 0; i < word1.length(); i++) {

                        for (int j = 0; j < word2.length(); j++) {

                            if (word1Arr[i] == word2Arr[j]) {

                                sameChArr[indexSameChArr] = word1Arr[i];
                                indexSameChArr++;

                            }

                        }

                    }

                    System.out.print("Common characters : ");

                    for (int i = 0; i < sameChArr.length; i++) {
                        Boolean isWrittenBefore = false;
                        if (i > 0) {

                            for (int j = 0; j < i; j++) {
                                if (sameChArr[i] == sameChArr[j])
                                    isWrittenBefore = true;
                            }

                        }

                        if (!isWrittenBefore)
                            System.out.print(sameChArr[i]);

                    }

                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Please enter a sentence : ");
                    String sentence2;
                    keyboard.nextLine();
                    sentence2 = keyboard.nextLine();
                    ArrayList<String> list = new ArrayList<String>();
                    StringTokenizer sentTok = new StringTokenizer(sentence2, " ");
                    while (sentTok.hasMoreTokens()) {
                        list.add(sentTok.nextToken());
                    }

                    for (int i = 0; i < list.size(); i++) {
                        
                        System.out.println(list.get(i));
                        
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }


    }
}
