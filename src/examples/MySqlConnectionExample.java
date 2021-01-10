package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class MySqlConnectionExample {

	public MySqlConnectionExample() {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?"
					+ "user=root&password=741593&useLegacyDatetimeCode=false&serverTimezone=UTC");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from oc_cart");
			int coulmnCount = rs.getMetaData().getColumnCount();

			System.out.println("coulmnCount: " + coulmnCount);

			List<String> tableKeys = new LinkedList<String>();

			for (int i = 1; i <= coulmnCount; i++) {
				tableKeys.add(rs.getMetaData().getColumnName(i));
			}

			int[] columnNameLens = new int[coulmnCount + 1];
			int count1 = 0;
			System.out.print("tableKeys: ");
			for (String column : tableKeys) {
				count1++;
				System.out.print(column+", ");
				columnNameLens[count1] = column.length();
			}

			int[] maxColumnValueLen = new int[coulmnCount + 1];

			List<List<String>> lls = new LinkedList<List<String>>();
			while (rs.next()) {
				List<String> lst = new LinkedList<String>();
				for (int i = 1; i <= coulmnCount; i++) {
					maxColumnValueLen[i] = Math.max(maxColumnValueLen[i], rs.getString(i).length());
					lst.add(rs.getString(i));
				}
				lls.add(lst);
			}

			int[] maxLen = new int[coulmnCount + 1];
			System.out.println("");
			for (int i = 1; i <= coulmnCount; i++) {
				maxLen[i] = Math.max(columnNameLens[i], maxColumnValueLen[i]);
			}
//			
//
//			System.out.println("");
//			for (int i = 1; i <= coulmnCount ; i++) {
//				System.out.print(" " + maxColumnValueLen[i]);
//
//			}
//			
//
//			for (int i = 1; i <= coulmnCount ; i++) {
//				System.out.print(" " + maxLen[i]);
//			}
//			System.out.println("");
//			for(List<String> strs : lls) {
//				for(String str: strs) {
//					System.out.print(str+" ");
//				}
//				System.out.println();
//			}

			System.out.println("");

			stmt.close();
			rs.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
