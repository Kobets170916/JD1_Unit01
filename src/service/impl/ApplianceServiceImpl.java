package service.impl;

import java.util.List;
import dao.ApplianceDAO;
import dao.DAOFactory;
import dao.impl.DAOException;
import entity.Appliance;
import entity.criteria.Criteria;
import service.ApplianceService;
import service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance = null;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		return appliance;

	}
}
