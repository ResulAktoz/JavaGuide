package Interfaceler;

public class Main {

	public static void main(String[] args) {
		
		PcEngineer engineer1 = new PcEngineer(false ,false);
		
		engineer1.askerlikDurumuSorgula();
		engineer1.adliSicilSorgula();
		System.out.println(engineer1.graduationGpa(3.07));
		String[] tecrübe = {"Vestel", "Havelsan", "Turkcell"};
		
		engineer1.isTecrübesi(tecrübe);
		
		System.out.println("****************");
		
		MechanicalEngineer engineer2 = new MechanicalEngineer(true, false);
		
		String[] deneyim = {};
		
		String[] references = {"Resul","Sinem"}; 
		
		engineer2.adliSicilSorgula();
		engineer2.askerlikDurumuSorgula();
		System.out.println(engineer2.graduationGpa(2.30));
		engineer2.isTecrübesi(deneyim);
		engineer2.getReference(references);
		engineer2.work();
		
		
		
	}

}
