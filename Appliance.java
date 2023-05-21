
public class Appliance 
{
	private String name;
	private String company;
	private String purchaseDate;
	private int warrantyYear;
	
	public Appliance()
	{
		super();
	}
	
	public Appliance(String name, String company, String purchaseDate, int warrantyYear)
	{
		super();
		this.name = name;
		this.company = company;
		this.purchaseDate = purchaseDate;
		this.warrantyYear = warrantyYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getWarrantyYear() {
		return warrantyYear;
	}

	public void setWarrantyYear(int warrantyYear) {
		this.warrantyYear = warrantyYear;
	}

	@Override
	public String toString() 
	{
		return "Appliance [name=" + name + ", company=" + company + ", purchaseDate=" + purchaseDate + ", warrantyYear="
				+ warrantyYear + "]";
	}

	
	
	
}
