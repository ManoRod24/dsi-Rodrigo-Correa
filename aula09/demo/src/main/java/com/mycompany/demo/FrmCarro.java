package com.mycompany.demo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FrmCarro extends JFrame {

    private JTextField txtPlaca;
    private JTextField txtCor;
    private JTextField txtDescricao;

    private JLabel lblMensagem;
    private JTable tblConsulta;
    private DefaultTableModel modeloTabela;

    private JButton btnIncluir;
    private JButton btnAlterar;
    private JButton btnExcluir;
    private JButton btnPesquisar;
    private JButton btnLimpar;
    private JButton btnFechar;

    private String placaOriginal;

    public FrmCarro() {
        setTitle("Cadastramento de veículos");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        criarInterface();
    }

    private void criarInterface() {
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titulo = new JLabel(
                "Cadastramento de veículos",
                SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 22));

        JPanel painelTitulo = new JPanel();
        painelTitulo.add(titulo);

        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));

        txtPlaca = new JTextField();
        txtCor = new JTextField();
        txtDescricao = new JTextField();
        lblMensagem = new JLabel(" ");

        painelFormulario.add(new JLabel("Placa:"));
        painelFormulario.add(txtPlaca);

        painelFormulario.add(new JLabel("Cor:"));
        painelFormulario.add(txtCor);

        painelFormulario.add(new JLabel("Descrição:"));
        painelFormulario.add(txtDescricao);

        painelFormulario.add(new JLabel("Mensagem:"));
        painelFormulario.add(lblMensagem);

        btnIncluir = new JButton("Incluir");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar");
        btnLimpar = new JButton("Limpar");
        btnFechar = new JButton("Fechar");

        JPanel painelBotoes = new JPanel(new FlowLayout());

        painelBotoes.add(btnIncluir);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnPesquisar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnFechar);

        modeloTabela = new DefaultTableModel(
                new String[] { "Placa", "Cor", "Descrição" }, 0) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };

        tblConsulta = new JTable(modeloTabela);
        JScrollPane painelTabela = new JScrollPane(tblConsulta);

        JPanel painelSuperior = new JPanel(new BorderLayout(10, 10));
        painelSuperior.add(painelTitulo, BorderLayout.NORTH);
        painelSuperior.add(painelFormulario, BorderLayout.CENTER);
        painelSuperior.add(painelBotoes, BorderLayout.SOUTH);

        painelPrincipal.add(painelSuperior, BorderLayout.NORTH);
        painelPrincipal.add(painelTabela, BorderLayout.CENTER);

        add(painelPrincipal);

        btnFechar.addActionListener(e -> System.exit(0));

        btnLimpar.addActionListener(e -> limparCampos());

        btnIncluir.addActionListener(e -> incluirCarro());

        btnPesquisar.addActionListener(e -> pesquisarCarros());

        tblConsulta.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int linha = tblConsulta.getSelectedRow();

                if (linha >= 0) {
                    txtPlaca.setText(modeloTabela.getValueAt(linha, 0).toString());
                    txtCor.setText(modeloTabela.getValueAt(linha, 1).toString());
                    txtDescricao.setText(modeloTabela.getValueAt(linha, 2).toString());

                    placaOriginal = txtPlaca.getText();
                }
            }
        });

        btnAlterar.addActionListener(e -> alterarCarro());

        btnExcluir.addActionListener(e -> excluirCarro());

    }

    private void incluirCarro() {
        String placa = txtPlaca.getText().trim();
        String cor = txtCor.getText().trim();
        String descricao = txtDescricao.getText().trim();

        if (placa.isEmpty() || cor.isEmpty() || descricao.isEmpty()) {
            lblMensagem.setText("Preencha todos os campos!");
            return;
        }

        CarroBean carro = new CarroBean();

        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);

        CarroDAO dao = new CarroDAO();

        lblMensagem.setText(dao.inserir(carro));

        txtPlaca.setText("");
        txtCor.setText("");
        txtDescricao.setText("");
    }

    private void limparCampos() {
        txtPlaca.setText("");
        txtCor.setText("");
        txtDescricao.setText("");
        lblMensagem.setText(" ");

        modeloTabela.setRowCount(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrmCarro().setVisible(true);
        });
    }

    private void pesquisarCarros() {
        modeloTabela.setRowCount(0);

        try {
            CarroDAO dao = new CarroDAO();

            for (CarroBean carro : dao.listarTodos()) {
                modeloTabela.addRow(new Object[] {
                        carro.getPlaca(),
                        carro.getCor(),
                        carro.getDescricao()
                });
            }

            lblMensagem.setText(
                    "Veículos encontrados: " + modeloTabela.getRowCount());

        } catch (RuntimeException e) {
            lblMensagem.setText(e.getMessage());
        }
    }

    private void alterarCarro() {
        if (placaOriginal == null) {
            lblMensagem.setText("Selecione um carro na tabela.");
            return;
        }

        String placa = txtPlaca.getText().trim();
        String cor = txtCor.getText().trim();
        String descricao = txtDescricao.getText().trim();

        if (placa.isEmpty() || cor.isEmpty() || descricao.isEmpty()) {
            lblMensagem.setText("Preencha todos os campos!");
            return;
        }

        CarroBean carro = new CarroBean();
        carro.setPlaca(placa);
        carro.setCor(cor);
        carro.setDescricao(descricao);

        CarroDAO dao = new CarroDAO();

        lblMensagem.setText(dao.alterar(carro, placaOriginal));

        pesquisarCarros();
        placaOriginal = null;
    }

    private void excluirCarro() {
        if (placaOriginal == null) {
            lblMensagem.setText("Selecione um carro na tabela.");
            return;
        }

        int resposta = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir este carro?",
                "Confirmar exclusão",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (resposta != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }

        CarroDAO dao = new CarroDAO();

        lblMensagem.setText(dao.excluir(placaOriginal));

        placaOriginal = null;

        txtPlaca.setText("");
        txtCor.setText("");
        txtDescricao.setText("");

        pesquisarCarros();
    }
}

//Rodrigo Correa do Nascimento