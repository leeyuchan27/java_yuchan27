package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String detail="신규회원 가입 10명 남았습니다.";
		
		request.setAttribute("message", detail);
		
		//response.sendRedirect("/signin.jsp");
		RequestDispatcher rds=request.getRequestDispatcher("signin.jsp");
		rds.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		if(id.equals("gold")&&pw.equals("1234")) {
			response.sendRedirect("/");
		}else {
			
			request.setAttribute("fail", "아이디 또는 비밀번호가 잘못되었습니다.");
			
			RequestDispatcher rsd=request.getRequestDispatcher("main.jsp");
			rsd.forward(request,response);
		}
	}

}
