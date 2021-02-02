package app.modconta.view;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.Proveedor;
import MODEL.ProveedorDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author MARCELO
 */
public class ProveedorView extends javax.swing.JInternalFrame {
    //variables  
    ProveedorDAO ProveedorDAO;
    DefaultTableModel dtm;
    boolean sw = false;
    String cad = "";
    int IdProv; 
    
    public ProveedorView() {
        this.setVisible(true);
        ProveedorDAO = new ProveedorDAO();
        initComponents(); 
        dtm = (DefaultTableModel)tblProveedor.getModel();
        llenaTabla(false, "");
    }  
   
    public void llenaTabla(boolean swr, String cadr)
    {
        Vector<Proveedor> persot = ProveedorDAO.ListaItem(swr, cadr);
        int i = persot.size(); 
        for(int j = 0; j<i;j++){
            Vector vect = new Vector();
            vect.addElement(persot.get(j).getIdProveedor());
            vect.addElement(persot.get(j).getRazonSocial());
            vect.addElement(persot.get(j).getTelefono());
            vect.addElement(persot.get(j).getDireccion());
            vect.addElement(persot.get(j).getRUC());
            dtm.addRow(vect);
        }
        
    } 
    public void llenaModifica(){
        int est;
        String cadx;
        int fila=this.tblProveedor.getSelectedRow();
        this.IdProv=Integer.parseInt(dtm.getValueAt(fila, 0).toString().trim());
        this.txtRazonSocial.setText(((String)dtm.getValueAt(fila, 1)).trim());
        this.txtTelefono.setText(((String)dtm.getValueAt(fila, 2)).trim());
        this.txtDireccion.setText(((String)dtm.getValueAt(fila, 3)).trim());
        this.txtRUC.setText(((String)dtm.getValueAt(fila, 4)).trim());
        
        this.btnRegistrar.setText("Actualizar");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtRUC = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("::CLIENTE_FRM::");
        setAutoscrolls(true);
        getContentPane().setLayout(null);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(590, 92, 155, 30);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel3.setLayout(null);

        jLabel2.setText("Búsqueda");
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 30);

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProveedor", "RazonSocial", "Telefono", "Direccion", "RUC"
            }
        ));
        tblProveedor.setToolTipText("");
        tblProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedor);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 460, 240);

        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField1);
        jTextField1.setBounds(110, 10, 370, 30);

        jTabbedPane1.addTab("Búsqueda", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel3.setText("RazonSocial");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 20, 90, 20);

        jLabel4.setText("Telefono");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(50, 60, 70, 16);

        txtRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazonSocialActionPerformed(evt);
            }
        });
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyPressed(evt);
            }
        });
        jPanel4.add(txtRazonSocial);
        txtRazonSocial.setBounds(130, 10, 310, 30);

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });
        jPanel4.add(txtTelefono);
        txtTelefono.setBounds(130, 50, 310, 30);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);
        btnLimpiar.setBounds(460, 70, 80, 40);

        txtRUC.setName("txtRUC"); // NOI18N
        txtRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUCActionPerformed(evt);
            }
        });
        jPanel4.add(txtRUC);
        txtRUC.setBounds(130, 140, 310, 30);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrarKeyPressed(evt);
            }
        });
        jPanel4.add(btnRegistrar);
        btnRegistrar.setBounds(450, 10, 100, 50);

        jLabel7.setText("RUC");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(60, 140, 30, 16);

        jLabel1.setText("Dirección");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(50, 100, 70, 20);
        jPanel4.add(txtDireccion);
        txtDireccion.setBounds(130, 90, 310, 30);

        jTabbedPane1.addTab("Registrar", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(12, 69, 560, 356);

        jButton1.setText("Generar Reporte Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 129, 210, 53);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MANTENIMIENTO - PROVEEDOR");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(12, 22, 560, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        if(evt.getClickCount() == 1){
            this.jTabbedPane1.setSelectedIndex(1);
            llenaModifica();
        }
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtRazonSocialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtRazonSocialKeyPressed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            this.getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRUCActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = "";
        if(valida() == true){
            util u = new util();
            Proveedor p = new Proveedor();
            p.setRazonSocial(this.txtRazonSocial.getText());
            p.setTelefono(this.txtTelefono.getText());
            p.setDireccion(this.txtDireccion.getText());
            p.setRUC(this.txtRUC.getText());
            if(proc.equals("Registrar")){
                id = u.idNext("Proveedor", "IdProveedor");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                id = this.IdProv;
                pr = "update";
            }
            p.setIdProveedor(id);
            ProveedorDAO.procesaItem(p, pr);
            limpiaControles();
            limpiaTabla();
            llenaTabla(false, "");
        }   

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void txtRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazonSocialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/ProveedorReporte.jrxml");
              JasperPrint jp= JasperFillManager.fillReport(jr,null,cn);
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed
  
    public void limpiaControles(){
        this.txtRazonSocial.setText("");
        this.txtTelefono.setText("");
        this.txtDireccion.setText("");
        this.txtRUC.setText("");
        this.btnRegistrar.setText("Registrar");
        this.txtRazonSocial.requestFocus();
    }
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblProveedor.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
    public boolean valida(){
        boolean sw = false;
        if(this.txtRazonSocial.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Razon Social");
        }else{
            if(this.txtTelefono.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese Telefono");
            }else{
                sw = true;
            }
        } if(this.txtDireccion.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Direccion");
        }else{
            if(this.txtRUC.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese RUC");
            }else{
                sw = true;
            }
        }
        return sw;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
