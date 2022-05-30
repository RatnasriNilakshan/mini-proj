/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nilak
 */
class logineduser {
    private String user_name, password, department, user_type;
    public logineduser(String user_name, String password, String department, String user_type)
    {
        this.user_name=user_name;
        this.password=password;
        this.department=department;
        this.user_type=user_type;
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

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
    
}
