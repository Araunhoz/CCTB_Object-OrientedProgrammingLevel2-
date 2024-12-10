import java.util.List;
import java.util.ArrayList;

public class Logger<T> {
	
	private final List <T> logs;
	
	public Logger() {
		this.logs = new ArrayList<>();
	}
	
	public void log (T entry) {
		logs.add(entry);
	}
	
	public T getLastLog() {
		return logs.isEmpty()?null:logs.get(logs.size()-1);
	}
	
	public List<T> getAllLogs(){
		
		return new ArrayList<>(logs);
		
	}

}
