package service;

import java.util.List;
import entity.Appliance;
import entity.criteria.Criteria;

public interface ApplianceService {

	List<Appliance> find(Criteria criteria);

}
