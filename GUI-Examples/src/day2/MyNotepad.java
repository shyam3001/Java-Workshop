package day2;


import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyNotepad extends javax.swing.JFrame {

    public MyNotepad() {
        initComponents();
        setLocationRelativeTo(null);
        jTextArea1.setLineWrap(true);
    }
    
    private boolean savedPreviously = false;
    private String filename;
    
    private void writeToFile(File file) throws Exception {
        PrintWriter pw = new PrintWriter(file);
        String text = jTextArea1.getText();
        pw.print(text);
        pw.close();
        JOptionPane.showMessageDialog(null, "Saved!");
    }
    
    private void writeToFileWithSave(File file, String name) throws Exception {
        writeToFile(file);
        savedPreviously = true;
        filename = name;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabelChars = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelWords = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCharsNoSpaces = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemOpen = new javax.swing.JMenuItem();
        jMenuItemSave = new javax.swing.JMenuItem();
        jMenuItemSaveAs = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemFind = new javax.swing.JMenuItem();
        jMenuItemReplace = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Notepad");
        setResizable(false);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Chars:");

        jLabelChars.setText("0");

        jLabel3.setText("Words:");

        jLabelWords.setText("0");

        jLabel5.setText("Characters Without Spaces:");

        jLabelCharsNoSpaces.setText("0");

        jMenu1.setText("File");

        jMenuItemNew.setText("New");
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNew);

        jMenuItemOpen.setText("Open");
        jMenuItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOpen);

        jMenuItemSave.setText("Save");
        jMenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSave);

        jMenuItemSaveAs.setText("Save-As");
        jMenuItemSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSaveAs);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItemFind.setText("Find");
        jMenuItemFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFindActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFind);

        jMenuItemReplace.setText("Replace");
        jMenuItemReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReplaceActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemReplace);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelChars)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelWords)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCharsNoSpaces)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelChars)
                    .addComponent(jLabel3)
                    .addComponent(jLabelWords)
                    .addComponent(jLabel5)
                    .addComponent(jLabelCharsNoSpaces))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        String text = jTextArea1.getText();
        int chars = text.length();
        int words = text.split("\\s+").length;

        text = text.replace(" ", "");
        int charnospaces = text.length();

        jLabelChars.setText("" + chars);
        jLabelWords.setText("" + words);
        jLabelCharsNoSpaces.setText("" + charnospaces);

    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        jTextArea1.setText("");
        jLabelChars.setText("0");
        jLabelCharsNoSpaces.setText("0");
        jLabelWords.setText("0");
        savedPreviously = false;
    }//GEN-LAST:event_jMenuItemNewActionPerformed

    private void jMenuItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenActionPerformed
        String name = JOptionPane.showInputDialog("Filename:");
        File file = new File(name);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String str = sc.next();
                jTextArea1.append(str + " ");
                jTextArea1KeyReleased(null); // re-use (not copied)
            }
            savedPreviously = true;
            filename = name;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File Not Found");
        }
    }//GEN-LAST:event_jMenuItemOpenActionPerformed
    
    private void jMenuItemSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveAsActionPerformed
        try {
            String name = JOptionPane.showInputDialog("Filename:");
            File file = new File(name);
            if (file.exists()) {
                int res = JOptionPane.showConfirmDialog(null, "Replace?");
                if (res == JOptionPane.YES_OPTION) {
                    writeToFileWithSave(file, name);
                }
            } else {
                file.createNewFile();
                writeToFileWithSave(file, name);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemSaveAsActionPerformed

    private void jMenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveActionPerformed
        if (savedPreviously) {
            try {
                File file = new File(filename);
                writeToFile(file);
            } catch (Exception e) {
            }
        }
        else {
            jMenuItemSaveAsActionPerformed(null);
        }
    }//GEN-LAST:event_jMenuItemSaveActionPerformed

    private void jMenuItemFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFindActionPerformed
        String find = JOptionPane.showInputDialog("Text to Find:");
        String text = jTextArea1.getText();
        int index = text.indexOf(find);
        if (index != -1) {
            jTextArea1.select(index, index + find.length());
        }
    }//GEN-LAST:event_jMenuItemFindActionPerformed

    private void jMenuItemReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReplaceActionPerformed
        String txt1 = JOptionPane.showInputDialog("Replace What?");
        String txt2 = JOptionPane.showInputDialog("Replace With?");
        String text = jTextArea1.getText();
        text = text.replace(txt1, txt2);
        jTextArea1.setText(text);
    }//GEN-LAST:event_jMenuItemReplaceActionPerformed

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
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelChars;
    private javax.swing.JLabel jLabelCharsNoSpaces;
    private javax.swing.JLabel jLabelWords;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemFind;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JMenuItem jMenuItemOpen;
    private javax.swing.JMenuItem jMenuItemReplace;
    private javax.swing.JMenuItem jMenuItemSave;
    private javax.swing.JMenuItem jMenuItemSaveAs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
