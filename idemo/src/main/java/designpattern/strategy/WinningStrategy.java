/**
 * <p>Title:WinningStrategy.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 * @version 
 */
package designpattern.strategy;

import java.util.Random;


/**
 * <p>Title:WinningStrategy</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月4日
 *
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;
    
    public WinningStrategy(int seed) {
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
        if(!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    /* (non-Javadoc)
     * <p>Title:study</p>
     * <p>Description:</p>
     * @see com.rxl.design_pattern.strategy.Strategy#study(boolean)
     */
    @Override
    public void study(boolean win) {
        // TODO Auto-generated method stub
        won = win;
    }

}