package de.xyonox.xtool;


import de.xyonox.xtool.console.CommandPacket;
import de.xyonox.xtool.utils.temp.Jiens;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class XTool {
    public static void defaultCommandHandler(@NotNull CommandPacket commandPacket){
        CommandPacket packet = commandPacket;
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            String[] args = input.split(" ");
            if(args == null) return;
            String abrCMD = args[0];
            String[] convertArgs = new String[args.length - 1];
            System.arraycopy(args, 1, convertArgs, 0, args.length - 1);
            System.out.println(String.join(" ", convertArgs));
            packet.handle(abrCMD, convertArgs);
        }

    }
    public static void defaultCommandHandler(){
        CommandPacket packet = new CommandPacket();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            String[] args = input.split(" ");
            if(args == null) return;
            String abrCMD = args[0];
            String[] convertArgs = new String[args.length - 1];
            System.arraycopy(args, 1, convertArgs, 0, args.length - 1);
            System.out.println(String.join(" ", convertArgs));
            packet.handle(abrCMD, convertArgs);
        }

    }


}
