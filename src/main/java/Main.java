import org.apache.log4j.Logger;

import java.util.Base64;


class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    static class OOMObject {

    }

    public static void main(String[] args) {
        logger.error("Hello");

        String str = "aGVsbG8=";

//        byte[] bytes = str.getBytes();
//        //Base64 加密
//        String encoded = Base64.getEncoder().encodeToString(bytes);
//        System.out.println("Base 64 加密后：" + encoded);

        //Base64 解密
        byte[] decoded = Base64.getDecoder().decode(str);
        System.out.println("decoded" + decoded);
        String decodeStr = new String(decoded);
        System.out.println("Base 64 解密后：" + decodeStr);


    }
}
