package readFromCSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        Reader in = null;
        try {
            in = new FileReader("C:\\Local Disk (D)\\OMRE_AutomationClass\\Junit5\\src\\test\\resources\\CSV_dataTest.csv");
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                String cDai = record.get(0);
                System.out.println("Chieu Dai: "+cDai);
                String cRong = record.get(1);
                System.out.println("Chieu Rộng: "+cRong);
                String chuVi = record.get(2);
                System.out.println("Chu Vi: "+chuVi);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
