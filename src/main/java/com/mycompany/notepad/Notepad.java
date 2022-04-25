package com.mycompany.notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.*;
import java.util.HashMap;
import javax.swing.JMenuItem;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class Notepad extends javax.swing.JFrame {

    public Notepad() {
       initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        ficheroBtn = new javax.swing.JMenu();
        nuevoBtn = new javax.swing.JMenuItem();
        abrirFicheroBtn = new javax.swing.JMenuItem();
        guardarBtn = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salirManuBtn = new javax.swing.JMenuItem();
        editarBtn = new javax.swing.JMenu();
        copiarBtn = new javax.swing.JMenuItem();
        cortarBtn = new javax.swing.JMenuItem();
        pegarBtn = new javax.swing.JMenuItem();
        ayudaBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        ficheroBtn.setText("Fichero");

        nuevoBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raque\\OneDrive\\Documentos\\NetBeansProjects\\Notepad\\img\\nuevo.png")); // NOI18N
        nuevoBtn.setText("Nuevo");
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });
        ficheroBtn.add(nuevoBtn);

        abrirFicheroBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raque\\OneDrive\\Documentos\\NetBeansProjects\\Notepad\\img\\abrir.png")); // NOI18N
        abrirFicheroBtn.setText("Abrir fichero...");
        abrirFicheroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirFicheroBtnActionPerformed(evt);
            }
        });
        ficheroBtn.add(abrirFicheroBtn);

        guardarBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raque\\OneDrive\\Documentos\\NetBeansProjects\\Notepad\\img\\guardar.png")); // NOI18N
        guardarBtn.setText("Guardar");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });
        ficheroBtn.add(guardarBtn);
        ficheroBtn.add(jSeparator1);

        salirManuBtn.setText("Salir");
        ficheroBtn.add(salirManuBtn);

        jMenuBar1.add(ficheroBtn);

        editarBtn.setText("Editar");

        copiarBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copiarBtn.setText("Copiar");
        copiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarBtnActionPerformed(evt);
            }
        });
        editarBtn.add(copiarBtn);

        cortarBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cortarBtn.setText("Cortar");
        cortarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarBtnActionPerformed(evt);
            }
        });
        editarBtn.add(cortarBtn);

        pegarBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pegarBtn.setText("Pegar");
        pegarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarBtnActionPerformed(evt);
            }
        });
        editarBtn.add(pegarBtn);

        jMenuBar1.add(editarBtn);

        ayudaBtn.setText("Ayuda");
        ayudaBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ayudaBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ayudaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudaBtnMouseClicked(evt);
            }
        });
        jMenuBar1.add(ayudaBtn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ayudaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaBtnMouseClicked
        JOptionPane.showMessageDialog(this, "This program is an exercise for the Programming subject. \n IES el Caminàs");
    }//GEN-LAST:event_ayudaBtnMouseClicked

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
        if (textArea != null){
           int n = JOptionPane.showConfirmDialog(this, "Do you want to delete the current text?", "Remove text?", JOptionPane.YES_NO_OPTION);
            
            if(n == 0){
                textArea.setText("");
            } 
        }     
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        guardarTexto();
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void guardarTexto(){
                try {
            JFileChooser archivo = new JFileChooser(System.getProperty("user.dir"));
            archivo.showSaveDialog(this);
                if (archivo.getSelectedFile() != null) {
                    try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                    guardado.write(textArea.getText());
                    JOptionPane.showMessageDialog(rootPane, "El archivo fue guardado con éxito en la ruta establecida");
                    }
                }
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
            }           
    }
    
    private void abrirFicheroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirFicheroBtnActionPerformed
        String aux = "";
        String text = "";

        if (!"".equals(textArea.getText())) {
            int n = JOptionPane.showConfirmDialog(this, "Do you want to save the current document?", "Remove text?", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                guardarTexto();
            } 
        }
        try {
            JFileChooser file = new JFileChooser(System.getProperty("user.dir"));
            file.showOpenDialog(this);
            File fileSelected = file.getSelectedFile();

            if (fileSelected != null) {
                FileReader archivos = new FileReader(fileSelected);
                BufferedReader read = new BufferedReader(archivos);
                while ((aux = read.readLine()) != null) {
                    text += aux + "\n";
                }
                read.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error Importando - " + ex);
        }

    }//GEN-LAST:event_abrirFicheroBtnActionPerformed

    private void copiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarBtnActionPerformed
       textArea.copy();
    }//GEN-LAST:event_copiarBtnActionPerformed

    private void cortarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarBtnActionPerformed
        textArea.cut();
    }//GEN-LAST:event_cortarBtnActionPerformed
    
    private void pegarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarBtnActionPerformed
        textArea.paste();
    }//GEN-LAST:event_pegarBtnActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirFicheroBtn;
    private javax.swing.JMenu ayudaBtn;
    private javax.swing.JMenuItem copiarBtn;
    private javax.swing.JMenuItem cortarBtn;
    private javax.swing.JMenu editarBtn;
    private javax.swing.JMenu ficheroBtn;
    public javax.swing.JMenuItem guardarBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem nuevoBtn;
    private javax.swing.JMenuItem pegarBtn;
    private javax.swing.JMenuItem salirManuBtn;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

}
