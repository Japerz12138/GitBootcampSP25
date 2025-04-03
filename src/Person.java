public class person{
    private String name;

    public person(String name) {
        this.name = name;
    }

    public Person(){name = "No Name yet";}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}