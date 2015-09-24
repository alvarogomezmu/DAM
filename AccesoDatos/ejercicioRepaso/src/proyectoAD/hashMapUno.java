/*
	Crear un hashMap en el que vamos a guardar 4 indicaciones según el nivel de importancia. Para la clave podemos asociar el String que queramos (en este caso será String String).
	Urgente
	Importante
	Normal
	BajaPrioridad
	Mostrar la información guardada en el hashMap
	Mostrar Urgente y Normal
 */
package proyectoAD;

import java.util.Iterator;
import java.util.Set.*;
import java.util.HashMap;

public class hashMapUno 
{
	public static void main(String args[])
	{
		HashMap nivelImportancia=new HashMap();
			
		nivelImportancia.put("Urgente", 1);
		nivelImportancia.put("Importante", 2);
		nivelImportancia.put("Normal", 3);
		nivelImportancia.put("BajaPrioridad", 4);
		
	}
}