/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizedchaos;

import javax.swing.JOptionPane;

/**
 *
 * @author CATATO
 */
public class InterfazMenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form InterfazMenuInicial
     */
    public static Grafo miGrafo = new Grafo(); //Cree un constructor de Grafo vacío para inicializar un grafo de manera Public Static
    public static ListW warehouseList = new ListW();
    public static ListI itemsList = new ListI();
    public static Openertxt file = new Openertxt();
    public InterfazMenuInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        buttonPedido = new javax.swing.JButton();
        buttonAgregarAlmacen = new javax.swing.JButton();
        buttonEliminarAlmacen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        GestionarStock = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPedido.setText("Realizar pedido");
        buttonPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPedidoMouseClicked(evt);
            }
        });
        jPanel1.add(buttonPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, -1));

        buttonAgregarAlmacen.setText("Agregar Almacen");
        buttonAgregarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAgregarAlmacenMouseClicked(evt);
            }
        });
        buttonAgregarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarAlmacenActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAgregarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        buttonEliminarAlmacen.setText("Eliminar Almacen");
        buttonEliminarAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarAlmacenMouseClicked(evt);
            }
        });
        jPanel1.add(buttonEliminarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jButton1.setText("Guardar Cambios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 140, -1));

        GestionarStock.setText("Gestionar Stock");
        GestionarStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionarStockMouseClicked(evt);
            }
        });
        jPanel1.add(GestionarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/amazonWarehouse.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPedidoMouseClicked
        // TODO add your handling code here:
        InterfazPrincipal realizarPedido = new InterfazPrincipal(this);
        realizarPedido.setLocationRelativeTo(null);
        realizarPedido.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_buttonPedidoMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void buttonAgregarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAgregarAlmacenMouseClicked
        // TODO add your handling code here:
        InterfazAgregarAlmacen agregarAlmacen = new InterfazAgregarAlmacen(this);
        agregarAlmacen.setLocationRelativeTo(null);
        agregarAlmacen.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_buttonAgregarAlmacenMouseClicked

    private void buttonEliminarAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarAlmacenMouseClicked
        // TODO add your handling code here:
        InterfazEliminarAlmacen eliminarAlmacen = new InterfazEliminarAlmacen(this);
        eliminarAlmacen.setLocationRelativeTo(null);
        eliminarAlmacen.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_buttonEliminarAlmacenMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String newFile = miGrafo.paraGuardar();
        file.write(newFile);
        JOptionPane.showMessageDialog(null, "Se han guardado los cambios exitósamente.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonAgregarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarAlmacenActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonAgregarAlmacenActionPerformed

    private void GestionarStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionarStockMouseClicked
        // TODO add your handling code here:
        InterfazGestionarStock gestionarStock = new InterfazGestionarStock(this);
        gestionarStock.setLocationRelativeTo(null);
        gestionarStock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GestionarStockMouseClicked

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
            java.util.logging.Logger.getLogger(InterfazMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMenuInicial().setVisible(true);
            }
        });
        //Llamamos a la clase para abrir y leer el archivo .txt.
        InterfazMenuInicial menu = new InterfazMenuInicial(); //Creo interfaz con la lista de almacenes como parámetro
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);

        Openertxt file = new Openertxt();
        String[] separados;
        
        try{
            separados = (file.read()).split(";");
            //Llamamos a la clase para crear la lista de Almacenes y calles
            ListS roadsList = new ListS();
            //Creamos un ciclo For que recorra todos los elementos que se hayan guaradado despues del split en base al ;.
            for (int i = 0; i < separados.length; i++) {
                //Generamos un if para determinar si el elemento pertenece a los almacenes.
                if (separados[i].contains("Almacen ")) {
                    // Si pertenece a los almacenes vamos a separar su información en base a los : que contengan y asi separar el nombre del almacen de sus items.
                    String[] warehouses = separados[i].split(":");
                        //Creamos otra lista, pero esta va a ser los inventarios de cada almacen.
                        ListI inventoryList = new ListI();
                        //Declaramos la variable name que determinara el nombre del almacen que estemos recorriendo.
                        String name = warehouses[0].replace("\n","");
                        //Volvemos a separar, esta vez los items de cada almacen para tener su cantidad y nombre.
                        String[] inventory = warehouses[1].split("\n");
                        //Recorremos los items con sus debidas cantidades.
                        for (int k = 1; k < inventory.length; k++) {
                            //Separamos los items de sus cantidades en base a la , que tienen de por medio.
                            String[] items = inventory[k].split(",");
                            //Asignamos la variable item que contiene el nombre del item.
                            String item = items[0];
                            String numberString = items[1];
                            //Asignamos la variable number que contiene el numero en formato entero de la cantidad del item.
                            int number = Integer.parseInt(numberString);
                            //Creamos un objeto que contenga el nombre y la cantidad de cada item.
                            Inventory thing = new Inventory(item, number);
                            //Agregamos ese objeto a la lista que sera el inventario de cada almacen.
                            inventoryList.addLast(thing);
                            itemsList.addLast(thing);
                        }
                        Warehouse warehouse = new Warehouse(name, inventoryList);
                        warehouseList.addLast(warehouse);
                } //Generamos un else if para determinar si el elemento pertenece a las Rutas.
                else if (separados[i].contains("Rutas")) {
                    String[] routs = separados[i + 1].split("\n");

                    for (int j = 1; j < routs.length; j++) {
                        String[] streets = routs[j].split(",");
                        String warehouse1 = "Almacen " + streets[0];
                        String warehouse2 = "Almacen " + streets[1];
                        String distanceString = streets[2];
                        int distance = Integer.parseInt(distanceString);
                        Street roads = new Street(warehouse1, warehouse2, distance);
                        roadsList.addLast(roads);
                    }
                }
            }
            miGrafo = new Grafo(warehouseList, roadsList);
        } catch (NullPointerException e){
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionarStock;
    private javax.swing.JButton buttonAgregarAlmacen;
    private javax.swing.JButton buttonEliminarAlmacen;
    private javax.swing.JButton buttonPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
