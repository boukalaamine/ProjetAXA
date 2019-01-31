

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import model.Garantie;

/**
 * Servlet implementation class ProjetTPMServlet
 */
@WebServlet("/ProjetTPPCServlet")
public class ProjetTPPCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjetTPPCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/TPPC.jsp" ).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*String var1 = request.getParameter("marque1");
		String var2 = request.getParameter("marque2");
		System.out.println(var1+"   "+var2); */
		String animauxVivants = request.getParameter( "animauxVivants" );
		String frigo = request.getParameter( "frigo" );
		String vehiculesEtRemorques = request.getParameter( "vehiculesEtRemorques" );
		String citerne = request.getParameter( "citerne" );
		String typeContrat = request.getParameter("typeContrat");
		String activite = request.getParameter("activite");
		String flotte = request.getParameter("flotte");
		String typeCotisation = request.getParameter("typeCotisation");
		String typeMarchandise = request.getParameter("typeMarchandise");
		String expositions = request.getParameter("expositions");
		String nombreExpositions = request.getParameter("nombreExpositions");
		String IAC = request.getParameter("IAC");
		String HIAC = request.getParameter("HIAC");
		String garantieVol = request.getParameter("garantieVol");
		int capital = Integer.parseInt(request.getParameter("capital"));
		int nombreDeSinistres = Integer.parseInt(request.getParameter("nombreDeSinistres")) ;
		int franchiseToutCas = Integer.parseInt(request.getParameter("franchiseToutCas"));
		int franchiseParVehiculeRoulant = Integer.parseInt(request.getParameter("franchiseParVehiculeRoulant"));
		//int cotisationParVehicule = Integer.parseInt(request.getParameter("cotisationVehicule"));
		int cotisationParChiffreAffaire = Integer.parseInt(request.getParameter("cotisationCA"));
		int cotisationParVehicule = 0;


		
		Garantie garantie = new Garantie (animauxVivants,frigo,vehiculesEtRemorques,citerne,typeContrat,activite,flotte,typeCotisation,typeMarchandise,expositions,nombreExpositions,IAC,HIAC,garantieVol,capital,nombreDeSinistres,franchiseToutCas,franchiseParVehiculeRoulant,cotisationParVehicule,cotisationParChiffreAffaire);
		System.out.println(garantie.toString());
		try {
			controler.HWPF.replaceAll(garantie);
			this.getServletContext().getRequestDispatcher( "/Success.jsp" ).forward( request, response );
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
