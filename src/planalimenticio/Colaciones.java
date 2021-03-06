package planalimenticio;

import database.Connect;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Equipo1
 */
public class Colaciones extends javax.swing.JFrame {
	
    private Connect con;
    private int go;
    private String[] comidas = new String [5];
    private ResultSet lacteos;
    private ResultSet cereales;
    private ResultSet fruta;
    private ResultSet otros;
    private final double CxD;
    private double cseleccionadas_totales;
	
    private int[] lacteos_frutas_selected_items;
	private final ArrayList<String> calorias_lacteos_frutas;
	private double cseleccionadas_lacteos_frutas;
	
    private int[] cereales_selected_items;
        private final ArrayList<String> calorias_cereales;
	private double cseleccionadas_cereales;
	
    private int[] otros_selected_items;
        private final ArrayList<String> calorias_otros;
	private double cseleccionadas_otros;
        
    /**
     * Constructor
     * @param CxD
     * @param go
     * @param comidas 
     */
    public Colaciones(double CxD,int go, String [] comidas) {
        initComponents();
	this.setLocationRelativeTo(null);
        
        this.CxD = Math.floor(CxD * .10);
        this.go = go;
        this.comidas = comidas;
        this.cseleccionadas_totales = 0.0d;
        this.cseleccionadas_lacteos_frutas = 0.0d;
        this.cseleccionadas_cereales = 0.0d;
        this.cseleccionadas_otros = 0.0d;

        this.ctotales_lbl.setText("" + this.CxD);
        this.cseleccionadas_lacteos_frutas_lbl.setText("0.0");
        this.cseleccionadas_cereales_lbl.setText("0.0");
        this.cseleccionadas_otros_lbl.setText("0.0");

        this.cseleccionadas_total_lbl.setText("0.0");
        this.cfaltantes_lbl.setText("0.0");

        this.lacteos_frutas_selected_items = new int [0];
        this.cereales_selected_items = new int [0];
        this.otros_selected_items = new int [0];
        
        ToList toList = loadLists("Tipo='Lacteos' OR Tipo='Frutas'");
        this.calorias_lacteos_frutas = toList.getArray();
        List li = toList.getList();
        for(int i = 0, n = toList.getSize(); i < n; i++) {
            this.lacteos_frutas_list.add(li.getItem(i));
        }
        
        toList = loadLists("Tipo='Rico en Azucares'");
        this.calorias_cereales = toList.getArray();
        li = toList.getList();
        for(int i=0, n = toList.getSize(); i<n; i++) {
            this.cereales_list.add(li.getItem(i));
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

        jpanel = new javax.swing.JPanel();
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
        lacteos_frutas_list = new java.awt.List();
        cereales_list = new java.awt.List();
        otros_list = new java.awt.List();
        cseleccionadas_lacteos_frutas_lbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cseleccionadas_cereales_lbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cseleccionadas_otros_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setText("Volver");
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolverMouseClicked(evt);
            }
        });

        jLabel2.setText("Lacteos/Frutas");

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

        lacteos_frutas_list.setMultipleMode(true);
        lacteos_frutas_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lacteos_frutas_listMouseClicked(evt);
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

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(lacteos_frutas_list, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpanelLayout.createSequentialGroup()
                                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cfaltantes_lbl)
                                            .addComponent(cseleccionadas_total_lbl)
                                            .addComponent(ctotales_lbl)
                                            .addComponent(cseleccionadas_lacteos_frutas_lbl)))
                                    .addGroup(jpanelLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel5)))
                                .addGap(44, 44, 44)
                                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpanelLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(cseleccionadas_cereales_lbl))
                                    .addComponent(jLabel8)
                                    .addComponent(cereales_list, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(otros_list, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(cseleccionadas_otros_lbl))
                            .addComponent(jLabel9)))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(128, 128, 128))))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cereales_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lacteos_frutas_list, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(otros_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cseleccionadas_otros_lbl))
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cseleccionadas_lacteos_frutas_lbl)
                        .addComponent(jLabel8)
                        .addComponent(cseleccionadas_cereales_lbl)))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cseleccionadas_total_lbl))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cfaltantes_lbl))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ctotales_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Colaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseClicked
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverMouseClicked


    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
        int[] lacteos =  this.lacteos_frutas_list.getSelectedIndexes();
        int[] cereales = this.cereales_list.getSelectedIndexes();
        int[] frutas = this.otros_list.getSelectedIndexes();
        if(lacteos.length==0 && cereales.length==0 && frutas.length==0 ) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos un "
                    + "alimento", "Advertencia", 2);
        } else {
            String aux ="";
            String [] colaciones = this.lacteos_frutas_list.getSelectedItems();
            for(int i=0;i<colaciones.length;i++)aux += colaciones[i]+", ";
            colaciones = this.cereales_list.getSelectedItems();
            for(int i=0;i<colaciones.length;i++)aux += colaciones[i]+", ";
            colaciones = this.otros_list.getSelectedItems();
            for(int i=0;i<colaciones.length;i++)aux += colaciones[i]+", ";
            aux +=";"+ cseleccionadas_totales;
            if(this.go==0) {
                comidas[1] = aux; 
                Comida comida = new Comida (this.CxD /.10, comidas);
                comida.setVisible  (true);
            } else {
                comidas[3] = aux;
                Cena cena = new Cena(this.CxD /.10, comidas);
                cena.setVisible(true);  
            }
            this.dispose();
        }
        
    }//GEN-LAST:event_btnSiguienteMouseClicked


    private void lacteos_frutas_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lacteos_frutas_listMouseClicked
        int[] indices = this.lacteos_frutas_list.getSelectedIndexes();
        if(this.lacteos_frutas_selected_items.length  > indices.length) {
			System.out.println("\t\tEliminado");
        }else {
            System.out.println("\t\tAgregado");
            if(this.cseleccionadas_totales <= this.CxD) {
                    if(indices.length > 2) {
                            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                                            + "2 raciones de este tipo de alimento", "Advertencia", 2);
                            this.lacteos_frutas_list.deselect(indices[2]);
                    }
            } else {
                    JOptionPane.showMessageDialog(null, "Has sobrepasado las calorias recomendadas.", "Plan Alimenticio", JOptionPane.WARNING_MESSAGE);
                    this.lacteos_frutas_list.deselect(indices[indices.length - 1]);
            }
        }
       
        this.lacteos_frutas_selected_items = this.lacteos_frutas_list.getSelectedIndexes();
        this.cseleccionadas_lacteos_frutas = getCaloriasSeleccionadas(this.lacteos_frutas_selected_items, this.calorias_lacteos_frutas);
        this.cseleccionadas_lacteos_frutas_lbl.setText("" + this.cseleccionadas_lacteos_frutas);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + this.cseleccionadas_totales);
    }//GEN-LAST:event_lacteos_frutas_listMouseClicked

    private void cereales_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cereales_listMouseClicked
        int []indices = this.cereales_list.getSelectedIndexes();
        if(this.cereales_selected_items.length  > indices.length) {
			System.out.println("\t\tEliminado");
        }else {
            System.out.println("\t\tAgregado");
            if(this.cseleccionadas_totales <= this.CxD) {
                    if(indices.length > 2) {
                            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                                            + "2 raciones de este tipo de alimento", "Advertencia", 2);
                            this.cereales_list.deselect(indices[2]);
                    }
            } else {
                    JOptionPane.showMessageDialog(null, "Has sobrepasado las calorias recomendadas.", "Plan Alimenticio", JOptionPane.WARNING_MESSAGE);
                    this.cereales_list.deselect(indices[indices.length - 1]);
            }
        }

        this.cereales_selected_items = this.cereales_list.getSelectedIndexes();
        this.cseleccionadas_cereales = getCaloriasSeleccionadas(this.cereales_selected_items, this.calorias_cereales);
        this.cseleccionadas_cereales_lbl.setText("" + this.cseleccionadas_cereales);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + (this.cseleccionadas_lacteos_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros));
    }//GEN-LAST:event_cereales_listMouseClicked

    private void otros_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otros_listMouseClicked
        int []indices = this.otros_list.getSelectedIndexes();
        if(this.otros_selected_items.length  > indices.length) {
			//System.out.println("\t\tEliminado");
        }else {
            //System.out.println("\t\tAgregado");
            if(this.cseleccionadas_totales <= this.CxD) {
                    if(indices.length > 2) {
                            JOptionPane.showMessageDialog(null, "No se debe seleccionar más de "
                                            + "2 raciones de este tipo de alimento", "Advertencia", 2);
                            this.otros_list.deselect(indices[2]);
                    }
            } else {
                    JOptionPane.showMessageDialog(null, "Has sobrepasado las calorias recomendadas.", "Plan Alimenticio", JOptionPane.WARNING_MESSAGE);
                    this.otros_list.deselect(indices[indices.length - 1]);
            }
        }
       
        indices = this.otros_list.getSelectedIndexes();
		
        this.otros_selected_items = this.otros_list.getSelectedIndexes();
        this.cseleccionadas_otros = getCaloriasSeleccionadas(this.otros_selected_items, this.calorias_otros);
        this.cseleccionadas_otros_lbl.setText("" + this.cseleccionadas_otros);

        this.cseleccionadas_totales = (this.cseleccionadas_lacteos_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros);
        this.setCaloriasFaltantes(this.cfaltantes_lbl, this.cseleccionadas_totales, this.CxD);
        this.cseleccionadas_total_lbl.setText("" + (this.cseleccionadas_lacteos_frutas + this.cseleccionadas_cereales + this.cseleccionadas_otros));
    }//GEN-LAST:event_otros_listMouseClicked
	
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
			
			if(!conn.isClosed()) conn.closeConnection();
			
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
    private javax.swing.JLabel cseleccionadas_lacteos_frutas_lbl;
    private javax.swing.JLabel cseleccionadas_otros_lbl;
    private javax.swing.JLabel cseleccionadas_total_lbl;
    private javax.swing.JLabel ctotales_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpanel;
    private java.awt.List lacteos_frutas_list;
    private java.awt.List otros_list;
    // End of variables declaration//GEN-END:variables
}
