package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Quan_Huyen;
import model.Xa_Phuong;
import repository.AddressBO;

/**
 * Servlet implementation class HomeCheckoutServlet
 */
public class HomeCheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeCheckoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	response.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset=UTF-8"); 
    	
    	AddressBO a = new AddressBO();	
    	String id_city = request.getParameter("id_tinh_thanhpho");
    	String id_district = request.getParameter("id_quan_huyen");
    	String status = request.getParameter("status");

    	// Nếu là yêu cầu từ Ajax để load Quận/Huyện
    	if ("district".equals(status)) {
    		if (id_city != null) {
    			Long idCity = Long.parseLong(id_city); 
    			String textDistricts = "<select id=\"iddistrict\" required onchange=\"load_town_ward(this.value);\" name=\"district\">" 
    				+ "<option value=\"\"></option>"; 
    			for (Quan_Huyen qh : a.getQuanHuyenById(idCity)) {
    				textDistricts += "<option value=\"" + qh.getId() + "\">" + qh.getTendaydu() + "</option>";
    			}
    			textDistricts += "</select>"; 
    			response.getWriter().println(textDistricts);  
    			return; // ✅ Rất quan trọng: dừng xử lý, KHÔNG forward JSP
    		}
    	}

    	// Nếu là yêu cầu từ Ajax để load Xã/Phường
    	if ("town_ward".equals(status)) {
    		if (id_district != null) {
    			Long idDistrict = Long.parseLong(id_district); 
    			String textWard = "<select id=\"idtown_ward\" required name=\"town_ward\">" 
    				+ "<option value=\"\"></option>";
    			for (Xa_Phuong xp : a.getXaPhuongById(idDistrict)) {
    				textWard += "<option value=\"" + xp.getTenHanhChinh() + "\">" + xp.getTenDayDu() + "</option>";
    			}
    			textWard += "</select>"; 
    			response.getWriter().println(textWard);  
    			return; // ✅ Dừng ở đây luôn
    		}
    	}

    	// Nếu không phải Ajax thì hiển thị trang checkout như bình thường
    	RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
    	rd.forward(request, response);
    	
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
