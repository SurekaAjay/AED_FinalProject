/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CovidCentreCoordinatorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LegalOfficerOrganization;
import Business.Organization.Organization;
import Business.People.Patient;
import Business.People.PatientDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SystemCoordinatorTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import HomePages.TableFormat;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ajaysureka
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
     //private JPanel userProcessContainerJPanel;
     //private PatientDirectory patientDirectory;
    private  EcoSystem system;
     private UserAccount userAccount;
     private Network network;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    CreatePatientJPanel(EcoSystem system, UserAccount userAccount, Network network) {
        initComponents();
        //this.patientDirectory = patientDirectory;
       
        this.system = system;
        this.userAccount = userAccount;
        this.network = network;
        populateTable();
        populatePatientTable();
        
        tblPatient.getTableHeader().setDefaultRenderer(new TableFormat());
        tblRequest.getTableHeader().setDefaultRenderer(new TableFormat());
        
    }
    
    private void populatePatientTable(){
    DefaultTableModel dtmA = (DefaultTableModel)tblPatient.getModel();
      dtmA.setRowCount(0);
      Object row[] = new Object[5];
       String line = "";  
       String splitBy = ",";  
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("PatientsRecord.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {
            String[] csv = line.split(splitBy);    // use comma as separator 
            row[0]= csv[0];
            row[1]= csv[1];
            row[2]= csv[2];
            row[3]= csv[3];
            row[4]= csv[4];
            
            dtmA.addRow(row);
        }   }
            catch (IOException e)   
            {  e.printStackTrace(); }   
    
    
    }
    
     private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequest.getModel();
        
        dtm.setRowCount(0);
        

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            
            row[1] = request.getSummary();
            row[2] = request.getPatient();
            row[3] = request.getPatient().getEmailID();
            row[4] = request.getStatus();
            row[5] = request.getActionDate();
            dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uidTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        btnCreateReceiver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        chkEmergency = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bloodGroupTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(208, 93, 2));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        uidTextField.setBackground(new java.awt.Color(0, 0, 0));
        uidTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        uidTextField.setForeground(new java.awt.Color(255, 255, 255));
        uidTextField.setEnabled(false);
        add(uidTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 212, -1));

        emailTextField.setBackground(new java.awt.Color(0, 0, 0));
        emailTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setEnabled(false);
        add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 212, -1));

        btnCreateReceiver.setBackground(new java.awt.Color(31, 31, 31));
        btnCreateReceiver.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCreateReceiver.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateReceiver.setText("Create Receiver/Patient");
        btnCreateReceiver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateReceiver.setEnabled(false);
        btnCreateReceiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReceiverActionPerformed(evt);
            }
        });
        add(btnCreateReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 250, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Create Reciever's Profile");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        tblPatient.setBackground(new java.awt.Color(0, 0, 0));
        tblPatient.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblPatient.setForeground(new java.awt.Color(255, 255, 255));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Email", "Covid Diagnosed Date", "Blood Group"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.setFocusable(false);
        tblPatient.setGridColor(new java.awt.Color(0, 0, 0));
        tblPatient.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblPatient.setRowHeight(30);
        tblPatient.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblPatient);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 1300, 230));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List Of Covid Patients In The Network Area Of The Coordinator");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("List Of Recievers");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, -1, -1));

        tblRequest.setBackground(new java.awt.Color(0, 0, 0));
        tblRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tblRequest.setForeground(new java.awt.Color(255, 255, 255));
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Number", "Summary", "Patient Name", "Email ID", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setFocusable(false);
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblRequest.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblRequest.setRowHeight(30);
        tblRequest.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tblRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 1310, 220));

        jPanel3.setBackground(new java.awt.Color(31, 31, 31));
        jPanel3.setPreferredSize(new java.awt.Dimension(926, 70));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Create Patient Profile");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        chkEmergency.setBackground(new java.awt.Color(31, 31, 31));
        chkEmergency.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        chkEmergency.setForeground(new java.awt.Color(255, 255, 255));
        chkEmergency.setText("Emergency");
        chkEmergency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkEmergency.setEnabled(false);
        add(chkEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 440, -1, -1));

        nameTextField.setBackground(new java.awt.Color(0, 0, 0));
        nameTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nameTextField.setEnabled(false);
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, 212, -1));

        jButton2.setBackground(new java.awt.Color(31, 31, 31));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("See Details");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 130, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Blood Group");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, -1, -1));

        bloodGroupTextField.setBackground(new java.awt.Color(0, 0, 0));
        bloodGroupTextField.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        bloodGroupTextField.setForeground(new java.awt.Color(255, 255, 255));
        bloodGroupTextField.setEnabled(false);
        add(bloodGroupTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 480, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateReceiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReceiverActionPerformed
        // TODO add your handling code here:
        
        Patient patient = system.getPatientDirectory().addPatient();
        
        patient.setReceiverID(uidTextField.getText());
        patient.setName(nameTextField.getText());
        patient.setEmailID((emailTextField.getText()));
        patient.setBloodGroup(bloodGroupTextField.getText());
        patient.setEmergencyStatus(chkEmergency.isSelected());
        patient.setStatus("Centre Approved");
        
        
        
        populateTable();
         JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>A new Patinet has been <font color='green'>added</font></I></h2></html>"));
           
        //JOptionPane.showMessageDialog(null,"New patient has been added!");
        
        WorkRequest request = new SystemCoordinatorTestWorkRequest();
        
        request.setPatient(patient);
        request.setActionDate(new Date());
        request.setAssigned("Legal Pool");
        request.setSummary("Requested for Plasma Reception");
        request.setStatus("Assigned to Legal Pool");
        
        request.setUserAccount(userAccount);
       
        Enterprise ent = null;
        Organization org = null;
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().toString().equals("Legal")) {
            
                ent = enterprise;
                System.out.println(enterprise);
                break;
            }
        }
        
        
       
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if(organization instanceof LegalOfficerOrganization) {
                org = organization;
                break;
            }
        }
        
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println(org.getName());
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            //user.addUserRequest(request);
            
            dB4OUtil.storeSystem(system);
            populateTable();
            //JOptionPane.showMessageDialog(null,"Request Sent Successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Request has been sent for<font color='green'> Legal Approval!</I></font></h2></html>"));         
            
        } else {
        
         JOptionPane.showMessageDialog(null, "No organization present", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        chkEmergency.setEnabled(false);
        btnCreateReceiver.setEnabled(false);
        
        uidTextField.setText("");
        nameTextField.setText("");
        emailTextField.setText("");
        bloodGroupTextField.setText("");
    }//GEN-LAST:event_btnCreateReceiverActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblPatient.getSelectedRow();
        
        if(selectedRow < 0){
            
             JOptionPane.showMessageDialog(null, new JLabel(  "<html><h2><I>Please select<font color='red'> a row</font> from the<font color='green'> table</I></font></h2></html>"), "Warning", JOptionPane.WARNING_MESSAGE);
           
            
            //JOptionPane.showMessageDialog(null,"Please select a row from the table first to View Details!","Warning!",JOptionPane.WARNING_MESSAGE);
        }
        else{

            //String.valueOf(tblGoogleSheet.getValueAt(selectedRow, 0));

            uidTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 0)));
             nameTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 1)));
            emailTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 2)));
            
            bloodGroupTextField.setText( String.valueOf(tblPatient.getValueAt(selectedRow, 4)));
            
            
            btnCreateReceiver.setEnabled(true);
            chkEmergency.setEnabled(true);
            

        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodGroupTextField;
    private javax.swing.JButton btnCreateReceiver;
    private javax.swing.JCheckBox chkEmergency;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField uidTextField;
    // End of variables declaration//GEN-END:variables
}