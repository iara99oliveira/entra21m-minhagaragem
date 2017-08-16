package view;

import dao.CarroDAO;
import database.Utilitarios;
import java.sql.Date;
import javax.swing.JOptionPane;
import model.Carro;

/**
 *
 * @author Iara Silva de Oliveira| 2017-08-15
 */
public class JFrameCadastroCarro extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCadastroCarro
     */
    public JFrameCadastroCarro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstaFuncionando = new javax.swing.ButtonGroup();
        buttonGroupCirculacaoPermitida = new javax.swing.ButtonGroup();
        buttonGroupQuantidadePortas = new javax.swing.ButtonGroup();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jLabelPlaca = new javax.swing.JLabel();
        jLabelAnoFabricacao = new javax.swing.JLabel();
        jLabelAnoLancamento = new javax.swing.JLabel();
        jLabelQuilometragem = new javax.swing.JLabel();
        jLabelDataCompra = new javax.swing.JLabel();
        jLabelTipoPneu = new javax.swing.JLabel();
        jLabelQtdPortas = new javax.swing.JLabel();
        jLabelQtdBatidas = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jLabelChassi = new javax.swing.JLabel();
        jLabelRenavam = new javax.swing.JLabel();
        jLabelEstaFuncionando = new javax.swing.JLabel();
        jLabelCirculacaoPermitida = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        jTextFieldQuilometragem = new javax.swing.JTextField();
        jTextFieldTipoPneu = new javax.swing.JTextField();
        jTextFieldChassi = new javax.swing.JTextField();
        jTextFieldRenavam = new javax.swing.JTextField();
        jScrollPaneDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jRadioButtonEstaFuncionandoSim = new javax.swing.JRadioButton();
        jRadioButtonEstaFuncionandoNao = new javax.swing.JRadioButton();
        jRadioButtonCirculacaoPermitidaSim = new javax.swing.JRadioButton();
        jRadioButtonCrculacaoPermitidaNao = new javax.swing.JRadioButton();
        jSpinnerAnoFabricacao = new javax.swing.JSpinner();
        jSpinnerAnoLancamento = new javax.swing.JSpinner();
        jFormattedTextFieldDataCompra = new javax.swing.JFormattedTextField();
        jSpinnerQuantidadeBatidas = new javax.swing.JSpinner();
        jComboBoxCor = new javax.swing.JComboBox();
        jComboBoxFabricante = new javax.swing.JComboBox();
        jRadioButtonQtdPortas2 = new javax.swing.JRadioButton();
        jRadioButtonQtdPortas4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros");
        setName("frameCadastroCarro"); // NOI18N
        setPreferredSize(new java.awt.Dimension(670, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));

        jButtonSalvar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCodigo.setText("Código");

        jLabelNome.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelNome.setText("Marca do Carro");

        jLabelFabricante.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelFabricante.setText("Fabricante");

        jLabelPlaca.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelPlaca.setText("Placa");

        jLabelAnoFabricacao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelAnoFabricacao.setText("Ano de Fabricação");

        jLabelAnoLancamento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelAnoLancamento.setText("Ano de Lancamento");

        jLabelQuilometragem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelQuilometragem.setText("Quilometragem");

        jLabelDataCompra.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelDataCompra.setText("Data Compra");

        jLabelTipoPneu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelTipoPneu.setText("Tipo de Pneu");

        jLabelQtdPortas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelQtdPortas.setText("Qtd. de Portas");

        jLabelQtdBatidas.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelQtdBatidas.setText("Qtd. de Batidas");

        jLabelCor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCor.setText("Cor");

        jLabelChassi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelChassi.setText("Chassi");

        jLabelRenavam.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelRenavam.setText("Renavam");

        jLabelEstaFuncionando.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEstaFuncionando.setText("Está Funcionando?");

        jLabelCirculacaoPermitida.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCirculacaoPermitida.setText("Circulação Permitida?");

        jLabelDescricao.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelDescricao.setText("Descrição");

        jTextFieldPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPlacaActionPerformed(evt);
            }
        });

        jTextFieldRenavam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRenavamActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);

        buttonGroupEstaFuncionando.add(jRadioButtonEstaFuncionandoSim);
        jRadioButtonEstaFuncionandoSim.setText("Sim");

        buttonGroupEstaFuncionando.add(jRadioButtonEstaFuncionandoNao);
        jRadioButtonEstaFuncionandoNao.setText("Não");

        buttonGroupCirculacaoPermitida.add(jRadioButtonCirculacaoPermitidaSim);
        jRadioButtonCirculacaoPermitidaSim.setText("Sim");

        buttonGroupCirculacaoPermitida.add(jRadioButtonCrculacaoPermitidaNao);
        jRadioButtonCrculacaoPermitidaNao.setText("Não");

        jSpinnerAnoFabricacao.setModel(new javax.swing.SpinnerNumberModel(Short.valueOf((short)2017), null, null, Short.valueOf((short)1)));

        jSpinnerAnoLancamento.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2017), null, null, Integer.valueOf(1)));

        jFormattedTextFieldDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFieldDataCompra.setToolTipText("21/08/2015");
        jFormattedTextFieldDataCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataCompraActionPerformed(evt);
            }
        });

        jComboBoxCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branco", "Preto", "Cinza", "Bege", "Rosê", "Fúcsia", "Ciano", "Esmeralda", "Escarlate", "Marsala", "Transparente" }));

        jComboBoxFabricante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fiat", "Chevrolet", "VW", "Ford", "Renault", "Hyundai", "Honda", "Toyota", "Nissan" }));

        buttonGroupQuantidadePortas.add(jRadioButtonQtdPortas2);
        jRadioButtonQtdPortas2.setText("2");

        buttonGroupQuantidadePortas.add(jRadioButtonQtdPortas4);
        jRadioButtonQtdPortas4.setText("4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addGap(18, 140, Short.MAX_VALUE)
                                        .addComponent(jLabelFabricante)
                                        .addGap(237, 237, 237))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelAnoFabricacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTipoPneu, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTipoPneu)
                                    .addComponent(jTextFieldChassi)
                                    .addComponent(jLabelChassi)
                                    .addComponent(jSpinnerAnoFabricacao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelRenavam)
                                        .addComponent(jLabelAnoLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldRenavam)
                                        .addComponent(jSpinnerAnoLancamento)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jRadioButtonQtdPortas2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButtonQtdPortas4)
                                            .addComponent(jLabelQtdPortas))
                                        .addGap(26, 26, 26)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(183, 183, 183)
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEstaFuncionando)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jRadioButtonEstaFuncionandoSim)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButtonEstaFuncionandoNao)))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCirculacaoPermitida)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jRadioButtonCirculacaoPermitidaSim)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButtonCrculacaoPermitidaNao))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextFieldQuilometragem)
                                                    .addComponent(jLabelQuilometragem)
                                                    .addComponent(jLabelQtdBatidas)
                                                    .addComponent(jSpinnerQuantidadeBatidas)
                                                    .addComponent(jComboBoxFabricante, 0, 142, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldPlaca)
                                                    .addComponent(jFormattedTextFieldDataCompra)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelPlaca)
                                                            .addComponent(jLabelDataCompra)
                                                            .addComponent(jLabelCor))
                                                        .addGap(0, 0, Short.MAX_VALUE))
                                                    .addComponent(jComboBoxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPaneDescricao)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPaneDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelAnoLancamento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinnerAnoLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelPlaca)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabelDataCompra)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabelCor)
                                        .addGap(57, 57, 57)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelRenavam)
                                    .addComponent(jLabelEstaFuncionando)
                                    .addComponent(jLabelCirculacaoPermitida))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldRenavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonEstaFuncionandoSim)
                                    .addComponent(jRadioButtonEstaFuncionandoNao)
                                    .addComponent(jRadioButtonCrculacaoPermitidaNao)
                                    .addComponent(jRadioButtonCirculacaoPermitidaSim)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabelFabricante))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabelAnoFabricacao)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelQuilometragem)
                                                .addGap(64, 64, 64)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabelQtdBatidas)
                                                .addComponent(jLabelQtdPortas))
                                            .addComponent(jLabelTipoPneu))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldTipoPneu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinnerQuantidadeBatidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonQtdPortas2)
                                            .addComponent(jRadioButtonQtdPortas4))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabelChassi)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextFieldQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(19, 19, 19)
                        .addComponent(jLabelDescricao)
                        .addGap(25, 25, 25)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRenavamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRenavamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRenavamActionPerformed

    private void jTextFieldPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPlacaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        Carro meuCarro = new Carro();
        meuCarro.setNome(jTextFieldNome.getText());
        meuCarro.setFabricante(( jComboBoxFabricante.getSelectedItem()).toString());
        meuCarro.setPlaca(jTextFieldPlaca.getText());
        meuCarro.setAnoFabricacao(Short.parseShort(jSpinnerAnoFabricacao.getValue().toString()));
        meuCarro.setAnoLancamento(Short.parseShort(jSpinnerAnoLancamento.getValue().toString()));
        meuCarro.setQuilometragem(Float.parseFloat(jTextFieldQuilometragem.getText()));
                
        String dataCompra = jFormattedTextFieldDataCompra.getText();
        int ano = Integer.parseInt(dataCompra.substring(6, 10));
        int mes = Integer.parseInt(dataCompra.substring(3, 5));
        int dia = Integer.parseInt(dataCompra.substring(0, 2));
        meuCarro.setDataCompra(new Date(ano, mes, dia));
                
        meuCarro.setTipoPneu(Short.parseShort(jTextFieldTipoPneu.getText()));
        
        byte quantidadePortas = jRadioButtonQtdPortas2.isSelected()?(byte)2:(byte)4;
        meuCarro.setQuantidadePortas(quantidadePortas);
        
        meuCarro.setQuantidadeBatidas(Byte.parseByte(jSpinnerQuantidadeBatidas.getValue().toString()));
        meuCarro.setCor((jComboBoxCor.getSelectedItem()).toString());
        meuCarro.setChassi(jTextFieldChassi.getText());
        meuCarro.setRenavam(Integer.parseInt(jTextFieldRenavam.getText()));
        
        meuCarro.setEstaFuncionando(jRadioButtonEstaFuncionandoSim.isSelected());
        
        meuCarro.setPermitidaCirculacao(jRadioButtonCirculacaoPermitidaSim.isSelected());
        
        meuCarro.setDescricao(jTextAreaDescricao.getText());
        
        CarroDAO dao = new CarroDAO();
        int codigo = dao.inserir(meuCarro);
        if(codigo!=Utilitarios.NAO_FOI_POSSIVEL_INSERIR){
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        }else
            JOptionPane.showMessageDialog(null, "Não foi possível inserir");
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jFormattedTextFieldDataCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataCompraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupCirculacaoPermitida;
    private javax.swing.ButtonGroup buttonGroupEstaFuncionando;
    private javax.swing.ButtonGroup buttonGroupQuantidadePortas;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCor;
    private javax.swing.JComboBox jComboBoxFabricante;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCompra;
    private javax.swing.JLabel jLabelAnoFabricacao;
    private javax.swing.JLabel jLabelAnoLancamento;
    private javax.swing.JLabel jLabelChassi;
    private javax.swing.JLabel jLabelCirculacaoPermitida;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelDataCompra;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelEstaFuncionando;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelQtdBatidas;
    private javax.swing.JLabel jLabelQtdPortas;
    private javax.swing.JLabel jLabelQuilometragem;
    private javax.swing.JLabel jLabelRenavam;
    private javax.swing.JLabel jLabelTipoPneu;
    private javax.swing.JRadioButton jRadioButtonCirculacaoPermitidaSim;
    private javax.swing.JRadioButton jRadioButtonCrculacaoPermitidaNao;
    private javax.swing.JRadioButton jRadioButtonEstaFuncionandoNao;
    private javax.swing.JRadioButton jRadioButtonEstaFuncionandoSim;
    private javax.swing.JRadioButton jRadioButtonQtdPortas2;
    private javax.swing.JRadioButton jRadioButtonQtdPortas4;
    private javax.swing.JScrollPane jScrollPaneDescricao;
    private javax.swing.JSpinner jSpinnerAnoFabricacao;
    private javax.swing.JSpinner jSpinnerAnoLancamento;
    private javax.swing.JSpinner jSpinnerQuantidadeBatidas;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldChassi;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldQuilometragem;
    private javax.swing.JTextField jTextFieldRenavam;
    private javax.swing.JTextField jTextFieldTipoPneu;
    // End of variables declaration//GEN-END:variables
}
