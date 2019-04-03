package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Epreuve;

public class EpreuveDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Epreuve u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into epreuve(eid,did,descr) values(?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getDid());  
        ps.setString(3,u.getDescr()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Epreuve u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update epreuve set did=?, descr=? where eid=?");
        ps.setInt(1,u.getDid());
        ps.setString(2,u.getDescr());  
        
        ps.setInt(3,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Epreuve u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from epreuve where eid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Epreuve> getAllRecords(){  
    List<Epreuve> list=new ArrayList<Epreuve>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from epreuve");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Epreuve u=new Epreuve();  
            u.setId(rs.getInt("eid"));
            u.setDid(rs.getInt("did"));  
            u.setDescr(rs.getString("descr"));   
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Epreuve getRecordById(int eid){  
    Epreuve u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from epreuve where eid=?");  
        ps.setInt(1,eid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Epreuve();  
            u.setId(rs.getInt("eid"));
            u.setDid(rs.getInt("did"));  
            u.setDescr(rs.getString("descr"));    
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  
