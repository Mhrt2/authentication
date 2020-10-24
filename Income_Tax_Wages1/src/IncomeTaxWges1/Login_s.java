
package IncomeTaxWges1;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


class Login_s {

    public static void main(String[] args) {
         double Wages;
    double Salary;
    double Tax;
    double Gross;
     double Deducted;
    public  Login_s() {
       
        
 
        initComponents();
 
        }

   
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        NetPay = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Deduction = new javax.swing.JLabel();
        jtxtGrossPay = new javax.swing.JTextField();
        jtxtDeductions = new javax.swing.JTextField();
        jtxtNetPay = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        IncomeTaxAndWagesSummary = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNiNumber = new javax.swing.JTextField();
        jCobTaxCode1 = new javax.swing.JComboBox<>();
        jCobTaxPeriod = new javax.swing.JComboBox<>();
        jCobTaxCode = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        IncomeTaxAndWagesCalculator = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Employer = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jtxtReferenceNo = new javax.swing.JTextField();
        jtxtEmployer = new javax.swing.JTextField();
        jtxtEmployee = new javax.swing.JTextField();
        jtxtJobTitle = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jtxtUntaxedIncome = new javax.swing.JTextField();
        jtxtTaxableWages = new javax.swing.JTextField();
        jCobPayment = new javax.swing.JComboBox<>();
        Calculate = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NetPay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NetPay.setForeground(new java.awt.Color(255, 255, 255));
        NetPay.setText("Net Pay:");
        jPanel2.add(NetPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gross Pay:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 40));

        Deduction.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Deduction.setForeground(new java.awt.Color(255, 255, 255));
        Deduction.setText("Deduction:");
        jPanel2.add(Deduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 40));

        jtxtGrossPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtGrossPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtGrossPayActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtGrossPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, -1));

        jtxtDeductions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtDeductions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDeductionsActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtDeductions, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 180, -1));

        jtxtNetPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtNetPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNetPayActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtNetPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, -1));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 10, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 420, 220));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IncomeTaxAndWagesSummary.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        IncomeTaxAndWagesSummary.setForeground(new java.awt.Color(255, 255, 255));
        IncomeTaxAndWagesSummary.setText("Income Tax and Wages Summary");
        jPanel3.add(IncomeTaxAndWagesSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 800, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 840, 70));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NI Code:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tax Period:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tax Code:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NI Number:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 40));

        jtxtNiNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel4.add(jtxtNiNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 110, -1));

        jCobTaxCode1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCobTaxCode1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC17700", "NIC1750", "NIC2250", "NIC2750", "NIC3250" }));
        jPanel4.add(jCobTaxCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 160, -1));

        jCobTaxPeriod.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCobTaxPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel4.add(jCobTaxPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        jCobTaxCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCobTaxCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TC1200", "TC1750", "TC2250", "TC2750", "TC3250" }));
        jPanel4.add(jCobTaxCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 160, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 420, 220));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IncomeTaxAndWagesCalculator.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        IncomeTaxAndWagesCalculator.setForeground(new java.awt.Color(255, 255, 255));
        IncomeTaxAndWagesCalculator.setText("Income Tax and Wages Calcultor");
        jPanel5.add(IncomeTaxAndWagesCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 800, 60));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 820, 70));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NI Code:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 280, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Reference No:");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, 180, 40));

        Employer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Employer.setForeground(new java.awt.Color(255, 255, 255));
        Employer.setText("Employer:");
        jPanel6.add(Employer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 40));

        Employee.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setText("Employee:");
        jPanel6.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Job Title:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 40));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tax Period:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 210, 40));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Tax Code:");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 180, 40));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("NI Number:");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, 40));

        jtxtReferenceNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtxtReferenceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtReferenceNoActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtReferenceNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 130, -1));

        jtxtEmployer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmployerActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtEmployer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, -1));

        jtxtEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmployeeActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 130, -1));

        jtxtJobTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtJobTitleActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, -1));

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 110, -1));

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel6.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 100, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 120, -1));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 120, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 390, 220));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Net Pay:");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 40));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Payment:");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 40));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Untaxed Income:");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 40));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Taxable Wages:");
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 200, 40));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Date:");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 280, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Gross Pay:");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 280, 40));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Deduction:");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 140, 40));

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 120, -1));

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 120, -1));

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 120, -1));

        jtxtUntaxedIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jtxtUntaxedIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 120, -1));

        jtxtTaxableWages.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel7.add(jtxtTaxableWages, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, -1));

        jCobPayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCobPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1200", "1750", "2250", "2750", "3250" }));
        jPanel7.add(jCobPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 120, -1));

        Calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel7.add(Calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel7.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel7.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 390, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jtxtDeductionsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void jtxtNetPayActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jtxtReferenceNoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void jtxtEmployerActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jtxtEmployeeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jtxtJobTitleActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
frame = new JFrame("Exit");
if(JOptionPane.showConfirmDialog( frame,"Confirm if you want to exit","Income Tax and Wages Calculator",
     JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
System.exit(0);

}

        
                                           

    }                                    

    private void jtxtGrossPayActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        jtxtGrossPay.setText(null);
        jtxtDeductions.setText(null);
        jtxtEmployee.setText(null);
        jtxtEmployer.setText(null);
        jtxtGrossPay.setText(null);
        jtxtJobTitle.setText(null);
        jtxtNetPay.setText(null);
        jtxtNiNumber.setText(null);
        jtxtReferenceNo.setText(null);
        jtxtTaxableWages.setText(null);
        jtxtUntaxedIncome.setText(null);
        jCobPayment.setSelectedIndex(0);
        jCobTaxCode.setSelectedIndex(0);
        jCobTaxCode1.setSelectedIndex(0);
        jCobTaxPeriod.setSelectedIndex(0);
           
    }                                     

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        double  Pay;
        
        Gross = Double.parseDouble(jtxtGrossPay.getText());
        Deducted = Double.parseDouble(jtxtDeductions.getText());
        Pay = Gross - Deducted;
        String Wages = String.format("%.2f",Pay);
        jtxtNetPay.setText(Wages);
        String g = String.format("%.2f",Gross);
        jtxtGrossPay.setText(g);
        String d = String.format("%.2f",Deducted);
        jtxtDeductions.setText(d);
        
        
    // End of variables declaration                 
        
    }                                         


