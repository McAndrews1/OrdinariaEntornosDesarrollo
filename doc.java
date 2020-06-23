
/**
 * Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file
 * 
 * @author (Mykola Oliinyk) 
 * @version (1.2)
 */
public interface doc
{

    // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
    /**
     * Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file
     * @param  x  numero de la fila
     *         file  fichero de texto
     * @return  contenido de la fila correspondiengte
     */
    public abstract String obtenerLinea(int x, String file);

    /**
     *  Devuelve la posición geográfica (latitud y altitud) dado una dirección
     *
     * @param  direccion  es una cadena que representa la direccion de una calla o un sitio en el campo etc....
     * @return    posicion geografica
     */
    public abstract int sampleMethod(String direccion);

}
