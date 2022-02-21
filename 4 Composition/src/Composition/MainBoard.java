package Composition;

public class MainBoard {
	
	private String model;
	private String manufacturer;
	private String ramModule;
	private String operatingSystem;
	
	public MainBoard() {
		
	}
	
	public void uploadOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		System.out.println("bu iþletim sistemi yüklendi: " +operatingSystem);
		
		
	}
	public MainBoard(String model, String manufacturer, String ramModule, String operatingSystem) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramModule = ramModule;
		this.operatingSystem = operatingSystem;
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

	public String getRamModule() {
		return ramModule;
	}

	public void setRamModule(String ramModule) {
		this.ramModule = ramModule;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
