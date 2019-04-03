package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Officiel;

public class OfficielDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Officiel u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into Officiel(oid,nom) values(?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getNom());

        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Officiel u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update officiel set nom=? where oid=?");
        ps.setString(1,u.getNom());

        
        ps.setInt(2,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Officiel u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from Officiel where oid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Officiel> getAllRecords(){  
    List<Officiel> list=new ArrayList<Officiel>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Officiel");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Officiel u=new Officiel();  
            u.setId(rs.getInt("oid"));  
            u.setNom(rs.getString("nom")); 
          
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Officiel getRecordById(int id){  
    Officiel u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from Officiel where oid=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Officiel();  
            u.setId(rs.getInt("oid"));   
            u.setNom(rs.getString("nom")); 
      
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  
