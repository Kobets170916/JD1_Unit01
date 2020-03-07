package dao;

import java.util.List;
import dao.impl.DAOException;
import entity.Appliance;
import entity.criteria.Criteria;

public interface ApplianceDAO {

	List<Appliance> find(Criteria criteria) throws DAOException;

}
