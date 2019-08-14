package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JButton jb1 = new JButton();
	ArrayList<String> guests = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.setup();
		
	}
	void setup() {
	
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	jf.setVisible(true);
	jf.add(jp);
	jp.add(jb);
	jp.add(jb1);
	
	jb.setText("Add Name");
	jb1.setText("View Names");
	
	
	jb.addActionListener(this);
	jb1.addActionListener(this);
	
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(jb)) {
		String name = 	JOptionPane.showInputDialog("enter your name");
		guests.add(name);
		
		}
		if(e.getSource().equals(jb1)) {
			String message = "";
			for (int i = 0; i < guests.size(); i++) {
				 message += "guest #"+(i+1) + ": " + guests.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, message);
		}

		
		
	}
}
