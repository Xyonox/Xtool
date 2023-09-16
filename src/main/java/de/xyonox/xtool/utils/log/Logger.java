package de.xyonox.xtool.utils.log;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private final boolean debug;

    public Logger(){ this.debug = false; }
    public Logger(boolean debug){this.debug = debug;}

    public void info(String msg){ log(ColorSign.YELLOW + "INFO", msg); }

    public void warning(String msg){ log(ColorSign.ORANGE + "WARNING", msg); }
    public void error(String msg){ log(ColorSign.RED + "ERROR",ColorSign.RED + msg); }
    public void error(Exception msg){ log(ColorSign.RED + "ERROR",ColorSign.RED + msg.getMessage()); }
    public void error(String msg, Exception exception){ log(ColorSign.RED + "ERROR",ColorSign.RED + msg + " Exception: " + exception.getMessage()); }
    public void log(String pref, String message){
        System.out.println(pref + ColorSign.RESET + " [" + ColorSign.BLUE + OffsetDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + ColorSign.RESET + "] " + message + ColorSign.RESET);
    }
    public void debug(String text) {
        if (debug)
            log("\u001b[38;5;147mDEBUG", text);
    }
    public void shutdown(String msg){
        log(ColorSign.WHITE + "SHUTDOWN", "->");
        System.out.println(msg);
        log(ColorSign.WHITE + "SHUTDOWN", "->");
    }

}