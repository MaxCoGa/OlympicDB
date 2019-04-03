package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Supervise;

public class SuperviseDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Supervise u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into Supervise(oid,aid,eid) values(?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getAid());
        ps.setInt(3,u.getEid());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Supervise u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update Supervise set aid=?,eid=? where oid=?");
        ps.setInt(1,u.getAid());
        ps.setInt(2,u.getEid());  
        
        ps.setInt(3,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Supervise u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from Supervise where oid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Supervise> getAllRecords(){  
    List<Supervise> list=new ArrayList<Supervise>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Supervise");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Supervise u=new Supervise();  
            u.setId(rs.getInt("oid"));
            u.setAid(rs.getInt("aid"));  
            u.setEid(rs.getInt("eid"));    
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Supervise getRecordById(int oid){  
    Supervise u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Supervise where oid=?");  
        ps.setInt(1,oid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Supervise();  
            u.setId(rs.getInt("oid"));
            u.setAid(rs.getInt("aid"));  
            u.setEid(rs.getInt("eid"));    
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  
