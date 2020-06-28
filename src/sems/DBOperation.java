/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sems;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Acer
 */
public class DBOperation {
    
    String url = "jdbc:mysql://localhost:3306/exmsystem";
    String un = "root";
    String pass = "";
    Connection con =null;
    PreparedStatement pst = null;
    ResultSet rs;
    
    PreparedStatement pst2 =null;
    PreparedStatement pst3 =null;
    

    /**
     *
     * @param std
     * @return
     */
    public boolean addStudent(Student std){
        
        try{
        con = (Connection)DriverManager.getConnection(url, un, pass);
        String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?)";
        pst =(PreparedStatement)con.prepareStatement(query);
        pst.setInt(1,std.getRegID());
        pst.setString(2,std.getFirstName());
        pst.setString(3,std.getLastName());
        pst.setString(4,std.getEmail());
        pst.setInt(5,std.getAge());
        pst.setString(6,std.getAddress());
        pst.setString(7,std.getGender());
        pst.setString(8,std.getFaculty());
        pst.setString(9,std.getDepartment());
        pst.setInt(10,std.getYearofreg());
        
        pst.executeUpdate();
        return true;
             
        }catch(SQLException e)
        {System.out.println(e);return false;}
    
}
    ArrayList<Student> getStudent(){
        
        ArrayList<Student> list = new ArrayList<Student>();
    
     try{
       
        con = (Connection)DriverManager.getConnection(url, un, pass);
        String query = "(SELECT * FROM student) ";
        pst =(PreparedStatement)con.prepareStatement(query);
        rs =  pst.executeQuery();
            
        while(rs.next()){
        Student s = new Student();
        s.setRegID(rs.getInt(1));
        s.setFirstName(rs.getString(2));
        s.setLastName(rs.getString(3));
        s.setEmail(rs.getString(4));
        s.setAge(rs.getInt(5));
        s.setAddress(rs.getString(6));
        s.setGender(rs.getString(7));
        s.setFaculty(rs.getString(8));  
        s.setDepartment(rs.getString(9));
        s.setYearofreg(rs.getInt(10));
     
        list.add(s);
        }
        return list;
      
        }catch(SQLException e)
        {
            System.out.println(e);return null;
        }
        
    }
    
  public boolean  updateStudent(Student std){
      
      try{
          
      con = (Connection)DriverManager.getConnection(url, un, pass);
      String query = "UPDATE student SET firstname='"+std.getFirstName()+"',lastname='"+std.getLastName()+"',email='"+std.getEmail()+"',age='"+std.getAge()+"',	address='"+std.getAddress()+"',	gender='"+std.getGender()+"',faculty='"+std.getFaculty()+"',department='"+std.getDepartment()+"',yearofreg='"+std.getYearofreg()+"' WHERE regid="+std.getRegID();
       // String query = "UPDATE student SET email='"+std.getEmail()+"' WHERE regid="+std.getRegID();
      pst =(PreparedStatement)con.prepareStatement(query);
      pst.executeUpdate();
        return true;
          
      }catch(SQLException e){
          System.out.println(e);
      return false;
      }
  }
    
    public boolean deleteStudent(Student em)
    {
        try{
               con = (Connection)DriverManager.getConnection(url, un, pass);
               String query;
            query = "DELETE FROM student WHERE regid ="+em.getRegID();
               pst =(PreparedStatement)con.prepareStatement(query);
            
                pst.executeUpdate();
               return true;
               
        }catch(SQLException e){System.out.println(e); return false;}
        
    }
    
    
    //Subject database Operation
    
    public boolean addSubject(Subject sbjct)
    {
        try{
            con = (Connection)DriverManager.getConnection(url, un, pass);
        String query = "INSERT INTO subject VALUES(?,?,?,?) ";
        pst =(PreparedStatement)con.prepareStatement(query);
        
         
         pst.setString(1,sbjct.getSubCode());
         pst.setString(2,sbjct.getSubName());
         pst.setInt(3,sbjct.getSubId());
         pst.setString(4,sbjct.getDescription());
         
         pst.executeUpdate();
        
            
            
        return true;
        }catch(Exception e){System.out.println(e);return false;}
    }
    
      ArrayList<Subject> getSubject(){
        
        ArrayList<Subject> list = new ArrayList<Subject>();
    
     try{
       
        con = (Connection)DriverManager.getConnection(url, un, pass);
        String query = "(SELECT * FROM subject) ";
        pst =(PreparedStatement)con.prepareStatement(query);
        rs =  pst.executeQuery();
        
        
        
        while(rs.next()){
        Subject s = new Subject();
        
        s.setSubCode(rs.getString(1));
        s.setSubName(rs.getString(2));
        s.setSubId(rs.getInt(3));
        s.setDescription(rs.getString(4));
        
        
     
        list.add(s);
        
       
        }
        return list;
        
             
        }catch(SQLException e)
        {
            System.out.println(e);return null;
        }
        
    }
      
       public boolean  updateSubject(Subject sbjct){
      
      try{
       con = (Connection)DriverManager.getConnection(url, un, pass);
      String query = "UPDATE subject SET subjectname='"+sbjct.getSubName()+"',description='"+sbjct.getDescription()+"',	subjectcode='"+sbjct.getSubCode()+"' WHERE id= '"+sbjct.getSubId()+"'";
      pst =(PreparedStatement)con.prepareStatement(query);
      pst.executeUpdate();
        return true;
          
      }catch(SQLException e){
          System.out.println(e);
          
      return false;
      }
  
     
      
  
  }

  
    public boolean deleteSubject(Subject sbjct)
    {
        try{
               con = (Connection)DriverManager.getConnection(url, un, pass);
                String query = "DELETE FROM subject WHERE id ="+sbjct.getSubId();
               pst =(PreparedStatement)con.prepareStatement(query);
            
                pst.executeUpdate();
               return true;
               
        }catch(SQLException e){System.out.println(e); return false;}
        
    }
    
    // Enrolements.............
    
    public boolean Enrolement(Enrolements enrole){
        
        try{
        con = (Connection)DriverManager.getConnection(url, un, pass);
        
        String qury = "ALTER TABLE `enrolements` AUTO_INCREMENT=1";
        pst2= (PreparedStatement)con.prepareStatement(qury);
        pst2.executeUpdate(); 
       
        //fixID(con, "enrolements");
        //String q = "set @autoid :=0; update enrolements set enrolemntID = @autoid := (@autoid+1);alter table enrolements Auto_increment =1;";
        //String q="SET @num := 0; UPDATE enrolements SET EnrolemntID = @num := (@num+1); ALTER TABLE enrolements AUTO_INCREMENT = 1";
        //pst3= (PreparedStatement)con.prepareStatement(q);
        //pst3.executeUpdate();
       
        String query = "INSERT INTO enrolements VALUES(?,?,?,?,?) ";     
        pst =(PreparedStatement)con.prepareStatement(query);   
        pst.setInt(1,enrole.getEnrolemntID());
        pst.setString(2,enrole.getStudentName());
        pst.setString(3,enrole.getStudentEmail());
        pst.setString(4,enrole.getSubject());
        pst.setString(5,enrole.getDateTime());
        
        pst.executeUpdate();
       
        return true;
             
        }catch(SQLException e)
        {System.out.println(e);return false;}
    
}
        public static void fixID(Connection con, String table)//Not used yet
        {

    try {
        Statement myStmt = con.createStatement();
        ResultSet myRs;
        int i = 1, id = 1, n = 0;
        boolean b;
        String sql;

        myRs = myStmt.executeQuery("select max(EnrolemntID) from " + table);
        if (myRs.next()) {
            n = myRs.getInt(1);
        }
        while (i <= n) {
            b = false;
            myRs = null;
            while (!b) {
                myRs = myStmt.executeQuery("select EnrolemntID from " + table + " where EnrolemntID=" + id);
                if (!myRs.next()) {
                    id++;
                } else {
                    b = true;
                }
            }

            sql = "UPDATE " + table + " set EnrolemntID =" + i + " WHERE EnrolemntID=" + id;
            myStmt.executeUpdate(sql);
            i++;
            id++;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    

    
}
