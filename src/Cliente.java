import javax.swing.*;

public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private double renda;
    int valIdade;

    public void cadastrarCliente() {
        valIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente"));

        if (valIdade > 18 ){
            this.idade = valIdade;
            this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
            this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
            this.renda = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente"));
        }
        else{
            System.out.println("Apenas clientes com idade superior a 18 anos podem ser cadastrados! ");
        }
    }

    public String imprimirResumoCliente() {
        String msg = "Id: " + this.id + "\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";
        msg += "Renda: " + this.renda + "\n";
        return msg;
    }

    public double getRenda(){
        return this.renda;
    }

    /*public String imprimirResumoCliente(){ correto
        String msg;
        msg = "Id: " + this.id + "\n"
                + "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "Renda: " + this.renda + "\n";
        return msg;
    }*/
}
