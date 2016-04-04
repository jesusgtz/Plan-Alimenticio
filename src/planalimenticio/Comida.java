package planalimenticio;

import database.Connect;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.Clock.system;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Equipo1
 */
public class Comida extends javax.swing.JFrame {
	
    private String[]resultados = new String [38];
    private int indiceResult = 0;
    private Connect con;
    private ResultSet lacteos;
    private ResultSet cereales;
    private ResultSet fruta;
    private ResultSet otros;
    private final double CxD;
    private double cseleccionadas_totales;

    private int[] lacteos_selected_items;
    private final ArrayList<String> calorias_lacteos;
    private double cseleccionadas_lacteos;

    private int[] cereales_selected_items;
    private final ArrayList<String> calorias_cereales;
    private double cseleccionadas_cereales;

    private int[] frutas_selected_items;
    private final ArrayList<String> calorias_frutas;
    private double cseleccionadas_frutas;

    private int[] otros_selected_items;
    private final ArrayList<String> calorias_otros;
    private double cseleccionadas_otros;

    public Comida(double CxD) {
        initComponents();
		
        this.CxD = Math.floor(CxD * .25);
        this.cseleccionadas_totales = 0.0d;
        this.cseleccionadas_lacteos = 0.0d;
        this.cseleccionadas_frutas = 0.0d;
        this.cseleccionadas_cereales = 0.0d;
        this.cseleccionadas_otros = 0.0d;

        this.ctotales_lbl.setText("" + this.CxD);
        this.cseleccionadas_lacteos_frutas_lbl.setText("0.0");
        this.cseleccionadas_cereales_lbl.setText("0.0");
        this.cseleccionadas_frutas_lbl.setText("0.0");
        this.cseleccionadas_otros_lbl.setText("0.0");

        this.cseleccionadas_total_lbl.setText("0.0");
        this.cfaltantes_lbl.setText("0.0");

        this.lacteos_selected_items = null;
        this.cereales_selected_items = null;
        this.frutas_selected_items = null;
        this.otros_selected_items = null;
        
        ToList toList = loadLists("Tipo='Lacteos'");
        this.calorias_lacteos = toList.getArray();
        List li = toList.getList();
        for(int i = 0, n = toList.getSize(); i < n; i++) {
            this.lacteos_list.add(li.getItem(i));
        }
        
        toList = loadLists("Tipo='Rico en Azucares'");
        this.calorias_cereales = toList.getArray();
        li = toList.getList();
        for(int i=0, n = toList.getSize(); i<n; i++) {
            this.cereales_list.add(li.getItem(i));
        }
        
        toList = loadLists("Tipo='Frutas'");
        this.calorias_frutas = toList.getArray();
        li = toList.getList();
        for(int i=0, n = toList.getSize(); i<n; i++) {
            this.frutas_list.add(li.getItem(i));
        }
        
        toList = loadLists("Tipo='Otros'");
        this.calorias_otros = toList.getArray();
        li = toList.getList();
        for(int i=0, n = toList.getSize(); i<n; i++) {
            this.otros_list.add(li.getItem(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cseleccionadas_lacteos_lbl = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cseleccionadas_total_lbl = new javax.swing.JLabel();
        cfaltantes_lbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ctotales_lbl = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        lacteos_list = new java.awt.List();
        cereales_list = new java.awt.List();
        otros_list = new java.awt.List();
        cseleccionadas_lacteos_frutas_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cseleccionadas_cereales_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cseleccionadas_otros_lbl = new javax.swing.JLabel();
        frutas_list = new java.awt.List();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cseleccionadas_frutas_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        jLabel2.setText("Lacteos");

        jLabel3.setText("Cereales");

        jLabel4.setText("Otros");

        jLabel6.setText("Calorías seleccionadas:");

        jLabel7.setText("Calorías faltantes:");

        cseleccionadas_total_lbl.setText("seleccionadas");

        cfaltantes_lbl.setText("faltantes");

        jLabel10.setText("Calorías totales:");

        ctotales_lbl.setText(Double.toString(this.CxD));

        btnSiguiente.setBackground(new java.awt.Color(102, 204, 0));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        lacteos_list.setMultipleMode(true);
        lacteos_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lacteos_listMouseClicked(evt);
            }
        });

        cereales_list.setMultipleMode(true);
        cereales_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cereales_listMouseClicked(evt);
            }
        });

        otros_list.setMultipleMode(true);
        otros_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otros_listMouseClicked(evt);
            }
        });

        cseleccionadas_lacteos_frutas_lbl.setText("value");

        jLabel5.setText("Calorias:");

        jLabel8.setText("Calorias:");

        cseleccionadas_cereales_lbl.setText("value");

        jLabel9.setText("Calorias:");

        cseleccionadas_otros_lbl.setText("value");

        frutas_list.setMultipleMode(true);
        frutas_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frutas_listMouseClicked(evt);
            }
        });

        jLabel11.setText("Frutas");

        jLabel12.setText("Calorias:");

        cseleccionadas_frutas_lbl.setText("value");

        javax.swing.GroupLayout cseleccionadas_lacteos_lblLayout = new javax.swing.GroupLayout(cseleccionadas_lacteos_lbl);
        cseleccionadas_lacteos_lbl.setLayout(cseleccionadas_lacteos_lblLayout);
        cseleccionadas_lacteos_lblLayout.setHorizontalGroup(
            cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                        .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                        .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(31, 31, 31)))
                                        .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cfaltantes_lbl)
                                            .addComponent(cseleccionadas_total_lbl)
                                            .addComponent(ctotales_lbl)
                                            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                                .addComponent(cseleccionadas_lacteos_frutas_lbl)
                                                .addGap(83, 83, 83)
                                                .addComponent(jLabel8)
                                                .addGap(35, 35, 35)
                                                .addComponent(cseleccionadas_cereales_lbl)))))
                                .addGap(95, 95, 95)
                                .addComponent(jLabel12)
                                .addGap(28, 28, 28)
                                .addComponent(cseleccionadas_frutas_lbl))
                            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lacteos_list, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cereales_list, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(frutas_list, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(46, 46, 46)
                                .addComponent(cseleccionadas_otros_lbl)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                                .addComponent(otros_list, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel11)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel4)
                        .addGap(104, 104, 104))))
        );
        cseleccionadas_lacteos_lblLayout.setVerticalGroup(
            cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cseleccionadas_lacteos_lblLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(frutas_list, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(cereales_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lacteos_list, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(otros_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cseleccionadas_otros_lbl)
                    .addComponent(cseleccionadas_lacteos_frutas_lbl)
                    .addComponent(jLabel8)
                    .addComponent(cseleccionadas_cereales_lbl)
                    .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cseleccionadas_frutas_lbl)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cseleccionadas_total_lbl))
                .addGap(18, 18, 18)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cfaltantes_lbl))
                .addGap(18, 18, 18)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ctotales_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(cseleccionadas_lacteos_lblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Desayuno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cseleccionadas_lacteos_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cseleccionadas_lacteos_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked


    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        Colaciones colacion1 = new Colaciones(this.CxD / .25);
        colacion1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void lacteos_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lacteos_listMouseClicked
        int[] indices = this.lacteos_list.getSelectedIndexes();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                    + "2 raciones de este tipo de alimento", "Advertencia", 2);
            this.lacteos_list.deselect(indices[2]);
        }
        this.lacteos_selected_items = indices;
        this.cseleccionadas_lacteos = getCaloriasSeleccionadas(indices, this.calorias_lacteos);
        this.cseleccionadas_lacteos_frutas_lbl.setText("" + this.cseleccionadas_lacteos);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + this.cseleccionadas_totales);
    }//GEN-LAST:event_lacteos_listMouseClicked

    private void cereales_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cereales_listMouseClicked
        int []indices = this.cereales_list.getSelectedIndexes();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                    + "2 raciones de este tipo de alimento", "Advertencia", 2);
            this.cereales_list.deselect(indices[2]);
        }
		
        this.cereales_selected_items = indices;
        this.cseleccionadas_cereales = getCaloriasSeleccionadas(indices, this.calorias_cereales);
        this.cseleccionadas_cereales_lbl.setText("" + this.cseleccionadas_cereales);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros));
    }//GEN-LAST:event_cereales_listMouseClicked

    private void otros_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otros_listMouseClicked
        int []indices = this.otros_list.getSelectedIndexes();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                    + "2 raciones de este tipo de alimento", "Advertencia", 2);
            this.otros_list.deselect(indices[2]);
        }
		
		this.otros_selected_items = indices;
		this.cseleccionadas_otros = getCaloriasSeleccionadas(indices, this.calorias_otros);
		this.cseleccionadas_otros_lbl.setText("" + this.cseleccionadas_otros);
		
		this.cseleccionadas_totales = (this.cseleccionadas_lacteos + this.cseleccionadas_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros);
		this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
		this.cseleccionadas_total_lbl.setText("" + (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros));
    }//GEN-LAST:event_otros_listMouseClicked

    private void frutas_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frutas_listMouseClicked
        int []indices = this.frutas_list.getSelectedIndexes();
        if(indices.length > 2) {
            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                    + "2 raciones de este tipo de alimento", "Advertencia", 2);
            this.frutas_list.deselect(indices[2]);
        }
		
        this.frutas_selected_items = indices;
        this.cseleccionadas_frutas = getCaloriasSeleccionadas(indices, this.calorias_frutas);
        this.cseleccionadas_frutas_lbl.setText("" + this.cseleccionadas_frutas);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + (this.cseleccionadas_lacteos + this.cseleccionadas_cereales + this.cseleccionadas_frutas + this.cseleccionadas_otros));
    }//GEN-LAST:event_frutas_listMouseClicked
	
	private ToList loadLists(String clausula) { // clausula: "Tipo='Algo' OR ... etc"
		ToList toList = null;
		try {
			Connect conn = new Connect();
			
			ResultSet rst = conn.Select("SELECT * FROM Alimentos WHERE " + clausula + ";");
			
			if(rst != null) {
				ArrayList<String> calorias = new ArrayList();
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
	
	private double getCaloriasSeleccionadas(int[] indices, ArrayList list) {
		double suma = 0.0d;
		if(indices.length > 0) suma = Double.parseDouble("" + list.get(indices[0]));
		if(indices.length > 1) suma += Double.parseDouble("" + list.get(indices[1]));
		return suma;
	}
	
	private void setCaloriasFaltantes(JLabel lbl, double actual, double total) {
		lbl.setText("" + (total - actual));
		if(total - actual < 0) lbl.setForeground(Color.red);
		else lbl.setForeground(Color.black);
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolver;
    private java.awt.List cereales_list;
    private javax.swing.JLabel cfaltantes_lbl;
    private javax.swing.JLabel cseleccionadas_cereales_lbl;
    private javax.swing.JLabel cseleccionadas_frutas_lbl;
    private javax.swing.JLabel cseleccionadas_lacteos_frutas_lbl;
    private javax.swing.JPanel cseleccionadas_lacteos_lbl;
    private javax.swing.JLabel cseleccionadas_otros_lbl;
    private javax.swing.JLabel cseleccionadas_total_lbl;
    private javax.swing.JLabel ctotales_lbl;
    private java.awt.List frutas_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.List lacteos_list;
    private java.awt.List otros_list;
    // End of variables declaration//GEN-END:variables

}

