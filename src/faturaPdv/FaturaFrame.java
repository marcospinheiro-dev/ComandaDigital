package faturaPdv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class FaturaFrame implements ActionListener {

    JFrame pizzariaFrame = new JFrame();

    JCheckBox calabresa = new JCheckBox("Calabresa");
    JCheckBox portuguesa = new JCheckBox("Portuguesa");
    JCheckBox frangoCatupiry = new JCheckBox("Frango Catupiry");
    JCheckBox catupiry = new JCheckBox("Catupiry");
    JCheckBox cheddar = new JCheckBox("Cheddar");
    JCheckBox creamCheese = new JCheckBox("Cream cheese");
    JCheckBox refrigerante2L = new JCheckBox("2 Litros");
    JCheckBox refrigerante1L = new JCheckBox("1 Litro");
    JCheckBox refrigerante500ml = new JCheckBox("500 ml");


    JLabel Pedido = new JLabel();
    JLabel Cliente = new JLabel();
    JLabel Valor = new JLabel();
    JLabel Refrigerante = new JLabel();
    JLabel Cobertura = new JLabel();
    JLabel Total = new JLabel();
    JLabel tipoProdutoTitulo = new JLabel();
    JLabel tipoCoberturaTitulo = new JLabel();
    JLabel pedidoConcluidoTitulo = new JLabel();
    JLabel tipoRefrigerante = new JLabel();

    JTextField boasVindas = new JTextField();
    JTextField pedido = new JTextField();
    JTextField cliente = new JTextField();
    JTextField valor = new JTextField();
    JTextField refrigerante = new JTextField();
    JTextField cobertura = new JTextField();
    JTextField total = new JTextField();

    JTextPane pedidoConcluido = new JTextPane();

    JButton concluir = new JButton();
    JButton enviar = new JButton();
    JButton novoPedido = new JButton();

    public FaturaFrame() {
        pizzariaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pizzariaFrame.setSize(700, 800);
        pizzariaFrame.getContentPane().setBackground(new Color(238, 230, 230));
        pizzariaFrame.setResizable(true);
        pizzariaFrame.setLayout(null);

        //CALABRESA JCheckBox
        calabresa.setBounds(50, 350, 150, 40);
        calabresa.addActionListener(this);
        calabresa.setVisible(true);

        //PORTUGUESA JCheckBox
        portuguesa.setBounds(50, 390, 150, 40);
        portuguesa.addActionListener(this);
        portuguesa.setVisible(true);

        //FRANGO CATUPIRY JCheckBox
        frangoCatupiry.setBounds(50, 430, 150, 40);
        frangoCatupiry.addActionListener(this);
        frangoCatupiry.setVisible(true);

        catupiry.setBounds(260, 350, 150, 40);
        catupiry.addActionListener(this);
        catupiry.setVisible(true);

        cheddar.setBounds(260, 390, 150, 40);
        cheddar.addActionListener(this);
        cheddar.setVisible(true);

        creamCheese.setBounds(260, 430, 150, 40);
        creamCheese.addActionListener(this);
        creamCheese.setVisible(true);

        refrigerante2L.setBounds(460, 350, 150, 40);
        refrigerante2L.addActionListener(this);
        refrigerante2L.setVisible(true);

        refrigerante1L.setBounds(460, 390, 150, 40);
        refrigerante1L.addActionListener(this);
        refrigerante1L.setVisible(true);

        refrigerante500ml.setBounds(460, 430, 150, 40);
        refrigerante500ml.addActionListener(this);
        refrigerante500ml.setVisible(true);

        //BOAS VINDAS JTextField
        boasVindas.setBounds(0, 0, 680, 50);
        boasVindas.setFont(new Font("", Font.BOLD, 20));
        boasVindas.setBorder(BorderFactory.createBevelBorder(1));
        boasVindas.setHorizontalAlignment(JTextField.CENTER);
        boasVindas.setEditable(false);
        boasVindas.setText("Pizzaria da Bela");

        concluir.setBounds(50, 710, 120, 30);
        concluir.setText("Concluir");
        concluir.isSelected();
        concluir.setVisible(true);

        enviar.setBounds(290, 710, 120, 30);
        enviar.setText("Enviar fatura");
        enviar.isSelected();
        enviar.setVisible(true);

        novoPedido.setBounds(500, 710, 120, 30);
        novoPedido.setText("Novo pedido");
        novoPedido.isSelected();
        novoPedido.setVisible(true);

        //PEDIDO JLabel
        Pedido.setBounds(50, 100, 300, 100);
        Pedido.setForeground(new Color(16, 3, 3));
        Pedido.setFont(new Font(" ", Font.PLAIN, 18));
        Pedido.setText("Pedido");
        Pedido.setVisible(true);

        //PEDIDO JTextField
        pedido.setBounds(150, 135, 100, 30);
        pedido.setBackground(new Color(255, 255, 255));
        pedido.setFont(new Font(" ", Font.PLAIN, 18));
        pedido.setText("");
        pedido.setVisible(true);

        //REFRIGERANTE JLabel
        Refrigerante.setBounds(350, 150, 100, 100);
        Refrigerante.setFont(new Font(" ", Font.PLAIN, 17));
        Refrigerante.setText("Refrigerante");
        Refrigerante.setVisible(true);

        //REFRIGERANTE caixa do valor JTextField
        refrigerante.setBounds(450, 185, 100, 30);
        refrigerante.setBackground(new Color(255, 255, 255));
        refrigerante.setFont(new Font(" ", Font.PLAIN, 18));
        refrigerante.setEnabled(false);
        refrigerante.setVisible(true);

        //CLIENTE JLabel
        Cliente.setBounds(50, 150, 300, 100);
        Cliente.setFont(new Font(" ", Font.PLAIN, 18));
        Cliente.setText("Cliente");
        Cliente.setVisible(true);

        //cliente JTextField
        cliente.setBounds(150, 185, 100, 30);
        cliente.setBackground(new Color(255, 255, 255));
        cliente.setFont(new Font(" ", Font.PLAIN, 18));
        cliente.setVisible(true);

        //descrição da "borda" JLabel
        Cobertura.setBounds(350, 100, 100, 100);
        Cobertura.setFont(new Font(" ", Font.PLAIN, 18));
        Cobertura.setText("Borda");
        Cobertura.setVisible(true);

        //caixa do valor borda JTextField
        cobertura.setBounds(450, 135, 100, 30);
        cobertura.setBackground(new Color(255, 255, 255));
        cobertura.setFont(new Font(" ", Font.PLAIN, 18));
        cobertura.setEnabled(false);
        cobertura.setVisible(true);

        //VALOR DO PRODUTO (Título) JLabel
        Valor.setBounds(50, 200, 300, 100);
        Valor.setFont(new Font(" ", Font.PLAIN, 18));
        Valor.setText("Pizza");
        Valor.setVisible(true);

        //caixa do valor da pizza JTextField
        valor.setBounds(150, 235, 100, 30);
        valor.setBackground(new Color(255, 255, 255));
        valor.setFont(new Font(" ", Font.PLAIN, 18));
        valor.setVisible(true);
        valor.setEnabled(false);

        //TOTAL titulo JLabel
        Total.setBounds(350, 200, 100, 100);
        Total.setFont(new Font(" ", Font.PLAIN, 18));
        Total.setText("Total");
        Total.setVisible(true);

        //caixa do valor de total JTextField
        total.setBounds(450, 235, 100, 30);
        total.setBackground(new Color(255, 255, 255));
        total.setFont(new Font(" ", Font.PLAIN, 18));
        total.setEnabled(false);
        total.setVisible(true);

        //tipoProdutoTitulo JLabel
        tipoProdutoTitulo.setBounds(50, 280, 150, 100);
        tipoProdutoTitulo.setFont(new Font("", Font.BOLD, 16));
        tipoProdutoTitulo.setText("SABOR DA PIZZA");
        tipoProdutoTitulo.setVisible(true);

        //tipoCoberturaTitulo JLabel
        tipoCoberturaTitulo.setBounds(260, 280, 150, 100);
        tipoCoberturaTitulo.setBackground(new Color(50, 50, 50));
        tipoCoberturaTitulo.setFont(new Font(" ", Font.BOLD, 16));
        tipoCoberturaTitulo.setText("BORDA");
        tipoCoberturaTitulo.setVisible(true);

        //tipoRefrigerante JLabel
        tipoRefrigerante.setBounds(460, 280, 150, 100);
        tipoRefrigerante.setBackground(new Color(50, 50, 50));
        tipoRefrigerante.setFont(new Font(" ", Font.BOLD, 16));
        tipoRefrigerante.setText("REFRIGERANTE");
        tipoRefrigerante.setVisible(true);

        //pedidoConcluido JTextPane
        pedidoConcluido.setBounds(50, 550, 570, 150);
        pedidoConcluido.setBackground(new Color(255, 255, 255));
        pedidoConcluido.setFont(new Font(" ", Font.PLAIN, 18));
        pedidoConcluido.setText("");
        pedidoConcluido.setVisible(true);

        //pedidoConcluidoTitulo JLabel
        pedidoConcluidoTitulo.setBounds(50, 480, 150, 100);
        pedidoConcluidoTitulo.setFont(new Font(" ", Font.PLAIN, 15));
        pedidoConcluidoTitulo.setText("Resumo da fatura");
        pedidoConcluidoTitulo.setVisible(true);

        pizzariaFrame.add(boasVindas);
        pizzariaFrame.add(Cliente);
        pizzariaFrame.add(Pedido);
        pizzariaFrame.add(Valor);
        pizzariaFrame.add(Refrigerante);
        pizzariaFrame.add(Cobertura);
        pizzariaFrame.add(Total);
        pizzariaFrame.add(pedido);
        pizzariaFrame.add(refrigerante);
        pizzariaFrame.add(cliente);
        pizzariaFrame.add(valor);
        pizzariaFrame.add(cobertura);
        pizzariaFrame.add(total);
        pizzariaFrame.add(tipoProdutoTitulo);
        pizzariaFrame.add(tipoCoberturaTitulo);
        pizzariaFrame.add(tipoRefrigerante);
        pizzariaFrame.add(pedidoConcluido);
        pizzariaFrame.add(pedidoConcluidoTitulo);
        pizzariaFrame.add(concluir);
        pizzariaFrame.add(enviar);
        pizzariaFrame.add(novoPedido);
        pizzariaFrame.add(calabresa);
        pizzariaFrame.add(calabresa);
        pizzariaFrame.add(portuguesa);
        pizzariaFrame.add(frangoCatupiry);
        pizzariaFrame.add(catupiry);
        pizzariaFrame.add(cheddar);
        pizzariaFrame.add(creamCheese);
        pizzariaFrame.add(refrigerante1L);
        pizzariaFrame.add(refrigerante2L);
        pizzariaFrame.add(refrigerante500ml);
        pizzariaFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (Objects.equals(e.getActionCommand(), "Calabresa")) {
            valor.setText("35.00");
            portuguesa.setSelected(false);
            frangoCatupiry.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "Portuguesa")) {
            valor.setText("45.00");
            calabresa.setSelected(false);
            frangoCatupiry.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "Frango Catupiry")) {
            valor.setText("55.00");
            portuguesa.setSelected(false);
            calabresa.setSelected(false);
        }

        if (Objects.equals(e.getActionCommand(), "Catupiry")) {
            cobertura.setText("17.00");
            cheddar.setSelected(false);
            creamCheese.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "Cheddar")) {
            cobertura.setText("19.00");
            catupiry.setSelected(false);
            creamCheese.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "Cream cheese")) {
            cobertura.setText("21.00");
            cheddar.setSelected(false);
            catupiry.setSelected(false);
        }

        if (Objects.equals(e.getActionCommand(), "2 Litros")) {
            refrigerante.setText("9.00");
            refrigerante1L.setSelected(false);
            refrigerante500ml.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "1 Litro")) {
            refrigerante.setText("7.00");
            refrigerante2L.setSelected(false);
            refrigerante500ml.setSelected(false);
        } else if (Objects.equals(e.getActionCommand(), "500 ml")) {
            refrigerante.setText("5.00");
            refrigerante2L.setSelected(false);
            refrigerante1L.setSelected(false);
        }

        double valor1 = Double.parseDouble(valor.getText());
        double valor2 = Double.parseDouble(cobertura.getText());
        double valor3 = Double.parseDouble(refrigerante.getText());

        double soma = (valor1 + valor2 + valor3);

        total.setText(String.format("%.2f", soma));

//        if (concluir.is()) {
//
//        }

        pedidoConcluido.setText("Olá, seu pedido é o nº " + pedido.getText() + "\n"
                + "\nNome: " + cliente.getText() + "\nTotal a pagar: R$ "
                + total.getText());


    }

}