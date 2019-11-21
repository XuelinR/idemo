/**
 * <p>Title:StrategyTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern;

import java.util.Arrays;

import designpattern.strategy.Hand;
import designpattern.strategy.Player;
import designpattern.strategy.ProbStrategy;
import designpattern.strategy.WinningStrategy;


/**
 * <p>Title:StrategyTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class StrategyTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        System.out.println("size="+args.length);
        if(args.length != 2) {
            System.out.println("Usage:java Main randomseed1 randomseed2");
            System.out.println("Example:java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2)); 
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if(nextHand1.isStrongerThen(nextHand2)) {
                System.out.println("Winner:"+player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThen(nextHand1)) {
                System.out.println("Winner:"+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
