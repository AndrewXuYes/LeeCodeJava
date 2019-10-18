import org.apache.log4j.Logger;


class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("This is a info");
        logger.error("This is an error");
    }
}
