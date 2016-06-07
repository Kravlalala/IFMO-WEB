import com.opencsv.CSVReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 1 on 07.06.2016.
 */
public class CSVParsing extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String area = request.getParameter("task");
        try (FileReader freader = new FileReader("Sports.csv")) {
            CSVReader csv_reader = new CSVReader(freader);
            String[] nextLine;
            int i = 0;
            while ((nextLine = csv_reader.readNext()) != null) {
                if(area.equals(nextLine[2])){
                    response.getWriter().println(nextLine[3]+nextLine[4]);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
