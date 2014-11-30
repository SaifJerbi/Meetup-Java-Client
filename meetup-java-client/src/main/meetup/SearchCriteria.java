package meetup;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SearchCriteria<T> {

	private T object;

	public SearchCriteria(T object) {
		this.setObject(object);
	}

	private Map<String, String> parameters = new HashMap<String, String>();

	public void addCriteria(String key, String value) {
		Field[] fields = object.getClass().getDeclaredFields();
		for(Field field : fields)
		{
			if(field.getName().compareToIgnoreCase(key)==0){
				parameters.put(field.getName(), value);
			}
		}
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

}
