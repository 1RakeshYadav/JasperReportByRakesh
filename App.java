package com.developedbyrakesh;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRCsvDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import java.io.File;

public class App {
    public static void main(String[] args) {
        try {
            //Give jasper file
            String jasperPath = App.class.getClassLoader()
                    .getResource("reports/Trial4.jasper").getPath();
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(new File(jasperPath));

            // Give the CSV Data Source
            String csvPath = App.class.getClassLoader()
                    .getResource("data/Trial3csv.csv").getPath();
            JRCsvDataSource dataSource = new JRCsvDataSource(new File(csvPath));
            dataSource.setFieldDelimiter(',');
            dataSource.setColumnNames(new String[]{
                "Report", "1995", "2000", "2001", "2002", "2003", 
                "1995p", "2000p", "2001p", "2002p", "2003p"
            });

            //Filling the report
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null, dataSource);

            //PDF output
            String outputPdf = "JavafinalReport.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputPdf);

            System.out.println("Report generated successfully: " + outputPdf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
