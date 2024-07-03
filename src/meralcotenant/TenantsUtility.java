package meralcotenant;

import java.awt.Color;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public final class TenantsUtility extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("0.00");

    public TenantsUtility() {
        new sqlConnect();
        new tenantUtilityTbl();
        initComponents();
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalMeralco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kwhField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalNawasa = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tenant1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tenant2 = new javax.swing.JLabel();
        tenant3 = new javax.swing.JLabel();
        tenant4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pr1 = new javax.swing.JLabel();
        pr2 = new javax.swing.JLabel();
        pr3 = new javax.swing.JLabel();
        pr4 = new javax.swing.JLabel();
        cr1 = new javax.swing.JTextField();
        cr2 = new javax.swing.JTextField();
        cr3 = new javax.swing.JTextField();
        cr4 = new javax.swing.JTextField();
        met3 = new javax.swing.JLabel();
        met4 = new javax.swing.JLabel();
        met1 = new javax.swing.JLabel();
        met2 = new javax.swing.JLabel();
        ad3 = new javax.swing.JLabel();
        ad4 = new javax.swing.JLabel();
        ad1 = new javax.swing.JLabel();
        ad2 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(610, 250));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 100));

        header.setBackground(new java.awt.Color(102, 102, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TENANTS' UTILITY CALCULATOR");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("MERALCO WAYBILL");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("KWH: ");

        totalMeralco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalMeralco.setForeground(java.awt.Color.gray);
        totalMeralco.setText("Meralco Total Bill");
        totalMeralco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        totalMeralco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalMeralcoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalMeralcoFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("TOTAL:");

        kwhField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kwhField.setForeground(java.awt.Color.gray);
        kwhField.setText("Meralco KWH");
        kwhField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        kwhField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kwhFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kwhFieldFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("NAWASA WAYBILL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL:");

        totalNawasa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalNawasa.setForeground(java.awt.Color.gray);
        totalNawasa.setText("Nawasa Total");
        totalNawasa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        totalNawasa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalNawasaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalNawasaFocusLost(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kwhField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalMeralco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalNawasa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kwhField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalMeralco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalNawasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(41, 41, 41)
                        .addComponent(nextButton)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tenant1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenant1.setText("PRECY");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("TENANT");

        tenant2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenant2.setText("MAIK");

        tenant3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenant3.setText("REMY");

        tenant4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenant4.setText("THIN");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("PREVIOUS READING");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("CURRENT READING");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("METER");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("AMOUNT DUE");

        pr1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pr2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pr3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pr4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cr1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cr1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cr1KeyPressed(evt);
            }
        });

        cr2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cr2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cr2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cr1KeyPressed(evt);
            }
        });

        cr3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cr3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cr3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cr1KeyPressed(evt);
            }
        });

        cr4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cr4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cr4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cr1KeyPressed(evt);
            }
        });

        met3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        met4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        met1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        met2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ad3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ad4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        ad2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        calculateButton.setBackground(new java.awt.Color(102, 102, 255));
        calculateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        calculateButton.setForeground(new java.awt.Color(255, 255, 255));
        calculateButton.setText("CALCULATE");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tenant4)
                    .addComponent(tenant3)
                    .addComponent(tenant2)
                    .addComponent(tenant1)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pr3)
                    .addComponent(pr4)
                    .addComponent(jLabel12)
                    .addComponent(pr1)
                    .addComponent(pr2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cr1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(met3)
                    .addComponent(met4)
                    .addComponent(met1)
                    .addComponent(met2)
                    .addComponent(jLabel14))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ad3)
                    .addComponent(ad4)
                    .addComponent(ad1)
                    .addComponent(ad2)
                    .addComponent(jLabel15))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cr1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenant1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pr1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cr2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenant2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pr2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pr3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cr3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenant3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pr4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cr4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenant4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(met4)
                            .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(met2)
                            .addGap(180, 180, 180))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(met3)
                            .addGap(135, 135, 135))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(met1)
                            .addGap(225, 225, 225)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ad1)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ad2)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(ad3)
                                .addGap(62, 62, 62))
                            .addComponent(ad4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(calculateButton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            if (kwhField.getText().isEmpty() || kwhField.getText().equals("Meralco KWH")) {
                JOptionPane.showMessageDialog(rootPane, "Fill-up KWH Meralco bill");
            } else if (totalMeralco.getText().isEmpty() || totalMeralco.getText().equals("Meralco Total Bill")) {
                JOptionPane.showMessageDialog(rootPane, "Fill-up Total Meralco bill");
            } else if (totalNawasa.getText().isEmpty() || totalNawasa.getText().equals("Nawasa Total")) {
                JOptionPane.showMessageDialog(rootPane, "Fill-up Total Nawasa bill");
            } else {
                int ask = JOptionPane.showConfirmDialog(rootPane, "Everything is correct?");
                if (ask == JOptionPane.YES_OPTION) {
                    new retrievePreviousReading();
                    jPanel2.setVisible(true);
                    nextButton.setEnabled(false);
                    totalNawasa.setEnabled(false);
                    totalMeralco.setEnabled(false);
                    kwhField.setEnabled(false);
                    new retrievePreviousReading();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Numbers only!");
        }

    }//GEN-LAST:event_nextButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        calculate();
        calculateButton.setBackground(Color.decode("#00B10B"));
    }//GEN-LAST:event_calculateButtonActionPerformed

    public static void getNewPreviousReading(int newReading1, int newReading2, int newReading3, int newReading4) {
        pr1.setText(newReading1 + "");
        pr2.setText(newReading2 + "");
        pr3.setText(newReading3 + "");
        pr4.setText(newReading4 + "");
    }

    public void saveCurrentReading() {
        insertData insertData = new insertData(
                tenant1.getText(),
                tenant2.getText(),
                tenant3.getText(),
                tenant4.getText(),
                Integer.parseInt(cr1.getText()),
                Integer.parseInt(cr2.getText()),
                Integer.parseInt(cr3.getText()),
                Integer.parseInt(cr4.getText())
        );
    }

    public void calculate() {
        try {
            df.setRoundingMode(RoundingMode.CEILING);
            if (cr1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, tenant1.getText() + "'s Current Reading is blank.");
            } else if (cr2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, tenant2.getText() + "'s Current Reading is blank.");
            } else if (cr3.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, tenant3.getText() + "'s Current Reading is blank.");
            } else if (cr4.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, tenant4.getText() + "'s Current Reading is blank.");
            } else {

                double nawasaShare = Double.parseDouble(totalNawasa.getText()) / 4;
                int kwh = Integer.parseInt(kwhField.getText());
                double totalM = Double.parseDouble(df.format(Double.parseDouble(totalMeralco.getText())));

                String meralcoReading[][] = {
                    {pr1.getText(), pr2.getText(), pr3.getText(), pr4.getText()},
                    {cr1.getText(), cr2.getText(), cr3.getText(), cr4.getText()}
                };
                double meralcoRate = totalM / kwh;

                int meter1 = Integer.valueOf(meralcoReading[1][0]) - Integer.valueOf(meralcoReading[0][0]);
                int meter2 = Integer.valueOf(meralcoReading[1][1]) - Integer.valueOf(meralcoReading[0][1]);
                int meter3 = Integer.valueOf(meralcoReading[1][2]) - Integer.valueOf(meralcoReading[0][2]);
                int meter4 = Integer.valueOf(meralcoReading[1][3]) - Integer.valueOf(meralcoReading[0][3]);
                int less = kwh - (meter1 + meter2 + meter3 + meter4);
                meter2 = meter2 + less;

                met1.setText(meter1 + "");
                met2.setText(meter2 + "");
                met3.setText(meter3 + "");
                met4.setText(meter4 + "");
                ad1.setText(df.format((meter1 * meralcoRate) + nawasaShare) + "");
                ad2.setText(df.format((meter2 * meralcoRate) + nawasaShare) + "");
                ad3.setText(df.format((meter3 * meralcoRate) + nawasaShare) + "");
                ad4.setText(df.format((meter4 * meralcoRate) + nawasaShare) + "");

                if (calculateButton.getText().equals("SAVE CURRENT READING")) {
                    int ask = JOptionPane.showConfirmDialog(rootPane, "Save current reading?");
                    if (ask == JOptionPane.YES_OPTION) {
                        saveCurrentReading();
                    }
                } else {
                    calculateButton.setText("SAVE CURRENT READING");
                }

            }

        } catch (NumberFormatException e) {
            String errorMessage = """
                                  FILL UP "CURRENT READING" SECTION
                                  AND MAKE SURE ONLY NUMBERS ARE PRESENT!!""";
            JOptionPane.showMessageDialog(rootPane, errorMessage);
        }
    }

