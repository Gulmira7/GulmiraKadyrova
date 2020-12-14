public class Bookcase {

    public static void main(String[] args) {
        System.out.println(fregChar("Java", 'a'));

        System.out.println();

        System.out.println(duplicate("banana", "bananaa"));
    }

    // sequences of char
    public static int fregChar(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    //Duplicate
    public static String duplicate(String word, String word2) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word.charAt(i) == word2.charAt(j)) {
                    newWord += word.charAt(i) + " " + word2.charAt(j);
                }
            }
        }
            return newWord;
        }

}