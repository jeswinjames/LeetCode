package CodeWars.crypto;

public class CaesarCipher {

    public static void printAlldecode(String input){
        String upper = input.toUpperCase();
        for(int i = 1; i <= 26; i++){
            StringBuilder builder = new StringBuilder();
            for(char val : input.toCharArray()){
                if(val != ' ') {
                    val = (char) (val + i);
                    if (val > 'Z') {
                        val = (char) (val - 26);
                    }
                }
                builder.append(val);
            }
            System.out.println(builder.toString());
        }
    }
}
