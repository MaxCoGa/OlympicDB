package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Medical;

public class MedicalDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Medical u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into medical(mid,nom,descr,phone,adr) values(?,?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getNom());  
        ps.setString(3,u.getDescr());  
        ps.setString(4,u.getPhone()); 
        ps.setString(5,u.getAdr()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Medical u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update medical set nom=?,descr=?,phone=?,adr=? where mid=?");
        ps.setInt(5,u.getId());
        ps.setString(1,u.getNom());  
        ps.setString(2,u.getDescr());  
        ps.setString(3,u.getPhone()); 
        ps.setString(4,u.getAdr()); 
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Medical u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from medical where mid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Medical> getAllRecords(){  
    List<Medical> list=new ArrayList<Medical>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from medical");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Medical u=new Medical();  
            u.setId(rs.getInt("mid"));  
            u.setNom(rs.getString("nom"));
            u.setDescr(rs.getString("descr"));
            u.setPhone(rs.getString("phone"));
            u.setAdr(rs.getString("adr"));   
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Medical getRecordById(int id){  
    Medical u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from medical where mid=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Medical();  
            u.setId(rs.getInt("mid"));  
            u.setNom(rs.getString("nom"));
            u.setDescr(rs.getString("descr"));
            u.setPhone(rs.getString("phone"));
            u.setAdr(rs.getString("adr"));   
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  