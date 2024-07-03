
package meralcotenant;

public class CalculationForm extends javax.swing.JFrame {

    public CalculationForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        tenant5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tenant4 = new javax.swing.JLabel();
        tenant3 = new javax.swing.JLabel();
        tenant2 = new javax.swing.JLabel();
        tenant1 = new javax.swing.JLabel();
        tenant6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(102, 102, 255));

        tenant5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tenant5.setForeground(new java.awt.Color(255, 255, 255));
        tenant5.setText("CALCULATION FORM");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(tenant5)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(tenant5)
                .addGap(24, 24, 24))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tenant4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tenant4.setForeground(new java.awt.Color(51, 51, 51));
        tenant4.setText("Tenant 4");

        tenant3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tenant3.setForeground(new java.awt.Color(51, 51, 51));
        tenant3.setText("Tenant 3");

        tenant2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tenant2.setForeground(new java.awt.Color(51, 51, 51));
        tenant2.setText("Tenant 2");

        tenant1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tenant1.setForeground(new java.awt.Color(51, 51, 51));
        tenant1.setText("Tenant 1");

        tenant6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tenant6.setForeground(new java.awt.Color(51, 51, 51));
        tenant6.setText("Tenant 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tenant1)
                        .addGap(45, 45, 45)
                        .addComponent(tenant6))
                    .addComponent(tenant3)
                    .addComponent(tenant4)
                    .addComponent(tenant2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenant1)
                    .addComponent(tenant6))
                .addGap(45, 45, 45)
                .addComponent(tenant2)
                .addGap(45, 45, 45)
                .addComponent(tenant3)
                .addGap(45, 45, 45)
                .addComponent(tenant4)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tenant1;
    private javax.swing.JLabel tenant2;
    private javax.swing.JLabel tenant3;
    private javax.swing.JLabel tenant4;
    private javax.swing.JLabel tenant5;
    private javax.swing.JLabel tenant6;
    // End of variables declaration//GEN-END:variables
}
