import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    	//Logger
    	
    	Logger<String> stringLogger = new Logger<>();
        
        stringLogger.log("Blastoise");
        stringLogger.log("Charizard");
        stringLogger.log("Venosaur");
        
        String lastStringLog = stringLogger.getLastLog();
        System.out.println("Last String Log: " + lastStringLog);
        
        List<String> allStringLogs = stringLogger.getAllLogs();
        System.out.println("All String Logs: " + allStringLogs);
        
        Logger<Boolean> loggerr = new Logger<>();
        
        loggerr.log(true);
        loggerr.log(false);
        loggerr.log(true);
        
        Boolean lastIntegerLog = loggerr.getLastLog();
        System.out.println("The last value of Boolean: " + lastIntegerLog);
        
        List<Boolean> allIntegerLogs = loggerr.getAllLogs();
        System.out.println("The Logs Boolean: " + allIntegerLogs);
        
        // LogEntry
        
        LogEntry logHandler = new LogEntry(LogLevel.DEBUG);
        
        logHandler.log("System initialized", LogLevel.INFO);    
        logHandler.log("Debugging application", LogLevel.DEBUG); 
        logHandler.log("An error occurred", LogLevel.ERROR);     
        
        logHandler.setLogLevel(LogLevel.ERROR);
        
        logHandler.log("System running smoothly", LogLevel.INFO);  
        logHandler.log("Debugging in progress", LogLevel.DEBUG);   
        logHandler.log("Critical fail", LogLevel.ERROR);       
        
        LogLevel currentLogLevel = logHandler.getCurrentLogLevel();
        System.out.println("Current Log Level: " + currentLogLevel);
                    
    }
}
