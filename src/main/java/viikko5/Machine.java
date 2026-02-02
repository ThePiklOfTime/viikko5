package viikko5;

public class Machine {
    String type;
    String model;
    Worker operator;

    Machine(String type, String model, Worker operator) {
        this.type = type;
        this.model = model;
        this.operator = operator;
    }

    public String getMachineDetails() {
        return "Koneen tiedot: " + type + ", " + model + "\nTyöntekijän tiedot: " + operator.getName() + ", " + operator.getRole();
    }
}