private void jCobPaymentActionPerformed(java.awt.event.ActionEvent evt){
    if(jCobPayment.getSelectedItem().equals("1200"))
    {
    jtxtUntaxedIncome.setText("1200");
    jtxtTaxableWages.setText("0");
    jtxtGrossPay.setText("1200");
    jtxtDeductions.setText("0");
   
    
    }
    
    else if(jCobPayment.getSelectedItem().equals("1750"))
            {
        
    jtxtUntaxedIncome.setText("1200");
    Wages = Double.parseDouble(jtxtUntaxedIncome.getText());
    Tax = 1750-1200;
    String WageTax = String.format("%.2f",Tax);
    jtxtTaxableWages.setText(WageTax);
    jtxtGrossPay.setText("1750");
    Salary = (Tax * 20)/100;
     String Deduction = String.format("%.2f",Salary);
     jtxtDeductions.setText(Deduction);
    
    }
    else if(jCobPayment.getSelectedItem().equals("2250"))
            {
        
    jtxtUntaxedIncome.setText("1200");
    Wages = Double.parseDouble(jtxtUntaxedIncome.getText());
    Tax = 2250-1200;
    String WageTax = String.format("%.2f",Tax);
    jtxtTaxableWages.setText(WageTax);
    jtxtGrossPay.setText("2250");
    Salary = (Tax * 25)/100;
     String Deduction = String.format("%.2f",Salary);
     jtxtDeductions.setText(Deduction);
    
    }
    
   else if(jCobPayment.getSelectedItem().equals("2750"))
           {
        
    jtxtUntaxedIncome.setText("1200");
    Wages = Double.parseDouble(jtxtUntaxedIncome.getText());
    Tax = 2750-1200;
    String WageTax = String.format("%.2f",Tax);
    jtxtTaxableWages.setText(WageTax);
    jtxtGrossPay.setText("2750");
    Salary = (Tax * 30)/100;
     String Deduction = String.format("%.2f",Salary);
     jtxtDeductions.setText(Deduction);
    }
   else if(jCobPayment.getSelectedItem().equals("3250"))
           {
        
    jtxtUntaxedIncome.setText("1200");
    Taxablewages = Double.parseDouble(jtxtUntaxedIncome.getText());
    Tax = 3250-1200;
    String WageTax = String.format("%.2f",Tax);
    jtxtTaxableWages.setText(WageTax);
    jtxtGrossPay.setText("3250");
    Salary = (Tax * 20)/100;
     String Deduction = String.format("%.2f",Salary);
     jtxtDeductions.setText(Deduction);
    }
    else if(jCobPayment.getSelectedItem().equals("0"))
    {
    jtxtUntaxedIncome.setText("0");
    jtxtTaxableWages.setText("0");
     jtxtGrossPay.setText("0");
     
    }  
}
    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable(){
           public void run(){
               new Income_Tax_Wages1.setVisible(true);
          
           }
       
       });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Income_Tax_Wages1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Income_Tax_Wages1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Income_Tax_Wages1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Income_Tax_Wages1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Income_Tax_Wages1().setVisible(true);
            }
        });
    }
   
    
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel Deduction;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Employer;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel IncomeTaxAndWagesCalculator;
    private javax.swing.JLabel IncomeTaxAndWagesSummary;
    private javax.swing.JLabel NetPay;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox<String> jCobPayment;
    private javax.swing.JComboBox<String> jCobTaxCode;
    private javax.swing.JComboBox<String> jCobTaxCode1;
    private javax.swing.JComboBox<String> jCobTaxPeriod;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jtxtDeductions;
    private javax.swing.JTextField jtxtEmployee;
    private javax.swing.JTextField jtxtEmployer;
    private javax.swing.JTextField jtxtGrossPay;
    private javax.swing.JTextField jtxtJobTitle;
    private javax.swing.JTextField jtxtNetPay;
    private javax.swing.JTextField jtxtNiNumber;
    private javax.swing.JTextField jtxtReferenceNo;
    private javax.swing.JTextField jtxtTaxableWages;
    private javax.swing.JTextField jtxtUntaxedIncome;
    // End of variables declaration                   

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class mysql {

        public mysql() {
        }

        public static class jdbc {

            public static String Driver;

            public jdbc() {
            }
        }
    }

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }
}

    
    

