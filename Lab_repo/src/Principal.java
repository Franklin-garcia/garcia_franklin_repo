
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menu_pop = new javax.swing.JPopupMenu();
        jmi_crear_hijo = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_modificar = new javax.swing.JMenuItem();
        menu_pop2 = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_altura = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_color_pelo = new javax.swing.JTextField();
        tf_sexo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descripcion = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_personas = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jmi_crear_hijo.setText("Crear hijo");
        jmi_crear_hijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crear_hijoActionPerformed(evt);
            }
        });
        menu_pop.add(jmi_crear_hijo);

        jmi_eliminar.setText("eliminar");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        menu_pop.add(jmi_eliminar);

        jmi_modificar.setText("modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        menu_pop.add(jmi_modificar);

        Eliminar.setText("eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        menu_pop2.add(Eliminar);

        Modificar.setText("modificar");
        Modificar.setToolTipText("");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        menu_pop2.add(Modificar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabStateChanged(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Edad");

        jLabel10.setText("Altura");

        jLabel11.setText("Sexo");

        jLabel12.setText("Color pelo");

        jLabel13.setText("Descripcion");

        tf_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_edadActionPerformed(evt);
            }
        });

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        ta_descripcion.setColumns(20);
        ta_descripcion.setRows(5);
        jScrollPane2.setViewportView(ta_descripcion);

        jLabel15.setText("Nuevo Padre");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_edad)
                            .addComponent(tf_altura)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(64, 64, 64)
                        .addComponent(tf_sexo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_color_pelo)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(51, 51, 51)
                        .addComponent(tf_nombre)))
                .addGap(322, 322, 322))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_color_pelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nuevo padre", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        tab.addTab("Agregar", jPanel1);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Personas");
        jt_personas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_personasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_personas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tab.addTab("Ver el arbol", jPanel4);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tab.addTab("Listar los guardados", jPanel2);

        jMenu3.setText("Menu principal");

        jMenuItem1.setText("Guardar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Cargar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("About");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabStateChanged


    }//GEN-LAST:event_tabStateChanged

    private void tf_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_edadActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //Padre padre = (Padre) cb_padre.getSelectedItem();
        String nombre = tf_nombre.getText();
        String edad = tf_edad.getText();
        String altura = tf_altura.getText();
        String sexo = tf_sexo.getText();
        String color_pelo = tf_color_pelo.getText();
        String descripcion = ta_descripcion.getText();

        DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();

        //Padre padre, String nombre, String edad, String altura, String sexo, String color_pelo, String descripcion, String tipo        
        /*Hijo h = new Hijo(new Padre(), nombre, edad, altura, sexo, color_pelo, descripcion, "hijo");
            nodo_hijo = new DefaultMutableTreeNode(h);
            nodo_padre.add(nodo_hijo);*/
        Padre p = new Padre(nombre, edad, altura, sexo, color_pelo, descripcion, "Padre");
        nodo_padre = new DefaultMutableTreeNode(p);

        adminPadre ap = new adminPadre(salida);
        ap.getListapersonas().add(p);
        ap.escribirPersonas();
        JOptionPane.showMessageDialog(this, "Se agrego");
        raiz.add(nodo_padre);
        m.reload();
        tf_nombre.setText("");
        tf_edad.setText("");
        tf_altura.setText("");
        tf_sexo.setText("");
        tf_color_pelo.setText("");
        ta_descripcion.setText("");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jt_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_personasMouseClicked
        if (evt.isMetaDown()) {
            int row = jt_personas.getClosestRowForLocation(evt.getX(), evt.getY());
            jt_personas.setSelectionRow(row);
            Object v1 = jt_personas.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Padre) {
                padre_seleccionado = (Padre) nodo_seleccionado.getUserObject();
                menu_pop.show(evt.getComponent(), evt.getX(), evt.getY());
            }
            if (nodo_seleccionado.getUserObject() instanceof Hijo) {
                hijo_seleccionado = (Hijo) nodo_seleccionado.getUserObject();
                menu_pop2.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jt_personasMouseClicked

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        String nombre = JOptionPane.showInputDialog("Nuevo Nombre");
        String edad = JOptionPane.showInputDialog("Nueva Edad");
        String altura = JOptionPane.showInputDialog("Nueva altura");
        String sexo = JOptionPane.showInputDialog("Nuevo Sexo");
        String color_pelo = JOptionPane.showInputDialog("Nuevo Color de pelo");
        String descripcion = JOptionPane.showInputDialog("Nuevo descripcion");
        padre_seleccionado.setNombre(nombre);
        padre_seleccionado.setAltura(altura);
        padre_seleccionado.setColor_pelo(color_pelo);
        padre_seleccionado.setDescripcion(descripcion);
        padre_seleccionado.setEdad(edad);
        padre_seleccionado.setSexo(sexo);

    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();
        m.removeNodeFromParent(nodo_seleccionado);
        m.reload();
    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmi_crear_hijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crear_hijoActionPerformed
        String nombre = JOptionPane.showInputDialog("Nombre");
        String edad = JOptionPane.showInputDialog("Edad");
        String altura = JOptionPane.showInputDialog("altura");
        String sexo = JOptionPane.showInputDialog("Sexo");
        String color_pelo = JOptionPane.showInputDialog("Color de pelo");
        String descripcion = JOptionPane.showInputDialog("descripcion");
        Hijo h = new Hijo(nombre, edad, altura, sexo, color_pelo, descripcion, "hijo");

        DefaultMutableTreeNode nodo_hijo;
        nodo_hijo = new DefaultMutableTreeNode(h);
        nodo_padre.add(nodo_hijo);
        adminHijo ah = new adminHijo(salida);
        ah.getListapersonas().add(h);
        ah.escribirPersonas();
        JOptionPane.showMessageDialog(this, "Se agrego");
    }//GEN-LAST:event_jmi_crear_hijoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        File dir = null;
        JFileChooser filechooser = new JFileChooser();
        int seleccion = filechooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            dir = filechooser.getSelectedFile();
        }
        administracionPersonas ah = new administracionPersonas(dir.getAbsolutePath());
        ah.cargarArchivo();
        ah.setPersona(padre_seleccionado);
        ah.escribirArchivo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) jt_personas.getModel();
        m.removeNodeFromParent(nodo_seleccionado);
        m.reload();
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        String nombre = JOptionPane.showInputDialog("Nuevo Nombre");
        String edad = JOptionPane.showInputDialog("Nueva Edad");
        String altura = JOptionPane.showInputDialog("Nueva altura");
        String sexo = JOptionPane.showInputDialog("Nuevo Sexo");
        String color_pelo = JOptionPane.showInputDialog("Nuevo Color de pelo");
        String descripcion = JOptionPane.showInputDialog("Nueva descripcion");
        hijo_seleccionado.setAltura(altura);
        hijo_seleccionado.setColor_pelo(color_pelo);
        hijo_seleccionado.setDescripcion(descripcion);
        hijo_seleccionado.setEdad(edad);
        hijo_seleccionado.setNombre(nombre);
        hijo_seleccionado.setSexo(sexo); 
    }//GEN-LAST:event_ModificarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;        
        try {
            JFileChooser jfc = new JFileChooser();      
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                jTextArea1.setText("");
                while ((linea = br.readLine()) != null) {
                    jTextArea1.append(linea);
                    jTextArea1.append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem jmi_crear_hijo;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JTree jt_personas;
    private javax.swing.JPopupMenu menu_pop;
    private javax.swing.JPopupMenu menu_pop2;
    private javax.swing.JTextArea ta_descripcion;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_color_pelo;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_sexo;
    // End of variables declaration//GEN-END:variables
    DefaultMutableTreeNode nodo_padre;
    DefaultMutableTreeNode nodo_seleccionado;
    Padre padre_seleccionado;
    Hijo hijo_seleccionado;
    File salida = new File("./personas.txt");
}
