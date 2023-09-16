package de.xyonox.xtool.console;

import de.xyonox.xtool.utils.log.Logger;
import java.util.concurrent.ConcurrentHashMap;

public class CommandPacket {
    private static final ConcurrentHashMap<String, ConstructCommand> commands;

    private static Logger logger;

    static {
        commands = new ConcurrentHashMap<>();
        if(logger == null) logger = new Logger();
    }

    public CommandPacket(Logger logger){
        if(logger == null) this.logger = logger;
    }

    public CommandPacket(){
        if(logger == null) logger = new Logger();
    }

    public void register(String name, ConstructCommand abs){
        if(commands.containsKey(name)){
            logger.error("command " + name + "is already exits");
        } else {
            commands.put(name, abs);
        }
    }

    public void handle(String command, String[] args){
        if(!commands.containsKey(command)){
            logger.error("This command doesn't exits");
        } else {
            ConstructCommand cmd = commands.get(command);
            cmd.execute(command, args);
        }
    }

}
