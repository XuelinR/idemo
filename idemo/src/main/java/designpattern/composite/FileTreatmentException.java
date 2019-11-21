/**
 * <p>Title:FileTreatmentException.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 * @version 
 */
package designpattern.composite;

/**
 * <p>Title:FileTreatmentException</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月5日
 *
 */
public class FileTreatmentException extends RuntimeException {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
    public FileTreatmentException() {}
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
