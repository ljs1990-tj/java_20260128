package day17;

public class Quiz {
	private String country;
	private String capital;
	
	public Quiz(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{country : " + this.country + ", capital : " + this.capital + "}";
	}
}
