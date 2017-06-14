package androidService;


import java.util.ArrayList;
import java.util.List;

public class PersonServis {

	private static PersonServis servis;
	
	public static PersonServis getInstance(){
		if(servis == null){
			servis = new PersonServis();
		}
	
	return servis;
	}

	List<Person> personList;
	
	public PersonServis() {
		this.personList = new ArrayList<>();
		Person person1 = new Person(1,"mus");
		Person person2 = new Person(2,"om");
		Person person3 = new Person(3,"rec");
		Person person4 = new Person(4,"bur");
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
	}


}