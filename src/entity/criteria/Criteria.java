package entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {
	
	private String groupSearchName; //по какой группе товаров я хочу искать
	private Map<String, Object> criteria = new HashMap<String, Object>();//для передачи любого набора параметров
	
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName(){
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {//имя и значение
		criteria.put(searchCriteria, value);
	}

	public Map<String, String> getCriteria() {
		 return null;
    }

    public void setCriteria(Map<String, Object> criteria) {
        this.criteria = criteria;
	}
	
}
