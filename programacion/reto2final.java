import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/**
 * Aqui declaramos lo botones, los labels y los importamos
 */
public class reto2final extends JFrame implements ActionListener {

JLabel   lblnombre,lblapellido,lblcorreoelectronico,lbltelefono,lblpersonas,lblhora,lblfecha;
JTextField txtnombre,txtapellido,txtcorreoelectronico,txttelefono,txtpersonas,txthora,txtfecha;
    JButton btnenviar;
    static String datos [][]= new String [30][8];

   
    /**
     * Aqui emìeza el metodo constructor, indicamos como queremos que salgan los diferentes botono, labels(Si tiene texto o no tiene texto)si son visibles o no son visibles, el tamaño...
     */
reto2final (){

setLayout(new GridLayout(8,7));


lblnombre = new JLabel("Nombre");
lblapellido = new JLabel("Apellido");
lblcorreoelectronico = new JLabel("Correo Electronico");
lbltelefono = new JLabel("Telefono");
lblpersonas = new JLabel("Personas");
lblhora = new JLabel("Hora");
lblfecha = new JLabel("Fecha");


txtnombre = new JTextField();
txtapellido = new JTextField();
txtcorreoelectronico = new JTextField();
txttelefono = new JTextField();
txtpersonas = new JTextField();
txthora = new JTextField();
txtfecha = new JTextField();


btnenviar = new JButton("Enviar");


add(lblnombre);
add(txtnombre);
add(lblapellido);
add(txtapellido);
add(lblcorreoelectronico);
add(txtcorreoelectronico);
add(lbltelefono);
add(txttelefono);
add(lblpersonas);
add(txtpersonas);
add(lblhora);
add(txthora);
add(lblfecha);
add(txtfecha);
add(btnenviar);





setTitle("Prueba elementos Swing");
setSize(800,800);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

}
@Override
/**
 *Aqui indicamos que accion tiene que realizar el boton mediante if, en este caso queremos que se concte a otros programas java
 */
public void actionPerformed(ActionEvent e) {


 
     

}




/**
 * @param args en esta pagina como ya se ha comentado en el documento del trabajo solo hemos podido hacer el diseño de dicha pagina
 */
public static void main(String[] args) {
new reto2final();

}


}
