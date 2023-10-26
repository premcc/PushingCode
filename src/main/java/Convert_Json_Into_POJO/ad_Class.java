package Convert_Json_Into_POJO;

public class ad_Class {
	
	String Name;
	String Age;
	String City;
	String Standard;
	
	public ad_Class(String name,String age,String city,String standard)
	{
		this.Name=name;
		this.Age=age;
		this.City=city;
		this.Standard=standard;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
	}
	

}
