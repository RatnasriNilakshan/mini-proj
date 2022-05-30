/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilakshan
 */
class student {
    private String registration_no, department, academic_year, students_name, gender;
    public student(String registration_no, String department, String academic_year, String students_name, String gender)
    {
        this.academic_year=academic_year;
        this.department=department;
        this.gender=gender;
        this.registration_no=registration_no;
        this.students_name=students_name;
    }
    public String getregistration_no()
    {
        return registration_no;
    }
    public String getdepartment()
    {
        return department;
    }
    public String getacademic_year()
    {
        return academic_year;
    }
    public String getstudents_name()
    {
        return students_name;
    }
    public String getgender()
    {
        return gender;
    }

    
}
