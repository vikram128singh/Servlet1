
public class Model
{
	private String un;
	private String uc;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getUc() {
		return uc;
	}
	public void setUc(String uc) {
		this.uc = uc;
	}
	
	boolean register()
	{
		System.out.println(un);
		System.out.println(uc);
		return true;
	}

}




