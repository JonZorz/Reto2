import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 * Aqui declaramos lo botones, los labels y los importamos
 */

public class PaginaInicio2 extends JFrame implements ActionListener {
JButton btnenviar ;
JButton btnbuscar;
JButton btnestado;
JLabel lblTitulo;
/**
 * Aqui emìeza el metodo constructor, indicamos como queremos que salgan los diferentes botono, labels(Si tiene texto o no tiene texto)si son visibles o no son visibles, el tamaño...
 */
PaginaInicio2 (){

setLayout(new GridLayout(3,1));



btnbuscar = new JButton ("Buscar información");
btnenviar = new JButton ("Insertar información");

lblTitulo = new JLabel ("Rincón de Oliva") ;

btnenviar.addActionListener(this);
btnbuscar.addActionListener(this);


add(lblTitulo);
add(btnbuscar);
add(btnenviar);


setTitle("Prueba elementos Swing");
setSize(800,800);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

}

/**
 *Aqui indicamos que accion tiene que realizar el boton mediante if, en este caso queremos que se concte a otros programas java
 */
@Override
public void actionPerformed(ActionEvent e) {

if (e.getSource()==btnenviar)
new reto2final();
if (e.getSource()==btnbuscar)
new BuscarDatos();


}





/**
 * @param args en el main tenemos que indicar de esta manera para que el programa se inicie
 */
public static void main(String[] args) {

new PaginaInicio2();


}

}
