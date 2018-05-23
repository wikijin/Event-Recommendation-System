package rpc;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Servlet implementation class SearchItem
 */
@WebServlet("/search") //localhost:8080/Jupiter/search 如果是get请求，就触发doGet 如果是post就触发doPost
public class SearchItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		///response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.addHeader("Access-Control-Allow-Origin", "*");
//
//		//Create a PrintWriter from response such that we can add data to response.
//		PrintWriter out = response.getWriter();
//		if (request.getParameter("username") != null) {
//			//Get the username sent from the client
//			String username = request.getParameter("username");
//            //In the output stream, add something to response body. 
//			out.print("Hello " + username);
//		}
//		// Send response back to client
//		out.close();
//
//	}
    ////Json 传输
//	protected void doGet(HttpServletRequest request,
//			HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("application/json");
//		response.addHeader("Access-Control-Allow-Origin", "*");
//
//		String username = "";
//		if (request.getParameter("username") != null) {
//			username = request.getParameter("username");
//		}
//		JSONObject obj = new JSONObject();
//		try {
//			obj.put("username", username);
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//		PrintWriter out = response.getWriter();
//		out.print(obj);
//		out.close();
//	}
    //Json Array 传输
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("application/json");
//		response.addHeader("Access-Control-Allow-Origin", "*");
//		PrintWriter out = response.getWriter();
//
//		JSONArray array = new JSONArray();
//		try {
//			array.put(new JSONObject().put("username", "abcd"));
//			array.put(new JSONObject().put("username", "1234"));
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//		out.print(array);
//		out.close();
		JSONArray array = new JSONArray();
		try {
			array.put(new JSONObject().put("username", "abcd"));
			array.put(new JSONObject().put("username", "1234"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		RpcHelper.writeJsonArray(response, array);

		
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
