package etl;

public class Home extends javax.swing.JFrame {

	public dataset ds[] = new dataset[10000];
	public int z = 0;
	public Home() {
		initComponents();

	}@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		extract = new javax.swing.JButton();
		load = new javax.swing.JButton();
		mining = new javax.swing.JButton();
		trans = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		extract.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		extract.setText("Extract!");
		extract.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				extractActionPerformed(evt);
			}
		});

		load.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		load.setText("Load!");
		load.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				loadActionPerformed(evt);
			}
		});

		mining.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		mining.setText("Mining!");
		mining.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				miningActionPerformed(evt);
			}
		});

		trans.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		trans.setText("Transform!");
		trans.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				transActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(143, 143, 143)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(mining, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(extract, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addContainerGap(170, Short.MAX_VALUE)));
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(20, 20, 20)
			.addComponent(extract, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(26, 26, 26)
			.addComponent(trans, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
			.addComponent(load, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(28, 28, 28)
			.addComponent(mining, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(19, 19, 19)));

		extract.getAccessibleContext().setAccessibleName("ExButton");
		load.getAccessibleContext().setAccessibleName("LoButton");
		mining.getAccessibleContext().setAccessibleName("MiButton");
		trans.getAccessibleContext().setAccessibleName("TransButton");

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void miningActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_miningActionPerformed
		Mine m = new Mine();
		m.setVisible(true);
	} //GEN-LAST:event_miningActionPerformed

	private void extractActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_extractActionPerformed
		extractPage ep = new extractPage();
		ep.setVisible(true);
	} //GEN-LAST:event_extractActionPerformed

	private void transActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_transActionPerformed
		transpage tp = new transpage();
		tp.setVisible(true);
	} //GEN-LAST:event_transActionPerformed

	private void loadActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_loadActionPerformed
		// TODO add your handling code here:
		load l = new load();
		l.setVisible(true);
	} //GEN-LAST:event_loadActionPerformed


	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home().setVisible(true);

			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton extract;
	private javax.swing.JButton load;
	private javax.swing.JButton mining;
	private javax.swing.JButton trans;
	// End of variables declaration//GEN-END:variables
}