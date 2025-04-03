public class person{
    private String name;

    public person(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Can't have an empty name!");
        }
    }

    public Person(){name = "No Name yet";}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}