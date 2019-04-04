package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Employee;

public class EmployeeDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Employee u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into employee(eid,psw,pnom,nom,phone,adr,rid) values(?,?,?,?,?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getPsw());
        ps.setString(3,u.getPnom());
        ps.setString(4,u.getNom());
        ps.setString(5,u.getPhone()); 
        ps.setString(6,u.getAdr());
        ps.setInt(7, u.getRid());
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Employee u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update employee set psw=?, pnom=?, nom=?, phone=?, adr=?, rid=? where eid=?");
        ps.setString(1,u.getPsw());
        ps.setString(2,u.getPnom());
        ps.setString(3,u.getNom());
        ps.setString(4,u.getPhone()); 
        ps.setString(5,u.getAdr());  
        ps.setInt(6, u.getRid());
        
        ps.setInt(7,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Employee u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from employee where eid=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Employee> getAllRecords(){  
    List<Employee> list=new ArrayList<Employee>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employee");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Employee u=new Employee();  
            u.setId(rs.getInt("eid"));  
            u.setPsw(rs.getString("psw"));
            u.setPnom(rs.getString("pnom")); 
            u.setNom(rs.getString("nom")); 
            u.setPhone(rs.getString("phone")); 
            u.setAdr(rs.getString("adr")); 
            u.setRid(rs.getInt("rid"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Employee getRecordById(int id){  
    Employee u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employee where eid=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Employee();  
            u.setId(rs.getInt("eid"));  
            u.setPsw(rs.getString("psw"));
            u.setPnom(rs.getString("pnom")); 
            u.setNom(rs.getString("nom")); 
            u.setPhone(rs.getString("phone")); 
            u.setAdr(rs.getString("adr")); 
            u.setRid(rs.getInt("rid")); 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}
public static List<Employee> getQuerry(String s){  
    List<Employee> list=new ArrayList<Employee>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employee where (cast(eid as TEXT) LIKE '%"+s+"%' or psw LIKE '%"+s+"%' or pnom LIKE '%"+s+"%' or nom LIKE '%"+s+"%' or phone LIKE '%"+s+"%' or adr LIKE '%"+s+"%' or cast(rid as TEXT) LIKE '%"+s+"%')");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Employee u=new Employee();  
            u.setId(rs.getInt("eid"));  
            u.setPsw(rs.getString("psw"));
            u.setPnom(rs.getString("pnom")); 
            u.setNom(rs.getString("nom")); 
            u.setPhone(rs.getString("phone")); 
            u.setAdr(rs.getString("adr")); 
            u.setRid(rs.getInt("rid"));  
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  

}  