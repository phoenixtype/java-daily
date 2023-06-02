package algorithms;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVColumnModifierUserId {
    public static void main(String[] args) {
        String inputFile = "/Users/samuelakuma/Desktop/lyne/ml-25m/ratings.csv";
        String outputFile = "/Users/samuelakuma/Desktop/lyne/ml-25m/interaction-dataset-1.csv";

        try {
            // Read the input CSV file
            FileReader fileReader = new FileReader(inputFile);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withHeader());

            // Create a new CSV file for writing
            FileWriter fileWriter = new FileWriter(outputFile);
            CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);

            // Get the header and modify the first column header
            String[] header = csvParser.getHeaderMap().keySet().toArray(new String[0]);
            header[0] = "USER_ID";

            // Write the modified header to the output CSV file
            csvPrinter.printRecord((Object[]) header);

            // Process each record and modify the first column value
            for (CSVRecord record : csvParser) {
                String firstColumnValue = record.get(0);
                String modifiedFirstColumnValue = "16475706" + String.format("%03d", Integer.parseInt(firstColumnValue));

                // Create a new record with the modified first column value
                String[] modifiedRecord = new String[record.size()];
                modifiedRecord[0] = modifiedFirstColumnValue;

                // Copy the remaining columns
                for (int i = 1; i < record.size(); i++) {
                    modifiedRecord[i] = record.get(i);
                }

                // Write the modified record to the output CSV file
                csvPrinter.printRecord((Object[]) modifiedRecord);
            }

            // Close the CSV reader, writer, and printer
            csvParser.close();
            csvPrinter.close();

            System.out.println("CSV file modification completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
