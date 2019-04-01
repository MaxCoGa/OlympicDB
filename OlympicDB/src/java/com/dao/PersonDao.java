package com.dao;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
import com.entity.Person;

public class PersonDao {  
  
public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("org.postgresql.Driver");  
        con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "CSI2532");   
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
public static int save(Person u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into person(id,nom,adresse) values(?,?,?)");  
        ps.setInt(1,u.getId());
        ps.setString(2,u.getNom());  
        ps.setString(3,u.getAdresse());  
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int update(Person u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update person set nom=?,adresse=? where id=?");
        ps.setString(1,u.getNom());  
        ps.setString(2,u.getAdresse());
        ps.setInt(3,u.getId());
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(Person u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from person where id=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<Person> getAllRecords(){  
    List<Person> list=new ArrayList<Person>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from person");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Person u=new Person();  
            u.setId(rs.getInt("id"));  
            u.setNom(rs.getString("nom"));  
            u.setAdresse(rs.getString("adresse"));   
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static Person getRecordById(int id){  
    Person u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from person where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Person();  
            u.setId(rs.getInt("id"));  
            u.setNom(rs.getString("nom"));  
            u.setAdresse(rs.getString("adresse"));  
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  
}  