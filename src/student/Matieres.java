package student;

import db.userConnection;
import static java.lang.Float.parseFloat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Matieres extends javax.swing.JFrame {
    private static JFrame homeFrame;
    DefaultTableModel tableMat = new DefaultTableModel();
    Object[] rowDataMatiere;
    ResultSet matiereResultSet = null;
    int selectedRowTableMatieres;

    public Matieres(JFrame frame) {
        this.homeFrame = frame;
        initComponents();
        tableMat = (DefaultTableModel) tableMatieres.getModel();
        getMatieresFromDB();
    }
    
    public void getMatieresFromDB(){
        userConnection.connect();
        String matiereVerificationQuery = "SELECT * FROM matieres";
        matiereResultSet = userConnection.selectFromDB(matiereVerificationQuery);
        String mat, prf;
        float cf;
        try{
            while(matiereResultSet.next()){
                mat = matiereResultSet.getString("nom_matiere");
                prf = matiereResultSet.getString("professeur");
                cf = parseFloat(matiereResultSet.getString("coefficient"));
                tableMat = (DefaultTableModel) tableMatieres.getModel();
                rowDataMatiere = new Object[]{mat, cf, prf};
                tableMat.addRow(rowDataMatiere);
            }
        } catch(SQLException sqlex){
            System.out.println("erreur de base de donnees!");
        }
        userConnection.closeConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomMatiere = new javax.swing.JTextField();
        coefMatiere = new javax.swing.JTextField();
        nomProfMatiere = new javax.swing.JTextField();
        ajouterMatiere = new javax.swing.JButton();
        fermerMatieres = new javax.swing.JButton();
        supprimerMatiere = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatieres = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajouter des matieres");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                formHierarchyChanged(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nom matiere:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(0, 102, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nom du Professeur:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Coefficient:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nomMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nomMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomMatiereActionPerformed(evt);
            }
        });

        coefMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        coefMatiere.setToolTipText("");

        nomProfMatiere.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        ajouterMatiere.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ajouterMatiere.setText("Ajouter");
        ajouterMatiere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajouterMatiereMouseClicked(evt);
            }
        });
        ajouterMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterMatiereActionPerformed(evt);
            }
        });

        fermerMatieres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fermerMatieres.setText("Fermer");
        fermerMatieres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerMatieresMouseClicked(evt);
            }
        });

        supprimerMatiere.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        supprimerMatiere.setText("Supprimer");
        supprimerMatiere.setEnabled(false);
        supprimerMatiere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supprimerMatiereMouseClicked(evt);
            }
        });
        supprimerMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerMatiereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(coefMatiere, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                .addComponent(nomMatiere, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(nomProfMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ajouterMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimerMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fermerMatieres, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coefMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomProfMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterMatiere)
                    .addComponent(supprimerMatiere)
                    .addComponent(fermerMatieres))
                .addGap(18, 18, 18))
        );

        tableMatieres.setBackground(new java.awt.Color(204, 204, 204));
        tableMatieres.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tableMatieres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matiere", "Coefficient", "Professeur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMatieres.setFillsViewportHeight(true);
        tableMatieres.setGridColor(new java.awt.Color(0, 0, 0));
        tableMatieres.setSelectionBackground(new java.awt.Color(0, 51, 102));
        tableMatieres.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableMatieres.setShowGrid(true);
        tableMatieres.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableMatieresFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableMatieresFocusLost(evt);
            }
        });
        tableMatieres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMatieresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMatieres);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomMatiereActionPerformed

    private void ajouterMatiereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMatiereMouseClicked
        String matiere = null;
        String prof = null;
        float coef = 0;
        try{
            matiere = nomMatiere.getText();
            prof = nomProfMatiere.getText();
            coef = parseFloat(coefMatiere.getText());
        } catch (Exception exc){
            System.out.println("Error: " + exc.getMessage());
            System.out.println("Cause: " + exc.getCause());
            System.out.println("----------------------------------");
        }
        
        try{
            boolean matiereFound = false;
            for(int i=0; i<tableMat.getRowCount(); i++){
                if(matiere.equals(tableMat.getValueAt(i, 0).toString())){
                    matiereFound = true;
                }
            }
            if (!matiereFound && !matiere.equals("") && coef != 0 && !prof.equals("")){
                rowDataMatiere = new Object[]{matiere, coef, prof};
                tableMat.addRow(rowDataMatiere);
                userConnection.connect();
                String query = "INSERT INTO matieres (nom_matiere, coefficient, professeur) VALUES ('" + matiere + "', '" + coef + "', '" + prof + "')";
                userConnection.insertIntoDB(query);
                userConnection.closeConnection();
                Home.comboBoxMatieres.addItem(matiere);
            }
            else if (coef == 0 || matiere.equals("") || prof.equals(""))
                JOptionPane.showMessageDialog(this, "Champ(s) vides ou invalides!", "Avertissement", JOptionPane.WARNING_MESSAGE);
            else if (matiereFound)
                JOptionPane.showMessageDialog(this, "Matiere deja ajoutee!", "Avertissement", JOptionPane.WARNING_MESSAGE);
        } 
        catch(Exception ex){
                System.out.println("Error: " + ex.getMessage());
                System.out.println("Cause: " + ex.getCause());
            }
        
    }//GEN-LAST:event_ajouterMatiereMouseClicked

    private void ajouterMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMatiereActionPerformed

    private void supprimerMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerMatiereActionPerformed

    private void tableMatieresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMatieresMouseClicked
        
    }//GEN-LAST:event_tableMatieresMouseClicked

    private void tableMatieresFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableMatieresFocusGained
        tableMatieres.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            // Enable the delete button only when a row is selected
            supprimerMatiere.setEnabled(tableMatieres.getSelectedRow() != -1);
        }
    });
        selectedRowTableMatieres = tableMatieres.getSelectedRow();
         
    }//GEN-LAST:event_tableMatieresFocusGained

    private void supprimerMatiereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMatiereMouseClicked
        if (selectedRowTableMatieres != -1) {
            Vector rowData = (Vector) tableMat.getDataVector().elementAt(selectedRowTableMatieres);
            String matiere = rowData.get(0).toString();
            tableMat.removeRow(selectedRowTableMatieres);
            try{
                userConnection.connect();
                String query = "delete from matieres where nom_matiere = '" + matiere + "'";
                userConnection.deletefromDB(query);
                Home.comboBoxMatieres.removeItem(matiere);
                selectedRowTableMatieres = -1;
                userConnection.closeConnection();
            } catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("Cause: " + e.getCause());
            }
        }
    }//GEN-LAST:event_supprimerMatiereMouseClicked

    private void tableMatieresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableMatieresFocusLost
        tableMatieres.clearSelection();
    }//GEN-LAST:event_tableMatieresFocusLost

    private void fermerMatieresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMatieresMouseClicked
        homeFrame.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_fermerMatieresMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        homeFrame.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void formHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formHierarchyChanged

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matieres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matieres(homeFrame).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterMatiere;
    private javax.swing.JTextField coefMatiere;
    private javax.swing.JButton fermerMatieres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomMatiere;
    private javax.swing.JTextField nomProfMatiere;
    private javax.swing.JButton supprimerMatiere;
    javax.swing.JTable tableMatieres;
    // End of variables declaration//GEN-END:variables
}
