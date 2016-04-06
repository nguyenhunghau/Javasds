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
public class Semester {
    private int Id;
    private int CourseId;
    private int MonthBegin;
    private int MonthEnd;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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

    /**
     * @return the MonthBegin
     */
    public int getMonthBegin() {
        return MonthBegin;
    }

    /**
     * @param MonthBegin the MonthBegin to set
     */
    public void setMonthBegin(int MonthBegin) {
        this.MonthBegin = MonthBegin;
    }

    /**
     * @return the MonthEnd
     */
    public int getMonthEnd() {
        return MonthEnd;
    }

    /**
     * @param MonthEnd the MonthEnd to set
     */
    public void setMonthEnd(int MonthEnd) {
        this.MonthEnd = MonthEnd;
    }
}
