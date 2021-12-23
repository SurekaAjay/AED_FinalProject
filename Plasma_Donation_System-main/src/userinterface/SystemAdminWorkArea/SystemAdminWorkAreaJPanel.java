/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

/**
 *
 * @author ajaysureka
 */

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    boolean a= true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
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
        jPanel1 = new javax.swing.JPanel();
        BtnClose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        BtnMax = new javax.swing.JPanel();
        fullmax = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        linehidemenu = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        ButtonHideMenu = new javax.swing.JLabel();
        panelSysadminControl = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BtnManageNetwork = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        BtnManageEnterprise = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        BtnManageAuthentication = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        BtnStatistics = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelSysadminWorkContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1200, 900));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 50));

        BtnClose.setBackground(new java.awt.Color(15, 29, 52));
        BtnClose.setPreferredSize(new java.awt.Dimension(50, 50));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_32px.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout BtnCloseLayout = new javax.swing.GroupLayout(BtnClose);
        BtnClose.setLayout(BtnCloseLayout);
        BtnCloseLayout.setHorizontalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnCloseLayout.createSequentialGroup()
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BtnCloseLayout.setVerticalGroup(
            BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BtnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        BtnMax.setBackground(new java.awt.Color(15, 29, 52));
        BtnMax.setPreferredSize(new java.awt.Dimension(50, 50));

        fullmax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/full_screen_32px.png"))); // NOI18N
        fullmax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout BtnMaxLayout = new javax.swing.GroupLayout(BtnMax);
        BtnMax.setLayout(BtnMaxLayout);
        BtnMaxLayout.setHorizontalGroup(
            BtnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BtnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fullmax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );
        BtnMaxLayout.setVerticalGroup(
            BtnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(BtnMaxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fullmax, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 721, Short.MAX_VALUE)
                .addComponent(BtnMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Header.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(270, 500));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(0, 0, 0));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 500));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linehidemenu.setBackground(new java.awt.Color(15, 29, 52));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        hidemenu.setBackground(new java.awt.Color(15, 29, 52));
        hidemenu.setPreferredSize(new java.awt.Dimension(50, 50));

        ButtonHideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonHideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back_32px.png"))); // NOI18N
        ButtonHideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonHideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hidemenuLayout = new javax.swing.GroupLayout(hidemenu);
        hidemenu.setLayout(hidemenuLayout);
        hidemenuLayout.setHorizontalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hidemenuLayout.createSequentialGroup()
                    .addComponent(ButtonHideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        hidemenuLayout.setVerticalGroup(
            hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(hidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ButtonHideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        panelSysadminControl.setBackground(new java.awt.Color(31, 31, 31));
        panelSysadminControl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(31, 31, 31));

        BtnManageNetwork.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageNetwork.setText("Manage Network");
        BtnManageNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageNetworkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelSysadminControl.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 50));

        jPanel9.setBackground(new java.awt.Color(31, 31, 31));

        BtnManageEnterprise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageEnterprise.setText("Manage Enterprise");
        BtnManageEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageEnterpriseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageEnterprise, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelSysadminControl.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jPanel10.setBackground(new java.awt.Color(31, 31, 31));

        BtnManageAuthentication.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageAuthentication.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageAuthentication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageAuthentication.setText("Manage Authentication");
        BtnManageAuthentication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageAuthentication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageAuthenticationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageAuthentication, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnManageAuthentication, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelSysadminControl.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        jPanel11.setBackground(new java.awt.Color(31, 31, 31));

        BtnStatistics.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnStatistics.setForeground(new java.awt.Color(255, 255, 255));
        BtnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnStatistics.setText("Statistics");
        BtnStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnStatisticsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BtnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelSysadminControl.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jPanel12.setBackground(new java.awt.Color(31, 31, 31));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel8)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panelSysadminControl.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        menu.add(panelSysadminControl, java.awt.BorderLayout.CENTER);

        add(menu, java.awt.BorderLayout.LINE_START);

        panelSysadminWorkContainer.setBackground(new java.awt.Color(208, 93, 2));
        panelSysadminWorkContainer.setLayout(new java.awt.CardLayout());
        add(panelSysadminWorkContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        changecolor(BtnClose, new Color(204,0,0));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
        changecolor(BtnClose, new Color(15,29,52));
    }//GEN-LAST:event_closeMouseExited

    private void fullmaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fullmaxMouseClicked

    private void fullmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseEntered
        // TODO add your handling code here:
        changecolor(BtnMax, new Color(0,237,0));
    }//GEN-LAST:event_fullmaxMouseEntered

    private void fullmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullmaxMouseExited
        // TODO add your handling code here:
        changecolor(BtnClose, new Color(15,29,52));
    }//GEN-LAST:event_fullmaxMouseExited

    private void ButtonHideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseClicked
        // TODO add your handling code here:
        clickmenu(MenuIcon, MenuIcon, 1);
        
        // reate void for methods hide and show panel menu
        
        if(a==true){
            hideshow(menu,a, ButtonHideMenu );
            SwingUtilities.updateComponentTreeUI(this);
            a=false;
        }
        else{
            
            hideshow(menu, a, ButtonHideMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_ButtonHideMenuMouseClicked

    private void ButtonHideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHideMenuMouseEntered

    private void ButtonHideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHideMenuMouseExited

    private void BtnManageNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageNetworkMouseClicked
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetwork = new ManageNetworkJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageNetworkJPanel",manageNetwork);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageNetworkMouseClicked

    private void BtnManageEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageEnterpriseMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterprise = new ManageEnterpriseJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageEnterpriseMouseClicked

    private void BtnManageAuthenticationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageAuthenticationMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEntAuth = new ManageEnterpriseAdminJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseAdminJPanel",manageEntAuth);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageAuthenticationMouseClicked

    private void BtnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnStatisticsMouseClicked
        // TODO add your handling code here:
        StatisticsJPanel graphs =  new StatisticsJPanel();
        panelSysadminWorkContainer.add("StatisticsJPanel",graphs);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnStatisticsMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JFrame frame = (JFrame) getWindowAncestor(this);
        frame.dispose();
        SystemAdminWorkAreaJPanel.super.setVisible(false);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnClose;
    private javax.swing.JLabel BtnManageAuthentication;
    private javax.swing.JLabel BtnManageEnterprise;
    private javax.swing.JLabel BtnManageNetwork;
    private javax.swing.JPanel BtnMax;
    private javax.swing.JLabel BtnStatistics;
    private javax.swing.JLabel ButtonHideMenu;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fullmax;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelSysadminControl;
    private javax.swing.JPanel panelSysadminWorkContainer;
    // End of variables declaration//GEN-END:variables
}
