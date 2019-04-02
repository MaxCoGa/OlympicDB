package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Discipline;

public class DisciplineDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Discipline u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into discipline(id,nom) values(?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getNom());   
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Discipline u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update discipline set nom=? where id=?");
        ps.setString(1,u.getNom());  

        ps.setInt(2,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Discipline u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from discipline where id=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Discipline> getAllRecords(){  
    List<Discipline> list=new ArrayList<Discipline>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from discipline");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Discipline u=new Discipline();  
            u.setId(rs.getInt("id"));  
            u.setNom(rs.getString("nom"));  
 
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Discipline getRecordById(int id){  
    Discipline u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from discipline where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Discipline();  
            u.setId(rs.getInt("id"));  
            u.setNom(rs.getString("nom"));  
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  