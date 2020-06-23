
/**
 * Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file
 * 
 * @author (Mykola Oliinyk) 
 * @version (1.1)
 */
public interface doc
{
   
   // Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
   /**
    * Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file
    * @param  x  numero de la fila
    *         file  fichero de texto
    */
   public abstract String obtenerLinea(int x, String file);
   
    

}
