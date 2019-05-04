package extra;

public class person {
private String name;
private String superpower;

public String name() {
	return name;
}
public String superpower() {
	return superpower;
}
public void setname(String name) {
	this.name=name;
}
public void setsuperpower(String superpower) {
	this.superpower=superpower;
}
public String toString() {
	return name+" has mad "+superpower+" skills.";

}
}
