package dao.impl;

import java.util.Map;
import entity.Appliance;
import entity.Laptop;
import entity.Oven;
import entity.Refrigerator;
import entity.Speakers;
import entity.TabletPC;
import entity.VacuumCleaner;
import entity.criteria.SearchCriteria;

public class ApplianceFactory {
	private final static String NAME = "Appliance";

	public static Appliance createAppliance(Map<String, Object> parametres) throws DAOException {
		Appliance newApplianceType;
		String newAppliance = (String) parametres.get(NAME);

		switch (newAppliance) {

		case "Laptop":
			newApplianceType = createLaptop(parametres);
			break;

		case "Oven":
			newApplianceType = createOven(parametres);
			break;

		case "Refrigerator":
			newApplianceType = createRefrigerator(parametres);
			break;

		case "Speakers":
			newApplianceType = createSpeakers(parametres);
			break;

		case "TabletPC":
			newApplianceType = createTabletPC(parametres);
			break;

		case "VacuumCleaner":
			newApplianceType = createVacuumCleaner(parametres);
			break;

		default:
			throw new DAOException();
		}
		return newApplianceType;
	}

	private static Laptop createLaptop(Map<String, Object> parametres) {

		Laptop laptop;
		String category = (String) parametres.get(NAME);
		double batteryCapacity = Double
				.parseDouble((String) parametres.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
		String os = (String) parametres.get(SearchCriteria.Laptop.OS.toString());
		int memoryRom = Integer.parseInt((String) parametres.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
		int systemMemory = Integer.parseInt((String) parametres.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
		double cpu = Double.parseDouble((String) parametres.get(SearchCriteria.Laptop.CPU.toString()));
		int displayInchs = Integer.parseInt((String) parametres.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));

		laptop = new Laptop(category, batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
		return laptop;
	}

	private static Oven createOven(Map<String, Object> parametres) {

		Oven oven;
		String category = (String) parametres.get(NAME);
		int powerConsumption = Integer
				.parseInt((String) parametres.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt((String) parametres.get(SearchCriteria.Oven.WEIGHT.toString()));
		int capacity = Integer.parseInt((String) parametres.get(SearchCriteria.Oven.CAPACITY.toString()));
		int depth = Integer.parseInt((String) parametres.get(SearchCriteria.Oven.DEPTH.toString()));
		double height = Double.parseDouble((String) parametres.get(SearchCriteria.Oven.HEIGHT.toString()));
		String x = (String) parametres.get(SearchCriteria.Oven.WIDTH.toString());
		x = x.substring(0, x.length() - 1);
		double width = Double.parseDouble(x);

		oven = new Oven(category, powerConsumption, weight, capacity, depth, height, width);

		return oven;
	}

	private static Refrigerator createRefrigerator(Map<String, Object> parametres) {

		Refrigerator refrigerator;

		String category = (String) parametres.get(NAME);
		int powerConsumption = Integer
				.parseInt((String) parametres.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
		int weight = Integer.parseInt((String) parametres.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
		int freezerCapacity = Integer
				.parseInt((String) parametres.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
		double overallCapacity = Double
				.parseDouble((String) parametres.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
		int height = Integer.parseInt((String) parametres.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
		int width = Integer.parseInt((String) parametres.get(SearchCriteria.Refrigerator.WIDTH.toString()));

		refrigerator = new Refrigerator(category, powerConsumption, weight, freezerCapacity, overallCapacity, height,
				width);

		return refrigerator;
	}

	private static Speakers createSpeakers(Map<String, Object> parametres) {

		Speakers speakers;
		String category = (String) parametres.get(NAME);
		int powerConsumption = Integer
				.parseInt((String) parametres.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
		int numberOfSpeakers = Integer
				.parseInt((String) parametres.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
		String frequencyRange = (String) parametres.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
		int cordLength = Integer.parseInt((String) parametres.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

		speakers = new Speakers(category, powerConsumption, numberOfSpeakers, frequencyRange, cordLength);

		return speakers;
	}

	private static TabletPC createTabletPC(Map<String, Object> parametres) {

		TabletPC tabletPC;

		String category = (String) parametres.get(NAME);
		int batteryCapacity = Integer
				.parseInt((String) parametres.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
		int displayInches = Integer
				.parseInt((String) parametres.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
		int memoryRom = Integer.parseInt((String) parametres.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
		int flashMemoryCapasity = Integer
				.parseInt((String) parametres.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
		String color = (String) parametres.get(SearchCriteria.TabletPC.COLOR.toString());

		tabletPC = new TabletPC(category, batteryCapacity, displayInches, memoryRom, flashMemoryCapasity, color);

		return tabletPC;
	}

	private static VacuumCleaner createVacuumCleaner(Map<String, Object> parametres) {

		VacuumCleaner vacuumCleaner;

		String category = (String) parametres.get(NAME);
		int powerConsumption = Integer
				.parseInt((String) parametres.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
		String filterType = (String) parametres.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
		String bagType = (String) parametres.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
		String wandType = (String) parametres.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
		int motorSpeeadRegulation = Integer
				.parseInt((String) parametres.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
		int cleaningWidth = Integer
				.parseInt((String) parametres.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

		vacuumCleaner = new VacuumCleaner(category, powerConsumption, filterType, bagType, wandType,
				motorSpeeadRegulation, cleaningWidth);

		return vacuumCleaner;
	}
}
