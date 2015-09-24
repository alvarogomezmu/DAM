package herramientas;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class herramientass 
{

    public static void recorrerMap(Map m) 
    {
        Iterator it = m.keySet().iterator();
        while (it.hasNext()) 
        {
            Integer clave = (Integer) it.next();
            Object valor = (Object) m.get(clave);
            System.out.println(clave + " " + valor);
        }
    }

    public static void recorrerColeccion(Collection C) 
    {
        Iterator it = C.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }

    public static String ConvertUTF(String txt, int largo) 
    {
        if (txt.length() > largo) 
        {
            return txt.substring(0, largo);
        }
        for (int n = txt.length(); n < largo; n++) 
        {
            txt = txt + " ";
        }
        return txt;
    }
}
