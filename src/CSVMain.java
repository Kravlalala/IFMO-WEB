import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 1 on 07.06.2016.
 */
public class CSVMain {
    public static void main(String args[]) {
        try(FileReader freader=new FileReader("Sports.csv")){
            CSVReader csv_reader = new CSVReader(freader);
            String [] nextLine;
            int i=0;
            while ((nextLine = csv_reader.readNext()) != null) {
                System.out.println(nextLine[0]+nextLine[1]+nextLine[2]+nextLine[3]+nextLine[4]+nextLine[5]);
                i++;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
