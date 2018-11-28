package com.mihuwis.hrhelper.dbconection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ConnectionDataParser {
    private String dataBaseURL;
    private String dataBaseUser;
    private String dataBasePassword;
    private List<String> parsedDataFromTxt;
    private String pathToFile = "src/main/resources/dbConnectionData.txt";


    ConnectionDataParser(){
        this.parsedDataFromTxt = parseConnectionDataBase(pathToFile);
        this.dataBaseURL = parsedDataFromTxt.get(0);
        this.dataBaseUser = parsedDataFromTxt.get(1);
        this.dataBasePassword = parsedDataFromTxt.get(2);

    }

    String getDataBaseURL() {
        return dataBaseURL;
    }

    String getDataBaseUser() {
        return dataBaseUser;
    }

    String getDataBasePassword() {
        return dataBasePassword;
    }

    private List<String> parseConnectionDataBase(String fileName) {
        List<String> parsedData = new ArrayList<String>();
        File file = new File(fileName);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String textLine;
            while ((textLine = bufferedReader.readLine()) != null){
                parsedData.add(textLine);
            }

        } catch(FileNotFoundException e){
            System.err.println("File with database access data does not exist!\n" +
                    "Please check dbConnection files and dbConnectionData.txt file");
        } catch (IOException e){
            System.err.println("Looks like some IO Exception in dbConnection");
            e.printStackTrace();
        }
        return parsedData;
    }


}
