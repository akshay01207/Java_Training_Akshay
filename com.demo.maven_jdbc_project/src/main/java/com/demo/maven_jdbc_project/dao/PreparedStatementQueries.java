package com.demo.maven_jdbc_project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.demo.maven_jdbc_project.connection.MyConnection;

public class PreparedStatementQueries {
	
	 public int addCompany() {
	        int i=0;
	        Connection connection = null;
	        try {
	        connection = MyConnection.getConnection();            
	        PreparedStatement stmt = connection.prepareStatement("insert into company values(?,?,?,?,?)");
	        stmt.setInt(1, 111);
	        stmt.setString(2, "wipro");
	        stmt.setLong(3, 999000);
	        stmt.setString(4, "Hydrabad");
	        stmt.setString(5, "2019-07-10");
	        
	        i =stmt.executeUpdate();
	        
	        System.out.println("Inserted");
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        	return i;
	    }
	    public int UpdateCompany() {
	        Connection connection = null;
	        int i=0;
	        try {
	            connection = MyConnection.getConnection();
	            PreparedStatement stmt = connection.prepareStatement("update company set address =?,turnOver=? where comapnyId =?");
	            stmt.setString(1, "Oracle");
	            stmt.setLong(2, 986366);
	            stmt.setInt(3, 102);
	            i =stmt.executeUpdate();
	            
	            System.out.println("updated");
	            
	        }catch(Exception e) {
	            System.out.println(e);
	        }
	        return i;
	    }
	    public int deleteData() {
	        int i=0;
	        Connection connection = null;
	        try {
	            connection = MyConnection.getConnection();
	            PreparedStatement stmt = connection.prepareStatement("delete from company where comapnyId =?");
	            stmt.setInt(1, 106);
	             i =stmt.executeUpdate();            
	            System.out.println("deleted");
	            
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return i;
	    }
    

}