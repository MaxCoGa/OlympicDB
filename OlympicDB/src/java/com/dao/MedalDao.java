package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Medal;

public class MedalDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Medal u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into Medal(mid,type,eid,aid) values(?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getType()); 
          ps.setInt(3,u.getEid()); 
           ps.setInt(4,u.getAid());  
         
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Medal u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("update Medal set type=?, eid=?, aid=? where mid=?");
        ps.setString(1,u.getType()); 
          ps.setInt(2,u.getEid()); 
           ps.setInt(3,u.getAid()); 
           
           ps.setInt(4,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Medal u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from Medal where mid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Medal> getAllRecords(){  
    List<Medal> list=new ArrayList<Medal>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Medal");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Medal u=new Medal();  
            u.setId(rs.getInt("mid"));
            u.setType(rs.getString("type")); 
            u.setEid(rs.getInt("eid")); 
            u.setAid(rs.getInt("aid")); 
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Medal getRecordById(int mid){  
    Medal u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Medal where mid=?");  
        ps.setInt(1, mid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Medal();  
            u.setId(rs.getInt("mid"));
            u.setType(rs.getString("type")); 
            u.setEid(rs.getInt("eid")); 
            u.setAid(rs.getInt("aid")); 
 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  
