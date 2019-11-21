/**
 * <p>Title:ChainOfResponsibility.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.chainofresponsibility.LimitSupport;
import designpattern.chainofresponsibility.NoSupport;
import designpattern.chainofresponsibility.OddSupport;
import designpattern.chainofresponsibility.SpecialSupport;
import designpattern.chainofresponsibility.Support;
import designpattern.chainofresponsibility.Trouble;


/**
 * <p>Title:ChainOfResponsibility</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月7日
 *
 */
public class ChainOfResponsibilityTest {
    @Test
    public void chainOfResponsibilityTest() {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("bob", 100);
        Support charlie = new SpecialSupport("charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for(int i=0;i<500;i++) {
            alice.support(new Trouble(i));
        }
    }
}
