/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradofichero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author AlumnoT
 */
public class CifradoFichero {

    public static void main(String[] args) {

        try {

            System.out.println("Obteniendo generador de claves con cifrado DES");
            KeyGenerator keygen = KeyGenerator.getInstance("DES");

            System.out.println("Generando clave");
            SecretKey key = keygen.generateKey();

            System.out.println("Obteniendo objeto Cipher con cifrado DES");
            Cipher desCipher = Cipher.getInstance("DES");

            System.out.println("Configurando Cipher para encriptar");
            desCipher.init(Cipher.ENCRYPT_MODE, key);

            System.out.println("Abriendo el fichero");
            File inf = new File("gundo.txt"); // El fichero lo crearemos a mano en la raiz del proyecto

            FileInputStream is = new FileInputStream(inf);

            // abrimos el fichero cifrado
            System.out.println("Abriendo el fichero cifrado");
            FileOutputStream os = new FileOutputStream("fichero_cifrado");

            System.out.println("Cifrando el fichero...");
            byte[] buffer = new byte[8];
            int bytes_leidos = is.read(buffer);
            while (bytes_leidos != -1) {

                os.write(desCipher.doFinal(buffer, 0, bytes_leidos));
                bytes_leidos = is.read(buffer);

            }

            // cerramos el fichero cifrado
            os.close();

            System.out.println("Obteniendo factoría de claves con cifrado DES");
            SecretKeyFactory keyfac = SecretKeyFactory.getInstance("DES");

            // generamos la clave cifrada
            System.out.println("Generando keyspec");
            DESKeySpec keyspec = (DESKeySpec) keyfac.getKeySpec(key, DESKeySpec.class);

            // guardamos la clave cifrada
            System.out.println("Salvando la clave en un fichero");
            FileOutputStream cos = new FileOutputStream("clave");

            cos.write(keyspec.getKey());

            // cerramos la clave cifrada 
            cos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
