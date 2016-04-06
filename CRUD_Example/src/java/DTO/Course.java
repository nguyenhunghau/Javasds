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
public class Course {
    private int Id;
    private String YearBegin;
    private String YearEnd;

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
     * @return the YearBegin
     */
    public String getYearBegin() {
        return YearBegin;
    }

    /**
     * @param YearBegin the YearBegin to set
     */
    public void setYearBegin(String YearBegin) {
        this.YearBegin = YearBegin;
    }

    /**
     * @return the YearEnd
     */
    public String getYearEnd() {
        return YearEnd;
    }

    /**
     * @param YearEnd the YearEnd to set
     */
    public void setYearEnd(String YearEnd) {
        this.YearEnd = YearEnd;
    }
}
