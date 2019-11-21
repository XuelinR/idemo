/**
 * <p>Title:TableFiledReflet.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 * @version 
 */
package reflect;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import annotation.ConnTable;
import utils.JdbcUtil;

/**
 * <p>Title:TableFiledReflet</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 *
 */
public class TableFiledReflet {
    public static void main(String[] args) throws ScriptException {
        /*try {
            Class<?> clazz = Class.forName("reflect.SysUser");
            Field[] f = clazz.getDeclaredFields();
            for (int i = 0; i < f.length; i++) {
                System.out.println(f[i].getName());
                System.out.println(f[i].getType());
                System.out.println(f[i]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */
        //动态编译
        /*JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int out = compiler.run(null, null, null, "D:\\HelloWorld.java");
        if (out>=0) {
            System.out.println("编译成功！");
        }*/
        //脚本引擎执行JavaScript代码
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByName("javascript");
        Double re = (Double)engine.eval("var date = new Date();" +"date.getHours();");
        System.out.println(re);
    }
    /**
     * <p>Title:getConn</p>  
     * <p>Description:</p>
     * @return
     */
    private Connection getConn() {
        JdbcUtil jUtil = new JdbcUtil("sqlite");
        jUtil.setUrl("/resources/demo_db.sqlite3");
        jUtil.setUser("demo");
        jUtil.setPassword("demo");
        return jUtil.getConnection();
    }
    /**
     * <p>Title:createTable</p>
     * <p>Description:创建表</p>
     */
    private void createTable() {
        try {
            Class<?> clazz = Class.forName("reflect.SysUser"); 
            Field[] f = clazz.getDeclaredFields();
            ConnTable ct = clazz.getAnnotation(ConnTable.class);
            Connection con = getConn();
            Statement state = con.createStatement();
            StringBuffer sb = new StringBuffer();
            sb.append("create ");
            sb.append(ct.value());
            sb.append("(");
            for (int i = 0; i < f.length; i++) {
                sb.append(f[i].getName());
                sb.append(f[i].getType());
            }
            sb.append(")");
            state.execute(sb.toString());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
}
