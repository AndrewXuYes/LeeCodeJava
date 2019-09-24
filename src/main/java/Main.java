import org.apache.log4j.Logger;

import java.util.Date;

class Main {

    private static Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) {

        logger.info(new Date() + "   hello");
        logger.error(new Date() +"   error");
    }
}
