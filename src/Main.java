import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String srcFilePath = "C:\\Users\\velu\\OneDrive\\Desktop\\Velu";
        String destinationFilePath = "C:\\Users\\velu\\OneDrive\\Desktop\\Velu ";

        System.out.println("Enter the word to be replaced ");
        String wordToReplace = s.nextLine();

        System.out.println("Enter the replace word");
        String replacementWord = s.nextLine();

        FileUtil.ReplacementWithFileCopy(srcFilePath,destinationFilePath,wordToReplace,replacementWord);
    }
}