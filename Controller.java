package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	frmServer server;

	public Controller(frmServer server) {
		super();
		this.server = server;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Send")) {
			this.server.send();
		}

	}

}
