/**
 * <p>Title:SysUser.java</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 * @version 
 */
package reflect;

import annotation.ConnFiled;
import annotation.ConnTable;

/**
 * <p>Title:SysUser</p>
 * <p>Description:</p>
 * @author XuelinR
 * @date 2019年5月31日
 *
 */
@ConnTable("t_sys_user")
public class SysUser {
    @ConnFiled(column="id",type="varchar",length=16)
    private String id;
    @ConnFiled(column="name",type="varchar",length=16)
    private String name;
    @ConnFiled(column="sex",type="varchar",length=2)
    private String sex;
    @ConnFiled(column="age",type="int",length=3)
    private Integer age;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }
    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }
    
}
