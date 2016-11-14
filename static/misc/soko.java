
import java.util.Scanner;

public class soko {

    static int R, C, destR, destC;
    static int[][] arr;

    static void read()throws Exception {
        Scanner sin = new Scanner(System.in);
        R = sin.nextInt();
        C = sin.nextInt();
        arr = new int[R + 2][C + 2];
        for (int i = 0; i < R + 2; i++) {
            for (int j = 0; j < C + 2; j++) {
                arr[i][j] = -1;
            }
        }
        sin.nextLine();
        for (int i = 1; i <= R; i++) {
            String tmp = sin.nextLine();
            for (int j = 1; j <= C; j++) {                
                char ch = tmp.charAt(j-1);
                switch (ch) {
                    case '#':
                        arr[i][j] = -1;
                        break;
                    case 'B':
                        arr[i][j] = 1;
                        break;
                    case 'D':
                        destR = i;
                        destC = j;
                    default:
                        arr[i][j] = 0;
                }
            }
        }
    }

    
    public static void main(String[] args)throws Exception {
        read();
    }
}
