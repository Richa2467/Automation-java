package Day19;
//cat ct=(Cat) an;
// A B     C D






class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}





public class TypeCastingobjects2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Rule 1 : conversion is valid or not (Compiletime error)
//		The type of d and c must have some relationship(either parent to child or child to parent)
//		Animal a=new Dog();
//		Cat c=(Cat)a;             //valid as per rule 1
		
//		Dog d=new Dog();
//		Cat c=(Cat) d;             // not valid as per rule 1
//		
		
		
		//Rule 2: assignment is valid or not.(Compiletime error)
		//'c' must be either same or child of 'A
		
//		Animal a=new Dog();
//		Cat c=(Cat) a;    //valid as per rule 2
		
//		Animal a=new Dog();
//		Cat c=(Dog) a;    //invalid as per rule 2
		
		
		//Rule 3:       (Runtime error)
		//the underlying object type of 'd' must be either same or child of c.
		
//		Animal a=new Dog();
//		Cat d=(Cat) a;     //not valid as per rule 3
		
		
		
		
		//Rule 1, Rule 2 ,Rule3
		Animal a=new Dog();
		Dog d=(Dog)a;            //Rule1- yes, Rule2-yes, Rule3- yes
		
		
		
		
		
		
		
		
		
		
		
	}

}
