package uniandes.dpoo.swing.interfaz.principal;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class PanelDetallesRestaurante extends JPanel
{
    /**
     * La etiqueta donde se muestra el nombre de un restaurante
     */
    private JLabel labNombre;

    /**
     * La etiqueta donde se muestra la calificación de un restaurante, usando imágenes de estrellas
     */
    private JLabel labCalificacion;

    /**
     * Un checkbox en el que se muestra si un restaurante fue visitado o no
     */
    private JCheckBox chkVisitado;

    public PanelDetallesRestaurante( )
    {
    	
        // Configura la etiqueta para el nombre
        // TODO completar el constructor
    	JLabel labN = new JLabel("Nombre: ");
    	labNombre = new JLabel();
    	add(labN);
    	add(labNombre);
    	

        // Configura la etiqueta para la calificación
        // TODO completar el constructor
    	JLabel labC = new JLabel("Calificación: ");
    	labCalificacion = new JLabel();
    	add(labC);
    	add(labCalificacion);
    	
        // Configura el checkbox para indicar si ya se visitaó o no el restaurante
        // TODO completar el constructor
    	JLabel labV = new JLabel("Visitado: ");
    	chkVisitado = new JCheckBox();
        chkVisitado.setEnabled(false);
        add(labV);
        add(chkVisitado);

        // Organiza los elementos en la venta
        // TODO completar el constructor
        setLayout(new GridLayout(3, 1));
    }

    /**
     * Actualiza los datos mostrados del restaurante, indicando los valores por separado.
     * @param nombre
     * @param calificacion
     * @param visitado
     */
    private void actualizarRestaurante( String nombre, int calificacion, boolean visitado )
    {
     // TODO completar actualizarRestaurante}
    	labNombre.setText(nombre);
    	labCalificacion.setIcon((buscarIconoCalificacion(calificacion)));
    	chkVisitado.setSelected(visitado);
    	
    	

    }

    /**
     * Actualiza los datos que se muestran de un restaurante
     * @param r El restaurante que se debe mostrar
     */
    public void actualizarRestaurante( Restaurante r )
    {
        this.actualizarRestaurante( r.getNombre( ), r.getCalificacion( ), r.isVisitado( ) );
    }

    /**
     * Dada una calificación, retorna una imagen para utilizar en la etiqueta que muestra la calificación
     * @param calificacion La calificación del restaurante, que debe ser un numero entre 1 y 5.
     * @return Una imagen a la que corresponde la calificación
     */
    private ImageIcon buscarIconoCalificacion( int calificacion )
    {
        String imagen = "./imagenes/stars" + calificacion + ".png";
        return new ImageIcon( imagen );
    }
}
