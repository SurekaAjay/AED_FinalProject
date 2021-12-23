/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.SwingUtilities.getWindowAncestor;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;

/**
 *
 * @author ajaysureka
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private UserAccount userAccount;
    boolean a = true;
    DoctorOrganization doctorOrganization;
    Enterprise enterprise;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public DoctorWorkAreaJPanel(UserAccount account, DoctorOrganization doctorOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.doctorOrganization = doctorOrganization;
        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    public void changeimage(JLabel button, String resourcecheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcecheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        
        if(dashboard == true){
            
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
        }
        
        else{
            
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Images/menu_32px.png");
            
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        Buttonhidemenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(15, 29, 52));
        jPanel2.setLayout(new java.awt.BorderLayout());

        ButtonClose.setBackground(new java.awt.Color(0, 0, 0));
        ButtonClose.setPreferredSize(new java.awt.Dimension(50, 50));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        ButtonMax.setBackground(new java.awt.Color(15, 29, 52));
        ButtonMax.setPreferredSize(new java.awt.Dimension(50, 50));

        fullmax.setBackground(new java.awt.Color(0, 0, 0));
        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/full_screen_32px.png"))); // NOI18N
        fullmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullmaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullmaxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonMaxLayout = new javax.swing.GroupLayout(ButtonMax);
        ButtonMax.setLayout(ButtonMaxLayout);
        ButtonMaxLayout.setHorizontalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonMaxLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fullmax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ButtonMaxLayout.setVerticalGroup(
            ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(ButtonMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonMaxLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fullmax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout ButtonCloseLayout = new javax.swing.GroupLayout(ButtonClose);
        ButtonClose.setLayout(ButtonCloseLayout);
        ButtonCloseLayout.setHorizontalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonCloseLayout.createSequentialGroup()
                .addGap(0, 813, Short.MAX_VALUE)
                .addComponent(ButtonMax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ButtonCloseLayout.setVerticalGroup(
            ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ButtonCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(ButtonClose, java.awt.BorderLayout.PAGE_START);

        Header.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(270, 500));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 0));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 500));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(15, 29, 52));
        jPanel4.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        Buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        Buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonhidemenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hidemenuLayout.createSequentialGroup()
                    .addComponent(Buttonhidemenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Buttonhidemenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 10));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(31, 31, 31));
        menuhide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(31, 31, 31));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Profile");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 60));

        jPanel9.setBackground(new java.awt.Color(31, 31, 31));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Manage Requests");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        menuhide.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jPanel10.setBackground(new java.awt.Color(31, 31, 31));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuhide.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        add(menu, java.awt.BorderLayout.LINE_START);

        userProcessContainer.setBackground(new java.awt.Color(208, 93, 2));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        add(userProcessContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        ManageDoctorProfile manageDoctorProfile = new ManageDoctorProfile(userAccount,doctorOrganization,enterprise);
        userProcessContainer.add("ManageDoctorProfile",manageDoctorProfile);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        ManageDoctorRequestJPanel manageDoctorRequestJPanel = new ManageDoctorRequestJPanel(system, userAccount, doctorOrganization, enterprise);
        userProcessContainer.add("ManageDoctorRequestJPanel",manageDoctorRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonMax, new Color(0,237,0));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_fullmaxMouseExited

    private void ButtonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseClicked
        // TODO add your handling code here:
        clickmenu(hidemenu, hidemenu, 1);
        
        // reate void for methods hide and show panel menu
        
        if(a==true){
            hideshow(menu,a, Buttonhidemenu );
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{
            
            hideshow(menu, a, Buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_ButtonhidemenuMouseClicked

    private void ButtonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonhidemenuMouseEntered

    private void ButtonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonhidemenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonhidemenuMouseExited

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(15,29,52));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changecolor(ButtonClose, new Color(204,0,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonClose;
    private javax.swing.JPanel ButtonMax;
    private javax.swing.JLabel Buttonhidemenu;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
