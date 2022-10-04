/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Employee;
import model.EmployeeList;
import utils.Chooser;

/**
 *
 * @author qiaotong
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     */
    private Employee employee;
    private EmployeeList employeeList;
    public CreateJPanel(EmployeeList employeeList) {
        this.employeeList = employeeList;
        initComponents();
        Chooser DOBChooser = Chooser.getInstance();
        DOBChooser.register(Text_Start_Date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        nameLabel3 = new javax.swing.JLabel();
        nameLabel4 = new javax.swing.JLabel();
        nameLabel5 = new javax.swing.JLabel();
        nameLabel6 = new javax.swing.JLabel();
        nameLabel7 = new javax.swing.JLabel();
        nameLabel8 = new javax.swing.JLabel();
        nameLabel9 = new javax.swing.JLabel();
        Text_Name = new javax.swing.JTextField();
        Text_Employee_ID = new javax.swing.JTextField();
        Text_Age = new javax.swing.JTextField();
        Text_Gender = new javax.swing.JTextField();
        Text_Start_Date = new javax.swing.JTextField();
        Text_Level = new javax.swing.JTextField();
        Text_Team_Info = new javax.swing.JTextField();
        Text_Cell_Phone_Number = new javax.swing.JTextField();
        Text_Email_Address = new javax.swing.JTextField();
        Text_Photo = new javax.swing.JLabel();
        SavejButton = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        nameLabel10 = new javax.swing.JLabel();
        Text_Position_Title = new javax.swing.JTextField();

        Title.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Create Profile");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");
        nameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel1.setText("Employee ID");
        nameLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel2.setText("Age");
        nameLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel3.setText("Gender");
        nameLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel4.setText("Start Date");
        nameLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel5.setText("Level");
        nameLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel6.setText("Team Info");
        nameLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel7.setText("Cell Phone Number");
        nameLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel8.setText("Email Address");
        nameLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        nameLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel9.setText("Photo");
        nameLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NameActionPerformed(evt);
            }
        });

        Text_Employee_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Employee_IDActionPerformed(evt);
            }
        });

        Text_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_AgeActionPerformed(evt);
            }
        });

        Text_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_GenderActionPerformed(evt);
            }
        });

        Text_Start_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Start_DateActionPerformed(evt);
            }
        });

        Text_Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_LevelActionPerformed(evt);
            }
        });

        Text_Team_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Team_InfoActionPerformed(evt);
            }
        });

        Text_Cell_Phone_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Cell_Phone_NumberActionPerformed(evt);
            }
        });

        Text_Email_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Email_AddressActionPerformed(evt);
            }
        });

        Text_Photo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Text_Photo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SavejButton.setText("Save");
        SavejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavejButtonActionPerformed(evt);
            }
        });

        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        nameLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel10.setText("Position Title");
        nameLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text_Position_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Position_TitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upload)
                            .addComponent(SavejButton))
                        .addGap(83, 83, 83)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_Level, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Name)
                    .addComponent(Text_Employee_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Start_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Email_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Cell_Phone_Number, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Team_Info, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Text_Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Position_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Employee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Start_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_Team_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel10)
                    .addComponent(Text_Position_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel7)
                    .addComponent(Text_Cell_Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel8)
                    .addComponent(Text_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(nameLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(upload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SavejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Text_Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Text_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NameActionPerformed

    private void Text_Employee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Employee_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Employee_IDActionPerformed

    private void Text_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_AgeActionPerformed

    private void Text_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_GenderActionPerformed

    private void Text_Start_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Start_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Start_DateActionPerformed

    private void Text_LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_LevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_LevelActionPerformed

    private void Text_Team_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Team_InfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Team_InfoActionPerformed

    private void Text_Cell_Phone_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Cell_Phone_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Cell_Phone_NumberActionPerformed

    private void Text_Email_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Email_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Email_AddressActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        upload(upload);
    }//GEN-LAST:event_uploadActionPerformed

    private void SavejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavejButtonActionPerformed
        // TODO add your handling code here:
        Employee employee = new Employee(); 
        this.employee = employee;
        employee.setName(Text_Name.getText());
        employee.setEmployeeID(Text_Employee_ID.getText());
        try{
            employee.setAge(Integer.parseInt(Text_Age.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Age Input Error!!!");
            return;
        }   
        employee.setGender(Text_Gender.getText());
        employee.setStartDate(Text_Start_Date.getText());
        employee.setLevel(Text_Level.getText());
        employee.setTeamInfo(Text_Team_Info.getText());
        employee.setPositionTitle(Text_Position_Title.getText());
        Employee.ContactInfo contactInfo = employee.getContactInfo();
        contactInfo.setCellPhoneNumber(Text_Cell_Phone_Number.getText());
        contactInfo.setEmailAddress(Text_Email_Address.getText());
        employeeList.addEmployee(employee);
        JOptionPane.showMessageDialog(this, "Employee Information Saved!!!");
    }//GEN-LAST:event_SavejButtonActionPerformed

    private void Text_Position_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Position_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Position_TitleActionPerformed

    public void upload(JButton upload){
        JFileChooser choose = new JFileChooser();
        choose.setMultiSelectionEnabled(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png","jpeg");
        choose.setFileFilter(filter);
        int returnVar = choose.showOpenDialog(upload);
        if(returnVar == choose.APPROVE_OPTION){
            File f = choose.getSelectedFile();
            String fileName =f.getName();
            String prefix=fileName.substring(fileName.lastIndexOf(".")+1);
            if(!(prefix.equals("jpg") || prefix.equals("png")|| prefix.equals("jpeg"))){
                JOptionPane.showMessageDialog(new JDialog(),"please upload jpg OR png OR jpeg");
                    return;
                }
            String newPath = "/Users/frank/Desktop/uploadImages";
            FileInputStream input = null;
            FileOutputStream out = null;
            try {      
                input = new FileInputStream(f);
                byte[] buffer = new byte[1024];
                File des = new File(newPath,f.getName());
                out = new FileOutputStream(des);
                int len = 0;
                String absolutePath = choose.getSelectedFile().getAbsolutePath();
                ImageIcon imageIcon = new ImageIcon(absolutePath);
                while((len = input.read(buffer)) != -1){
                    out.write(buffer, 0, len);
                    out.flush();
                }
                Image img = imageIcon.getImage();
                img = img.getScaledInstance(120, 120, Image.SCALE_DEFAULT);
                imageIcon.setImage(img);
                Text_Photo.setIcon(imageIcon);
                employee.setPhotoAddress(newPath+"/"+f.getName());
                JOptionPane.showMessageDialog(this, "upload success！");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "upload failed！", "reminder",JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "upload failed！", "reminder",JOptionPane.ERROR_MESSAGE);
            } finally{
                try {
                    out.close();
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SavejButton;
    private javax.swing.JTextField Text_Age;
    private javax.swing.JTextField Text_Cell_Phone_Number;
    private javax.swing.JTextField Text_Email_Address;
    private javax.swing.JTextField Text_Employee_ID;
    private javax.swing.JTextField Text_Gender;
    private javax.swing.JTextField Text_Level;
    private javax.swing.JTextField Text_Name;
    private javax.swing.JLabel Text_Photo;
    private javax.swing.JTextField Text_Position_Title;
    private javax.swing.JTextField Text_Start_Date;
    private javax.swing.JTextField Text_Team_Info;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel10;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JLabel nameLabel4;
    private javax.swing.JLabel nameLabel5;
    private javax.swing.JLabel nameLabel6;
    private javax.swing.JLabel nameLabel7;
    private javax.swing.JLabel nameLabel8;
    private javax.swing.JLabel nameLabel9;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
