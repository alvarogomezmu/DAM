/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifradodescrifradosimetrico;

/**
 *
 * @author Alvaro Gomez
 */
import com.sun.crypto.provider.DESCipher;
import javax.crypto.*;

public class Cipher_simetrico {

    public static void main(String[] args) {

        try {

            System.out.println("Obteniendo generador de claves con cifrado AES");
            KeyGenerator keygen = KeyGenerator.getInstance("AES");

            System.out.println("Generando clave");
            SecretKey key = keygen.generateKey();

            System.out.println("Obteniendo objeto Cipher con cifrado AES");
            Cipher aesCipher = Cipher.getInstance("AES");

            System.out.println("Configurando Cipher para encriptar");
            aesCipher.init(Cipher.ENCRYPT_MODE, key);

            System.out.println("Preparando el mensaje");
            String mensaje = "Mensaje que se cifrará con AES";

            System.out.println("Mensaje Original: " + mensaje);
            System.out.println("Cifrando el mensaje");

            Byte[] bitcodificado = DESCipher.doFinal(mensaje.getBytes());

            String mensajeCifrado = new String(bitcodificado);

            System.out.println("Configurando Cipher par adesencriptar");
            aesCipher.init(Cipher.DECRYPT_MODE, key);

            System.out.println("Descifrando mensaje");
            Byte[] bitcodificado = DESCipher.doFinal(mensaje.getbytes());

            String mensaje_descifrado = new String(bitcodificado);

            System.out.println("Mensaje desencriptado: " + mensajeDescrifrado);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
