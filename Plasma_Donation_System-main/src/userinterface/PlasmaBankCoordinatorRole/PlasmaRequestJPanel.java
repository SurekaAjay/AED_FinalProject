/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PlasmaBankCoordinatorRole;

import Business.BloodGroup.BloodGroup;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PlasmaBankOrganization;
import Business.Organization.SystemCoordinatorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajaysureka
 */
public class PlasmaRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlasmaCountJPanel
     */
    private UserAccount userAccount;
    private PlasmaBankOrganization plasmaorganization;
    private Enterprise enterprise;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private EcoSystem system;
    
    public PlasmaRequestJPanel(UserAccount userAccount, PlasmaBankOrganization plasmaorganization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.plasmaorganization = plasmaorganization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
         
        jPanel1.setVisible(false);
        tblPlasmaCoordinator.getTableHeader().setDefaultRenderer(new TableFormat());
        populateTextFields();
        populatePlasmaCoordinatorTable();
    }

   

    public void populateTextFields(){
        
        Enterprise ent1 = null;
        Organization org1 = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("PlasmaBank")) {
            
                ent1 = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        
       
        for (Organization organization : ent1.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof PlasmaBankOrganization) {
                org1 = organization;
                break;
            }
        }
        
        if (org1 != null) {
           
            System.out.println(org1.getName()+"Orgcheck");
            
            //user.addUserRequest(request);
            
            
            
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        txtAnegative.setText(String.valueOf(org1.getBloodGroup().getaNegative()));
        txtApositive.setText(String.valueOf(org1.getBloodGroup().getaPositive()));
        txtABpositive.setText(String.valueOf(org1.getBloodGroup().getAbPositive()));
        txtABnegative.setText(String.valueOf(org1.getBloodGroup().getAbNegative()));
        txtOpositive.setText(String.valueOf(org1.getBloodGroup().getoPositive()));
        txtOnegative.setText(String.valueOf(org1.getBloodGroup().getoNegative()));
        txtBpositive.setText(String.valueOf(org1.getBloodGroup().getbPositive()));
        txtBnegative.setText(String.valueOf(org1.getBloodGroup().getbNegative()));
        
    }
    
    public void populatePlasmaCoordinatorTable(){
        DefaultTableModel model = (DefaultTableModel)tblPlasmaCoordinator.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getPatient();
            row[2] = request.getPatient().getName();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getPatient().getBloodGroup();
            row[5] = request.getStatus();
             
            model.addRow(row);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApositive = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtAnegative = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOpositive = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBnegative = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBpositive = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtOnegative = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtABpositive = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtABnegative = new javax.swing.JTextField();
        btnOnHold = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlasmaCoordinator = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 93, 2));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List of Plasma Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 247, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood Group Category");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Available Blood Groups");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("A+");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 30, 20));

        txtApositive.setBackground(new java.awt.Color(0, 0, 0));
        txtApositive.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtApositive.setForeground(new java.awt.Color(255, 255, 255));
        txtApositive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApositiveActionPerformed(evt);
            }
        });
        add(txtApositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 190, -1));

        btnApprove.setBackground(new java.awt.Color(31, 31, 31));
        btnApprove.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve Request");
        btnApprove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, 210, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("A-");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, -1, -1));

        txtAnegative.setBackground(new java.awt.Color(0, 0, 0));
        txtAnegative.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtAnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtAnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 190, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("O+");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        txtOpositive.setBackground(new java.awt.Color(0, 0, 0));
        txtOpositive.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtOpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtOpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("O-");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        txtBnegative.setBackground(new java.awt.Color(0, 0, 0));
        txtBnegative.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtBnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtBnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 190, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("B+");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 30, 30));

        txtBpositive.setBackground(new java.awt.Color(0, 0, 0));
        txtBpositive.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtBpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtBpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 190, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("B-");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        txtOnegative.setBackground(new java.awt.Color(0, 0, 0));
        txtOnegative.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtOnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtOnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, 190, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AB+");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        txtABpositive.setBackground(new java.awt.Color(0, 0, 0));
        txtABpositive.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtABpositive.setForeground(new java.awt.Color(255, 255, 255));
        add(txtABpositive, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 550, 190, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("AB-");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));

        txtABnegative.setBackground(new java.awt.Color(0, 0, 0));
        txtABnegative.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtABnegative.setForeground(new java.awt.Color(255, 255, 255));
        add(txtABnegative, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 540, 190, -1));

        btnOnHold.setBackground(new java.awt.Color(31, 31, 31));
        btnOnHold.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnOnHold.setForeground(new java.awt.Color(255, 255, 255));
        btnOnHold.setText("Hold Request");
        btnOnHold.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOnHold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnHoldActionPerformed(evt);
            }
        });
        add(btnOnHold, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 190, 40));

        tblPlasmaCoordinator.setBackground(new java.awt.Color(0, 0, 0));
        tblPlasmaCoordinator.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPlasmaCoordinator.setForeground(new java.awt.Color(255, 255, 255));
        tblPlasmaCoordinator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Patient ID", "Patient Name", "Email ID", "Blood Group", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlasmaCoordinator.setGridColor(new java.awt.Color(0, 0, 0));
        tblPlasmaCoordinator.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPlasmaCoordinator.setRowHeight(30);
        tblPlasmaCoordinator.setShowVerticalLines(false);
        tblPlasmaCoordinator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlasmaCoordinatorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlasmaCoordinator);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 1270, 200));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Plasma Bank");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Images/blood-bank.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 130, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Images/emergency.gif"))); // NOI18N
        jLabel6.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 650, 610, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void txtApositiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApositiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApositiveActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPlasmaCoordinator.getSelectedRow();
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        else{
            WorkRequest request = (WorkRequest)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")
                || request.getStatus().equals("On Hold Due to Plasma unavailability")){
                request.setStatus("PlasmaBank Approved. Passing to System Coordinator");
        
                dB4OUtil.storeSystem(system);
                populatePlasmaCoordinatorTable();
        
                Enterprise ent = null;
                Organization org = null;
        
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.getEnterpriseType().toString().equals("Hospital")) {
                            ent = enterprise;
                            break;
                    }
                }
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if(organization instanceof SystemCoordinatorOrganization) {
                        org = organization;
                        break;
                    }
                }
        
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    org.getBloodGroup().subtractBloodGroup(request.getPatient().getBloodGroup());
                    populateTextFields();
                }
                else {
                    JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                // JOptionPane.showMessageDialog(null, "Work Request is already in progress!" );
                 JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            }
        }
            
     dB4OUtil.storeSystem(system);
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnOnHoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnHoldActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblPlasmaCoordinator.getSelectedRow();
        
        if (selectedRow < 0){
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            
            return;
        }
        else{
            WorkRequest request = (WorkRequest)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")){
                request.setStatus("On Hold Due to Plasma unavailability");
                
                dB4OUtil.storeSystem(system);
                populatePlasmaCoordinatorTable();   
            }
            else{
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
              //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }
        
    }//GEN-LAST:event_btnOnHoldActionPerformed

    private void tblPlasmaCoordinatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlasmaCoordinatorMouseClicked
        // TODO add your handling code here:
        
        int selectedRow = tblPlasmaCoordinator.getSelectedRow();
       // jPanel1.setVisible(true);
        if (selectedRow < 0){   
            //JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table!</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
             return;
        }
         else{
            jPanel1.setVisible(true);
            WorkRequest request = (WorkRequest)tblPlasmaCoordinator.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Legally Approved. Passing to PlasmaBank")){
                //request.setStatus("On Hold Due to Plasma unavailability");
                if(request.getPatient().isEmergencyStatus() == true){
                jPanel1.setVisible(true);
                }
                //dB4OUtil.storeSystem(system);
                //populatePlasmaCoordinatorTable();   
            }
            else{
              //JOptionPane.showMessageDialog(null, new JLabel("<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                 jPanel1.setVisible(false);
              //  JOptionPane.showMessageDialog(null, "Work Request is already in progress!" ); 
            }
        }
        
        
        
    }//GEN-LAST:event_tblPlasmaCoordinatorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnOnHold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPlasmaCoordinator;
    private javax.swing.JTextField txtABnegative;
    private javax.swing.JTextField txtABpositive;
    private javax.swing.JTextField txtAnegative;
    private javax.swing.JTextField txtApositive;
    private javax.swing.JTextField txtBnegative;
    private javax.swing.JTextField txtBpositive;
    private javax.swing.JTextField txtOnegative;
    private javax.swing.JTextField txtOpositive;
    // End of variables declaration//GEN-END:variables
}
