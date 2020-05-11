package CodeWars;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if(walk.length > 10)
            return false;
        int hor = 0;
        int vert = 0;
        // Insert brilliant code here
        for(char c : walk){
            switch (c){
                case 'n':
                    vert++;
                    break;
                case 's':
                    vert--;
                    break;
                case 'e':
                    hor++;
                    break;
                case 'w':
                    hor--;
                    break;
            }
        }
        if(hor ==0 && vert ==0){
            return true;
        }else {
            return false;
        }
    }
}
