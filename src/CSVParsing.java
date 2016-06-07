import com.opencsv.CSVReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by 1 on 07.06.2016.
 */
public class CSVParsing extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String area = request.getParameter("task");
        try (Reader freader = new InputStreamReader(new FileInputStream("Sports.csv"), "UTF-8")) {
            CSVReader csv_reader = new CSVReader(freader);
            String[] nextLine;
            int i = 0;
            while ((nextLine = csv_reader.readNext()) != null) {
                if(area.equals(nextLine[2])){
                    response.getWriter().println(nextLine[3]);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
