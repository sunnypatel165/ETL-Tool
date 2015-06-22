package etl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class transpage extends javax.swing.JFrame {


	public dataset ds[] = new dataset[10000];
	public int z;


	public transpage() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		key = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		merge = new javax.swing.JLabel();
		dedup = new javax.swing.JLabel();
		calc = new javax.swing.JLabel();
		form = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Transformation Process:");

		key.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		key.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
		jButton1.setText("Start");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		merge.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		merge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		dedup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		dedup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		calc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		calc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		form.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		form.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addGap(79, 79, 79)
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGroup(layout.createSequentialGroup()
			.addGap(135, 135, 135)
			.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
			.addGroup(layout.createSequentialGroup()
			.addGap(108, 108, 108)
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(merge, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(dedup, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
			.addContainerGap(92, Short.MAX_VALUE)));
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			.addContainerGap()
			.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(merge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(18, 18, 18)
			.addComponent(dedup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
			.addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
			.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
			.addGap(21, 21, 21)));

		pack();
	} // </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		for (int i = 0; i < 10000; i++)
		ds[i] = new dataset();
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\extracted.txt"));
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

			for (int i = 0; i < z; i++) {
				ds[i].key = i * 1000;
			}
			key.setText("1---\"Key Reconstruction\" : variable-KEY");

			for (int i = 0; i < z; i++)
			System.out.println(ds[i].name + "," + ds[i].g + "," + ds[i].age + "," + ds[i].usage + "," + ds[i].op1 + "," + ds[i].op2 + "," + ds[i].lname);

			merge.setText("2---\"Merging\" : First name and last name");

			for (int i = 0; i < z; i++) {
				if (ds[i].lname.compareTo("-") != 0) ds[i].fullname = ds[i].name + " " + ds[i].lname;
				else ds[i].fullname = ds[i].name;
			}
			dedup.setText("3---\"Deduplication\"");
			for (int i = 0; i < z; i++) {
				for (int j = i + 1; j < z; j++) {
					if (ds[i].fullname.compareTo(ds[j].fullname) == 0 && ds[i].usage == ds[j].usage) {
						ds[j].fullname = "duplicate";
						z--;
					}
				}
			}

			calc.setText("4---\"Calculated values\" : Minutes to Hours");
			for (int i = 0; i < z; i++) {
				ds[i].hrs = ds[i].usage / 60;
			}

			form.setText("5---\"Format Revision\" Char to String");

			for (int i = 0; i < z; i++)
			if (ds[i].g == 'M') ds[i].gen = "MALE";
			else ds[i].gen = "FEMALE";
			PrintWriter op = new PrintWriter("C:\\Users\\Sunny Patel\\Documents\\NetBeansProjects\\ETL\\src\\etl\\transformed.txt", "UTF-8");
			for (int i = 0; i < z; i++)
			op.println(ds[i].fullname + "," + ds[i].gen + "," + ds[i].age + "," + ds[i].usage + "," + ds[i].op1 + "," + ds[i].op2 + "," + ds[i].hrs);
			op.close();
		} catch (Exception e) {}

	}//GEN-LAST:event_jButton1ActionPerformed
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new transpage().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel calc;
	private javax.swing.JLabel dedup;
	private javax.swing.JLabel form;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel key;
	private javax.swing.JLabel merge;
	// End of variables declaration//GEN-END:variables
}