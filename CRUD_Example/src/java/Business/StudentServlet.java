
package Business;
//<editor-fold defaultstate="collapsed" desc="IMPORT">
import DAO.StudentDao;
import DTO.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//</editor-fold>

/**
 *
 * @author root
 */
public class StudentServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StudentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StudentServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        StudentDao studentDao = new StudentDao();
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        
        try {
            // Get Id and Name from input in form in file studentmanager.jsp
            String Id = request.getParameter("ID");
            String Name = request.getParameter("name");
            //String url = "../../View/Content/studentmanager.jsp";
            String url = "/CRUD_Example/faces/View/Content/studentmanager.jsp?type=search";
        
            //Get student in database
            List<Student> listStudent = studentDao.getListStudent(Id, Name);
            HttpSession session = request.getSession();
            session.setAttribute("listStudent", listStudent);
            //Send message
            session.setAttribute("message", "search");
            //Redirect to studentmanager.jsp
            response.sendRedirect(url); 
            
        } catch (Exception ex) {
              ex.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
