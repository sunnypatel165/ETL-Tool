package etl;
import java.io.File;
import java.util.*;
import java.io.*;
import java.sql.*;
public class extractPage extends javax.swing.JFrame {

	public dataset ds[] = new dataset[10000];
	public int z = 0;

	public extractPage() {
		initComponents();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		for (int i = 0; i < 10000; i++)
		ds[i] = new dataset();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		SQLcheck = new javax.swing.JCheckBox();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		textCheck = new javax.swing.JCheckBox();
		CSVCheck = new javax.swing.JCheckBox();
		AccCheck = new javax.swing.JCheckBox();
		ExStart = new javax.swing.JButton();

		jLabel2.setText("jLabel2");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		SQLcheck.setText("SQL");
		SQLcheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SQLcheckActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
		jLabel3.setText("    Choose the sources");
		jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		jLabel4.setText("   Extraction Process!");

		textCheck.setText("Text");

		CSVCheck.setText("CSV");
		CSVCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CSVCheckActionPerformed(evt);
			}
		});

		AccCheck.setText("Access");
		AccCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AccCheckActionPerformed(evt);
			}
		});

		ExStart.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		ExStart.setText("Start Extraction!");
		ExStart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ExStartActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(160, 160, 160)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGap(0, 130, Short.MAX_VALUE))
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			.addGap(64, 64, 64)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
			.addComponent(ExStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
			.addComponent(CSVCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
			.addComponent(SQLcheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(textCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(AccCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
			.addGap(65, 65, 65)));
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(16, 16, 16)
			.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(18, 18, 18)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(SQLcheck)
			.addComponent(textCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGap(18, 18, 18)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(CSVCheck)
			.addComponent(AccCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGap(29, 29, 29)
			.addComponent(ExStart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(29, 29, 29)));

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void SQLcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQLcheckActionPerformed

	}//GEN-LAST:event_SQLcheckActionPerformed

	private void CSVCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSVCheckActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_CSVCheckActionPerformed

	private void AccCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccCheckActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_AccCheckActionPerformed

	private void ExStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExStartActionPerformed
		try {
			if (textCheck.isSelected()) {
				BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\ip.txt"));
				String line;

				while ( in .ready()) {
					line = in .readLine();
					ds[z].name = line.split(",")[0];
					ds[z].g = line.split(",")[1].charAt(0);
					ds[z].age = Integer.parseInt(line.split(",")[2]);
					ds[z].usage = Integer.parseInt(line.split(",")[3]);
					ds[z].op1 = line.split(",")[4];
					ds[z].op2 = line.split(",")[5];
					ds[z].lname = line.split(",")[6];
					z++;
				} in .close();
			}
			if (SQLcheck.isSelected()) {
				PrintWriter op = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\op.csv", true)));

				Connection conn = null;
				String url = "jdbc:mysql://localhost:3306/";
				String dbName = "dwm";
				String driver = "com.mysql.jdbc.Driver";
				String userName = "root";
				String password = "";
				Class.forName(driver).newInstance();
				conn = DriverManager.getConnection(url + dbName, userName, password);
				PreparedStatement s = conn.prepareStatement("select * from users");
				ResultSet rs = s.executeQuery();
				while (rs.next()) {
					ds[z].name = (rs.getObject(1).toString());
					ds[z].age = Integer.parseInt(rs.getObject(2).toString());
					ds[z].usage = Integer.parseInt(rs.getObject(3).toString());
					ds[z].g = rs.getObject(4).toString().charAt(0);
					ds[z].op1 = rs.getObject(5).toString();
					ds[z].lname = "-";
					ds[z].op2 = "-";
					z++;
				}

				op.close();
			}

			if (AccCheck.isSelected()) {
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection("jdbc:odbc:cust", "", "");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from cust");
				while (rs.next()) {
					ds[z].name = rs.getObject(2) + "";
					ds[z].age = Integer.parseInt(rs.getObject(3) + "");
					ds[z].g = (rs.getObject(4) + "").charAt(0);
					ds[z].usage = Integer.parseInt(rs.getObject(5) + "");
					ds[z].op1 = rs.getObject(6) + "";
					ds[z].op2 = rs.getObject(7) + "";
					ds[z].lname = "-";
					z++;
				}

			}
			if (CSVCheck.isSelected()) {
				BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\ip.csv"));
				String line;
				while ( in .ready()) {
					line = in .readLine();
					System.out.println(line);
					ds[z].name = line.split(",")[0];
					ds[z].g = line.split(",")[1].charAt(0);
					ds[z].age = Integer.parseInt(line.split(",")[2]);
					ds[z].usage = Integer.parseInt(line.split(",")[3]);
					ds[z].op1 = line.split(",")[4];
					ds[z].op2 = line.split(",")[5];
					ds[z].lname = "-";
					z++;
				}
				System.out.println("done"); in .close();
			}

			PrintWriter op = new PrintWriter("C:\\Users\\Sunny\\Documents\\NetBeansProjects\\ETL\\src\\etl\\extracted.txt", "UTF-8");
			for (int i = 0; i < z; i++)
			op.println(ds[i].name + "," + ds[i].g + "," + ds[i].age + "," + ds[i].usage + "," + ds[i].op1 + "," + ds[i].op2 + "," + ds[i].lname);
			op.close();
		} catch (Exception e) {}

		for (int i = 0; i < z; i++)
		System.out.println(ds[i].name + "," + ds[i].g + "," + ds[i].age + "," + ds[i].usage + "," + ds[i].op1 + "," + ds[i].op2 + "," + ds[i].lname);
		System.out.println(z);


	}//GEN-LAST:event_ExStartActionPerformed



	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JCheckBox AccCheck;
	private javax.swing.JCheckBox CSVCheck;
	private javax.swing.JButton ExStart;
	private javax.swing.JCheckBox SQLcheck;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JCheckBox textCheck;
	// End of variables declaration//GEN-END:variables
}