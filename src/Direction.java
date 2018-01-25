import java.util.Scanner;

public class Direction {
    public int x = 0, y=0;

    public void deplacer(char c){
        switch (c){
            case 'N' : y++;
            break;
            case 'O' : x--;
            break;
            case 'S' : y--;
            break;
            case 'E': x++;
            break;
        }
    }

}
