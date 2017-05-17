package employeedatabase;

public class AddEmployee extends javax.swing.JFrame {

    public AddEmployee() {
        initComponents();
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
        firstNameLabel = new javax.swing.JLabel();
        firstNameForm = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameForm = new javax.swing.JTextField();
        locationLabel = new javax.swing.JLabel();
        locationForm = new javax.swing.JTextField();
        deductionRateLabel = new javax.swing.JLabel();
        deductionRateForm = new javax.swing.JTextField();
        fullTimeRadioButton = new javax.swing.JRadioButton();
        partTimeRadioButton = new javax.swing.JRadioButton();
        annualSalaryLabel = new javax.swing.JLabel();
        annualSalaryForm = new javax.swing.JTextField();
        hourlyWageLabel = new javax.swing.JLabel();
        hourlyWageForm = new javax.swing.JTextField();
        hoursPerWeekLabel = new javax.swing.JLabel();
        hoursPerWeekForm = new javax.swing.JTextField();
        weeksPerYearLabel = new javax.swing.JLabel();
        weeksPerYearForm = new javax.swing.JTextField();
        employeeNumberForm = new javax.swing.JTextField();
        deductionRateLabel1 = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNameLabel.setText("Last Name");

        firstNameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFormActionPerformed(evt);
            }
        });

        lastNameLabel.setText("First Name");

        lastNameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFormActionPerformed(evt);
            }
        });

        locationLabel.setText("Location");

        deductionRateLabel.setText("Deduction Rate");

        buttonGroup1.add(fullTimeRadioButton);
        fullTimeRadioButton.setText("Full Time ");
        fullTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(partTimeRadioButton);
        partTimeRadioButton.setText("Part Time");
        partTimeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadioButtonActionPerformed(evt);
            }
        });

        annualSalaryLabel.setText("Annual Salary");

        hourlyWageLabel.setText("Hourly Wage");

        hoursPerWeekLabel.setText("Hours per Week");

        weeksPerYearLabel.setText("Weeks per Year");

        deductionRateLabel1.setText("Employee Number");

        addEmployeeButton.setLabel("Add Employee");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(deductionRateLabel)
                                    .addComponent(locationLabel)
                                    .addComponent(deductionRateLabel1))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(locationForm, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(lastNameForm)
                                    .addComponent(firstNameForm)
                                    .addComponent(deductionRateForm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(employeeNumberForm, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annualSalaryLabel)
                                    .addComponent(hourlyWageLabel)
                                    .addComponent(hoursPerWeekLabel)
                                    .addComponent(weeksPerYearLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(annualSalaryForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(hourlyWageForm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hoursPerWeekForm, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(weeksPerYearForm, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(fullTimeRadioButton)
                                .addGap(29, 29, 29)
                                .addComponent(partTimeRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(addEmployeeButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionRateLabel)
                    .addComponent(deductionRateForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deductionRateLabel1)
                    .addComponent(employeeNumberForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullTimeRadioButton)
                    .addComponent(partTimeRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualSalaryLabel)
                    .addComponent(annualSalaryForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageLabel)
                    .addComponent(hourlyWageForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekLabel)
                    .addComponent(hoursPerWeekForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearLabel)
                    .addComponent(weeksPerYearForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        firstNameForm.getAccessibleContext().setAccessibleName("");
        lastNameForm.getAccessibleContext().setAccessibleName("");
        locationForm.getAccessibleContext().setAccessibleName("");
        deductionRateForm.getAccessibleContext().setAccessibleName("");
        employeeNumberForm.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFormActionPerformed

    private void lastNameFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFormActionPerformed

    private void fullTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeRadioButtonActionPerformed
        hourlyWageForm.setEnabled(false);
        hoursPerWeekForm.setEnabled(false);
        weeksPerYearForm.setEnabled(false);
        annualSalaryForm.setEnabled(true);
    }//GEN-LAST:event_fullTimeRadioButtonActionPerformed

    private void partTimeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeRadioButtonActionPerformed
        hourlyWageForm.setEnabled(true);
        hoursPerWeekForm.setEnabled(true);
        weeksPerYearForm.setEnabled(true);
        annualSalaryForm.setEnabled(false);
    }//GEN-LAST:event_partTimeRadioButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        
        if (fullTimeRadioButton.isSelected() == true) {
            FullTimeEmployee blah = new FullTimeEmployee();
            blah.setFullTimeEmployee(
                    Integer.parseInt(employeeNumberForm.getText()),
                    firstNameForm.getText(),
                    lastNameForm.getText(),
                    locationForm.getText(),
                    Double.parseDouble(deductionRateForm.getText()),
                    Double.parseDouble(annualSalaryForm.getText())
            );
            System.out.println(blah.getFirstName());
            Primary.bigList.addToTable(blah);
            
            Object[] row = {blah.getFirstName(), 
                            blah.getLastName(), 
                            blah.getLocation(), 
                            blah.getEmpNumber(), 
                            true, 
                            blah.getSalary(), 
                            blah.getDeduction(),
                            null, 
                            null, 
                            null};
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) GUI.fullTable.getModel();
            model.addRow(row);

        } else {
            PartTimeEmployee blah = new PartTimeEmployee();
            blah.setPartTimeEmployee(
                    Integer.parseInt(employeeNumberForm.getText()),
                    firstNameForm.getText(),
                    lastNameForm.getText(),
                    locationForm.getText(),
                    Double.parseDouble(deductionRateForm.getText()),
                    Double.parseDouble(hourlyWageForm.getText()),
                    Integer.parseInt(hoursPerWeekForm.getText()),
                    Double.parseDouble(weeksPerYearForm.getText())
            );
            System.out.println(blah.getFirstName());
            Primary.bigList.addToTable(blah);
            
            Object[] row = {blah.getFirstName(), 
                            blah.getLastName(), 
                            blah.getLocation(), 
                            blah.getEmpNumber(), 
                            false, 
                            null, 
                            blah.getDeduction(),
                            blah.getHourlyWage(),
                            blah.getWeeks(),
                            blah.getPerYear()};
            javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) GUI.fullTable.getModel();
            model.addRow(row);
        }
        dispose();
    }//GEN-LAST:event_addEmployeeButtonActionPerformed
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JTextField annualSalaryForm;
    private javax.swing.JLabel annualSalaryLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField deductionRateForm;
    private javax.swing.JLabel deductionRateLabel;
    private javax.swing.JLabel deductionRateLabel1;
    private javax.swing.JTextField employeeNumberForm;
    private javax.swing.JTextField firstNameForm;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JRadioButton fullTimeRadioButton;
    private javax.swing.JTextField hourlyWageForm;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JTextField hoursPerWeekForm;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JTextField lastNameForm;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField locationForm;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JRadioButton partTimeRadioButton;
    private javax.swing.JTextField weeksPerYearForm;
    private javax.swing.JLabel weeksPerYearLabel;
    // End of variables declaration//GEN-END:variables
}
