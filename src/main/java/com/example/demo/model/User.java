package com.example.demo.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_info_t
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class User {
    /** 主键*/
    private Integer id;

    /** 用户名*/
    private String userName;

    /** 密码*/
    private String password;

    /** 年龄*/
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info_t.id
     *
     * @return the value of user_info_t.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info_t.id
     *
     * @param id the value for user_info_t.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info_t.user_name
     *
     * @return the value of user_info_t.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info_t.user_name
     *
     * @param userName the value for user_info_t.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info_t.password
     *
     * @return the value of user_info_t.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info_t.password
     *
     * @param password the value for user_info_t.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info_t.age
     *
     * @return the value of user_info_t.age
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info_t.age
     *
     * @param age the value for user_info_t.age
     *
     * @mbg.generated
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}