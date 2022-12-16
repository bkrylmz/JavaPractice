package tasks;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player = scan.nextInt();
        int house = scan.nextInt();
        String result = "";
        if(player > 21){
            result = "player bust";
        } else if (player == house) {
            result = "its a tie";
        } else if (player == 21 ) {
            result = "player win";
        } else if (player < house) {
            result = "player lose";
        } else {
            result = "player win";
        }
        System.out.println(result);
        /*
        - if the `player` score is bigger than `21`, the result is `player bust`
> - if the `player` score is equal to the `house` score, the result is `its a tie`
> - if the `player` score is equal to `21`, the result is `player win`
> - if the `house` score is bigger than the `player` score, the result is `player lose`
> - if the `player` score is bigger than the `house` score, the result is `player win`
         */
        
        
        
        
        
        
    }
}
