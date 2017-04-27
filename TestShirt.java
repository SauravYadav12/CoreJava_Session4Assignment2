class Shirt{
	private int CollarSize;
    private int SleeveLength;
	private String material;
	
	public Shirt(int collar , int sleeve)
	{
		CollarSize = collar;
		SleeveLength = sleeve;
		material = "Cotton";
		
	}
	public Shirt()
	{
		CollarSize = 0;
		SleeveLength = 0;
		material = "Cotton";
	}
	public void setMaterial(String value)
	{
		material = value;;
		
	}
	public String getMaterial()
	{
		 return material;
	}
	
	public int getCollarSize()
	{
		return CollarSize;
	}
	public void setCollarSize(int value)
	{
		CollarSize = value;
	}
	
	public int getSleeveLength()
	{
		return SleeveLength;
	}
	public void setSleeveLength(int value)
	{
		SleeveLength = value;
	}
	
	public void shirtNew()
	{
		System.out.println("The Collar Size is " + CollarSize + "\n" + "The Sleeve Length is " + SleeveLength + "\n" + "The Material is " + material );
	}
}

class TestShirt
{
	public static void main(String[] args)
	{
		Shirt sr1 = new Shirt();
		Shirt sr2 = new Shirt(11,21);
		Shirt sr3 = new Shirt(12,22);
		sr1.setCollarSize(10);
		sr1.setSleeveLength(20);
		
		sr1.shirtNew();
		sr2.shirtNew();
		sr3.shirtNew();	
	}
}