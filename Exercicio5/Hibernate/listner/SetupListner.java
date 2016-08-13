package listner;

import java.util.List;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import entity.Cargo;
import service.ServiceException;
import service.ServiceFactory;

public class SetupListner implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent event)  { 
    }

    public void requestInitialized(ServletRequestEvent event) { 
         HttpSession session = ((HttpServletRequest) event.getServletRequest()).getSession();
         try {
	         List<Cargo> cargos = ServiceFactory.getInstance().getCargoService().getCargos();
	         
	         session.setAttribute("cargos", cargos);
         
         } catch (ServiceException e) {
        	 e.printStackTrace();
         }
    }
	
}
