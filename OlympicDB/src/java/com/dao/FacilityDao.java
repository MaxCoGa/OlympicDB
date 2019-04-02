package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Facility;

public class FacilityDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Facility u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into facility(facility_id,capacity,adresses,nom) values(?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getCapacity());  
        ps.setString(3,u.getAdresses());
        ps.setString(4,u.getNom()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Facility u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update facility set capacity=?, adresses=?, nom=? where facility_id=?");
        ps.setInt(1,u.getCapacity());  
        ps.setString(2,u.getAdresses());
        ps.setString(3,u.getNom());
        ps.setInt(4,u.getId());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Facility u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from facility where facility_id=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Facility> getAllRecords(){  
    List<Facility> list=new ArrayList<Facility>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from facility");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Facility u=new Facility();  
            u.setId(rs.getInt("facility_id"));
            u.setCapacity(rs.getInt("capacity"));
            u.setAdresses(rs.getString("adresses"));
            u.setNom(rs.getString("nom")); 
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Facility getRecordById(int facility_id){  
    Facility u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from facility where facility_id=?");  
        ps.setInt(1,facility_id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Facility();  
            u.setId(rs.getInt("facility_id"));  
            u.setCapacity(rs.getInt("capacity"));
            u.setAdresses(rs.getString("adresses"));
            u.setNom(rs.getString("nom")); 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  