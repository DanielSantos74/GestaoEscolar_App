package br.com.escola.views;

import javax.swing.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Gestão Escolar");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton espaco = new JButton("Cadastro de Espaço");
        JButton recurso = new JButton("Cadastro de Recurso");

        espaco.addActionListener(e -> new CadastroEspacoFrame().setVisible(true));
        recurso.addActionListener(e -> new CadastroRecursoFrame().setVisible(true));

        JPanel painel = new JPanel();
        painel.add(espaco);
        painel.add(recurso);

        add(painel);
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}