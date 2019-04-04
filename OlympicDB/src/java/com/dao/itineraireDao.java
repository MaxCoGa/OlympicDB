package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.itineraire;

public class itineraireDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(itineraire u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into itineraire(itiid,tid,tof,fromf) values(?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getTid());
        ps.setInt(3,u.getTof());
        ps.setInt(4,u.getFromf());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(itineraire u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update itineraire set tid=?, tof=?, fromf=? where itiid=?");
        ps.setInt(1,u.getTid());
        ps.setInt(2,u.getTof());
        ps.setInt(3,u.getFromf());  
        
        ps.setInt(4,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(itineraire u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from itineraire where itiid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<itineraire> getAllRecords(){  
    List<itineraire> list=new ArrayList<itineraire>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from itineraire");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            itineraire u=new itineraire();  
            u.setId(rs.getInt("itiid"));
             u.setTid(rs.getInt("tid"));
            u.setTof(rs.getInt("tof"));  
            u.setFromf(rs.getInt("fromf"));    
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static itineraire getRecordById(int itiid){  
    itineraire u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from itineraire where itiid=?");  
        ps.setInt(1,itiid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new itineraire();  
            u.setId(rs.getInt("itiid"));
            u.setTid(rs.getInt("tid"));
            u.setTof(rs.getInt("tof"));  
            u.setFromf(rs.getInt("fromf"));    
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
public static List<itineraire> getQuerry(String s){  
    List<itineraire> list=new ArrayList<itineraire>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from itineraire where (cast(itiid as TEXT) like '%"+s+"%' or cast(tid as TEXT) like '%"+s+"%')");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            itineraire u=new itineraire();  
            u.setId(rs.getInt("itiid"));
             u.setTid(rs.getInt("tid"));
            u.setTof(rs.getInt("tof"));  
            u.setFromf(rs.getInt("fromf"));    
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
} 
}  
