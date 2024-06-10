
/**
 *
 * @author diaz
 */
import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.NumberFormat;
import java.text.ParseException;

public class MainFrame extends javax.swing.JFrame {

    public static double result = 0;
    public static double num1 = 0;
    public static double num2 = 0;
    public static String operation;
    private NumberFormat numberFormat;

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        numberFormat = NumberFormat.getNumberInstance();
    }

    public void formatText() {
        try {
            String text = result_box.getText();
            if (!text.isEmpty()) {
                Number number = numberFormat.parse(text);
                result_box.setText(numberFormat.format(number));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    public static String removeCommas(String input) {
        if (input == null) {
            return null;
        }
        return input.replace(",", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        neg_pos_btn = new javax.swing.JButton();
        ac_btn = new javax.swing.JButton();
        div_btn = new javax.swing.JButton();
        mod_btn = new javax.swing.JButton();
        mult_btn = new javax.swing.JButton();
        nine_btn = new javax.swing.JButton();
        eight_btn = new javax.swing.JButton();
        seven_btn = new javax.swing.JButton();
        minus_btn = new javax.swing.JButton();
        six_btn = new javax.swing.JButton();
        five_btn = new javax.swing.JButton();
        four_btn = new javax.swing.JButton();
        plus_btn = new javax.swing.JButton();
        three_btn = new javax.swing.JButton();
        two_btn = new javax.swing.JButton();
        one_btn = new javax.swing.JButton();
        equal_btn = new javax.swing.JButton();
        period_btn = new javax.swing.JButton();
        zero_btn = new javax.swing.JButton();
        result_box = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        neg_pos_btn.setText("+/-");
        neg_pos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neg_pos_btnActionPerformed(evt);
            }
        });

        ac_btn.setText("AC");
        ac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_btnActionPerformed(evt);
            }
        });

        div_btn.setText("/");
        div_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                div_btnActionPerformed(evt);
            }
        });

        mod_btn.setText("%");
        mod_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mod_btnActionPerformed(evt);
            }
        });

        mult_btn.setText("X");
        mult_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mult_btnActionPerformed(evt);
            }
        });

        nine_btn.setText("9");
        nine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nine_btnActionPerformed(evt);
            }
        });

        eight_btn.setText("8");
        eight_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eight_btnActionPerformed(evt);
            }
        });

        seven_btn.setText("7");
        seven_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seven_btnActionPerformed(evt);
            }
        });

        minus_btn.setText("-");
        minus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_btnActionPerformed(evt);
            }
        });

        six_btn.setText("6");
        six_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                six_btnActionPerformed(evt);
            }
        });

        five_btn.setText("5");
        five_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                five_btnActionPerformed(evt);
            }
        });

        four_btn.setText("4");
        four_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_btnActionPerformed(evt);
            }
        });

        plus_btn.setText("+");
        plus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_btnActionPerformed(evt);
            }
        });

        three_btn.setText("3");
        three_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_btnActionPerformed(evt);
            }
        });

        two_btn.setText("2");
        two_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_btnActionPerformed(evt);
            }
        });

        one_btn.setText("1");
        one_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_btnActionPerformed(evt);
            }
        });

        equal_btn.setText("=");
        equal_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal_btnActionPerformed(evt);
            }
        });

        period_btn.setText(".");
        period_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                period_btnActionPerformed(evt);
            }
        });

        zero_btn.setText("0");
        zero_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero_btnActionPerformed(evt);
            }
        });

        result_box.setEditable(false);
        result_box.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(period_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mult_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ac_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(neg_pos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mod_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(div_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(result_box))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(result_box, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(neg_pos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mult_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(period_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void one_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_btnActionPerformed
        result_box.setText(result_box.getText() + "1");
        formatText();
    }//GEN-LAST:event_one_btnActionPerformed

    private void two_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_btnActionPerformed
        result_box.setText(result_box.getText() + "2");
        formatText();
    }//GEN-LAST:event_two_btnActionPerformed

    private void three_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_btnActionPerformed
        result_box.setText(result_box.getText() + "3");
        formatText();
    }//GEN-LAST:event_three_btnActionPerformed

    private void four_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_btnActionPerformed
        result_box.setText(result_box.getText() + "4");
        formatText();
    }//GEN-LAST:event_four_btnActionPerformed

    private void five_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_five_btnActionPerformed
        result_box.setText(result_box.getText() + "5");
        formatText();
    }//GEN-LAST:event_five_btnActionPerformed

    private void six_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_six_btnActionPerformed
        result_box.setText(result_box.getText() + "6");
        formatText();
    }//GEN-LAST:event_six_btnActionPerformed

    private void seven_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seven_btnActionPerformed
        result_box.setText(result_box.getText() + "7");
        formatText();
    }//GEN-LAST:event_seven_btnActionPerformed

    private void eight_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eight_btnActionPerformed
        result_box.setText(result_box.getText() + "8");
        formatText();
    }//GEN-LAST:event_eight_btnActionPerformed

    private void nine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nine_btnActionPerformed
        result_box.setText(result_box.getText() + "9");
        formatText();
    }//GEN-LAST:event_nine_btnActionPerformed

    private void zero_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero_btnActionPerformed
        result_box.setText(result_box.getText() + "0");
        formatText();
    }//GEN-LAST:event_zero_btnActionPerformed

    private void period_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_period_btnActionPerformed
        result_box.setText(result_box.getText() + ".");

    }//GEN-LAST:event_period_btnActionPerformed

    private void ac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_btnActionPerformed
        result_box.setText("");
    }//GEN-LAST:event_ac_btnActionPerformed

    private void plus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus_btnActionPerformed
        MainFrame.num1 = Float.parseFloat(removeCommas(result_box.getText()));
        result_box.setText("");
        MainFrame.operation = "+";
    }//GEN-LAST:event_plus_btnActionPerformed

    private void equal_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal_btnActionPerformed
        switch (MainFrame.operation) {
            case "+" -> {
                MainFrame.num2 = Float.parseFloat(result_box.getText());
                result_box.setText(String.valueOf(MainFrame.num1 + MainFrame.num2));
                formatText();
            }
            case "-" -> {
                MainFrame.num2 = Float.parseFloat(result_box.getText());
                result_box.setText(String.valueOf(MainFrame.num1 - MainFrame.num2));
                formatText();
            }
            case "*" -> {
                MainFrame.num2 = Float.parseFloat(result_box.getText());
                result_box.setText(String.valueOf(MainFrame.num1 * MainFrame.num2));
                formatText();
            }
            case "/" -> {
                MainFrame.num2 = Float.parseFloat(result_box.getText());
                result_box.setText(String.valueOf(MainFrame.num1 / MainFrame.num2));
                formatText();
            }
            case "%" -> {
                MainFrame.num2 = Float.parseFloat(result_box.getText());
                result_box.setText(String.valueOf(MainFrame.num1 % MainFrame.num2));
                formatText();
            }
            default -> {
            }
        }
    }//GEN-LAST:event_equal_btnActionPerformed

    private void minus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus_btnActionPerformed
        MainFrame.num1 = Float.parseFloat(removeCommas(result_box.getText()));
        result_box.setText("");
        MainFrame.operation = "-";
    }//GEN-LAST:event_minus_btnActionPerformed

    private void mult_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mult_btnActionPerformed
        MainFrame.num1 = Float.parseFloat(removeCommas(result_box.getText()));
        result_box.setText("");
        MainFrame.operation = "*";
    }//GEN-LAST:event_mult_btnActionPerformed

    private void div_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_div_btnActionPerformed
        MainFrame.num1 = Float.parseFloat(removeCommas(result_box.getText()));
        result_box.setText("");
        MainFrame.operation = "/";
    }//GEN-LAST:event_div_btnActionPerformed

    private void mod_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mod_btnActionPerformed
        MainFrame.num1 = Float.parseFloat(removeCommas(result_box.getText()));
        result_box.setText("");
        MainFrame.operation = "%";
    }//GEN-LAST:event_mod_btnActionPerformed

    private void neg_pos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neg_pos_btnActionPerformed
        String rslt = String.valueOf(Float.parseFloat(result_box.getText()) * -1);
        result_box.setText(removeCommas(rslt));
    }//GEN-LAST:event_neg_pos_btnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ac_btn;
    private javax.swing.JButton div_btn;
    private javax.swing.JButton eight_btn;
    private javax.swing.JButton equal_btn;
    private javax.swing.JButton five_btn;
    private javax.swing.JButton four_btn;
    private javax.swing.JButton minus_btn;
    private javax.swing.JButton mod_btn;
    private javax.swing.JButton mult_btn;
    private javax.swing.JButton neg_pos_btn;
    private javax.swing.JButton nine_btn;
    private javax.swing.JButton one_btn;
    private javax.swing.JButton period_btn;
    private javax.swing.JButton plus_btn;
    private javax.swing.JTextField result_box;
    private javax.swing.JButton seven_btn;
    private javax.swing.JButton six_btn;
    private javax.swing.JButton three_btn;
    private javax.swing.JButton two_btn;
    private javax.swing.JButton zero_btn;
    // End of variables declaration//GEN-END:variables
}
