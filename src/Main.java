public class Main {

    public static void main(String[] args) {
        String text = "Привет медвед!";
        char[] textChar = text.toCharArray();

        for(int i = 0; i<=(textChar.length-1)/2; i++){
            textChar[i] ^=textChar[textChar.length-i-1];
            textChar[textChar.length-i-1]^= textChar[i];
            textChar[i] ^= textChar[textChar.length-i-1];

        }
        System.out.println(textChar);

    }
}
