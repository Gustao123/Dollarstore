/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DAOCliente;
import modelo.proveedor;
import modelo.DAOProveedor;

/**
 *
 * @author juriel
 */
public class JFrameProveedor extends javax.swing.JFrame {

    

    /**
     * Creates new form Proveedor
     */
    public JFrameProveedor() throws SQLException{
        initComponents();
         jTextID.setEnabled(false);
         
        obtenerDatos();
    }
     private void obtenerDatos() throws SQLException{
        
        List<proveedor> proveedores = new DAOProveedor().ObtenerDatos();
        
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] columnas={"proveedor_id", "company","telefono",
            "correo_electro"};
        
        modelo.setColumnIdentifiers(columnas);
        for (proveedor pr: proveedores){
            
            String[] renglon ={Integer.toString(pr.getproveedor_id()),
                pr.getCompany(),pr.getTelefono(), 
                pr.getCorreo_electro()};
            modelo.addRow(renglon);
        }
        jTproveedor.setModel(modelo);
    }
     
          private void limpiarcampor(){
           jTextID.setText("");
           jTextcompa.setText("");
           jtexttele.setText("");
           jTextcorre.setText("");
         
    
}
       public void Actualizarproveedor()throws SQLException{
           int id=Integer.parseInt(this.jTextID.getText());
           String com=this.jTextcompa.getText();
           String tele=this.jtexttele.getText();
           String corre=this.jTextcorre.getText();
      
           proveedor pr=new proveedor(id,com,tele ,
                   corre);
           DAOProveedor dao=new DAOProveedor();
           int res= dao.Actualizar(pr);
           if(res==0){
               JOptionPane.showMessageDialog(rootPane,
                       "¡Se a actualizado!");
               
           }else{
               JOptionPane.showMessageDialog(rootPane, 
                       "Algo salío mal");
           }
           
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jtexttele = new javax.swing.JFormattedTextField();
        jTextcompa = new javax.swing.JTextField();
        jTextcorre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTproveedor = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(63, 218, 132));
        jPanel3.setForeground(new java.awt.Color(0, 153, 102));

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Dollar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Store");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextField4.setText("Buscar Proveedor");

        jBbuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/buscar.png"))); // NOI18N
        jBbuscar.setText("Buscar");

        jLabel6.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proveedor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 769, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBbuscar)
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Teléfono");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Company");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Correo Electroníco");

        jBAgregar.setBackground(new java.awt.Color(0, 153, 51));
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/boton-agregar.png"))); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID");

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        try {
            jtexttele.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtexttele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextteleActionPerformed(evt);
            }
        });

        jTextcompa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextcompaKeyTyped(evt);
            }
        });

        jTextcorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcorreActionPerformed(evt);
            }
        });
        jTextcorre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextcorreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextcorre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextcompa, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtexttele, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jBAgregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextcompa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtexttele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextcorre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/actualizar (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTproveedor.setAutoCreateRowSorter(true);
        jTproveedor.setBackground(new java.awt.Color(255, 255, 255));
        jTproveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTproveedor);

        jButton4.setBackground(new java.awt.Color(0, 153, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/editar (1).png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono/eliminar (1).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextcompaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextcompaKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if ((car<'a' || car>'z')&&(car<'A'||car>'Z')
            && car !='á'
            && car !='é'
            && car !='í'
            && car !='ó'
            && car !='ú'
            && car !='Á'
            && car !='É'
            && car !='Í'
            && car !='Ó'
            && car !='Ú'
            && car !='Ü'
            && car !='ü'
            && car !='Ñ'
            && car !='ñ'
            && car !=(char) KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_jTextcompaKeyTyped

    private void jTextcorreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextcorreKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if ((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car<1)
            &&car !='á'
            &&car !='é'
            &&car !='í'
            &&car !='ó'
            &&car !='ú'
            &&car !='Á'
            &&car !='É'
            &&car !='Í'
            &&car !='Ó'
            &&car !='Ú'
            &&car !='Ü'
            &&car !='ü'
            &&car !='Ñ'
            &&car !='ñ'
            &&car !='@'
            &&car !='.'
            &&car !=','
            &&car !=(char)KeyEvent.VK_SPACE){
            evt.consume();
        }
    }//GEN-LAST:event_jTextcorreKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           int fila=this.jTproveedor.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(rootPane, 
                    "Seleccione un registro");
        }else{
            try{
                int id =Integer.parseInt((String)this.jTproveedor.
                        getValueAt(fila, 0).toString());
                String com=(String)this.jTproveedor.getValueAt(fila, 1);
                String tele=(String)this.jTproveedor.getValueAt(fila, 2);
                String corr=(String)this.jTproveedor.getValueAt(fila, 3).toString();
                
                jTextID.setText(""+id);
                jTextcompa.setText(com);
                jtexttele.setText(tele);
                jTextcorre.setText(corr);
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane,
                        "¡Ocurrio un error!"+e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                try{
                Actualizarproveedor();
            }catch(SQLException ex){
                Logger.getLogger(JFrameProveedor.class.getName()).
                    log(Level.SEVERE,null,ex); 
            }
            try{
                obtenerDatos();
            }catch(SQLException ex){
                 Logger.getLogger(JFrameProveedor.class.getName()).
                    log(Level.SEVERE,null,ex);
            }
        limpiarcampor();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiarcampor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        // TODO add your handling code here:
          try {
            String comp=jTextcompa.getText();
            String tele=jtexttele.getText();
            String corre=jTextcorre.getText();
            
            
            if (comp.contentEquals("")|| tele.contentEquals("")
                    || corre.contentEquals("")){
                JOptionPane.showMessageDialog(rootPane, 
                        "Todos los campos son obligatorios");
            }else{
                try {
                    
                    
                    proveedor pro =new proveedor(comp, tele, corre);
                    DAOProveedor dao = new DAOProveedor();
                    if(dao.insertar(pro) == 0) {
                        JOptionPane.showMessageDialog(rootPane, 
                                "Registro agregado");
                    }
                    
                }catch (HeadlessException | SQLException e){
                      JOptionPane.showMessageDialog(rootPane, 
                                "No se agrego otro registro");
                }
            }
            obtenerDatos();
            limpiarcampor();
        }catch(SQLException ex){
            Logger.getLogger(JFrameProveedor.class.getName()). 
                    log(Level.SEVERE, null,ex);
        
   
    }                                     
        
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jTextcorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcorreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcorreActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int fila=this.jTproveedor.getSelectedRow();
       if(fila==-1){
       JOptionPane.showMessageDialog(rootPane,
               "Selecione un registro");
       }else{
           JDialog.setDefaultLookAndFeelDecorated(true);
           int resp= JOptionPane.showConfirmDialog(null,
                   "¿Estas seguro que quieres eliminarlo?", 
                   "Aceptar",JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
           if(resp==JOptionPane.NO_OPTION){
              JOptionPane.showMessageDialog(rootPane,
                      "Registro no borrado");
              
           }else{
               
               if(resp==JOptionPane.YES_OPTION){
                   try{
                   int id =Integer.parseInt((String)
                           this.jTproveedor.getValueAt( fila,0).toString());
                   DAOProveedor dao= new DAOProveedor();
                   dao.delete(id);
                   obtenerDatos();
                   
               }catch(SQLException ex){
                       Logger.getLogger(JFrameProveedor.class.getName()).
                    log(Level.SEVERE,null,ex); 
                       }
               }
           }
           if (resp==JOptionPane.CLOSED_OPTION){
               JOptionPane.showMessageDialog(rootPane, 
                       "Ninguna accion realizada");
           }
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtextteleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextteleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextteleActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameProveedor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameProveedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextcompa;
    private javax.swing.JTextField jTextcorre;
    private javax.swing.JTable jTproveedor;
    private javax.swing.JFormattedTextField jtexttele;
    // End of variables declaration//GEN-END:variables
}