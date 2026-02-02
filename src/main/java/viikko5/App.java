package viikko5;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Anna tehtaalle nimi:");
        String factoryName = scanner.nextLine();
        Factory factory = new Factory(factoryName);
        while (!exit) {
            System.out.println("1) Lisää kone \n2) Listaa kaikki koneet\n0) Lopeta ohjelma");
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
                
            switch (i) {
                case 1:
                    System.out.println("Anna koneen tyyppi:");
                    String type = scanner.nextLine();
                    System.out.println("Anna koneen malli:");
                    String model = scanner.nextLine();
                    System.out.println("Anna työntekijän nimi:");
                    String name = scanner.nextLine();
                    System.out.println("Anna työntekijän ammattinimike:");
                    String role = scanner.nextLine();
                    Worker worker = new Worker(name, role);
                    Machine machine = new Machine(type, model, worker);
                    factory.addMachine(machine);
                    System.out.println("Kone lisätty!");
                    break;
                case 2:
                    if (factory.getMachines().isEmpty()) {
                        System.out.println("Tehtaassa ei ole koneita.");
                    } else {
                        System.out.println("Tehtaasta " + factory.getName() + " löytyy seuraavat koneet:");
                        for (Machine m : factory.getMachines()) {
                            System.out.println(m.getMachineDetails());
                        }
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
            }
        }
        scanner.close();
    }
}