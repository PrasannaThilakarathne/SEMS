/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sems;

/**
 *
 * @author Acer
 */
public class Subject {
    private int subId;
    private String subCode;
    private String subName;
    private String description;

    /**
     * @return the subCode
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * @param subCode the subCode to set
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /**
     * @return the subName
     */
    public String getSubName() {
        return subName;
    }

    /**
     * @param subName the subName to set
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the subId
     */
    public int getSubId() {
        return subId;
    }

    /**
     * @param subId the subId to set
     */
    public void setSubId(int subId) {
        this.subId = subId;
    }
    
    
}
