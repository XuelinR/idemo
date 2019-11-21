/**
 * <p>Title:FacadeTest.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 * @version 
 */
package designpattern;

import org.junit.Test;

import designpattern.facade.pagemaker.PageMaker;


/**
 * <p>Title:FacadeTest</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月12日
 *
 */
public class FacadeTest {
    @Test
    public void facadeTest() {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
