/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PathologistRole;

import Business.BloodGroup.BloodGroup;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PathologistOrganization;
import Business.People.Donor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajaysureka
 */
public class ManagePathologistRequests extends javax.swing.JPanel {

    /**
     * Creates new form DonorListJPanel
     */
    private EcoSystem system;
    private UserAccount userAccount;
    private PathologistOrganization pathoorganization;
    private Enterprise enterprise;
    private Network network;
    private Enterprise enterprise1;
    private Organization organ;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public ManagePathologistRequests(EcoSystem system, UserAccount userAccount, PathologistOrganization pathoorganization, Enterprise enterprise, Network network) {
        initComponents();
        this.pathoorganization = pathoorganization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;

        tblOrganisationDonors.getTableHeader().setDefaultRenderer(new TableFormat());
        tblPathologistDonors.getTableHeader().setDefaultRenderer(new TableFormat());
        populateOrganizationDonorTable();
        populatePathologistDonorTable();
        populateBloodGroupComboBox();
        jLabel7.setVisible(false);
        
    }
    
    
    public void populateOrganizationDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrganisationDonors.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : pathoorganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSummary();
            row[2] = request.getDonor();
            row[3] = request.getDonor().getName();
            row[4] = request.getDonor().getContact();
            row[5] = request.getStatus();
            
