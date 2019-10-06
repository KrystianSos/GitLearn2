class Machine {
    private String name;
    int ok;

    public Machine() {
        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int ok) {
        System.out.println("Third constructor running!");
        this.ok = ok;
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {

        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");

        Machine machine3 = new Machine("Bertie", 3);

    }

}

/*
class Machine {
	private String name;
	int ok;

	public Machine() {
		this("Arnie", 0);

		System.out.println("Constructor running!");
	}

	public Machine(String name) {
		this(name, 0);

		System.out.println("Second constructor running!");
		this.name = name;
	}

	public Machine(String name, int ok) {
		System.out.println("Third constructor running!");
		this.ok = ok;
		this.name = name;
	}
}

public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();

		Machine machine2 = new Machine("Bertie");

		Machine machine3 = new Machine("Bertie", 3);

	}

}
*/