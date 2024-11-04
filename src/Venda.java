import javax.swing.*;

public class Venda {
    private Carro carro;
    private Cliente cliente;

    public void realizarVenda(){
        this.carro = new Carro();
        carro.cadastrarCarro();
        carro.imprimirResumoCarro();
        this.cliente = new Cliente();
        cliente.cadastrarCliente();

        double parcela = this.carro.getValorVenda() / 36;

        if(validarVenda(parcela, this.cliente.getRenda())){
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        }else {
            JOptionPane.showMessageDialog(null, "Venda NÃO foi realizada!");
        }
    }

    public boolean validarVenda(double valorParcela, double renda){
        boolean resultado = false;
        double valorReferencia = renda * 0.30;

        if(valorParcela < valorReferencia){
            resultado = true;
        }

        return resultado;
    }
}
