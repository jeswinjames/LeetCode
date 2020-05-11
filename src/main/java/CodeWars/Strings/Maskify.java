package CodeWars.Strings;

public class Maskify {
    public static String maskify(String str) {
        char[] array = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for(; i < array.length - 4; i++){
            builder.append("#");
        }
        for(; i < array.length; i++){
            builder.append(array[i]);
        }
        return builder.toString();
    }
}
