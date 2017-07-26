package snippet;

public class Snippet {
	response.setContentType("application/json");
	response.addHeader("Access-Control-Allow-Origin", "*");
	
	String username = "";
	if (request.getParameter("username") != null) {
		username = request.getParameter("username");
	}
	JSONObject obj = new JSONObject();
	try {
		obj.put("username", username);
	} catch (JSONException e) {
		e.printStackTrace();
	}
	PrintWriter out = response.getWriter();
	out.print(obj);
	out.flush();
	out.close();
}

