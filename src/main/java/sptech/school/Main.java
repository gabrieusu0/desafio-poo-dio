package sptech.school;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("111.111.111-11", "João", 20, 50.0);
        Coordenador coordenador1 = new Coordenador("222.222.222-22", "Carlos", 15, 2, 60.0);
        Secretaria secretaria1 = new Secretaria("333.333.333-33", "Juliana", 2000.0, 200.0);


        System.out.println("--- Funcionários ---");
        System.out.println(professor1);
        System.out.println("Salário: R$ " + professor1.getSalario());
        System.out.println("Bônus: R$ " + professor1.getValorBonus());

        System.out.println(coordenador1);
        System.out.println("Salário: R$ " + coordenador1.getSalario());
        System.out.println("Bônus: R$ " + coordenador1.getValorBonus());

        System.out.println(secretaria1);
        System.out.println("Salário: R$ " + secretaria1.getSalario());

        // criando o controle de bônus
        ControleBonus controle = new ControleBonus();

        // add professor e coordenador no controle de bônus
        controle.adiciona(professor1);
        controle.adiciona(coordenador1);
        // controle.adiciona(secretaria1); // n dá para add pq secretaria não implementa bonus


        System.out.println("\n--- Controle de Bônus ---");
        System.out.println("Total de bônus pagos: R$ " + controle.calculaTotal());


        System.out.println("\n--- Lista de funcionários com bônus ---");
        System.out.println(controle.exibir());
    }
}
