package Case_Study5_Referal.Tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Case_Study5_Referal.Service.MyConnection;

public class ReferralData {

	public int addReferral() {
		int i = 0;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("insert into Referral values(?,?,?,?,?,?,?)");
			stmt.setInt(1, 1131);
			stmt.setString(2, "saumya");
			stmt.setString(3, "pra");
			stmt.setString(4, "097834");
			stmt.setString(5, "saumya@gmail.com");
			stmt.setInt(6, 1102);
			stmt.setString(7, "2021-12-11");
//			stmt.setBoolean(8, "true");

			i = stmt.executeUpdate();

			System.out.println("Inserted");
		} catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}

	public int UpdateReferral() {
		Connection connection = null;
		int i = 0;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection
					.prepareStatement("update Referral set referral_fname =?, mobile=? where referalId =?");
			stmt.setString(1, "niteen");
			stmt.setString(2, "9557585");
			stmt.setInt(3, 1131);
			i = stmt.executeUpdate();

			System.out.println("updated");

		} catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}

	public void displayReferrals() {
		Connection connection = null;
		connection = MyConnection.getConnection();
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Referral");
			System.out.println("id " + "\t" + "referral_fname\t" + "referral_lname\t" +  " " + "mobileNo" + "\t" + "email ");
			while (rs.next())
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4)+ " " + rs.getString(5));
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * public void deleteReferrals(int id) { Connection connection = null;
	 * connection = MyConnection.getConnection(); 
	 * Statement stmt; try { stmt = connection.createStatement(); 
	 * ResultSet rs = stmt.executeQuery("delete from Referral where referalId="+id);
	 * System.out.println("Deleted successfully"); connection.close();
	 *  } catch
	 * (SQLException e) { e.printStackTrace(); } }
	 */

	public int deleteData() {
		int i = 0;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("delete from Referral where referalId =?");
			stmt.setInt(1, 1131);
			i = stmt.executeUpdate();
			System.out.println("deleted");

		} catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}

}
