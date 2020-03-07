package dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import dao.ApplianceDAO;
import entity.Appliance;
import entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {// реализация поиска подходящей Appliance

		List<Appliance> findAppliance = new ArrayList<Appliance>();

		String groupSearchName = criteria.getGroupSearchName();

		Map<String, Object> parametr;

		try {
			BufferedReader reader = new BufferedReader(new FileReader("appliances.txt"));

			while (reader.ready()) {

				String line = reader.readLine();
				String applianceType = line.split(":")[0].trim();

				if (groupSearchName.equals(applianceType)) {
					parametr = getCriteria(line);

					if (compareCriteria(parametr, criteria.getCriteria())) {
						findAppliance.add(ApplianceFactory.createAppliance(parametr));
					}
				}
			}
			reader.close();

		} catch (IOException e) {
			throw new DAOException(e);
		}
		return findAppliance;
	}

	private Map<String, Object> getCriteria(String line) {
		Map<String, Object> criteria = new HashMap<String, Object>();
		String[] parametr = line.split("\\s?[,;:]?\\s+");

		criteria.put("Appliance", parametr[0]);

		for (int i = 1; i < parametr.length; i++) {
			criteria.put(parametr[i].split("=")[0], parametr[i].split("=")[1]);
		}

		return criteria;
	}

	private boolean compareCriteria(Map<String, Object> parametres, Map<String, Object> criteria) {
		boolean isCheck = true;

		for (Map.Entry<String, Object> entry : criteria.entrySet()) {
			String st = entry.getKey();
			if (!(criteria.get(st).toString()).equals(parametres.get(st))) {
				isCheck = false;
				break;
			}
		}

		return isCheck;
	}

}
