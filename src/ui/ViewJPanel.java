/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.EmployeeList;
import utils.Chooser;

/**
 *
 * @author qiaotong
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private EmployeeList employeeList;
    public ViewJPanel(EmployeeList employeeList) {
        this.employeeList = employeeList;
        initComponents();
        Chooser DOBChooser = Chooser.getInstance();
        DOBChooser.register(Text_Start_Date);
        displayEmployeeList(employeeList.getEmployeeList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text_Gender = new javax.swing.JTextField();
        Text_Start_Date = new javax.swing.JTextField();
        Text_Level = new javax.swing.JTextField();
        Text_Team_Info = new javax.swing.JTextField();
        Text_Cell_Phone_Number = new javax.swing.JTextField();
        Text_Email_Address = new javax.swing.JTextField();
        Text_Photo = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        nameLabel10 = new javax.swing.JLabel();
        Text_Position_Title = new javax.swing.JTextField();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeListTable = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        SearchItem = new javax.swing.JComboBox<>();

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

        Title.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("View Profile");
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

        nameLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel10.setText("Position Title");
        nameLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Text_Position_Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Position_TitleActionPerformed(evt);
            }
        });

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

        EmployeeListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Level", "TeamInfo"
            }
        ));
        jScrollPane1.setViewportView(EmployeeListTable);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });

        SearchItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Employee ID", "Level", "Team Info" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)
                        .addGap(13, 13, 13))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete)
                    .addComponent(Search)
                    .addComponent(SearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nameLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Text_Level)
                        .addComponent(Text_Name)
                        .addComponent(Text_Employee_ID)
                        .addComponent(Text_Age)
                        .addComponent(Text_Gender)
                        .addComponent(Text_Start_Date)
                        .addComponent(Text_Email_Address)
                        .addComponent(Text_Cell_Phone_Number)
                        .addComponent(Text_Team_Info)
                        .addComponent(Text_Position_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Text_Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel1)
                    .addComponent(Text_Employee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Start_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Team_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Position_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Cell_Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Email_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel9)
                    .addComponent(Text_Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void Text_Position_TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Position_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Position_TitleActionPerformed

    private void Text_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_NameActionPerformed

    private void Text_Employee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Employee_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Employee_IDActionPerformed

    private void Text_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_AgeActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String searchTextString = SearchText.getText();
        String searchItemString = SearchItem.getSelectedItem().toString();
        ArrayList result = new ArrayList<Employee>();
        switch (searchItemString) {
            case "Name":
                for(Employee employee : employeeList.getEmployeeList()){
                    if(employee.getName().contains(searchTextString)){
                        result.add(employee);
                    }
                }
                if(result.size() <= 0){
                    JOptionPane.showMessageDialog(this, "Can Not Find Such Employee!!!");
                }else{
                    displayEmployeeList(result);
                }
                break;
            case "Employee ID":
                for(Employee employee : employeeList.getEmployeeList()){
                    if(employee.getEmployeeID().contains(searchTextString)){
                        result.add(employee);
                    }
                }
                if(result.size() <= 0){
                    JOptionPane.showMessageDialog(this, "Can Not Find Such Employee!!!");
                }else{
                    displayEmployeeList(result);
                }
                
                break;
            case "Level":
                for(Employee employee : employeeList.getEmployeeList()){
                    if(employee.getLevel().contains(searchTextString)){
                        result.add(employee);
                    }
                }
                if(result.size() <= 0){
                    JOptionPane.showMessageDialog(this, "Can Not Find Such Employee!!!");
                }else{
                    displayEmployeeList(result);
                }
                
                break;
            case "Team Info":
                for(Employee employee : employeeList.getEmployeeList()){
                    if(employee.getTeamInfo().contains(searchTextString)){
                        result.add(employee);
                    }
                }
                if(result.size() <= 0){
                    JOptionPane.showMessageDialog(this, "Can Not Find Such Employee!!!");
                }else{
                    displayEmployeeList(result);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeListTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "please select a row to update");
            return;
        }
        Employee employee = employeeList.getEmployeeList().get(selectedRowIndex);
        employee.setName(Text_Name.getText());
        employee.setEmployeeID(Text_Employee_ID.getText());
        employee.setAge(Integer.parseInt(Text_Age.getText()));
        employee.setGender(Text_Gender.getText());
        employee.setStartDate(Text_Start_Date.getText());
        employee.setLevel(Text_Level.getText());
        employee.setTeamInfo(Text_Team_Info.getText());
        employee.setPositionTitle(Text_Position_Title.getText());
        Employee.ContactInfo contactInfo = employee.getContactInfo();
        contactInfo.setCellPhoneNumber(Text_Cell_Phone_Number.getText());
        contactInfo.setEmailAddress(Text_Email_Address.getText());
        employeeList.updateEmployee(selectedRowIndex, employee);
        JOptionPane.showMessageDialog(this, "Employee Information Updated!!!");
        displayEmployeeList(employeeList.getEmployeeList());
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = EmployeeListTable.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "please select a row to delete");
            return;
        }
        employeeList.deleteEmployee(selectedRowIndex);
        JOptionPane.showMessageDialog(this, "Employee Information deleted!!!");
        displayEmployeeList(employeeList.getEmployeeList());
    }//GEN-LAST:event_DeleteActionPerformed

    private void displayEmployeeList(ArrayList<Employee> employeeList){
        DefaultTableModel model = (DefaultTableModel)EmployeeListTable.getModel();
        model.setRowCount(0);
        EmployeeListTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                rowClicked();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
            
        });
        for(Employee employee : employeeList){
            Object[] row = new Object[4];
            row[0] = employee.getEmployeeID();
            row[1] = employee.getName();
            row[2] = employee.getLevel();
            row[3] = employee.getTeamInfo();
            model.addRow(row); 
        }
    }
    
    private void rowClicked(){
        int row = EmployeeListTable.getSelectedRow();
        if(row >= 0){
            displayEmployee(employeeList.getEmployeeList().get(row));
        } 
    }
    
    private void displayEmployee(Employee employee){
        Text_Name.setText(employee.getName());
        Text_Employee_ID.setText(employee.getEmployeeID());
        Text_Age.setText(String.valueOf(employee.getAge()));
        Text_Gender.setText(employee.getGender());
        Text_Start_Date.setText(employee.getStartDate());
        Text_Level.setText(employee.getLevel());
        Text_Team_Info.setText(employee.getTeamInfo());
        Text_Position_Title.setText(employee.getPositionTitle());
        Text_Cell_Phone_Number.setText(employee.getContactInfo().getCellPhoneNumber());
        Text_Email_Address.setText(employee.getContactInfo().getEmailAddress());
        String photoAddress = employee.getPhotoAddress();
        if(photoAddress != null){
            ImageIcon originImage = new ImageIcon(photoAddress);
            Image scaledImage = originImage.getImage().getScaledInstance(120,120,Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(scaledImage);
            Text_Photo.setIcon(newIcon);
        } else{
            Text_Photo.setIcon(new ImageIcon());
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTable EmployeeListTable;
    private javax.swing.JButton Search;
    private javax.swing.JComboBox<String> SearchItem;
    private javax.swing.JTextField SearchText;
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
    private javax.swing.JButton Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    // End of variables declaration//GEN-END:variables
}
