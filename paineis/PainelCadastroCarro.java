package paineis;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import classe.Carro;

public class PainelCadastroCarro extends JPanel {
	//atributos
	private JLabel jlCarro, jlFabricante, jlAnoModelo, jlAnoFab, jlModelo, jlCor, jlChassi, jlPlaca, jlCombustivel,
			jlLugares;
	private JTextField jtfFabricante, jtfAnoModelo, jtfAnoFab, jtfCor, jtfChassi, jtfPlaca, jtfModelo;
	private JButton jbCadastrar;
	private JRadioButton jrb7, jrb4, jrb5, jrbGasolina, jrbGasolinaAlcool, jrbAlcool, jrbDiesel;
	private ButtonGroup bgLugares, bgCombustivel;
	private List<Carro> carros;

	//construtor
	public PainelCadastroCarro(List<Carro> carros) { //colocamos aqui para guardar quando o usuario clicar  em cadastrar. o tipo que entra o construtor é o que sai
		super();
		setSize(400, 400);// dimenciona a tela
		setLayout(null); // tira o redimensionamento automatico
		setBackground(Color.yellow); // nao precisa do getContentPane pois vai colorir um painel
		this.carros = carros; //passando o end da matriz 
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		// objeto
		jlCarro = new JLabel("Carro"); // componente na tela
		jlFabricante = new JLabel("Fabricante");
		jlAnoModelo = new JLabel("Ano/Modelo");
		jlAnoFab = new JLabel("Ano/Fabricação");
		jlCor = new JLabel("Cor");
		jlChassi = new JLabel("Numero Chassi");
		jlPlaca = new JLabel("Placa");
		jlCombustivel = new JLabel("Combustível:");
		jlLugares = new JLabel("N° de lugares:");
		jlModelo = new JLabel("Modelo");
		bgLugares = new ButtonGroup();
		bgCombustivel = new ButtonGroup();

		// caixa de texto
		jtfFabricante = new JTextField();
		jtfAnoModelo = new JTextField();
		jtfAnoFab = new JTextField();
		jtfCor = new JTextField();
		jtfChassi = new JTextField();
		jtfPlaca = new JTextField();
		jtfModelo = new JTextField();

		// botao de opcao e cadastrar
		jbCadastrar = new JButton("Cadastrar");
		jrb4 = new JRadioButton("4", true);
		jrb5 = new JRadioButton("5");
		jrb7 = new JRadioButton("7");
		jrbGasolina = new JRadioButton("Gasolina", true);
		jrbAlcool = new JRadioButton("Alcool");
		jrbGasolinaAlcool = new JRadioButton("Gasolina/Alcool");
		jrbDiesel = new JRadioButton("Diesel");
		jrb4.setOpaque(false);
		jrb5.setOpaque(false);
		jrb7.setOpaque(false);
		jrbAlcool.setOpaque(false);
		jrbDiesel.setOpaque(false);
		jrbGasolina.setOpaque(false);
		jrbGasolinaAlcool.setOpaque(false);

		// adicionando oa componentes na tela
		add(jlCarro);
		add(jlFabricante);
		add(jlAnoModelo);
		add(jlAnoFab);
		add(jlModelo);
		add(jlCor);
		add(jlLugares);
		add(jlChassi);
		add(jlPlaca);
		add(jlCombustivel);
		add(jrb4);
		add(jrb5);
		add(jrb7);
		add(jrbGasolina);
		add(jrbDiesel);
		add(jrbAlcool);
		add(jrbGasolinaAlcool);
		add(jtfFabricante);
		add(jtfAnoModelo);
		add(jtfAnoFab);
		add(jtfModelo);
		add(jtfCor);
		add(jtfChassi);
		add(jtfPlaca);
		add(jbCadastrar);
		bgLugares.add(jrb4);
		bgLugares.add(jrb5);
		bgLugares.add(jrb7);
		bgCombustivel.add(jrbAlcool);
		bgCombustivel.add(jrbDiesel);
		bgCombustivel.add(jrbGasolina);
		bgCombustivel.add(jrbGasolinaAlcool);

		// redimensionando os componentes
		jlCarro.setBounds(170, 10, 60, 20); // coluna, linha, largura, altura
		jlFabricante.setBounds(20, 40, 100, 20);
		jtfFabricante.setBounds(20, 60, 100, 20);
		jlAnoModelo.setBounds(170, 40, 100, 20);
		jtfAnoModelo.setBounds(170, 60, 50, 20);
		jlAnoFab.setBounds(280, 40, 100, 20);
		jtfAnoFab.setBounds(280, 60, 50, 20);
		jlModelo.setBounds(20, 80, 50, 20);
		jtfModelo.setBounds(20, 100, 100, 20);
		jlCor.setBounds(170, 80, 50, 20);
		jtfCor.setBounds(170, 100, 50, 20);
		jlChassi.setBounds(20, 120, 100, 20);
		jtfChassi.setBounds(20, 140, 50, 20);
		jlPlaca.setBounds(170, 120, 50, 20);
		jtfPlaca.setBounds(170, 140, 50, 20);
		jlLugares.setBounds(280, 80, 120, 20);
		jrb4.setBounds(280, 100, 60, 20);
		jrb5.setBounds(280, 120, 60, 20);
		jrb7.setBounds(280, 140, 60, 20);
		jlCombustivel.setBounds(20, 180, 100, 20);
		jrbAlcool.setBounds(170, 200, 60, 20);
		jrbDiesel.setBounds(170, 220, 60, 20);
		jrbGasolina.setBounds(20, 200, 100, 20);
		jrbGasolinaAlcool.setBounds(20, 220, 120, 20);
		jbCadastrar.setBounds(150, 280, 100, 20);

	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//validação dos campos
				if (!jtfFabricante.getText().isEmpty() && !jtfAnoModelo.getText().isEmpty() && !jtfAnoModelo.getText().isEmpty() && !jtfModelo.getText().isEmpty() && !jtfCor.getText().isEmpty() && !jtfChassi.getText().isEmpty() && !jtfPlaca.getText().isEmpty()) {//pega os campos e verifica se estão vazios. o ! NEGA A FRASE E DEIXA ELA POSITIVA
					
					
					
					//declaração das vaiaveis
					String fabricante, anoModelo, anoFabricacao, modelo, cor, chassi, placa, tipoVeiculo, tipoCombustivel;
					int quantidadeLugares;
					
					//entradas
					fabricante = jtfFabricante.getText();
					anoModelo = jtfAnoModelo.getText();
					anoFabricacao = jtfAnoFab.getText();
					modelo = jtfModelo.getText();
					cor = jtfCor.getText();
					chassi = jtfChassi.getText();
					placa = jtfPlaca.getText();
					tipoVeiculo = jlCarro.getText();
					
					//entrada de quantidade de lugares 
					
					if (jrb4.isSelected()) {
						quantidadeLugares = 4;
					} else {
						if (jrb5.isSelected()) {
							quantidadeLugares = 5;
						} else { 
							quantidadeLugares = 7;

						}

					}
					//entrada de combustivel
					if (jrbAlcool.isSelected()) {
						tipoCombustivel = "Alcool";
						
					} else { 
						if (jrbDiesel.isSelected()) {
						tipoCombustivel = "Diesel";
					} else { 
						if (jrbGasolina.isSelected()) {
							tipoCombustivel = "Gasolina";
					} else {
						tipoCombustivel = "Gasolina e Alcool";

					}

					}

					}
					carros.add(new Carro(placa, tipoCombustivel, fabricante, chassi, cor, tipoVeiculo, modelo, anoFabricacao, anoModelo, quantidadeLugares));
					
				} else {
					JOptionPane.showMessageDialog(null, "É necessário preencher todos os campos", "TRANSPORTADORA", JOptionPane.ERROR_MESSAGE);

				}
				
				//limpa todos os campos após apertar o botao
				jtfFabricante.setText("");
				jtfAnoModelo.setText("");
				jtfAnoFab.setText("");
				jtfAnoModelo.setText("");
				jtfChassi.setText("");
				jtfCor.setText("");
				jtfPlaca.setText("");
				jtfModelo.setText("");
				
				
			}
		});

}

}
