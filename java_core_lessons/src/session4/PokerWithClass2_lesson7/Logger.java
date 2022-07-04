package session4.PokerWithClass2_lesson7;

public class Logger {

//    public static final String INFO = "INFO";
//    public static final String DEBUG = "DEBUG";
//    public static final String WARN = "WARNING";
//    public static final String ERROR = "ERROR";


//    Написать свой класс Logger, который потом можно в разных местах наших программ.
//    Логгер должен поддерживать разные уровни логирования (info, debug, warn, error).
//    Можно добавить Enum для разных уровней логирования,
//    чтобы по этим уровням менять цвет выводимого сообщения.

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";



    public enum Levels{
        INFO("Information"),
        DEBUG("Debug"),
        WARN("Warning"),
        ERROR("Error");

        private String value;

        Levels(String value){
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }



    public static void log(Levels level, String message){
        switch (level){
            case INFO:
                System.out.println(ANSI_YELLOW + level.getValue() + ANSI_RESET + ": " +  message );
                break;
            case WARN:
                System.out.println(ANSI_BLUE + level.getValue() + ANSI_RESET + ": " +  message );
                break;
            case DEBUG:
                System.out.println(ANSI_GREEN + level.getValue() + ANSI_RESET + ": " +  message );
                break;
            case ERROR:
                System.out.println(ANSI_RED + level.getValue() + ": " +  message + ANSI_RESET);
                break;
        }

    }



    //System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

   // LOGGER.log(Level.INFO, "setSuit");

//    final static java.util.logging.Logger LOGGER =
//            java.util.logging.Logger.getLogger(Logger.class.getName());



}
