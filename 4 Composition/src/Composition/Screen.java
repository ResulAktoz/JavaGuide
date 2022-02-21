package Composition;

public class Screen {
	private String model;
	private String manufacturer;
	private String screenSize;
	private Resolution resolution; //monitör içinden resolutionu yerleþtireceðiz.
	
	public Screen() {
		super();
	}

	public Screen(String model, String manufacturer, String screenSize, Resolution resolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.screenSize = screenSize;
		this.resolution = resolution;
	}
	
	public void closeScreen() {
		System.out.println("Monitör kapatýlýyor..");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

}
