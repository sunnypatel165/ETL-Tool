package etl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class BayesPage extends javax.swing.JFrame {
	public BayesPage() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		NameVar = new javax.swing.JTextField();
		GenVar = new javax.swing.JTextField();
		AgeVar = new javax.swing.JTextField();
		UseVar = new javax.swing.JTextField();
		BayesClassify = new javax.swing.JButton();
		bayeans = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Please enter following details for the new tuple to be classified.");
		jLabel1.setToolTipText("");

		jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("BAYES CLASSIFICATION!");
		jLabel2.setToolTipText("");

		jLabel3.setText("Usage:");
		jLabel3.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel3.setMinimumSize(new java.awt.Dimension(35, 15));

		jLabel4.setText("Name:");
		jLabel4.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel4.setMinimumSize(new java.awt.Dimension(35, 15));

		jLabel5.setText("Gender:");
		jLabel5.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel5.setMinimumSize(new java.awt.Dimension(35, 15));

		jLabel6.setText("Age:");
		jLabel6.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel6.setMinimumSize(new java.awt.Dimension(35, 15));

		NameVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NameVarActionPerformed(evt);
			}
		});

		GenVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GenVarActionPerformed(evt);
			}
		});

		AgeVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AgeVarActionPerformed(evt);
			}
		});

		UseVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UseVarActionPerformed(evt);
			}
		});

		BayesClassify.setText("Classify!");
		BayesClassify.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BayesClassifyActionPerformed(evt);
			}
		});

		bayeans.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
		bayeans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(110, 110, 110))
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
			.addContainerGap()
			.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
			.addContainerGap())
			.addGroup(layout.createSequentialGroup()
			.addGap(79, 79, 79)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
			.addComponent(BayesClassify, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
			.addGroup(layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
			.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
			.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
			.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
			.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
			.addComponent(NameVar)
			.addComponent(GenVar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
			.addComponent(AgeVar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
			.addComponent(UseVar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))))
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			.addGroup(layout.createSequentialGroup()
			.addContainerGap()
			.addComponent(bayeans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addContainerGap()));
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addContainerGap()
			.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(1, 1, 1)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(NameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGap(10, 10, 10)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(GenVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
			.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(UseVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(AgeVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(BayesClassify)
			.addGap(29, 29, 29)
			.addComponent(bayeans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(22, Short.MAX_VALUE)));

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void NameVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_NameVarActionPerformed

	private void GenVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_GenVarActionPerformed

	private void AgeVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_AgeVarActionPerformed

	private void UseVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_UseVarActionPerformed

	private void BayesClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayesClassifyActionPerformed
		try {
			FileInputStream fstream = new FileInputStream("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\ip.txt");
			BufferedReader brf = new BufferedReader(new InputStreamReader(fstream));
			BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));
			String line;
			dataset ds[] = new dataset[10000];
			for (int i = 0; i < 10000; i++) {
				ds[i] = new dataset();
			}

			System.out.println("in1");
			int z = 0;
			while ((line = brf.readLine()) != null) {
				ds[z].name = line.split(",")[0];
				ds[z].g = line.split(",")[1].charAt(0);
				ds[z].age = Integer.parseInt(line.split(",")[2]);
				ds[z].usage = Integer.parseInt(line.split(",")[3]);
				ds[z].op1 = line.split(",")[4];
				ds[z].op2 = line.split(",")[5];
				z++;
			}
			brf.close();


			int count[][] = new int[2][3];
			int countc[][] = new int[6][3];

			double prob[][] = new double[2][3];
			double probc[][] = new double[6][3];

			for (int i = 0; i < z; i++) {
				if (ds[i].op1.compareTo("low") == 0 && ds[i].g == 'M') count[0][0]++;
				if (ds[i].op1.compareTo("medium") == 0 && ds[i].g == 'M') count[0][1]++;
				if (ds[i].op1.compareTo("high") == 0 && ds[i].g == 'M') count[0][2]++;

				if (ds[i].op1.compareTo("low") == 0 && ds[i].g == 'F') count[1][0]++;
				if (ds[i].op1.compareTo("medium") == 0 && ds[i].g == 'F') count[1][1]++;
				if (ds[i].op1.compareTo("high") == 0 && ds[i].g == 'F') count[1][2]++;
			}

			int totallow = count[0][0] + count[1][0] + 1; // +1 otherwise NAN error
			int totalMed = count[0][1] + count[1][1] + 1;
			int totalhigh = count[0][2] + count[1][2] + 1;

			for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++) {
				prob[i][j] = count[i][j] * 1.0;
				if (j == 0) prob[i][j] /= totallow;
				if (j == 1) prob[i][j] /= totalMed;
				if (j == 2) prob[i][j] /= totalhigh;
			}
			for (int i = 0; i < z; i++) {
				if (ds[i].usage >= 0 && ds[i].usage <= 300) {
					if (ds[i].op1.compareTo("low") == 0) countc[0][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[0][1]++;
					if (ds[i].op1.compareTo("high") == 0) {
						countc[0][2]++;
					}
				} else if (ds[i].usage > 300 && ds[i].usage <= 600) {
					if (ds[i].op1.compareTo("low") == 0) countc[1][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[1][1]++;
					if (ds[i].op1.compareTo("high") == 0) countc[1][2]++;
				} else if (ds[i].usage > 600 && ds[i].usage <= 900) {
					if (ds[i].op1.compareTo("low") == 0) countc[2][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[2][1]++;
					if (ds[i].op1.compareTo("high") == 0) countc[2][2]++;
				} else if (ds[i].usage > 900 && ds[i].usage <= 1200) {
					if (ds[i].op1.compareTo("low") == 0) countc[3][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[3][1]++;
					if (ds[i].op1.compareTo("high") == 0) countc[3][2]++;
				} else if (ds[i].usage > 1200 && ds[i].usage <= 1500) {
					if (ds[i].op1.compareTo("low") == 0) countc[4][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[4][1]++;
					if (ds[i].op1.compareTo("high") == 0) countc[4][2]++;
				} else if (ds[i].usage > 1500) {
					if (ds[i].op1.compareTo("low") == 0) countc[5][0]++;
					if (ds[i].op1.compareTo("medium") == 0) countc[5][1]++;
					if (ds[i].op1.compareTo("high") == 0) countc[5][2]++;
				}
			}
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 3; j++) {
					if (j == 0) probc[i][j] = countc[i][j] * 1.0 / totallow;
					if (j == 1) probc[i][j] = countc[i][j] * 1.0 / totalMed;
					if (j == 2) probc[i][j] = countc[i][j] * 1.0 / totalhigh;
				}
			}

			String namenew = (NameVar.getText());
			char ge = GenVar.getText().charAt(0);
			int h = Integer.parseInt(UseVar.getText());
			int agenew = Integer.parseInt(AgeVar.getText());
			double ps, pm, pt, ls, lm, lt;
			int index = 0;
			if (h >= 0 && h <= 300) index = 0;
			else if (h > 300 && h <= 600) index = 1;
			else if (h > 600 && h <= 900) index = 2;
			else if (h > 900 && h <= 1200) index = 3;
			else if (h > 1200 && h <= 1500) index = 4;
			else if (h > 1500) index = 5;
			if (ge == 'M') {
				ps = prob[0][0] * probc[index][0];
				pm = prob[0][1] * probc[index][1];
				pt = prob[0][2] * probc[index][2];
			} else {
				ps = prob[1][0] * probc[index][0];
				pm = prob[1][1] * probc[index][1];
				pt = prob[1][2] * probc[index][2];
			}

			ls = ps * totallow / z;
			lm = pm * totalMed / z;
			lt = pt * totalhigh / z;

			double ptt = ls + lm + lt;
			double pst = ls / ptt;
			double pmt = lm / ptt;
			double ptta = lt / ptt;
			if (pst >= pmt && pst >= ptta) bayeans.setText("NEW TUPLE CLASSIFIED AS: LOW");
			if (pmt >= pst && pmt >= ptta) bayeans.setText("NEW TUPLE CLASSIFIED AS: MEDIUM");
			if (ptta >= pst && ptta >= pmt) bayeans.setText("NEW TUPLE CLASSIFIED AS: HIGH");

			System.out.println("in1");

		} catch (Exception e) {}
	}//GEN-LAST:event_BayesClassifyActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BayesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BayesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BayesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BayesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BayesPage().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField AgeVar;
	private javax.swing.JButton BayesClassify;
	private javax.swing.JTextField GenVar;
	private javax.swing.JTextField NameVar;
	private javax.swing.JTextField UseVar;
	private javax.swing.JLabel bayeans;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	// End of variables declaration//GEN-END:variables
}