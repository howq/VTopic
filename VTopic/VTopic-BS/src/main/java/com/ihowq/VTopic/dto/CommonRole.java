package com.ihowq.VTopic.dto;

/**
 * The type Common role.
 *
 * @author howq
 * @create 2017 -04-30 下午12:18
 */
public class CommonRole {

    private Byte roleid;

    private String roleauthoriy;

    private String rolename;

    private String rolecoment;

    /**
     * Gets roleid.
     *
     * @return the roleid
     */
    public Byte getRoleid() {
        return roleid;
    }

    /**
     * Sets roleid.
     *
     * @param roleid the roleid
     */
    public void setRoleid(Byte roleid) {
        this.roleid = roleid;
    }

    /**
     * Gets roleauthoriy.
     *
     * @return the roleauthoriy
     */
    public String getRoleauthoriy() {
        return roleauthoriy;
    }

    /**
     * Sets roleauthoriy.
     *
     * @param roleauthoriy the roleauthoriy
     */
    public void setRoleauthoriy(String roleauthoriy) {
        this.roleauthoriy = roleauthoriy;
    }

    /**
     * Gets rolename.
     *
     * @return the rolename
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * Sets rolename.
     *
     * @param rolename the rolename
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * Gets rolecoment.
     *
     * @return the rolecoment
     */
    public String getRolecoment() {
        return rolecoment;
    }

    /**
     * Sets rolecoment.
     *
     * @param rolecoment the rolecoment
     */
    public void setRolecoment(String rolecoment) {
        this.rolecoment = rolecoment;
    }
}