//DESIGNS
    private void kwhFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kwhFieldFocusGained
        if (kwhField.getText().equals("Meralco KWH")) {
            kwhField.setText("");
            kwhField.setForeground(Color.black);

        }
    }//GEN-LAST:event_kwhFieldFocusGained

    private void kwhFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kwhFieldFocusLost
        if (kwhField.getText().equals("")) {
            kwhField.setForeground(Color.gray);
            kwhField.setText("Meralco KWH");
        }
    }//GEN-LAST:event_kwhFieldFocusLost

    private void totalMeralcoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalMeralcoFocusGained
        if (totalMeralco.getText().equals("Meralco Total Bill")) {
            totalMeralco.setText("");
            totalMeralco.setForeground(Color.black);
        }
    }//GEN-LAST:event_totalMeralcoFocusGained

    private void totalMeralcoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalMeralcoFocusLost
        if (totalMeralco.getText().equals("")) {
            totalMeralco.setText("Meralco Total Bill");
            totalMeralco.setForeground(Color.gray);
        }

    }//GEN-LAST:event_totalMeralcoFocusLost

    private void totalNawasaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalNawasaFocusGained
        if (totalNawasa.getText().equals("Nawasa Total")) {
            totalNawasa.setText("");
            totalNawasa.setForeground(Color.black);
        }

    }//GEN-LAST:event_totalNawasaFocusGained

    private void totalNawasaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalNawasaFocusLost
        if (totalNawasa.getText().equals("")) {
            totalNawasa.setText("Nawasa Total");
            totalNawasa.setForeground(Color.gray);
        }
    }//GEN-LAST:event_totalNawasaFocusLost

    private void cr1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cr1KeyPressed
        // TODO add your handling code here:
        calculateButton.setText("CALCULATE");
        calculateButton.setBackground(Color.decode("#6666FF"));
    }//GEN-LAST:event_cr1KeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TenantsUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantsUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantsUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantsUtility.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TenantsUtility().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad1;
    private javax.swing.JLabel ad2;
    private javax.swing.JLabel ad3;
    private javax.swing.JLabel ad4;
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField cr1;
    private javax.swing.JTextField cr2;
    private javax.swing.JTextField cr3;
    private javax.swing.JTextField cr4;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kwhField;
    private javax.swing.JLabel met1;
    private javax.swing.JLabel met2;
    private javax.swing.JLabel met3;
    private javax.swing.JLabel met4;
    private javax.swing.JButton nextButton;
    private static javax.swing.JLabel pr1;
    private static javax.swing.JLabel pr2;
    private static javax.swing.JLabel pr3;
    private static javax.swing.JLabel pr4;
    private javax.swing.JLabel tenant1;
    private javax.swing.JLabel tenant2;
    private javax.swing.JLabel tenant3;
    private javax.swing.JLabel tenant4;
    private javax.swing.JTextField totalMeralco;
    private javax.swing.JTextField totalNawasa;
    // End of variables declaration//GEN-END:variables
}
