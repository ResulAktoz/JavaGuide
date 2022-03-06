package AnonymousInnerClass;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(){

			@Override
			public void study() {
				System.out.println("ders çalışıyorum");
				
			}

			@Override
			public void attendClass() {
				System.out.println("derse giriyorum");
				
			}
			
		}; 
		
		student.study();
		student.attendClass();
		
		
		System.out.println("******************");
		
		AStudent student1 = new AStudent("Resul",15) {

			@Override
			void register() {
				
				System.out.println("Kayıt yapılıyor.. " +getName()+ " numarası: " +getNumber());
				
			}
			
		};
		
		student1.hi();
		student1.register();

	}
	
	public static abstract class AStudent{
		
		private String name;
		private int number;
		
		
		public AStudent(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		abstract void register();
		public void hi() {
			
		
		
		System.out.println("Selamlar.. ");
		
		}
	}
	
	public interface Student{
		void study();
		void attendClass();
	}

}
