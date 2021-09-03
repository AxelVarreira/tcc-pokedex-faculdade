package com.axel.joao.tcc.poo2.gui;

import com.axel.joao.tcc.poo2.domain.Usuario;
import com.axel.joao.tcc.poo2.services.impl.SalvarUsuarioServiceImpl;
import com.axel.joao.tcc.poo2.services.interfaces.SalvarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JFrame {
    private JPanel mainPanel;
    private JTextField TF_name;
    private JButton BT_ok;
    private JLabel LB_hello;
    @Autowired
    private SalvarUsuarioService salvarUsuario;

    public StartScreen() {
        super("Start");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);

        BT_ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int id = 0;
                String name = TF_name.getText();
                System.out.println(name);
                Usuario usuario = new Usuario(id, name);
                salvarUsuario.salvar(usuario);
            }
        });
    }
}
