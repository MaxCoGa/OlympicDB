package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Residence;

public class ResidenceDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Residence u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into residence(rid,cap,adr,phone) values(?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setInt(2,u.getCap());  
        ps.setString(3,u.getAdr());
        ps.setString(4,u.getPhone()); 
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Residence u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update residence set cap=?, adr=?, phone=? where rid=?");
        ps.setInt(1,u.getCap());  
        ps.setString(2,u.getAdr());
        ps.setString(3,u.getPhone());
        ps.setInt(4,u.getId());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Residence u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from residence where rid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Residence> getAllRecords(){  
    List<Residence> list=new ArrayList<Residence>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from residence");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Residence u=new Residence();  
            u.setId(rs.getInt("rid"));
            u.setCap(rs.getInt("cap"));
            u.setAdr(rs.getString("adr"));
            u.setPhone(rs.getString("phone")); 
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Residence getRecordById(int id){  
    Residence u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from residence where rid=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Residence();  
            u.setId(rs.getInt("rid"));  
            u.setCap(rs.getInt("cap"));
            u.setAdr(rs.getString("adr"));
            u.setPhone(rs.getString("phone")); 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
public static List<Residence> getQuerry(String s){  
    List<Residence> list=new ArrayList<Residence>();  
      
    try{
        Connection con=getConnection();

        PreparedStatement ps=con.prepareStatement("select * from residence where (cast(rid as TEXT) like '%"+s+"%' or cast(cap as TEXT) like '%"+s+"%' or adr like '%"+s+"%' or phone like '%"+s+"%')");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Residence u=new Residence();  
            u.setId(rs.getInt("rid"));
            u.setCap(rs.getInt("cap"));
            u.setAdr(rs.getString("adr"));
            u.setPhone(rs.getString("phone")); 
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static boolean isInteger( String input ) {
    try {
        Integer.parseInt( input );
        return true;
    }
    catch( Exception e ) {
        return false;
    }
}

}  
