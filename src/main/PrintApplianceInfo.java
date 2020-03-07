package main;

import java.util.List;
import entity.Appliance;

public class PrintApplianceInfo {

	public static void print(List<Appliance> appliance) {
		if (appliance == null) {
			System.out.println("no matches");

			return;
		}

		for (Appliance app : appliance) {
			System.out.println(app);
		}
	}

}
