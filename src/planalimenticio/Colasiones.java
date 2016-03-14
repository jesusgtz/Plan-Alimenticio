package planalimenticio;

import database.Connect;
<<<<<<< HEAD:src/planalimenticio/Desayuno.java
import java.sql.ResultSet;
import javax.swing.JOptionPane;
=======
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

>>>>>>> c27e42e4faca7074d58c39318d39d1dfa95ed14d:src/planalimenticio/Colasiones.java
/**
 *
 * @author Equipo1
 */
public class Colasiones extends javax.swing.JFrame {
	
	private ArrayList calorias_lacteos_frutas;

<<<<<<< HEAD:src/planalimenticio/Desayuno.java
    public Desayuno(double CxD) {
        this.CxD = Math.floor(CxD*.25);
        this.con = new Connect();
        if(!con.isClosed()) {
            this.lacteos = con.Select("SELECT * FROM `Alimentos` "
                    + "WHERE `Tipo` = 'Lacteos';");
            this.cereales = con.Select("SELECT * FROM `Alimentos` "
                    + "WHERE `Tipo` = 'Ricos en Azucares';");
            this.fruta = con.Select("SELECT * FROM `Alimentos` "
                    + "WHERE `Tipo` = 'Frutas';");
            this.otros = con.Select("SELECT * FROM `Alimentos` "
                    + "WHERE `Tipo` = 'Otros';");
        }
        initComponents();
        this.setLocationRelativeTo(null);
=======
    public Colasiones(double CxD) {
        initComponents();
		
		this.CxD = Math.floor(CxD*.20);
		ToList toList = loadLists("Tipo='Lacteos'");
		
		this.calorias_lacteos_frutas = toList.getArray();
		List li = toList.getList();
		for(int i = 0, n = toList.getSize(); i < n; i++) {
			this.lacteos_frutas_list.add(li.getItem(i));
		}
>>>>>>> c27e42e4faca7074d58c39318d39d1dfa95ed14d:src/planalimenticio/Colasiones.java
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cereales_list = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        otros_list = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calorias_seleccionadas_lbl = new javax.swing.JLabel();
        calorias_faltantes_lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        calorias_totales_lbl = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        lacteos_frutas_list = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

<<<<<<< HEAD:src/planalimenticio/Desayuno.java
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Lacteos");
=======
        jLabel2.setText("Lacteos/Frutas");
>>>>>>> c27e42e4faca7074d58c39318d39d1dfa95ed14d:src/planalimenticio/Colasiones.java

        jLabel3.setText("Cereales");

        jLabel4.setText("Otros");

        cereales_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(cereales_list);

        otros_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(otros_list);

        jLabel6.setText("Calorías seleccionadas:");

        jLabel7.setText("Calorías faltantes:");

        calorias_seleccionadas_lbl.setText("seleccionadas");

        calorias_faltantes_lbl.setText("faltantes");

        jLabel10.setText("Calorías totales:");

        calorias_totales_lbl.setText("totales");

        btnVolver1.setBackground(new java.awt.Color(102, 204, 0));
        btnVolver1.setText("Siguiente");
        btnVolver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolver1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calorias_faltantes_lbl)
                                    .addComponent(calorias_seleccionadas_lbl)
                                    .addComponent(calorias_totales_lbl)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lacteos_frutas_list, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(lacteos_frutas_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(calorias_seleccionadas_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(calorias_faltantes_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(calorias_totales_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel4.getAccessibleContext().setAccessibleName("Otros");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Colasiones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Colasiones");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked

<<<<<<< HEAD:src/planalimenticio/Desayuno.java
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int []indices = this.jList1.getSelectedIndices();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No puedes seleccionar"
                    + " más de 3 elementos", "Error", 2);
            this.jList1.clearSelection();
        }
    }//GEN-LAST:event_jList1MouseClicked
    
    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        int []indices = this.jList2.getSelectedIndices();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No puedes seleccionar"
                    + " más de 3 elementos", "Error", 2);
            this.jList2.clearSelection();
        }
    }
    
    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {                                    
        int []indices = this.jList3.getSelectedIndices();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No puedes seleccionar"
                    + " más de 3 elementos", "Error", 2);
            this.jList3.clearSelection();
        }
    }
    
    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {                                    
        int []indices = this.jList4.getSelectedIndices();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No puedes seleccionar"
                    + " más de 3 elementos", "Error", 2);
            this.jList4.clearSelection();
        }
    }
    
=======
    private void btnVolver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1MouseClicked
	
	private ToList loadLists(String clausula) { // clausula: "Tipo='Algo' OR ... etc"
		ToList toList = null;
		
		try {
			Connect conn = new Connect();
			ResultSet rst = conn.Select("SELECT * FROM Alimentos WHERE " + clausula + ";");

			if(rst != null) {
				ArrayList calorias = new ArrayList();
				List list = new List(7, true);
				int size = 0;

				while(rst.next()) {
					calorias.add(rst.getString("Calorias"));
					list.add(rst.getString("Nombre"));
					size++;
				}
				
				toList = new ToList(list, calorias, size);
			} else System.out.println("Error: no se pudo cargar la lista");
			
		} catch (SQLException er) {
			System.out.println("Error: " + er.getMessage());
		}
		
		return toList;
	}
	
	
>>>>>>> c27e42e4faca7074d58c39318d39d1dfa95ed14d:src/planalimenticio/Colasiones.java
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JLabel calorias_faltantes_lbl;
    private javax.swing.JLabel calorias_seleccionadas_lbl;
    private javax.swing.JLabel calorias_totales_lbl;
    private javax.swing.JList<String> cereales_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.List lacteos_frutas_list;
    private javax.swing.JList<String> otros_list;
    // End of variables declaration//GEN-END:variables
    private double CxD;
    private Connect con;
    private ResultSet lacteos;
    private ResultSet cereales;
    private ResultSet fruta;
    private ResultSet otros;
}
