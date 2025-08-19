package type_conversion;

class Abc {
    void getRateOfInterest() {
        System.out.println("I am Parent class");
    }
}

class Child extends Abc{
	void getRateOfInterest() {
        System.out.println("I am Child class");
        super.getRateOfInterest();
    }
	
	
}

public class Bank {

    public static void main(String[] args) {
        Child b = new Child();
        b.getRateOfInterest();


    }
}

	