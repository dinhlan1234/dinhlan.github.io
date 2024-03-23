package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controllerr implements ActionListener {
	frmClient client;
	

	


	public Controllerr(frmClient client) {
		super();
		this.client = client;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Send")) {
			this.client.send();
		}
		
	}

}
