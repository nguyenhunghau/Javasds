
package Business;
//<editor-fold defaultstate="collapsed" desc="IMPORT">
import DAO.StudentDao;
import DTO.Student;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//</editor-fold>

/**
 *
 * @author root
 */
@WebServlet(name = "AddStudentServlet", urlPatterns = {"/AddStudentServlet"})
public class AddStudentServlet extends HttpServlet {

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
            out.println("<title>Servlet AddStudentServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddStudentServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
        
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        String message;
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //String url = request.getSession().getServletContext().getRealPath("/studentmanager.jsp");
        String url = "/CRUD_Example/faces/View/Content/studentmanager.jsp?type=addnew";
        try {
            // Get data from inputs in form in file newstudent.jsp
            student.setId(studentDao.createId());
            student.setAddress(request.getParameter("Address"));
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = format.parse(request.getParameter("Birthday")); // mysql datetime format
            student.setBirthday(new Date(date.getTime()));
            student.setGender(request.getParameter("Gender"));
            student.setName(request.getParameter("Name"));
            java.util.Date receive = Calendar.getInstance().getTime();
            student.setReceiveDay(new Date(receive.getTime()));
            HttpSession session = request.getSession();
            //insert student into database
            if(studentDao.addNewStudent(student))
                message = "Add student sucessfully";
            else
                message = "Can not insert into database";
            
            //send a message 
            session.setAttribute("message", message);
            response.sendRedirect(url);
        } catch(Exception e) {
            e.printStackTrace();
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
