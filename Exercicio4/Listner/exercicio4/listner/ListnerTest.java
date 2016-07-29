package exercicio4.listner;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ListnerTest implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent e)  { 
    	System.out.println("Listener Destruído!");
    }

    public void requestInitialized(ServletRequestEvent e)  { 
    	System.out.println("Listener Inicializado!");
    }
	
}
