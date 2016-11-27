//I didn't copy the BasePlusCommissionEmployeeTest method from the book (chapter 9,
//so I don't actually test this method, even though I am pretty sure I understand how it will work

public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	
	public BasePlusCommissionEmployee( String first, String last, String ssn,
			double sales, double rate, double salary)
	{
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	public void setBaseSalary( double salary )
	{
		if ( salary >= 0.0)
			baseSalary = salary;
		else
			throw new IllegalArgumentException(
					"Base salary must be >= 0.0");
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	@Override
	public double earnings()
	{
		return getBaseSalary() + super.earnings();
	}

	@Override
	public String toString()
	{
		return String.format(
				"%s %s\n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary() );
	}
	
}
