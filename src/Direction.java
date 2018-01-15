import java.util.Scanner;

public class Direction {
    int x = 0, y=0;

    public void deplacer(char c){
        switch (c){
            case 'N' : y++;
            case 'O' : x--;
            case 'S' : x++;
        }
    }

}
