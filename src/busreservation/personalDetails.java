/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author sumes
 */
public class personalDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form personalDetails
     */
    public personalDetails() {
        initComponents();
 
    }

    personalDetails(String id) {
        initComponents();
         txtbusid.setText(id);
         FetchData();
         NonEditable();
           Toolkit toolkit=getToolkit();
       Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        btnsv.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblBusid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfnm = new javax.swing.JTextField();
        txtmnm = new javax.swing.JTextField();
        txtlnm = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtmobileNo = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        rdbmale = new javax.swing.JRadioButton();
        rdbfemale = new javax.swing.JRadioButton();
        rsbother = new javax.swing.JRadioButton();
        btnsv = new javax.swing.JButton();
        txtsource = new javax.swing.JTextField();
        lblsource = new javax.swing.JLabel();
        txtdest = new javax.swing.JTextField();
        lbldest = new javax.swing.JLabel();
        txttime = new javax.swing.JTextField();
        lbltime = new javax.swing.JLabel();
        txtseats = new javax.swing.JTextField();
        lblseats = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lbldate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtbusid = new javax.swing.JTextField();
        lblseats1 = new javax.swing.JLabel();
        cmbSeats = new javax.swing.JComboBox<>();
        lblEI = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busreservation/5166950.jpg"))); // NOI18N

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book Ticket");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        lblBusid.setText("Bus Id :");
        getContentPane().add(lblBusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 333, -1, -1));

        jLabel3.setText("First Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 127, -1, -1));

        jLabel4.setText("Middle Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, -1, -1));

        jLabel5.setText("Last Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 197, -1, -1));

        txtfnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtfnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 124, 150, -1));

        txtmnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtmnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 159, 150, -1));

        txtlnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlnmKeyPressed(evt);
            }
        });
        getContentPane().add(txtlnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 194, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Personal Details");

        jLabel8.setText("Bus Id :");

        jLabel9.setText("First Name :");

        jLabel10.setText("Middle Name :");

        jLabel11.setText("Last Name :");

        jLabel12.setText("Address :");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel7))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 262, 0, 0));

        jLabel13.setText("Email Id :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 127, -1, -1));

        jLabel14.setText("Mobilen No :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 165, -1, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 124, 150, -1));

        txtmobileNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileNoActionPerformed(evt);
            }
        });
        txtmobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobileNoKeyPressed(evt);
            }
        });
        getContentPane().add(txtmobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 156, 150, -1));

        lblgender.setText("Gender :");
        getContentPane().add(lblgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 197, -1, -1));

        buttonGroup1.add(rdbmale);
        rdbmale.setText("Male");
        getContentPane().add(rdbmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 193, -1, -1));

        buttonGroup1.add(rdbfemale);
        rdbfemale.setText("Female");
        getContentPane().add(rdbfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 193, -1, -1));

        buttonGroup1.add(rsbother);
        rsbother.setText("other");
        getContentPane().add(rsbother, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 193, -1, -1));

        btnsv.setText("Save and Next");
        btnsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsvActionPerformed(evt);
            }
        });
        getContentPane().add(btnsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));
        getContentPane().add(txtsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 359, 150, -1));

        lblsource.setText("source");
        getContentPane().add(lblsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 362, -1, -1));
        getContentPane().add(txtdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 394, 150, -1));

        lbldest.setText("destination");
        getContentPane().add(lbldest, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 397, -1, -1));
        getContentPane().add(txttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 330, 150, -1));

        lbltime.setText("Time");
        getContentPane().add(lbltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 333, -1, -1));
        getContentPane().add(txtseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 359, 150, -1));

        lblseats.setText("Total No of Seats");
        getContentPane().add(lblseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 362, -1, -1));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 429, 150, -1));

        lblprice.setText("price");
        getContentPane().add(lblprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 432, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 429, 150, -1));

        lbldate.setText("Date");
        getContentPane().add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 429, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Personal Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Payment");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txtbusid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusidActionPerformed(evt);
            }
        });
        getContentPane().add(txtbusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 330, 150, -1));

        lblseats1.setText(" Seats");
        getContentPane().add(lblseats1, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 397, -1, -1));

        cmbSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cmbSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeatsActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 394, 150, -1));
        getContentPane().add(lblEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Bus Details");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("Bus Details");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 288, -1, -1));

        jCheckBox1.setText("Cash Payment");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busreservation/5166950.jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsvActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=RegistrationDB";
            String user="sa";
            String pass="123";
                    Connection con=DriverManager.getConnection(url,user,pass);
                    String gender="";
                    if(rdbmale.isSelected())
                    {
                        gender="male";
                    }
                     if(rdbfemale.isSelected())
                    {
                        gender="female";
                    }
                      if(rsbother.isSelected())
                    {
                        gender="other";
                    } 
                     
                    String qry="insert into TicketTbl values('"+txtfnm.getText()+"','"+txtmnm.getText()+"','"+txtlnm.getText()+"','"+txtemail.getText()+"','"+txtmobileNo.getText()+"','"+gender+"','"+txtbusid.getText()+"','"+cmbSeats.getSelectedItem().toString()+"','"+txtprice.getText()+"')";
                            PreparedStatement st=con.prepareStatement(qry);
                            st.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Record submitted");
                           String Id=txtbusid.getText().toString();
                           String mn=txtmobileNo.getText().toString();
                           Ticket tkt=new Ticket(mn,Id);
                           JDesktopPane jd=getDesktopPane();
                           jd.add(tkt);
                           this.dispose();
                           tkt.show();
                          //  LoadData();
                           // clearControls();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BusDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BusDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsvActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void cmbSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeatsActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=RegistrationDB";
            String user="sa";
            String pass="123";
            int p=0;
            Connection con=DriverManager.getConnection(url,user,pass);
            String qry="select Price from BusDetails where BusId='"+txtbusid.getText()+"'";
            PreparedStatement st=con.prepareStatement(qry);
            ResultSet rs= st.executeQuery();
            if(rs.next())
            {
                 p=Integer.parseInt(rs.getString("Price"));
            }
            int s=Integer.parseInt(cmbSeats.getSelectedItem().toString());
            String z;
            z = String.valueOf(p*s);
            txtprice.setText(String.valueOf(z));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(personalDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(personalDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbSeatsActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtfnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnmKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txtfnm.setEditable(true);
        }
        else
        {
            txtfnm.setEditable(false);
        }
    }//GEN-LAST:event_txtfnmKeyPressed

    private void txtmnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmnmKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txtmnm.setEditable(true);
        }
        else
        {
            txtmnm.setEditable(false);
        }
    }//GEN-LAST:event_txtmnmKeyPressed

    private void txtlnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnmKeyPressed
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            txtlnm.setEditable(true);
        }
        else
        {
            txtlnm.setEditable(false);
        }
    }//GEN-LAST:event_txtlnmKeyPressed

    private void txtmobileNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileNoKeyPressed
        // TODO add your handling code here:
        String phone=txtmobileNo.getText();
        int lenght=phone.length();
        char c=evt.getKeyChar();
        if(c>='0' && c<='9')
        {
            if(lenght<10)
            {
                txtmobileNo.setEditable(true);
            }
            else
            {
                txtmobileNo.setEditable(false);
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                txtmobileNo.setEnabled(true);
            }
            else
            {
                txtmobileNo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtmobileNoKeyPressed

    private void txtbusidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusidActionPerformed

    private void txtmobileNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileNoActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{1,30}[@][a-zA-z0-9]{1,10}[.][a-zA-Z]{1,3}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtemail.getText());
        if(match.matches())
        {
            lblEI.setText(""); 
        } 
        else
        { 
            lblEI.setText("please Enter valid Email Id ..");
           
        }
    }//GEN-LAST:event_txtemailKeyReleased


    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        btnsv.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    public void FetchData()
    {
         try {
            // TODO add your handling code here:
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=RegistrationDB";
            String user="sa";
            String pass="123";
                    Connection con=DriverManager.getConnection(url,user,pass);
                    String qry="select * from BusDetails where BusId='"+txtbusid.getText()+"'";
                            PreparedStatement st=con.prepareStatement(qry);
                            ResultSet rs= st.executeQuery();
                            if(rs.next())
                            {
                                txtsource.setText(rs.getString("Source"));
                                txtdest.setText(rs.getString("Destination"));
                                jDateChooser1.setDate(rs.getDate("Date"));
                                txttime.setText(rs.getString("Time"));
                                txtseats.setText(rs.getString("NoOfSeats"));
                                txtprice.setText(rs.getString("Price"));
                            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BusDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BusDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void NonEditable()
 {
     txtbusid.setEditable(false);
     txtdest.setEditable(false);
    
     txtprice.setEditable(false);
     txtseats.setEditable(false);
     txtsource.setEditable(false);
     txttime.setEditable(false);
     jDateChooser1.setEnabled(false);
  
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbSeats;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblBusid;
    private javax.swing.JLabel lblEI;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldest;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblseats;
    private javax.swing.JLabel lblseats1;
    private javax.swing.JLabel lblsource;
    private javax.swing.JLabel lbltime;
    private javax.swing.JRadioButton rdbfemale;
    private javax.swing.JRadioButton rdbmale;
    private javax.swing.JRadioButton rsbother;
    private javax.swing.JTextField txtbusid;
    private javax.swing.JTextField txtdest;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfnm;
    private javax.swing.JTextField txtlnm;
    private javax.swing.JTextField txtmnm;
    private javax.swing.JTextField txtmobileNo;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtseats;
    private javax.swing.JTextField txtsource;
    private javax.swing.JTextField txttime;
    // End of variables declaration//GEN-END:variables
}
