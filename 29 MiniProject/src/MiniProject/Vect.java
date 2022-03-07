package MiniProject;

import java.util.Scanner;

public class Vect {
	
	private String name;
	private int i;
	private int j;
	private int k;
	
	public Vect(String name) {
		this.name=name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vektörün i j ve k deðerlerini giriniz.");
		System.out.print("i= ");
		this.i= scanner.nextInt();
		System.out.print("j= " );
		this.j= scanner.nextInt();
		System.out.print("k= ");
		this.k= scanner.nextInt();
		System.out.println(name+ " i= " +i);
		System.out.println(name+ " j= " +j);
		System.out.println(name+ " k= " +k);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

}