            model.addRow(row);
        }
    }
    
  private void populateBloodGroupComboBox(){
           
           bloodGroupJComboBox.addItem("O+");
           bloodGroupJComboBox.addItem("AB+");
           bloodGroupJComboBox.addItem("O-");
           bloodGroupJComboBox.addItem("AB-");
           bloodGroupJComboBox.addItem("A+");
           bloodGroupJComboBox.addItem("B+");
           bloodGroupJComboBox.addItem("A-");
           bloodGroupJComboBox.addItem("B-");
           
        }
    public void populatePathologistDonorTable(){
        DefaultTableModel model = (DefaultTableModel)tblPathologistDonors.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getDonor();
            row[2] = request.getDonor().getName();
            //row[3] = request.getDonor().getContact();
            row[3] = request.getDonor().getBloodGroup();
            row[4] = request.getUserAccount().getUsername();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganisationDonors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignPathologist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPathologistDonors = new javax.swing.JTable();
        buttonAddPlasma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonPlasmaDonated = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonPlasmaDiscard = new javax.swing.JButton();
        checkBP = new javax.swing.JCheckBox();
        checkPulse = new javax.swing.JCheckBox();
        checkTest = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        bloodGroupJComboBox = new javax.swing.JComboBox();
        buttonProcessRequest = new javax.swing.JButton();
        textRequest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        checkPlasma = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrganisationDonors.setBackground(new java.awt.Color(0, 0, 0));
        tblOrganisationDonors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblOrganisationDonors.setForeground(new java.awt.Color(255, 255, 255));
        tblOrganisationDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Donor UID", "Donor Name", "Contact", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrganisationDonors.setGridColor(new java.awt.Color(0, 0, 0));
        tblOrganisationDonors.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblOrganisationDonors.setRowHeight(30);
        tblOrganisationDonors.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblOrganisationDonors);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 1330, 160));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Of Voluntary Plasma Donors");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 511, -1));

        btnAssignPathologist.setBackground(new java.awt.Color(31, 31, 31));
        btnAssignPathologist.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAssignPathologist.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignPathologist.setText("Assign To Me");
        btnAssignPathologist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignPathologist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPathologistActionPerformed(evt);
            }
        });
        add(btnAssignPathologist, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 160, 30));

        tblPathologistDonors.setBackground(new java.awt.Color(0, 0, 0));
        tblPathologistDonors.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPathologistDonors.setForeground(new java.awt.Color(255, 255, 255));
        tblPathologistDonors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Donor UID", "Donor Name", "Blood Group", "Assigned to", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPathologistDonors.setGridColor(new java.awt.Color(0, 0, 0));
        tblPathologistDonors.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPathologistDonors.setRowHeight(30);
        tblPathologistDonors.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblPathologistDonors);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 1330, 190));

        buttonAddPlasma.setBackground(new java.awt.Color(31, 31, 31));
        buttonAddPlasma.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonAddPlasma.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddPlasma.setText("Add Plasma to Bank");
        buttonAddPlasma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAddPlasma.setEnabled(false);
        buttonAddPlasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddPlasmaActionPerformed(evt);
            }
        });
        add(buttonAddPlasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 690, 210, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Blood Pressure Check");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pulse Check");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, 20));

        buttonPlasmaDonated.setBackground(new java.awt.Color(31, 31, 31));
        buttonPlasmaDonated.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonPlasmaDonated.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlasmaDonated.setText("Plasma donated by the donor");
        buttonPlasmaDonated.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlasmaDonated.setEnabled(false);
        buttonPlasmaDonated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlasmaDonatedActionPerformed(evt);
            }
        });
        add(buttonPlasmaDonated, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health check");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tests on Plasma for other infections");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 640, 360, -1));

        buttonPlasmaDiscard.setBackground(new java.awt.Color(31, 31, 31));
        buttonPlasmaDiscard.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonPlasmaDiscard.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlasmaDiscard.setText("Discard the donated plasma");
        buttonPlasmaDiscard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlasmaDiscard.setEnabled(false);
        buttonPlasmaDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlasmaDiscardActionPerformed(evt);
            }
        });
        add(buttonPlasmaDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 750, 290, 40));

        checkBP.setBackground(new java.awt.Color(0, 0, 0));
        checkBP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkBP.setForeground(new java.awt.Color(255, 255, 255));
        checkBP.setEnabled(false);
        checkBP.setOpaque(false);
        checkBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBPActionPerformed(evt);
            }
        });
        add(checkBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 20, -1));

        checkPulse.setBackground(new java.awt.Color(0, 0, 0));
        checkPulse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkPulse.setForeground(new java.awt.Color(255, 255, 255));
        checkPulse.setEnabled(false);
        checkPulse.setOpaque(false);
        add(checkPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, 20, 20));

        checkTest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkTest.setForeground(new java.awt.Color(255, 255, 255));
        checkTest.setEnabled(false);
        checkTest.setOpaque(false);
        checkTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTestActionPerformed(evt);
            }
        });
        add(checkTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 30, 30));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Manage Donor Request - Pathologist ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1602, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, -1));

        bloodGroupJComboBox.setBackground(new java.awt.Color(31, 31, 31));
        bloodGroupJComboBox.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodGroupJComboBox.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroupJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bloodGroupJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupJComboBoxActionPerformed(evt);
            }
        });
        add(bloodGroupJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 570, 110, 30));

        buttonProcessRequest.setBackground(new java.awt.Color(31, 31, 31));
        buttonProcessRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        buttonProcessRequest.setForeground(new java.awt.Color(255, 255, 255));
        buttonProcessRequest.setText("Process the request");
        buttonProcessRequest.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcessRequestActionPerformed(evt);
            }
        });
        add(buttonProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 210, 40));

        textRequest.setBackground(new java.awt.Color(208, 93, 2));
        textRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        textRequest.setForeground(new java.awt.Color(255, 255, 255));
        textRequest.setBorder(null);
        textRequest.setEnabled(false);
        add(textRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 200, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Blood Group");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, -1, 30));

        checkPlasma.setBackground(new java.awt.Color(0, 0, 0));
        checkPlasma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        checkPlasma.setForeground(new java.awt.Color(255, 255, 255));
        checkPlasma.setEnabled(false);
        checkPlasma.setOpaque(false);
        checkPlasma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPlasmaActionPerformed(evt);
            }
        });
        add(checkPlasma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 640, 20, 20));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Request Number:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, 30));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 80, 120, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loadingScreen.gif"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 520, 140));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 1320, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignPathologistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPathologistActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganisationDonors.getSelectedRow();
        
        if (selectedRow < 0){
         //JOptionPane.showMessageDialog(null, "Please select a row first!" );
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        
        else{
        WorkRequest request = (WorkRequest)tblOrganisationDonors.getValueAt(selectedRow, 0);
        //request.setReceiver(userAccount);
        
        if(request.getStatus().equals("Assigned to Hospital"))
        { 
        request.setStatus("Assigned to Pathologist" + userAccount.getUsername());
        request.setUserAccount(userAccount);
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        else{
            
        JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
        //JOptionPane.showMessageDialog(null, "Work Request is already assigned!" );
        }
        
        dB4OUtil.storeSystem(system);
        
        
        populateOrganizationDonorTable();
        populatePathologistDonorTable();
        }
    }//GEN-LAST:event_btnAssignPathologistActionPerformed

    private void buttonAddPlasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddPlasmaActionPerformed
        // TODO add your handling code here:
        // BloodGroup bloodGroup = new BloodGroup(txtBloodGroup.getText());
        
        if(!checkPlasma.isSelected()){
            checkPlasma.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkPlasma.setForeground(Color.red);
           // JOptionPane.showMessageDialog(null, "Kindly Test for other Infections!", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly do the<font color='red'> Test</font> for other infections!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
        else if(bloodGroupJComboBox.getSelectedItem().equals(null)){
            bloodGroupJComboBox.setBorder(BorderFactory.createLineBorder(Color.RED));
            bloodGroupJComboBox.setForeground(Color.red);
           // JOptionPane.showMessageDialog(null, "Kindly select a Blood Group!", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly select a<font color='red'> Blood Group!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
        }
        else{
        for(Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()){
              if(ent.getEnterpriseType().toString().equals("PlasmaBank")){
                  enterprise1 = ent;           
              }
        }  
        for (Organization org: enterprise1.getOrganizationDirectory().getOrganizationList()){
              System.out.println(org.getClass().getTypeParameters().toString()+" asit");
              if(org.getClass().getTypeParameters().toString().equals("Business.Organization.PlasmaBankOrganization")){
                 organ =org;
              }
        }
          
        try
          {organ.getBloodGroup().addBloodGroup(String.valueOf(bloodGroupJComboBox.getSelectedItem()));
          }
        catch( NullPointerException ex   )
          { System.out.println("");
          }
                    
        int selectedRow = tblPathologistDonors.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly select a<font color='red'> row!</font><I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
          
        WorkRequest request = (WorkRequest)tblPathologistDonors.getValueAt(selectedRow, 0);
                request.setStatus("Plasma added to Bank");
                
                dB4OUtil.storeSystem(system);
                
                populateOrganizationDonorTable();
                populatePathologistDonorTable();
            
                JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Plasma<font color='green'> added</font> to the bank!<I></h2></html>"));
           
                
                buttonAddPlasma.setEnabled(false);
                buttonPlasmaDiscard.setEnabled(false);        
         }
         dB4OUtil.storeSystem(system);
         
    }//GEN-LAST:event_buttonAddPlasmaActionPerformed

    private void checkTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTestActionPerformed

    private void checkBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBPActionPerformed

    private void buttonPlasmaDonatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlasmaDonatedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPathologistDonors.getSelectedRow();
        
        
        if (!checkBP.isSelected()) {
            checkBP.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkBP.setForeground(Color.red);
        }
         if (!checkTest.isSelected()) {
            checkTest.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkTest.setForeground(Color.red);
        }
         if (!checkPulse.isSelected()) {
            checkPulse.setBorder(BorderFactory.createLineBorder(Color.RED));
            checkPulse.setForeground(Color.red);
        }
        
        
        
        if (selectedRow < 0){
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a Request Number</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
           //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        
        else if( !checkBP.isSelected()  || !checkTest.isSelected()  ||  !checkPulse.isSelected())
        {   JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Kindly do the<font color='red'> Health Check of the Donor</font> before the<font color='green'> Plasma Donation</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
            //JOptionPane.showMessageDialog(null, "Kindly do the Heatlth Check of the Donor before the Donation!" , "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
        WorkRequest request1 = (WorkRequest)tblOrganisationDonors.getValueAt(selectedRow, 0);
                request1.setStatus("Plasma Donated");
                
                //request1.getDonor().setStatus("Plasma Donated");
                dB4OUtil.storeSystem(system);
                
                populateOrganizationDonorTable();
                populatePathologistDonorTable();
                
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='green'><I>Plasma Donated!</I></font></h2></html>"));
           
        for(Donor dnr: system.getDonorDirectory().getDonorList()){
            if(dnr.getDonorID().equals(request1.getDonor().getDonorID())){
                dnr.setLastDonationDate(new Date());
                dnr.setStatus("Plasma Donated");
                System.out.println(String.valueOf(dnr.getLastDonationDate())+" last donation date");
            }
        }
        buttonPlasmaDonated.setEnabled(false);
        bloodGroupJComboBox.setEnabled(true);
        buttonAddPlasma.setEnabled(true);
        buttonPlasmaDiscard.setEnabled(true);
        checkPlasma.setEnabled(true);
        
        jLabel7.setVisible(true);
        
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonPlasmaDonatedActionPerformed

    private void bloodGroupJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupJComboBoxActionPerformed

    private void buttonProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcessRequestActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblPathologistDonors.getSelectedRow();
        
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            
           // JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        else
        {               
        WorkRequest request = (WorkRequest)tblPathologistDonors.getValueAt(selectedRow, 0);
       
        if(request.getStatus().contains("Assigned to Pathologist")){
       textRequest.setText( String.valueOf(tblOrganisationDonors.getValueAt(selectedRow, 0)));  
       checkBP.setEnabled(true);
       checkTest.setEnabled(true);
       checkPulse.setEnabled(true);
       buttonPlasmaDonated.setEnabled(true);
        }
        else{
            
            JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Work Request is<font color='red'> already</font> in progress!</I></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
                
            //JOptionPane.showMessageDialog(null, "Request is already processed!" );
        }
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_buttonProcessRequestActionPerformed

    private void checkPlasmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPlasmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPlasmaActionPerformed

    private void buttonPlasmaDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlasmaDiscardActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPathologistDonors.getSelectedRow();
        if (selectedRow < 0){
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
            //JOptionPane.showMessageDialog(null, "Please select a row first!" );
            return;
        }
        else
        {  
        WorkRequest request = (WorkRequest)tblPathologistDonors.getValueAt(selectedRow, 0);
                request.setStatus("Plasma Discarded");
                populateOrganizationDonorTable();
                populatePathologistDonorTable();
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2><font color='red'><I>Plasma Discarded!</I></font></h2></html>"));  
        
        buttonAddPlasma.setEnabled(false);
        buttonPlasmaDiscard.setEnabled(false);
        
        dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_buttonPlasmaDiscardActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodGroupJComboBox;
    private javax.swing.JButton btnAssignPathologist;
    private javax.swing.JButton buttonAddPlasma;
    private javax.swing.JButton buttonPlasmaDiscard;
    private javax.swing.JButton buttonPlasmaDonated;
    private javax.swing.JButton buttonProcessRequest;
    private javax.swing.JCheckBox checkBP;
    private javax.swing.JCheckBox checkPlasma;
    private javax.swing.JCheckBox checkPulse;
    private javax.swing.JCheckBox checkTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblOrganisationDonors;
    private javax.swing.JTable tblPathologistDonors;
    private javax.swing.JTextField textRequest;
    // End of variables declaration//GEN-END:variables
}
