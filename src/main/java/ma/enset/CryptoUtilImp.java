package ma.enset;

import javax.xml.bind.DatatypeConverter;
import java.util.Base64;
import java.util.Formatter;

public class CryptoUtilImp {


    //encoder en base64
    public String encodeToBase64(byte[] data){
        return Base64.getEncoder().encodeToString(data);
    }
    //Decoder base64 recoit String
    public byte[] decodeFromBase64(String dataBase64){
        return Base64.getDecoder().decode(dataBase64.getBytes());
    }


    //encoder en base64URL
    public String encodeToBase64URL(byte[] data){
        return Base64.getUrlEncoder().encodeToString(data);
    }
    //Decoder base64URL recoit String
    public byte[] decodeFromBase64URL(String dataBase64){
        return Base64.getUrlDecoder().decode(dataBase64.getBytes());
    }

    public String encodeToHex(byte[] data){
        return DatatypeConverter.printHexBinary(data);
    }
    public String encodeToHexNative(byte[] data){
        Formatter formatter = new Formatter();
        for(byte b:data){
            formatter.format("%02x",b);
        }
        return formatter.toString();
    }

}
