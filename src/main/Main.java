package main;

import java.util.List;

import entity.Appliance;
import entity.Laptop;
import entity.criteria.Criteria;
import service.ApplianceService;
import service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService servise = factory.getApplianceService();

		/////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());// создаем объект Criteria
		criteriaLaptop.add(Laptop.DISPLAY_INCHS.toString(), 22);

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		///////////////////////

		criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY.toString(), 1000);
		criteriaLaptop.add(Laptop.DISPLAY_INCHS.toString(), 16);

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

	}

}
