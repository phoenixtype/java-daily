package algorithms;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVColumnModifierEventType {
    public static void main(String[] args) {
        String inputFile = "/Users/samuelakuma/Desktop/lyne/ml-25m/interaction-dataset-2.csv";
        String outputFile = "/Users/samuelakuma/Desktop/lyne/ml-25m/interaction-dataset-3.csv";

        try {
            // Read the input CSV file
            FileReader fileReader = new FileReader(inputFile);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withHeader());

            // Create a new CSV file for writing
            FileWriter fileWriter = new FileWriter(outputFile);
            CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT);

            // Get the header and modify the third column header
            String[] header = csvParser.getHeaderMap().keySet().toArray(new String[0]);
            header[2] = "EVENT_TYPE";

            // Write the modified header to the output CSV file
            csvPrinter.printRecord((Object[]) header);

            // Process each record and modify the third column value
            for (CSVRecord record : csvParser) {
                String thirdColumnValue = record.get(2);
                String modifiedThirdColumnValue = switch (thirdColumnValue) {
                    case "1.5", "2.0", "3.0", "3.5" -> "likedByUserId";
                    case "0.5", "1.0", "2.5", "4.0", "4.5" -> "likedByItemId";
                    case "5.0" -> "matched";
                    default -> thirdColumnValue;
                };

                // Create a new record with the modified third column value
                String[] modifiedRecord = new String[record.size()];
                modifiedRecord[0] = record.get(0); // Copy the first column as it is
                modifiedRecord[1] = record.get(1); // Copy the second column as it is
                modifiedRecord[2] = modifiedThirdColumnValue;

                // Copy the remaining columns
                for (int i = 3; i < record.size(); i++) {
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

