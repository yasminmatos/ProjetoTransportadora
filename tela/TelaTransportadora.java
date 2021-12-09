package tela;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import classe.Carro;
import paineis.PainelCadastroCarro;

public class TelaTransportadora extends JFrame {
	private Container contentPane;
	private JMenuBar jmbBarra; //cria algo para sustentar o menu
	private JMenu jmArquivo, jmCadastro, jmSobre, jmCaminhao; //cria a primeira parte do menu
	private JMenuItem jmiSair, jmiCarro, jmiOnibus, jmiBau, jmiBasculante, jmiCarreta; //cria um item dentro do arquivo
	private List<Carro> carros = new ArrayList<>(); // objeto da matriz dinamica
	

	public TelaTransportadora(String title) throws HeadlessException {
		super(title);
		setSize(400, 400);//dimenciona a tela
		getContentPane().setBackground(Color.orange);
		iniciarComponentes();
		criarEventos();
		setLocationRelativeTo(getContentPane()); //método que deixa a tela no centro
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	private void iniciarComponentes() {
		//objetos
		contentPane = getContentPane(); //devolve um container que é a propria tela
		jmbBarra = new JMenuBar();
		setJMenuBar(jmbBarra);
		jmArquivo = new JMenu("Arquivo");
		jmiSair = new JMenuItem("Sair");
		jmCadastro = new JMenu("Cadastro");
		jmCaminhao = new JMenu("Caminhão");
		jmSobre = new JMenu("Sobre");
		jmiCarro = new JMenuItem("Carro");
		jmiOnibus = new JMenuItem("Onibus");
		jmiBasculante = new JMenuItem("Basculante");
		jmiBau = new JMenuItem("Baú");
		jmiCarreta = new JMenuItem("Carreta");

		
		//add o menu na barra de menu
		jmbBarra.add(jmArquivo);
		jmbBarra.add(jmCadastro);
		jmbBarra.add(jmSobre);

		//add menu item ao menu
		jmArquivo.add(jmiSair);
		jmCadastro.add(jmiCarro);
		jmCadastro.add(jmiOnibus);
		jmCadastro.add(jmCaminhao);
		jmCaminhao.add(jmiBasculante);
		jmCaminhao.add(jmiBau);
		jmCaminhao.add(jmiCarreta);
		
	}

	private void criarEventos() { //adicionar uma ação
		//direciona a ação sair 
		jmiSair.addActionListener(new ActionListener() { //interface que esconde o método
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int contagem = 0; contagem < carros.size(); contagem++) {
					System.out.println(carros.get(contagem).mostrarDados());
					
					
				}
				
				
				
				
			}
		}); 
		
		//evento para cadastro de carro
		jmiCarro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//criar objeto do painel
				PainelCadastroCarro carro = new PainelCadastroCarro(carros); //objeto da classe painel que guarda variavel referenciada que guarda o endereco do objeto
				//para manipular o container
				contentPane.removeAll(); //remove todos os componentes da tela, dando espaço para outro painel
				contentPane.add(carro); //adiciona outro painel
				contentPane.validate(); //valida todos os componentes adicionados na tela
				
			}
		});
		
	}
	
	

}
