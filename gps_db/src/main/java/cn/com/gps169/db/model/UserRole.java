package cn.com.gps169.db.model;

import java.util.Date;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_user_role.user_role_id
     *
     * @mbggenerated
     */
    private Long userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_user_role.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_user_role.role_id
     *
     * @mbggenerated
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_user_role.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_user_role.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_user_role.user_role_id
     *
     * @return the value of gps_user_role.user_role_id
     *
     * @mbggenerated
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_user_role.user_role_id
     *
     * @param userRoleId the value for gps_user_role.user_role_id
     *
     * @mbggenerated
     */
    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_user_role.user_id
     *
     * @return the value of gps_user_role.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_user_role.user_id
     *
     * @param userId the value for gps_user_role.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_user_role.role_id
     *
     * @return the value of gps_user_role.role_id
     *
     * @mbggenerated
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_user_role.role_id
     *
     * @param roleId the value for gps_user_role.role_id
     *
     * @mbggenerated
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_user_role.created
     *
     * @return the value of gps_user_role.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_user_role.created
     *
     * @param created the value for gps_user_role.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_user_role.updated
     *
     * @return the value of gps_user_role.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_user_role.updated
     *
     * @param updated the value for gps_user_role.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_user_role
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserRole other = (UserRole) that;
        return (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_user_role
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }
}