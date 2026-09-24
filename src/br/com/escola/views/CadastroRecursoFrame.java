package br.com.escola.views;

import br.com.escola.models.*;
import br.com.escola.repository.BancoMemoria;
import javax.swing.*;
import java.awt.*;

public class CadastroRecursoFrame extends JFrame {

    JTextField patrimonio = new JTextField();
    JTextField descricao = new JTextField();
    JTextField quantidade = new JTextField();
    JComboBox<String> categoria = new JComboBox<>(new String[]{"Livro", "Computador", "Projetor", "Outro"});
    JComboBox<Espaco> espaco = new JComboBox<>();

    public CadastroRecursoFrame() {
        setTitle("Cadastro de Recurso");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        for (Espaco e : BancoMemoria.listarEspacos())
            espaco.addItem(e);

        JPanel p = new JPanel(new GridLayout(6, 2, 10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        p.add(new JLabel("Patrimônio:")); p.add(patrimonio);
        p.add(new JLabel("Descrição:")); p.add(descricao);
        p.add(new JLabel("Categoria:")); p.add(categoria);
        p.add(new JLabel("Quantidade:")); p.add(quantidade);
        p.add(new JLabel("Espaço:")); p.add(espaco);

        JButton cadastrar = new JButton("Cadastrar");
        p.add(new JLabel()); p.add(cadastrar);

        cadastrar.addActionListener(e -> cadastrar());
        add(p);
    }

    private void cadastrar() {
        if (patrimonio.getText().isEmpty() || descricao.getText().isEmpty() || quantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os campos.");
            return;
        }

        try {
            RecursoEducacional r = new RecursoEducacional(
                    patrimonio.getText(), descricao.getText(),
                    (String) categoria.getSelectedItem(),
                    Integer.parseInt(quantidade.getText()),
                    (Espaco) espaco.getSelectedItem()
            );

            BancoMemoria.adicionarRecurso(r);
            JOptionPane.showMessageDialog(this, "Recurso cadastrado!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantidade deve ser um número.");
        }
    }

    public static void main(String[] args) {
        new CadastroRecursoFrame().setVisible(true);
    }
}