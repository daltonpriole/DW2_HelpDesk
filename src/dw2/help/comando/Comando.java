package dw2.help.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {
	
	public String executa(HttpServletRequest request,
						HttpServletResponse response)
							throws Exception;

}
