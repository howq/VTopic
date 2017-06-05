package com.ihowq.VTopic.util.common;

/**
 * VTopic 常量
 *
 * @author howq
 * @create 2017/3/10 14:17
 **/

public class VTopicConst{

    /** Cookie的名字  */
    public static final String COOKIE_NAME="VTopic";

    /**Token**/
    public static final String TOKEN = "token_";

    /** 角色类型（管理员）ID */
    public static final byte ROLE_MANAGER_CODE = 0;
    /** 角色类型（教师）ID */
    public static final byte ROLE_TEACHER_CODE = 1;
    /** 角色类型（学生）ID */
    public static final byte ROLE_STUDENT_CODE = 2;

    /** 删除标识 未删除 */
    public static final String DELETE_FLAG_NO = "0";
    /** 删除标识 删除 */
    public static final String DELETE_FLAG_YES = "1";

    /** 选题成功 */
    public static final String SELECT_STATUS_0 = "0";
    /** 学生选题待老师同意 */
    public static final String SELECT_STATUS_1 = "1";
    /** 老师指定题目待学生同意 */
    public static final String SELECT_STATUS_2 = "2";
    /** 管理员指定题目待学生同意 */
    public static final String SELECT_STATUS_3 = "3";
    /** 学生拒绝 */
    public static final String SELECT_STATUS_4 = "4";
    /** 老师拒绝 */
    public static final String SELECT_STATUS_5 = "5";

    /** 未开题 */
    public static final String OPEN_STATUS_0 = "0";
    /** 开题 */
    public static final String OPEN_STATUS_1 = "1";

}
