package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Transport;

public class TransportDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Transport u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into transport(tid,cap,freq) values(?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getCap());
        ps.setInt(3,u.getFreq());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Transport u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update transport set cap=?, freq=? where tid=?");
        ps.setInt(1,u.getCap());
        ps.setInt(2,u.getFreq());  
        
        ps.setInt(3,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Transport u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from transport where tid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Transport> getAllRecords(){  
    List<Transport> list=new ArrayList<Transport>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from transport");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Transport u=new Transport();  
            u.setId(rs.getInt("tid"));
            u.setCap(rs.getInt("cap"));  
            u.setFreq(rs.getInt("freq"));    
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Transport getRecordById(int tid){  
    Transport u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from transport where tid=?");  
        ps.setInt(1,tid);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Transport();  
            u.setId(rs.getInt("tid"));
            u.setCap(rs.getInt("cap"));  
            u.setFreq(rs.getInt("freq"));    
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  

public static List<Transport> getQuerry(String i){  
    List<Transport> list=new ArrayList<Transport>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from transport where (CAST(tid AS TEXT) like '%"+i+"%' or CAST(cap AS TEXT) like '%"+i+"%' or CAST(freq AS TEXT) like '%"+i+"%')");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Transport u=new Transport();  
            u.setId(rs.getInt("tid"));
            u.setCap(rs.getInt("cap"));  
            u.setFreq(rs.getInt("freq"));    
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
}  
