package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Athlete;

public class AthleteDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Athlete u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into athlete(aid,pnom,nom,pid,age,adr,rid) values(?,?,?,?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getPnom());
        ps.setString(3,u.getNom());
        ps.setString(4,u.getPid()); 
        ps.setInt(5,u.getAge());
        ps.setString(6,u.getAdr());
        ps.setInt(7, u.getRid());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Athlete u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update athlete set pnom=?, nom=?, pid=?, age=?, adr=?, rid=? where aid=?");
        ps.setString(1,u.getPnom());
        ps.setString(2,u.getNom());
        ps.setString(3,u.getPid()); 
        ps.setInt(4,u.getAge());
        ps.setString(5,u.getAdr());
        ps.setInt(6, u.getRid());
        
        ps.setInt(7,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Athlete u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from athlete where aid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Athlete> getAllRecords(){  
    List<Athlete> list=new ArrayList<Athlete>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from athlete");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Athlete u=new Athlete();  
            u.setId(rs.getInt("aid"));  
            u.setPnom(rs.getString("pnom")); 
            u.setNom(rs.getString("nom")); 
            u.setPid(rs.getString("pid"));
            u.setAge(rs.getInt("age")); 
            u.setAdr(rs.getString("adr")); 
            u.setRid(rs.getInt("rid"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Athlete getRecordById(int id){  
    Athlete u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from athlete where aid=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Athlete();  
            u.setId(rs.getInt("aid"));  
            u.setPnom(rs.getString("pnom")); 
            u.setNom(rs.getString("nom")); 
            u.setPid(rs.getString("pid"));
            u.setAge(rs.getInt("age")); 
            u.setAdr(rs.getString("adr")); 
            u.setRid(rs.getInt("rid"));  
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  