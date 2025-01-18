class ObjectNode{
	Object data;
	ObjectNode next;
	public ObjectNode(Object data) {
		this.data=data;
	}
}
class Book{
	int id;
	String name;
	public Book(int id,String name) {
	this.id=id;
	this.name=name;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	public String toString() {
		return "ID: "+this.id+ 
				" \nName: "+this.name;
	}
}
public class Student {
int id;
String name;
public Student(int id,String name) {
this.id=id;
this.name=name;
}
int getId() {
	return id;
}
String getName() {
	return name;
}
public String toString() {
	return "ID: "+this.id+ 
			" \nName: "+this.name;
}
	public static void main(String[] args) {
		Student s1=new Student(127, "Sarah");
		Student s2=new Student(6, "Aisha");
		Student s3=new Student(103,"Zainab");
		ObjectNode start=new ObjectNode(s1);
		start.next=new ObjectNode(s2);
		start.next.next=new ObjectNode(s3);
		//for(ObjectNode q=start;q!=null;q=q.next) {
			//System.out.println(q.data);
		//}
		Book b1=new Book(23,"AbC");
		Book b2=new Book(1, "XYZ");
		Book b3=new Book(9,"DSa");
		start.next.next.next=new ObjectNode(b1);
		start.next.next.next.next=new ObjectNode(b2);
		start.next.next.next.next.next=new ObjectNode(b3);
		for(ObjectNode q=start;q!=null;q=q.next) {
			System.out.println(q.data);
		}
	}

}