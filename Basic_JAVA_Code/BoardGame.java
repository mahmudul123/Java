
//java.awt.*; imports all the lib 
import java.awt.*;

//Actual events and the fuctions can be defined and coded using this. 
import java.awt.event.ActionEvent;

//This listens and identifies all the things are happing inside the frame. 
import java.awt.event.ActionListener;

//JButton allows to create clickable buttons inside the frame.  
import javax.swing.JButton;

//Everything goes inside the JFrame on GUI programming 
import javax.swing.JFrame;

//JLabrl allows to display text to our GUI programs. 
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener{
	
	private JFrame frame;
	private JLabel Champion, lastWinner,player1,player2 ;
	private JPanel panel, panel2, player;
	private JTextField result;
	
	
	//I will be creating all the possible buttons manually.
	private JButton 
	one,two,three,four,five,six,seven,eight,nine,ten,
	Oone,Ttwo,Tthree,Ffour,Ffive,Ssix,Sseven,Eeight,Nnine,Tten
	,OOone,TTtwo,TTthree,FFfour,FFfive,SSsix,SSseven,EEeight,NNnine,TTten
	,OOOone,TTTtwo,TTTthree,FFFfour,FFFfive,SSSsix,SSSseven,EEEeight,NNNnine,TTTten
	,OOOOone,TTTTtwo
	
	;

	
	public Game() {
		
		//We are adding the whole JFrame into two parts. 
		this.panel = new JPanel();
		this.panel2 = new JPanel();
		this.player = new JPanel();
		
		
		this.one = new JButton(" ");this.two = new JButton(" ");this.three = new JButton(" ");this.four = new JButton(" ");this.five = new JButton(" ");this.six = new JButton(" ");this.seven = new JButton(" ");this.eight = new JButton(" ");this.nine = new JButton(" ");this.ten = new JButton(" ");
		this.Oone = new JButton(" ");this.Ttwo = new JButton(" ");this.Tthree = new JButton(" ");this.Ffour = new JButton(" ");this.Ffive = new JButton(" ");this.Ssix = new JButton(" ");this.Sseven = new JButton(" ");this.Eeight = new JButton(" ");this.Nnine = new JButton(" ");this.Tten = new JButton(" ");
		this.OOone = new JButton(" ");this.TTtwo = new JButton(" ");this.TTthree = new JButton(" ");this.FFfour = new JButton(" ");this.FFfive = new JButton(" ");this.SSsix = new JButton(" ");this.SSseven = new JButton(" ");this.EEeight = new JButton(" ");this.NNnine = new JButton(" ");this.TTten = new JButton(" ");
		this.OOOone = new JButton(" ");this.TTTtwo = new JButton(" ");this.TTTthree = new JButton(" ");this.FFFfour = new JButton(" ");this.FFFfive = new JButton(" ");this.SSSsix = new JButton(" ");this.SSSseven = new JButton(" ");this.EEEeight = new JButton(" ");this.NNNnine = new JButton(" ");this.TTTten = new JButton(" ");
		this.OOOOone = new JButton(" ");this.TTTTtwo = new JButton(" ");
		
		
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.NORTH); 
		this.add(player, BorderLayout.SOUTH); 
		this.add(panel2, BorderLayout.CENTER);


		//Adding it to the panel
		//This Line will help me to add color to the panel
		
		panel.setBackground(Color.RED);
		
		Champion = new JLabel("Champion:                                 ");
		Champion.setFont((new Font(Font.SANS_SERIF, Font.BOLD, 18)));
		lastWinner = new JLabel("Last Winner:      ");
		lastWinner.setFont((new Font(Font.SANS_SERIF, Font.BOLD, 18)));

		panel.add(Champion);
		panel.add(lastWinner);
		
		//adding to the player 
		
		player.setBackground(Color.GREEN);
		player1 = new JLabel("YOU:                                        ");
		
		
	    player1.setFont((new Font(Font.SANS_SERIF, Font.BOLD, 18)));
	    
	    
	    
		player2 = new JLabel("ME:      ");
		player2.setFont((new Font(Font.SANS_SERIF, Font.BOLD, 18)));
		
		
		
		player.add(player1);
		player.add(player2);
		
		
		
		
		//Adding it the panel2
		panel2.setLayout(new GridLayout(6, 7));
		
		panel2.add(one);panel2.add(two);panel2.add(three);panel2.add(four);panel2.add(five);panel2.add(six);panel2.add(seven);panel2.add(eight);panel2.add(nine);panel2.add(ten);
		panel2.add(Oone);panel2.add(Ttwo);panel2.add(Tthree);panel2.add(Ffour);panel2.add(Ffive);panel2.add(Ssix);panel2.add(Sseven);panel2.add(Eeight);panel2.add(Nnine);panel2.add(Tten);		
		panel2.add(OOone);panel2.add(TTtwo);panel2.add(TTthree);panel2.add(FFfour);panel2.add(FFfive);panel2.add(SSsix);panel2.add(SSseven);panel2.add(EEeight);panel2.add(NNnine);panel2.add(TTten);
		panel2.add(OOOone);panel2.add(TTTtwo);panel2.add(TTTthree);panel2.add(FFFfour);panel2.add(FFFfive);panel2.add(SSSsix);panel2.add(SSSseven);panel2.add(EEEeight);panel2.add(NNNnine);panel2.add(TTTten);
		panel2.add(OOOOone);panel2.add(TTTTtwo);


		one.addActionListener(this);two.addActionListener(this);three.addActionListener(this);four.addActionListener(this);five.addActionListener(this);six.addActionListener(this);seven.addActionListener(this);eight.addActionListener(this);nine.addActionListener(this);ten.addActionListener(this);
		Oone.addActionListener(this);Ttwo.addActionListener(this);Tthree.addActionListener(this);Ffour.addActionListener(this);Ffive.addActionListener(this);Ssix.addActionListener(this);Sseven.addActionListener(this);Eeight.addActionListener(this);Nnine.addActionListener(this);Tten.addActionListener(this);
		OOone.addActionListener(this);TTtwo.addActionListener(this);TTthree.addActionListener(this);FFfour.addActionListener(this);FFfive.addActionListener(this);SSsix.addActionListener(this);SSseven.addActionListener(this);EEeight.addActionListener(this);NNnine.addActionListener(this);TTten.addActionListener(this);
		OOOone.addActionListener(this);TTTtwo.addActionListener(this);TTTthree.addActionListener(this);FFFfour.addActionListener(this);FFFfive.addActionListener(this);SSSsix.addActionListener(this);SSSseven.addActionListener(this);EEEeight.addActionListener(this);NNNnine.addActionListener(this);TTTten.addActionListener(this);
		OOOOone.addActionListener(this);TTTTtwo.addActionListener(this);

	}
	
	

	public static void main(String[] args) {

		Game gui = new Game();
		gui.pack();
		gui.setSize(500, 500);
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setVisible(true);

	}
	
	

	
	public JLabel getPlayerName() {
	       return player1;
	   }
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
		
		//Shows the numers on the textfield. 
		System.out.println(e.getActionCommand());
		
		String act = e.getActionCommand();
		
		if (act.equals(" ")) {
			getPlayerName();
			
		}
	

	}
	
	
	
	
	
	
	
	
}
