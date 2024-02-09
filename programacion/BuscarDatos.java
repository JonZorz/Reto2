import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Aqui declaramos lo botones, los labels y los importamos. En este caso creamos una tabla y despues tenemos que indicar en forma de string los campos de la tabla
 */

public class BuscarDatos extends JFrame implements ActionListener  {

   
   
    static JTable tblCampos;
    static String encabezados[]= {
    "idReserva","Nombre","Apellido","CorreoElectronico","Telefono","Persona","hora","fecha"
    };
    static String datos [][]= new String [30][8];
    JScrollPane sp;
    JButton btnBoton;
   
 
   
    /**
     * Hemos usado FlowLayout, es decir, el programa decide donde se coloca los botones (en este caso). Aqui emìeza el metodo constructor, indicamos como queremos que salgan los diferentes botono, labels(Si tiene texto o no tiene texto)si son visibles o no son visibles, el tamaño...
     */
    BuscarDatos(){
   
    setLayout(new FlowLayout());
    btnBoton = new JButton("Mostrar Datos");
    add(btnBoton);
     
    btnBoton.addActionListener(this);
   
    setTitle("Prueba elementos Swing");
setSize(800,800);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   
    }
    /**
     *Indicamos que despues de pulsar btnBoton ejerza la accion de que nos salga un mensaje y que una vez cerrado la ventana del mensaje al volver a pulsar el boton nos aparece en forma de tabla la informacion de la base de datos
     */
    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource()== btnBoton) {
    JOptionPane.showMessageDialog(this, createTablePanel(), "Seleccionado: " , JOptionPane.PLAIN_MESSAGE);
    }
    }
    private JScrollPane createTablePanel () {
JScrollPane scrollPane = null;

scrollPane = new
JScrollPane (tblCampos);
return scrollPane;
}

   

/**
 * @param args
 * @throws Exception En el main hemos insertado el codigo de la conexion añadiendo los campos que queremos en la base de datos (Hemos tenido que poner la direccion, usuario y contraseña del servidor de la base de datos)
 */
public static void main(String[] args) throws Exception{
new BuscarDatos();


     // Conectar el Driver JDBC
     Class.forName("com.mysql.cj.jdbc.Driver");

     // variables, cambiar según corresponda
     final String url = "jdbc:mysql://ricondeoliva.crig4y0kwxey.us-east-1.rds.amazonaws.com:3306/rincondeoliva";
     final String user = "alejandro";
     final String password = "B15a2r3B**+2001";

     // establecer la conexión
     Connection con = DriverManager.getConnection(url, user, password);

     // mostrar mensaje de conexión exitosa o fallo
     if (con == null) {
        System.out.println("No se ha establecido la conexión");
        return;
     } else
        System.out.println("¡Felicidades! Se ha establecido la conexión");
 
     Statement statement = con.createStatement();

     ResultSet resultSet = statement.executeQuery("select * from reservas");
     
              int i1 = 0;
     while (resultSet.next()&& i1 < 30) {

         System.out.println(resultSet.getInt(1)+ "-"+ resultSet.getString(2) + "-" + resultSet.getString(3)+ "-" + resultSet.getString(4)+ "-" + resultSet.getInt(5)+ " " + resultSet.getInt(6)+ " " + resultSet.getTime(7)+ " " + resultSet.getDate(8) );          ;
         
          int idReserva = resultSet.getInt(1);
          datos[i1][0] = String.valueOf(idReserva) ;
          String Nombre = resultSet.getString(2);
          datos[i1][1] = Nombre;
          String Apellido = resultSet.getString(3);
          datos[i1][2] = Apellido;
          String CorreoElectronico = resultSet.getString(4);
          datos[i1][3] = CorreoElectronico;
          int Telefono = resultSet.getInt(5);
          datos[i1][4] = String.valueOf(Telefono);
          int Personas = resultSet.getInt(6);
          datos[i1][5] = String.valueOf(Personas) ;
          String hora = resultSet.getString(7);
          datos[i1][6] = hora;
          String fecha = resultSet.getString(8);
          datos[i1][7] = fecha;
         
         
         
        i1++;


     }
     tblCampos = new JTable (datos,encabezados);
     
     
     
   
     

     // Cerrar la conexión JDBC
     con.close();

  }
}