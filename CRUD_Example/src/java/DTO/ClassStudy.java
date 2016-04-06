package DTO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
public class ClassStudy {
    private String Id;
    private String Name;
    private int CourseId;

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the CourseId
     */
    public int getCourseId() {
        return CourseId;
    }

    /**
     * @param CourseId the CourseId to set
     */
    public void setCourseId(int CourseId) {
        this.CourseId = CourseId;
    }
}
