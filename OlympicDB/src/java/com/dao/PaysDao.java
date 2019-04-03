package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Pays;

public class PaysDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Pays u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into pays(pid) values(?)");  
        ps.setString(1,u.getId()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Pays u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("update pays where pid=?");
        ps.setString(1,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Pays u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from pays where pid=?");  
        ps.setString(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Pays> getAllRecords(){  
    List<Pays> list=new ArrayList<Pays>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from pays");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Pays u=new Pays();  
            u.setId(rs.getString("pid"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Pays getRecordById(String pid){  
    Pays u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from pays where pid=?");  
        ps.setString(1,pid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Pays();  
            u.setId(rs.getString("pid"));  
 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  