package app.modconta.view;
import app.modconta.databaase.Helper;
import app.modconta.databaase.dbBean;
import app.modconta.databaase.util;
import app.modconta.entity.DetalleVenta;
import app.modconta.entity.DetalleServicio;
import app.modconta.entity.Servicio;
import MODEL.EquipoDAO;
import MODEL.ServicioDAO;
import MODEL.VentaDAO;
import MODEL.detserDAO;
import java.sql.Connection;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class ServicioView extends javax.swing.JInternalFrame {
      //variables  
    EquipoDAO eqx = new EquipoDAO();
    ServicioDAO ServicioDAO;
    detserDAO detserDAO;
    VentaDAO vaux;
    DefaultTableModel dtm,dtm2;
    boolean sw = false;
    String cad = "";
    int idClie; 
    Helper h = new Helper();
    public ServicioView() {
        ServicioDAO = new ServicioDAO();
        detserDAO = new detserDAO();
        initComponents();
        comboEquipos.setEnabled(false);
        AreaCausa.setEnabled(false);
        AreaFallas.setEnabled(false);
        AreaSolucion.setEnabled(false);
        //comboVentas.setModel(h.getvaluesVentas("Venta"));
        comboTienda.setModel(h.getvaluesTienda("Tienda"));
        AutoCompleteDecorator.decorate(comboTienda);
         dtm = (DefaultTableModel)tblServicio.getModel();
         dtm2 = (DefaultTableModel)jTable1.getModel();
       // llenaTabla(false, "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnFechaEntrega = new com.toedter.calendar.JDateChooser();
        btnFechaRecibido = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        comboVentas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comboTienda = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaFallas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaCausa = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        AreaSolucion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        comboEquipos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        comboEstado = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO ORDEN DE SERVICIO");

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(32769, 32769));

        jPanel4.setLayout(null);

        jLabel8.setText("Número de Factura");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 20, 100, 16);

        btnFechaEntrega.setDate(Calendar.getInstance().getTime());
        btnFechaEntrega.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaEntrega);
        btnFechaEntrega.setBounds(460, 50, 120, 30);

        btnFechaRecibido.setDate(Calendar.getInstance().getTime());
        btnFechaRecibido.setPreferredSize(new java.awt.Dimension(120, 20));
        jPanel4.add(btnFechaRecibido);
        btnFechaRecibido.setBounds(460, 10, 120, 30);

        jLabel5.setText("Fecha de Entrega");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(360, 50, 90, 20);

        comboVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVentasActionPerformed(evt);
            }
        });
        jPanel4.add(comboVentas);
        comboVentas.setBounds(150, 20, 120, 22);

        jLabel6.setText("Tienda");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(90, 50, 90, 16);

        jLabel9.setText("Fecha de Recibido");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(360, 20, 90, 20);
        jPanel4.add(comboTienda);
        comboTienda.setBounds(150, 50, 120, 22);

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblServicio);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(90, 90, 452, 120);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Diagnostico"));

        jLabel7.setText("Fallas");

        AreaFallas.setColumns(20);
        AreaFallas.setRows(5);
        jScrollPane2.setViewportView(AreaFallas);

        AreaCausa.setColumns(20);
        AreaCausa.setRows(5);
        jScrollPane3.setViewportView(AreaCausa);

        jLabel4.setText("Causa");

        jLabel3.setText("Solución");

        AreaSolucion.setColumns(20);
        AreaSolucion.setRows(5);
        jScrollPane6.setViewportView(AreaSolucion);

        jLabel10.setText("Estado");

        comboEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEquiposActionPerformed(evt);
            }
        });

        jLabel11.setText("Equipo");

        jTextField2.setColumns(3);

        jLabel12.setText("Observaciones");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/agregar_over.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable1);

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso", "Finalizado" }));
        comboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(161, 161, 161))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(comboEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(175, 175, 175)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane5.setViewportView(jPanel1);

        jPanel4.add(jScrollPane5);
        jScrollPane5.setBounds(10, 230, 630, 210);

        jTabbedPane1.addTab("Ficha Técnica", jPanel4);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Reporte Fichas Técnicos");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(btnRegistrar))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      
        String proc = this.btnRegistrar.getText();
        int id = 0, est;
        String pr = "";
        if(valida() == true){
            util u = new util();
            Servicio s = new Servicio();
            s.setIdVenta(Integer.parseInt(comboVentas.getSelectedItem().toString()));
              //configuramos la fecha 
             String dia_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
             String year_i = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             String fecha_i = (year_i + "/" + mes_i+ "/" + dia_i);
             s.setFechaEntrega(fecha_i);
             
              //configuramos la fecha
             String dia_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.DAY_OF_MONTH));
             String mes_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.MONTH) + 1);
             String year_i2 = Integer.toString(this.btnFechaEntrega.getCalendar().get(Calendar.YEAR));
             String fecha_i2 = (dia_i2 + "/" + mes_i2+ "/" +year_i2 );
             s.setFechaRecibido(fecha_i2);
             s.setIdTienda(vaux.FindIDTienda(this.comboTienda.getSelectedItem().toString()));
            id = u.idNext("Servicio", "idServicio");
            pr = "insert";
            s.setIdServicio(id);
            ServicioDAO.procesaItem(s, pr);  
             
            for(int i =0;i<this.jTable1.getRowCount();i++){
                    DetalleServicio detse = new  DetalleServicio();
                    //detVent.setIdVenta(id);
                    detse.setIdServicio(id);
                     detse.setIdEquipo(Integer.parseInt(dtm2.getValueAt(i,0).toString().trim()));
                      detse.setEstado(dtm2.getValueAt(i, 1).toString().trim());
                     detse.setFallo(dtm2.getValueAt(i, 2).toString().trim());
                     detse.setCausa(dtm2.getValueAt(i, 3).toString().trim());
                     detse.setSolucion(dtm2.getValueAt(i, 4).toString().trim());
                     detse.setObs(dtm2.getValueAt(i, 5).toString().trim());
                     
//                   detse.setP_unit(Float.parseFloat(dtm2.getValueAt(i, 3).toString().trim()));
                     //detse.setImporte(Float.parseFloat(dtm2.getValueAt(i, 4).toString().trim()));
                
                    this.detserDAO.procesaItem(detse, "insert");
                    
                }
         

            if(proc.equals("Registrar")){
               // id = u.idNext("Cliente", "idcliente");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                id = this.idClie;
                pr = "update";
            }
            s.setIdVenta(id);
            // persDAO.procesaItem(p, pr);
            //limpiaControles();
            //limpiaTabla();
            //llenaTabla(false, "");
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    

    public void limpiaControles()
 {
  this.btnRegistrar.setText("Registrar");
   //   this.txtNombre.requestFocus();
 }
 
    public void limpiaTabla(){
        DefaultTableModel dm = (DefaultTableModel)this.tblServicio.getModel();
        if(dm.getRowCount()>0){
            while(dm.getRowCount()>0){
                dm.removeRow(dm.getRowCount()-1);
            }
        }
    }
      public boolean valida(){
   /*
        boolean sw = false;
        if(this.txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Ingrese Apellidos");
        }else{
            if(this.txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Ingrese Nombres");
            }else{
                sw = true;
            }
        }*/
        return true;

    }  
    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try { 
            //creamos un objeto dbBean
              dbBean aux = new dbBean();
              HashMap map = new HashMap();
              //Connection cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ST;user=sa;password=sasasa;");
              Connection cn = aux.getConnection();
              JasperReport jr= JasperCompileManager.compileReport("src/REPORTS/FichaTecnica.jrxml");
              // map.put("idCliente",idClie); 
              JasperPrint jp = JasperFillManager.fillReport(jr,null,cn);
              JasperViewer jv= new JasperViewer(jp,false);
              jv.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Vector vec = new Vector();
        vec.addElement(eqx.FindIDEquipo(this.comboEquipos.getSelectedItem().toString()));
        // vec.addElement(this.comboEquipos.getSelectedItem().toString());
        vec.addElement(this.comboEstado.getSelectedItem().toString());
        vec.addElement(this.AreaCausa.getText());
        vec.addElement(this.AreaFallas.getText());
        vec.addElement(this.AreaSolucion.getText());
        vec.addElement(this.jTextField2.getText());
        dtm2.addRow(vec);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEquiposActionPerformed

    private void comboVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVentasActionPerformed
        comboEquipos.setEnabled(true);
        comboEquipos.setModel(h.getvaluesEqVe(Integer.parseInt(comboVentas.getSelectedItem().toString())));
    }//GEN-LAST:event_comboVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaCausa;
    private javax.swing.JTextArea AreaFallas;
    private javax.swing.JTextArea AreaSolucion;
    private com.toedter.calendar.JDateChooser btnFechaEntrega;
    private com.toedter.calendar.JDateChooser btnFechaRecibido;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboEquipos;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTienda;
    private javax.swing.JComboBox<String> comboVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblServicio;
    // End of variables declaration//GEN-END:variables
}
