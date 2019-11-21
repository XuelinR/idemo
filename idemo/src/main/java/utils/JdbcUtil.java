/**
 * <p>Title:JdbcUtil.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年6月3日
 * @version 
 */
package utils;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Callable;

/**
 * <p>Title:JdbcUtil</p>
 * <p>Description:连接各种数据库</p>
 * @author XuelinR
 * @date 2019年6月3日
 *
 */
public class JdbcUtil {
    private String dbType;
    private String url;
    private String user;
    private String password;
    
    /**
     * @param dbType
     */
    public JdbcUtil(String dbType) {
        super();
        this.dbType = dbType;
    }
    
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>Title:getConnection</p>
     * <p>Description:</p>
     */
    public Connection getConnection() {
        String className = "";
        String sUrl = "";
        switch (dbType) {
            case "sqlite":
                className = "org.sqlite.JDBC";
                sUrl = "jdbc:sqlite:"+url;
                break;
            case "mysql":
                className = "com.mysql.jdbc.Driver";
                sUrl = "jdbc:mysql://"+url;
                break;
            case "sqlserver":
                className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                sUrl = "jdbc:sqlserver://"+url;
                break;
            case "oracle":
                className = "oracle.jdbc.driver.OracleDriver";
                sUrl = "jdbc:oracle:thin:@"+url;
                break;
            default:
                break;
        }
        Connection connection = null;
        try {
            if(className!="") {
                Class.forName(className);
                if(url==null) {
                    System.out.println("请设置数据库URL！");
                    return null;
                }
                if(user==null) {
                    System.out.println("请设置数据库用户！");
                    return null;
                }
                if(password==null) {
                    System.out.println("请设置数据库密码！");
                    return null;
                }
                connection = DriverManager.getConnection(sUrl, user, password);  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    /**
     * <p>Title:releaseResource</p>
     * <p>Description:</p>
     */
    public void releaseResource(ResultSet resultSet, Statement statement, Connection connection) {
        try {  
            if (resultSet != null)  
                resultSet.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        } finally {  
            resultSet = null;  
            try {  
                if (statement != null)  
                    statement.close();  
            } catch (SQLException e) {  
                e.printStackTrace();  
            } finally {  
                statement = null;  
                try {  
                    if (connection != null)  
                        connection.close();  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                } finally {  
                    connection = null;  
                }  
            }  
        }  
  
    }
    /**
     * <p>Title:closeAll</p>
     * <p>Description:链接关闭</p>
     */
    @SuppressWarnings("unused")
    private void closeAll(Closeable... io) {
        try {
            for (Closeable closeable : io) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
