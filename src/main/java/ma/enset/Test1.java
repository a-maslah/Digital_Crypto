package ma.enset;

import javax.xml.bind.DatatypeConverter;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

public class Test1 {


    public static void main(String[] args) {

       /* String document = "This is my message";
        byte[] bytes =  document.getBytes();
        System.out.println(Arrays.toString(bytes));
        //Encodage et Decodage base64
        String docuemntBase64 = Base64.getEncoder().encodeToString(bytes);
        System.out.println(docuemntBase64);
        byte[] decoded= Base64.getDecoder().decode(docuemntBase64);
        System.out.println(new String(decoded));


        String encodedBase64Url = Base64.getUrlEncoder().encodeToString(document.getBytes());
        System.out.println(encodedBase64Url);

        */


        CryptoUtilImp cryptoUtilImp = new CryptoUtilImp();

        System.out.println("--------------BASE64 && BASE64URL --------------------------");
        String data  = "Hello From ENSET>>>";
        String  dataBase64 =  cryptoUtilImp.encodeToBase64(data.getBytes());
        String  dataBase64URL =  cryptoUtilImp.encodeToBase64URL(data.getBytes());
        System.out.println(dataBase64);
        System.out.println(dataBase64URL);

        byte[] decodedBytes =  cryptoUtilImp.decodeFromBase64(dataBase64);
        System.out.println("decode Base64 :  "+new String(decodedBytes));

        byte[] decodedBytesURL =  cryptoUtilImp.decodeFromBase64URL(dataBase64URL);
        System.out.println("decode Base64URL :  "+new String(decodedBytesURL));

        System.out.println(Arrays.toString(dataBase64.getBytes()));

        byte[] dataBytes = dataBase64.getBytes();
        String dataHex = DatatypeConverter.printHexBinary(dataBytes);
        System.out.println("byte -> Hex "+dataHex);

        byte[] bytesData = DatatypeConverter.parseHexBinary(dataHex);
        System.out.println(Arrays.toString(bytesData));


        System.out.println("******************");
        System.out.println(cryptoUtilImp.encodeToHexNative(dataBytes));

    }
}
