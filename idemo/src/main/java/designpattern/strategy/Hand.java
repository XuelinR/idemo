/**
 * <p>Title:Hand.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.strategy;

/**
 * <p>Title:Hand</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0;//表示石头的值
    public static final int HANDVALUE_CHO = 1;//表示剪刀的值
    public static final int HANDVALUE_PAA = 2;//表示布的值
    public static final Hand[] hand = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {
            "石头","剪刀","布",
    };
    private int handvalue;//猜拳中出的手势的值
    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue) {
        return hand[handvalue];
    }
    public boolean isStrongerThen(Hand hand) {
        return fight(hand) == 1;
    }
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }
    public int fight(Hand hand) {
        if(this==hand) {
            return 0;
        }else if((this.handvalue+1)%3==hand.handvalue) {
            return 1;
        }else {
            return -1;
        }
    }
    public String toString() {
        return name[handvalue];
    }
}
