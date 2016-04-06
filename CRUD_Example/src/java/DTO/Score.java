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
public class Score {
    private int StudentId;
    private int SemesterId;
    private int SubjectId;
    private float Scrore_1;     //Score with coefficient 1
    private float Scrore_2;     //Score with coefficient 2
    private float Scrore_3;     //Score with coefficient 3

    /**
     * @return the StudentId
     */
    public int getStudentId() {
        return StudentId;
    }

    /**
     * @param StudentId the StudentId to set
     */
    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    /**
     * @return the SemesterId
     */
    public int getSemesterId() {
        return SemesterId;
    }

    /**
     * @param SemesterId the SemesterId to set
     */
    public void setSemesterId(int SemesterId) {
        this.SemesterId = SemesterId;
    }

    /**
     * @return the SubjectId
     */
    public int getSubjectId() {
        return SubjectId;
    }

    /**
     * @param SubjectId the SubjectId to set
     */
    public void setSubjectId(int SubjectId) {
        this.SubjectId = SubjectId;
    }

    /**
     * @return the Scrore_1
     */
    public float getScrore_1() {
        return Scrore_1;
    }

    /**
     * @param Scrore_1 the Scrore_1 to set
     */
    public void setScrore_1(float Scrore_1) {
        this.Scrore_1 = Scrore_1;
    }

    /**
     * @return the Scrore_2
     */
    public float getScrore_2() {
        return Scrore_2;
    }

    /**
     * @param Scrore_2 the Scrore_2 to set
     */
    public void setScrore_2(float Scrore_2) {
        this.Scrore_2 = Scrore_2;
    }

    /**
     * @return the Scrore_3
     */
    public float getScrore_3() {
        return Scrore_3;
    }

    /**
     * @param Scrore_3 the Scrore_3 to set
     */
    public void setScrore_3(float Scrore_3) {
        this.Scrore_3 = Scrore_3;
    }
}
