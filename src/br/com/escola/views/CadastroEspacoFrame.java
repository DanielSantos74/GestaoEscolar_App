package br.com.escola.views;

import br.com.escola.models.Espaco;
import br.com.escola.repository.BancoMemoria;

import javax.swing.*;
import java.awt.*;

public class CadastroEspacoFrame extends JFrame {

    JTextField codigo = new JTextField();
    JTextField nome = new JTextField();
    JComboBox<String> tipo = new JComboBox<>(new String[]{"Sala", "Laboratório", "Biblioteca"});
    JTextField capacidade = new JTextField();

    public CadastroEspacoFrame() {
        setTitle("Cadastro de Espaço");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(5, 2, 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painel.add(new JLabel("Código:"));
        painel.add(codigo);
        painel.add(new JLabel("Nome:"));
        painel.add(nome);
        painel.add(new JLabel("Tipo:"));
        painel.add(tipo);
        painel.add(new JLabel("Capacidade:"));
        painel.add(capacidade);

        JButton cadastrar = new JButton("Cadastrar");
        painel.add(new JLabel());
        painel.add(cadastrar);

        cadastrar.addActionListener(e -> cadastrar());
        add(painel);
    }

    private void cadastrar() {
        if (codigo.getText().isEmpty() || nome.getText().isEmpty() || capacidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os campos.");
            return;
        }

        try {
            Espaco espaco = new Espaco(
                    codigo.getText(),
                    nome.getText(),
                    (String) tipo.getSelectedItem(),
                    Integer.parseInt(capacidade.getText())
            );

            BancoMemoria.adicionarEspaco(espaco);
            JOptionPane.showMessageDialog(this, "Espaço cadastrado!");

            codigo.setText("");
            nome.setText("");
            capacidade.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Capacidade deve ser um número.");
        }
    }

    public static void main(String[] args) {
        new CadastroEspacoFrame().setVisible(true);
    }
}