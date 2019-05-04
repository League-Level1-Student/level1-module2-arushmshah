package extra;

public class runnerPerson {
public static void main(String[] args) {
	person Spiderman=new person();
	person Thanos=new person();
	person Thor=new person();
	
	
Spiderman.setsuperpower("Spider Power");	
Thanos.setsuperpower("Infinity Stones");	
Thor.setsuperpower("Lightning");

Thor.setname("Thor");
Thanos.setname("Thanos");
Spiderman.setname("Spiderman");

System.out.println(Spiderman.toString());
System.out.println(Thanos.toString());
System.out.println(Thor.toString());

}
}
