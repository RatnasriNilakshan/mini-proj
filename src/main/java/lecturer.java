/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nilak
 */
public class lecturer {
    private String user_name, password, department, user_type;
    public lecturer(String user_name, String password, String department, String user_type)
    {
        this.user_name=user_name;
        this.password=password;
        this.department=department;
        this.user_type=user_type;
    }
    public lecturer(String user_name, String department)
    {
       this.user_name=user_name; 
       this.department=department;
    }

    public String getuser_name()
    {
        return user_name;
    }
    public String getpassword()
    {
        return password;
    }
    public String getdepartment()
    {
        return department;
    }
    public String getuser_type()
    {
        return user_type;
    }

    
}
