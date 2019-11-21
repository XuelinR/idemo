/**
 * <p>Title:TextBuilder.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2018年9月3日
 * @version 
 */
package designpattern.builder;

/**
 * <p>Title:TextBuilder</p>
 * <p>Description:使用纯文本编写文档</p>
 * @author XuelinR
 * @date 2018年9月3日
 *
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    /* (non-Javadoc)
     * <p>Title:makeTitle</p>
     * <p>Description:纯文本的标题</p>
     * @see com.rxl.design_pattern.builder.Builder#makeTitle(java.lang.String)
     */
    @Override
    public void makeTitle(String title) {
        // TODO Auto-generated method stub
        buffer.append("=====================================\n");
        buffer.append("[[" + title +"]]\n");
        buffer.append("\n");
    }

    /* (non-Javadoc)
     * <p>Title:makeString</p>
     * <p>Description:纯文本的字符串</p>
     * @see com.rxl.design_pattern.builder.Builder#makeString(java.lang.String)
     */
    @Override
    public void makeString(String str) {
        // TODO Auto-generated method stub
        buffer.append("**" + str + "\n");
        buffer.append("\n");
    }

    /* (non-Javadoc)
     * <p>Title:makeTitem</p>
     * <p>Description:纯文本的条目</p>
     * @see com.rxl.design_pattern.builder.Builder#makeTitem(java.lang.String[])
     */
    @Override
    public void makeTitem(String[] items) {
        // TODO Auto-generated method stub
        for (int i = 0; i < items.length; i++) {
            buffer.append("   ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    /* (non-Javadoc)
     * <p>Title:close</p>
     * <p>Description:完成文档</p>
     * @see com.rxl.design_pattern.builder.Builder#close()
     */
    @Override
    public void close() {
        // TODO Auto-generated method stub
        buffer.append("====================================\n");
    }
    public String getResult() {
        return buffer.toString();
    }
}
