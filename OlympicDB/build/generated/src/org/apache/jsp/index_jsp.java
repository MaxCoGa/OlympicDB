package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>  \n");
      out.write("<html>  \n");
      out.write("<head> \n");
      out.write("<style>\n");
      out.write("table, th, td {\n");
      out.write("  border: 1px solid black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">  \n");
      out.write("<title>Olympic Database</title>  \n");
      out.write("</head>  \n");
      out.write("<body>  \n");
      out.write("<h1>Olympic Database</h1>  \n");
      out.write("<table style=\"width:100%\">\n");
      out.write("    <tr>\n");
      out.write("        <th>Employee</th>\n");
      out.write("        <td> <a href=\"employee/addform.jsp\">Add Employee</a> </td>\n");
      out.write("        <td> <a href=\"employee/view.jsp\">View Employee</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>Athlete</th>\n");
      out.write("        <td> <a href=\"athlete/addform.jsp\">Add Athlete</a> </td>\n");
      out.write("        <td> <a href=\"athlete/view.jsp\">View Athlete</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>Pays</th>\n");
      out.write("        <td> <a href=\"pays/addpaysform.jsp\">Add Pays</a> </td>\n");
      out.write("        <td> <a href=\"pays/viewpays.jsp\">View Pays</a> </td>\n");
      out.write("    </tr>\n");
      out.write("     </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Disicipline</th>\n");
      out.write("        <td> <a href=\"discipline/adddisciplineform.jsp\">Add Discipline</a> </td>\n");
      out.write("        <td> <a href=\"discipline/viewdiscipline.jsp\">View Discipline</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Epreuve</th>\n");
      out.write("        <td> <a href=\"epreuve/adddisciplineform.jsp\">Add Epreuve</a> </td>\n");
      out.write("        <td> <a href=\"epreuve/viewdiscipline.jsp\">View Epreuve</a> </td>\n");
      out.write("    </tr>\n");
      out.write("     </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Facility</th>\n");
      out.write("        <td> <a href=\"facility/addfacilityform.jsp\">Add Facility</a> </td>\n");
      out.write("        <td> <a href=\"facility/viewfacility.jsp\">View Facility</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Residence</th>\n");
      out.write("        <td> <a href=\"residence/addresidenceform.jsp\">Add Residence</a> </td>\n");
      out.write("        <td> <a href=\"residence/viewresidence.jsp\">View Residence</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Medical</th>\n");
      out.write("        <td> <a href=\"medical/addform.jsp\">Add Medical</a> </td>\n");
      out.write("        <td> <a href=\"medical/view.jsp\">View Medical</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Transport</th>\n");
      out.write("        <td> <a href=\"transport/addform.jsp\">Add Transport</a> </td>\n");
      out.write("        <td> <a href=\"transport/view.jsp\">View Transport</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Itineraire</th>\n");
      out.write("        <td> <a href=\"itineraire/addform.jsp\">Add Itineraire</a> </td>\n");
      out.write("        <td> <a href=\"itineraire/view.jsp\">View Itineraire</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Medal</th>\n");
      out.write("        <td> <a href=\"medal/addform.jsp\">Add Medal</a> </td>\n");
      out.write("        <td> <a href=\"medal/view.jsp\">View Medal</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Officiel</th>\n");
      out.write("        <td> <a href=\"officiel/addform.jsp\">Add Officiel</a> </td>\n");
      out.write("        <td> <a href=\"officiel/view.jsp\">View Officiel</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Referee</th>\n");
      out.write("        <td> <a href=\"oreferee/addform.jsp\">Add Referee</a> </td>\n");
      out.write("        <td> <a href=\"oreferee/view.jsp\">View Referee</a> </td>\n");
      out.write("    </tr>\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <th>Supervise</th>\n");
      out.write("        <td> <a href=\"orsupervise/addform.jsp\">Add Supervise</a> </td>\n");
      out.write("        <td> <a href=\"orsupervise/view.jsp\">View Supervise</a> </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>  \n");
      out.write("</html>  ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
