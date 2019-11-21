/**
 * <p>Title:ProbStrategy.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.strategy;

import java.util.Random;

/**
 * <p>Title:ProbStrategy</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1,1,1,},{1,1,1,},{1,1,1,},
    };
    public ProbStrategy(int seed) {
        // TODO Auto-generated constructor stub
        random = new Random(seed);
    }
    /* (non-Javadoc)
     * <p>Title:nextHand</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.strategy.Strategy#nextHand()
     */
    @Override
    public Hand nextHand() {
        // TODO Auto-generated method stub
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if(bet<history[currentHandValue][0]) {
            handvalue = 0;
        }else if (bet<history[currentHandValue][0]+history[currentHandValue][1]) {
            handvalue = 1;
        }else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }
    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
    /* (non-Javadoc)
     * <p>Title:study</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.strategy.Strategy#study(boolean)
     */
    @Override
    public void study(boolean win) {
        // TODO Auto-generated method stub
        if(win) {
            history[prevHandValue][currentHandValue]++;
        }else {
            history[prevHandValue][(currentHandValue+1)%3]++;
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }
    
}
