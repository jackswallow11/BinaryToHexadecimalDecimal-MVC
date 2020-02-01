package driver_package;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BintoDectoHex.Bin_Dec_Converter;
import com.BintoDectoHex.Dec_Hex_Converter;
import com.BintoDectoHex.regex;


/**
 * Servlet implementation class Driver
 */
@WebServlet("/Driver")
public class Driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Driver() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String binary = (request.getParameter("binary")); //request binary value from JSP
		//construct
		new regex(); 
		new Bin_Dec_Converter();
		new Dec_Hex_Converter();
		
		String Clean_Var= regex.AsciiCheck(binary); //This variable takes input from JSP "binary" and used it as an argument for regex object
		int Decimal_Result= Bin_Dec_Converter.BinaryToDecimal(Clean_Var); //used Clean_Var as an argument for Binary to Decimal Converter
		String Hexadecimal_Result = Dec_Hex_Converter.DecimalToHexadecimal(Decimal_Result);
		String Decimal_String = Integer.toString(Decimal_Result); //convert to string in order display in JSP
		
		
		request.setAttribute("Decimal_Result", Decimal_String);
		request.setAttribute("Hexadecimal_Result", Hexadecimal_Result);
		request.getRequestDispatcher("Main_Page.jsp").forward(request, response);

		//doGet(request, response);
	}

}
