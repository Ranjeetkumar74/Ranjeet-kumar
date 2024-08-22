package Spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private String Gender;
	private Address address;
	private List<Integer>list;
	private Set<Integer>set;
	private Map<Integer,String > map;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, String gender, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
		System.out.println("Employee.setGender()");
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Employee.setAddress()");
	}
	public List<Integer> getList() {
		return list;
	}


	public void setList(List<Integer> list) {
		this.list = list;
		System.out.println("Employee.setList(55)");
		
	}


	public Set<Integer> getSet() {
		return set;
	}


	public void setSet(Set<Integer> set) {
		this.set = set;
	}


	public Map<Integer, String> getMap() {
		return map;
	}


	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Gender=" + Gender + ", address=" + address + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}


	
	
}
