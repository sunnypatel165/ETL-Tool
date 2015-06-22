package etl;

public class Mine extends javax.swing.JFrame {

	public Mine() {
		initComponents();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        Bayes = new javax.swing.JButton();
        KNN = new javax.swing.JButton();
        Kmenas = new javax.swing.JButton();

        jButton4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton4.setText("K means");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bayes.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        Bayes.setText("Bayes");
        Bayes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BayesActionPerformed(evt);
            }
        });

        KNN.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        KNN.setText("KNN");
        KNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KNNActionPerformed(evt);
            }
        });

        Kmenas.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        Kmenas.setText("K means");
        Kmenas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KmenasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Kmenas, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Bayes, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(KNN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Bayes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(KNN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Kmenas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        Kmenas.getAccessibleContext().setAccessibleName("Kmeans");

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void KmenasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KmenasActionPerformed
//yet to add
	}//GEN-LAST:event_KmenasActionPerformed

	private void BayesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BayesActionPerformed

		BayesPage bp = new BayesPage();
		bp.setVisible(true);
	}//GEN-LAST:event_BayesActionPerformed

	private void KNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KNNActionPerformed

		KNNpage kp = new KNNpage();
		kp.setVisible(true);

	}//GEN-LAST:event_KNNActionPerformed

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Mine().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bayes;
    private javax.swing.JButton KNN;
    private javax.swing.JButton Kmenas;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}