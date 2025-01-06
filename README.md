# JasperReportByRakesh
Creating Jasper Reports using Java

Data source file(.csv) can be found at:-  eclipse workspace--->JasperbyJava--->src--->main--->resources--->data--->Trial3csv.csv
jrxml file(.jrxml) can be found at:-  eclipse workspace--->JasperbyJava--->src--->main--->resources--->reports--->Trial4.jrxml
jasper file(.jasper) can be found at:-  eclipse workspace--->JasperbyJava--->src--->main--->resources--->reports--->Trial4.jasper
pom file(.xml) can be found at:- eclipse workspace--->JasperbyJava--->pom.xml
Java file(.java) can be found at:- eclipse workspace--->JasperbyJava--->src--->main--->Java-->com-->developedbyrakesh-->App.java
Report(.pdf) can be found at:- eclipse workspace--->JasperbyJava--->JavafinalReport

My Approach for this project:

*** Software and IDE installation
-> I have installed JasperSoft Studio 7.0.1 for report designing
-> I chose Eclipse IDE to integrate Jasper Reports into Java Applications

*** Designing the report Template on JasperSoft Studio
--> Created New Jasper Report Project,given a simple name with .jrxml extension
--> Chose Data Adapter which is csv in my case, you can aslo choose different data adapters based on your data source file(eg excel,JDBC)
--> Now the feilds must me selected which you want to include in the report
--> make sure that the feilds you see on the wizard match the feilds in your data file
-->you can choose to group them or simply ignore
-->Data connection must be the data adapter you have chosen
-->Now you could see the layout which is a standard layout for report making
-->the layout consists of different sections like Tiltle, Page header, column header,detail,column foooter, page footer, summary
-->you can choose what to include and what to delete
-->you can drag items into the detail pane
-->for my project i have created a table with 11 column headers and their respective feilds below them
-->feilds must be mapped to their respective column headers
-->use parameters $P to provide inputs inside reports. We use parameter for single value eg:- $P{name of the parameter}
-->we use feilds $F to provide inputs inside reports. We use feild for multiple values eg:- $F{name of the parameter}. A column will have multiple values in different rows
-->use variables $V to provide calculations inside reports. We use variable for calculated value eg:- $V{formula}.eg:- To calculate sum, percentage at the end of column or column footer
-->heading, subheading and colors we given
-->size adjustments were made to get the report in one single page
-->Preview tab shows us how the report looks also gives errors if any
-->source tab shows the jrxml code which is an altrnative editing method
-->If you are ok with your design, simply save and compile to obtain the .jasper file
-->now you have .jrxml and .jasper files with you.

***Integrating Jasper reports into java applications
-->Be ready with .jrxml,.jasper,.csv files
-->Obtain jasper report class object- JRLoader
-->create JRData source class object- JRBean collection data source
-->create hashmap to store parameters
-->create jasperprint object--Jasper Fill Manager
-->Export to desired format-Jasper Export Manager
--> you can find the code in App.java file
