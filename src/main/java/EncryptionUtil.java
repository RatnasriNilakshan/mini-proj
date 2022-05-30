
import java.util.Base64;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nilak
 */
public class EncryptionUtil {
    public static String endcrypt(String text){
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
    
    public static String decrypt (String encryptedString){
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedString);
        return new String(decodedBytes);

    }
}
