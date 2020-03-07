package service.validation;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import entity.Laptop;
import entity.criteria.Criteria;

public class Validator {// проверяет переданные критерии

	public static boolean criteriaValidator(Criteria criteria) {
		String categoria = criteria.getGroupSearchName();

		switch (categoria) {
		case "Laptop":
			return laptopValidator(criteria);
		case "Oven":
			return true;

		case "Refrigerator":
			return true;
		case "VacuumCleaner":
			return true;
		case "TabletPC":

			return true;
		case "Speakers":
			return true;
		default:
			return false;
		}
	}

	private static boolean laptopValidator(Criteria criteria) {

		Map<String, String> validator = new HashMap<>();
		validator.put(Laptop.BATTERY_CAPACITY.toString(), "[0-9]\\.[0-9]");
		validator.put(Laptop.CPU.toString(), "[0-9]\\.[0-9]");
		validator.put(Laptop.OS.toString(), "[0-9a-zA-Z]+");
		validator.put(Laptop.DISPLAY_INCHS.toString(), "[1-2][0-9]");
		validator.put(Laptop.SYSTEM_MEMORY.toString(), "[1-9][0-9]{3,4}");

		Set<String> criteriesKeys = criteria.getCriteria().keySet();

		for (String key : criteriesKeys) {
			String regex = validator.get(key);
			String parametres = criteria.getCriteria().get(key);

			if (!Pattern.matches(regex, parametres)) {
				return false;
			}
		}

		return true;
	}

}
