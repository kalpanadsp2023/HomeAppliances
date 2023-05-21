

public class Main 
{
	public static void main(String[] args)
	{
		// Adding the appliances details to the list 
		ApplianceService appService = new ApplianceService();
		appService.addApplianceToHome(new Appliance("Washing Machine", "LG", "05-20-2023",2025));
		appService.addApplianceToHome(new Appliance("Washing Dryer", "LG", "05-20-2023",2022));
		appService.addApplianceToHome(new Appliance("Washing Dryer", "GE", "05-20-2023",2022));
		appService.addApplianceToHome(new Appliance("Refridgerator", "Whirpool", "05-20-2023",2021));
		appService.addApplianceToHome(new Appliance("Electric Range", "GE", "05-20-2023",2025));
		appService.addApplianceToHome(new Appliance("Microwave Oven", "GE", "05-20-2023",2020));
		appService.addApplianceToHome(new Appliance("Television", "TCL", "05-20-2023",2025));

		// Display of the appliances 
		appService.displayAllAppliances();
		System.out.println("****************************************************************");
		
		// Get details of an appliance
		
		appService.getAppliance("Washing Dryer").forEach(System.out::println);
		//System.out.println(appService.getAppliance("Washing Dryer"));
		System.out.println("****************************************************************");
		
		//Get details with a text
		appService.getApplianceWithText("GE").forEach(System.out::println);
		//for(Appliance appl:appService.getApplianceWithText("GE"))
		//	System.out.println(appl);
		System.out.println("****************************************************************");
		
		// Get details by company
		//for(Appliance appl:appService.getApplianceByCompany("LG"))
		//	System.out.println(appl);
		appService.getApplianceByCompany("LG").forEach(System.out::println);
		System.out.println("****************************************************************");
		
		// Get details of appliances which are out of warranty
		//for(Appliance appl:appService.getApplianceOutOfWarranty(2023))
		//	System.out.println(appl);
		appService.getApplianceOutOfWarranty(2023).forEach(System.out::println);
		System.out.println("****************************************************************");
	}
}
