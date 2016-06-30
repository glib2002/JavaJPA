/*
 * Copyright (C) 2016 CodeFireUA <edu@codefire.com.ua>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ua.com.codefire;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import ua.com.codefire.entity.Article;
import ua.com.codefire.entity.Category;

/**
 *
 * @author CodeFireUA <edu@codefire.com.ua>
 */
public class MainFrame extends javax.swing.JFrame {

    EntityManagerFactory factory;

    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlCategories = new javax.swing.JList<>();
        jbCategoriesAdd = new javax.swing.JButton();
        jbCategoriesDel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jcbArtcles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaArticleContent = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jmbMain = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiExit = new javax.swing.JMenuItem();
        jmArticle = new javax.swing.JMenu();
        jmiArticleAddNew = new javax.swing.JMenuItem();
        jmiArticleDeleteSelected = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlCategories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCategoriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlCategories);

        jbCategoriesAdd.setText("+");
        jbCategoriesAdd.setToolTipText("");
        jbCategoriesAdd.setEnabled(false);
        jbCategoriesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCategoriesAddActionPerformed(evt);
            }
        });

        jbCategoriesDel.setText("-");
        jbCategoriesDel.setEnabled(false);
        jbCategoriesDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCategoriesDelActionPerformed(evt);
            }
        });

        jLabel1.setText("Category:");

        jcbArtcles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbArtclesMouseClicked(evt);
            }
        });
        jcbArtcles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbArtclesActionPerformed(evt);
            }
        });

        jLabel2.setText("Article:");

        jtaArticleContent.setColumns(20);
        jtaArticleContent.setRows(5);
        jtaArticleContent.setEnabled(false);
        jtaArticleContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtaArticleContentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtaArticleContent);

        jButton3.setText("Reload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jmFile.setText("File");
        jmFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFileActionPerformed(evt);
            }
        });

        jmiExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiExit.setText("Exit");
        jmFile.add(jmiExit);

        jmbMain.add(jmFile);

        jmArticle.setText("Article");
        jmArticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArticleActionPerformed(evt);
            }
        });

        jmiArticleAddNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiArticleAddNew.setText("Add new...");
        jmiArticleAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArticleAddNewActionPerformed(evt);
            }
        });
        jmArticle.add(jmiArticleAddNew);

        jmiArticleDeleteSelected.setText("Delete selected");
        jmiArticleDeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiArticleDeleteSelectedActionPerformed(evt);
            }
        });
        jmArticle.add(jmiArticleDeleteSelected);

        jmbMain.add(jmArticle);

        setJMenuBar(jmbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCategoriesAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCategoriesDel))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                            .addComponent(jcbArtcles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbArtcles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCategoriesAdd)
                    .addComponent(jbCategoriesDel)
                    .addComponent(jButton3))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiArticleDeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArticleDeleteSelectedActionPerformed

        Article article = (Article) jcbArtcles.getSelectedItem();

        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.remove(article);
        manager.getTransaction().commit();

        manager.close();

    }//GEN-LAST:event_jmiArticleDeleteSelectedActionPerformed

    private void jlCategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCategoriesMouseClicked

        if (evt.getClickCount() == 2) {

            evt.consume();
            showCategories();
            // TODO add your handling code here:
        }

    }//GEN-LAST:event_jlCategoriesMouseClicked

    private void jcbArtclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbArtclesActionPerformed

    }//GEN-LAST:event_jcbArtclesActionPerformed

    private void jmFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFileActionPerformed
        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jmFileActionPerformed

    private void jmArticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArticleActionPerformed

        // TODO add your handling code here:

    }//GEN-LAST:event_jmArticleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reload();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jcbArtclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbArtclesMouseClicked
        DefaultComboBoxModel dlm = (DefaultComboBoxModel) jlCategories.getModel();
        List<Article> listArticles = Category.getArticles();
        if (evt.getClickCount() == 2) {
            for (Article art : listArticles) {
                dlm.addElement("Item " + listArticles);
            }
// TODO add your handling code here:
        }

    }//GEN-LAST:event_jcbArtclesMouseClicked

    private void jtaArticleContentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtaArticleContentMouseClicked

        showCategories();

    }//GEN-LAST:event_jtaArticleContentMouseClicked

    private void jbCategoriesDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCategoriesDelActionPerformed


    }//GEN-LAST:event_jbCategoriesDelActionPerformed

    private void jbCategoriesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCategoriesAddActionPerformed


    }//GEN-LAST:event_jbCategoriesAddActionPerformed

    private void jmiArticleAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiArticleAddNewActionPerformed

        Article article = Category.getArticles();

        // Statement
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(article);
        manager.getTransaction().commit();

        manager.flush();
        manager.close();

        jcbArtcles.getModel().setSelectedItem(article);


    }//GEN-LAST:event_jmiArticleAddNewActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCategoriesAdd;
    private javax.swing.JButton jbCategoriesDel;
    private javax.swing.JComboBox<String> jcbArtcles;
    private javax.swing.JList<String> jlCategories;
    private javax.swing.JMenu jmArticle;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JMenuItem jmiArticleAddNew;
    private javax.swing.JMenuItem jmiArticleDeleteSelected;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JTextArea jtaArticleContent;
    // End of variables declaration//GEN-END:variables

    private void showCategories() {
        DefaultListModel dlm = (DefaultListModel) jlCategories.getModel();

        List<Article> listArticles = Category.getArticles();
        for (Article art : listArticles) {
            dlm.addElement("Item " + listArticles);
        }

    }

    private void reload() {

        Object[] databaseArray = Category.getArticles().toArray();

        jcbArtcles.setModel(new DefaultComboBoxModel(databaseArray));

        saveData();

    }

    private void saveData() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("MainPU");
        EntityManager manager = factory.createEntityManager();
        manager.merge(factory);
        manager.flush();
    }
}