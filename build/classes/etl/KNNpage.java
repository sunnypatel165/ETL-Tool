package etl;
import java.io.*;
public class KNNpage extends javax.swing.JFrame {

	public KNNpage() {
		initComponents();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		knnans = new javax.swing.JLabel();
		BayesClassify = new javax.swing.JButton();
		UseVar = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		AgeVar = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		GenVar = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		NameVar = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		knnans.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
		knnans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		BayesClassify.setText("Classify!");
		BayesClassify.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BayesClassifyActionPerformed(evt);
			}
		});

		UseVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UseVarActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Please enter following details for the new tuple to be classified.");
		jLabel1.setToolTipText("");

		AgeVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AgeVarActionPerformed(evt);
			}
		});

		jLabel4.setText("Name:");
		jLabel4.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel4.setMinimumSize(new java.awt.Dimension(35, 15));

		jLabel5.setText("Gender:");
		jLabel5.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel5.setMinimumSize(new java.awt.Dimension(35, 15));

		jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("K Nearest Neighbours!");
		jLabel2.setToolTipText("");

		jLabel3.setText("Usage:");
		jLabel3.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel3.setMinimumSize(new java.awt.Dimension(35, 15));

		GenVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GenVarActionPerformed(evt);
			}
		});

		jLabel6.setText("Age:");
		jLabel6.setMaximumSize(new java.awt.Dimension(35, 15));
		jLabel6.setMinimumSize(new java.awt.Dimension(35, 15));

		NameVar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NameVarActionPerformed(evt);
			}
		});

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
			.addComponent(knnans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
			.addComponent(knnans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void BayesClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayesClassifyActionPerformed
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System. in ));

			FileInputStream fstream = new FileInputStream("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\ip.txt");
			BufferedReader brf = new BufferedReader(new InputStreamReader(fstream));
			String line;
			dataset ds[] = new dataset[10000];
			for (int i = 0; i < 10000; i++) {
				ds[i] = new dataset();
			}
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
			System.out.println(z);
			brf.close();

			int la = 99999, ha = 0, lm = 99999, hm = 0;
			for (int i = 0; i < z; i++) {
				if (ds[i].age < la) la = ds[i].age;
				if (ds[i].age > ha) ha = ds[i].age;
				if (ds[i].usage < lm) lm = ds[i].usage;
				if (ds[i].usage > hm) hm = ds[i].usage;
			}
			double na[] = new double[z];
			double nm[] = new double[z];
			int da = ha - la;
			int dm = hm - lm;
			for (int i = 0; i < z; i++) {
				na[i] = 1.0 * (ds[i].age - la) / (1.0 * da);
				nm[i] = 1.0 * (ds[i].usage - lm) / (1.0 * dm);
			}
			System.out.println("Enter the new tupple(name,gender, age,usage");
			String nnew;
			int minsnew, agenew;
			char gnew;

			nnew = (NameVar.getText());
			gnew = GenVar.getText().charAt(0);
			minsnew = Integer.parseInt(UseVar.getText());
			agenew = Integer.parseInt(AgeVar.getText());



			double nanew = 1.0 * (agenew - la) / da;
			double nmnew = 1.0 * (minsnew - lm) / dm;


			double dist[] = new double[z];
			int index[] = new int[z];
			for (int i = 0; i < z; i++) {
				index[i] = i;
				dist[i] = (na[i] - nanew) * (na[i] - nanew);
				dist[i] += (nm[i] - nmnew) * (nm[i] - nmnew);
				dist[i] = Math.sqrt(dist[i]);
			}
			for (int i = 0; i < z - 1; i++) {
				for (int j = 0; j < z - 1; j++) {
					if (dist[j] > dist[j + 1]) {
						double temp = dist[j];
						dist[j] = dist[j + 1];
						dist[j + 1] = temp;

						int x = index[j];
						index[j] = index[j + 1];
						index[j + 1] = x;
					}
				}
			}
			int ch = 0, cm = 0, cl = 0, k = 3;

			for (int c = 0; c < k; c++) {
				for (int i = 0; i < k; i++) {
					if ((ds[index[i]].op1).compareTo("high") == 0) ch++;
					if (ds[index[i]].op1.compareTo("medium") == 0) cm++;
					if (ds[index[i]].op1.compareTo("low") == 0) cl++;
				}
				if (ch == cl || cl == cm || ch == cm && k < z - 3 && ch != 0 && cm != 0 && cl != 0) k += 2;
				else {
					if (cl > ch && cl > cm) knnans.setText("NEW TUPLE CLASSIFIED AS: LOW (K = " + k + " )");
					if (cm > ch && cm > cl) knnans.setText("NEW TUPLE CLASSIFIED AS: MEDIUM (K = " + k + " )");
					if (ch > cl && ch > cm) knnans.setText("NEW TUPLE CLASSIFIED AS: HIGH (K = " + k + " )");
					break;
				}
			}

		} catch (Exception e) {}
	}//GEN-LAST:event_BayesClassifyActionPerformed

	private void UseVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_UseVarActionPerformed

	private void AgeVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_AgeVarActionPerformed

	private void GenVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_GenVarActionPerformed

	private void NameVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameVarActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_NameVarActionPerformed

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
			java.util.logging.Logger.getLogger(KNNpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(KNNpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(KNNpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(KNNpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new KNNpage().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField AgeVar;
	private javax.swing.JButton BayesClassify;
	private javax.swing.JTextField GenVar;
	private javax.swing.JTextField NameVar;
	private javax.swing.JTextField UseVar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel knnans;
	// End of variables declaration//GEN-END:variables
}