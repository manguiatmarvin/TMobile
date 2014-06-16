package com.emerge.TMobile.server.Db.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.emerge.TMobile.client.Models.Audit;
import com.emerge.TMobile.server.DB.ConnectionFactory;

public class AuditsDAO {
	Connection connection;
	Statement stmt;
	private int noOfRecords;

	public AuditsDAO() {

	}

	private static Connection getConnection() throws SQLException,
			ClassNotFoundException {
		Connection con = (Connection) ConnectionFactory.getInstance().getConnection();
		return con;
	}

	public List<Audit> getAllAudit(int offset, int noOfRecords) {
		String query = "select SQL_CALC_FOUND_ROWS * from Audit limit "
				+ offset + ", " + noOfRecords;
		
		System.out.println(query);
		
		List<Audit> list = new ArrayList<Audit>();
		Audit audit = null;
		try {
			connection = getConnection();
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				audit = new Audit();
				audit.setId(rs.getInt("id"));
				audit.setTitle(rs.getString("title"));
				audit.setDesc(rs.getString("desc"));
				audit.setStart(rs.getTimestamp("start"));
				audit.setEnd(rs.getTimestamp("end"));
				list.add(audit);
			}
			rs.close();

			rs = stmt.executeQuery("SELECT FOUND_ROWS()");
			if (rs.next())
				this.noOfRecords = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public int getNoOfRecords() {
		return noOfRecords;
	}
}