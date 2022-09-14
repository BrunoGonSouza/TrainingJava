package atividadeJava;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Medicamento m1 = new Medicamento();
        Cliente c1 = new Cliente();
        Celular cel1 = new Celular();

        m1.validade = JOptionPane.showInputDialog("Digite a validade do medicamento: ");
        m1.utilidadeMedicamento = JOptionPane.showInputDialog("Digite qual o uso do medicamento: ");
        m1.usoAdulto = JOptionPane.showInputDialog("O medicamento é exclusivo de uso adulto?");

        JOptionPane.showMessageDialog(null,
                                    "Validade: " + m1.validade +
                                    "\nFunção do medicamento: " + m1.utilidadeMedicamento +
                                    "\nUso exclusivo adulto: " + m1.usoAdulto);
        
        c1.nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        c1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
        c1.profissao = JOptionPane.showInputDialog("Digite a profissão do cliente: ");

        JOptionPane.showMessageDialog(null,
                                    "Nome: " + c1.nome +
                                    "\nIdade: " + c1.idade +
                                    "\nProfissão: " + c1.profissao);

        cel1.marca = JOptionPane.showInputDialog("Digite a marca do celular: ");
        cel1.bateria = Integer.parseInt(JOptionPane.showInputDialog("Informe a capacidade da bateria: "));
        cel1.tamanhoTela = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da tela: "));

        JOptionPane.showMessageDialog(null,
                                    "Marca: " + cel1.marca +
                                    "\nCapacidade da bateria: " + cel1.bateria +
                                    "\nTamanho da tela: " + cel1.tamanhoTela + " polegadas");
    }
}
