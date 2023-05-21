import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class ApplianceService
{
	private List<Appliance> homeAppliances = new ArrayList<>();
	public void addApplianceToHome(Appliance appliance)
	{
		homeAppliances.add(appliance);
	}
	
	public void displayAllAppliances()
	{
		homeAppliances.forEach(System.out::println);
		
		//for(Appliance appl: homeAppliances)
		//	System.out.println(appl);
	}
	
	public List<Appliance> getAppliance(String name)
	{
		List<Appliance> appl =  homeAppliances.stream()
									.filter(p -> p.getName().equals(name))
									.collect(Collectors.toList());
		
		/*for(Appliance appl: homeAppliances)
		{
			if(appl.getName().equals(name))
				return appl;
		}*/
		return appl;
	}
	public List<Appliance> getApplianceWithText(String text)
	{
		String searchText = text.toLowerCase();
		
		List<Appliance> applFound =  homeAppliances.stream()
				.filter(p -> p.getName().toLowerCase().contains(searchText) || 
						p.getCompany().toLowerCase().contains(searchText))
						.collect(Collectors.toList());
		
		
		/*List<Appliance> applFound = new ArrayList<>();
		for(Appliance appl: homeAppliances)
		{
			if(appl.getName().toLowerCase().contains(searchText) ||
					appl.getCompany().toLowerCase().contains(searchText))
			{
				applFound.add(appl);
			}
		}*/
		return applFound;
	}
	public List<Appliance> getApplianceByCompany(String text)
	{
		String searchText = text.toLowerCase();
		
		List<Appliance> applFound =  homeAppliances.stream()
				.filter(p -> p.getCompany().toLowerCase().equals(searchText))
				.collect(Collectors.toList());
		
		/*List<Appliance> applFound = new ArrayList<>();
		for(Appliance appl: homeAppliances)
		{
			if(appl.getCompany().toLowerCase().equals(searchText))
			{
				applFound.add(appl);
			}
		}*/
		return applFound;
	}
	public List<Appliance> getApplianceOutOfWarranty(int currYear)
	{
		List<Appliance> applFound = homeAppliances.stream()
				.filter(a -> a.getWarrantyYear() < currYear)
				.collect(Collectors.toList());
				
		/*List<Appliance> applFound = new ArrayList<>();
		for(Appliance appl: homeAppliances)
		{
			if(appl.getWarrantyYear() < currYear)
			{
				applFound.add(appl);
			}
		}*/
		return applFound;
	}
}
