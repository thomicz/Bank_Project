package org.example.logger;
import com.google.gson.Gson;

import org.example.dataClasses.TransactionDetails;

import java.io.FileWriter;
import java.io.IOException;

import org.example.dataClasses.TransactionDetailsDTO;

public class ExportTransactionFile {
    public void CreateFile( TransactionDetails details)
    {
        Gson gson = new Gson();
        String date = details.getDate().toString();
        date = date.replace(":", "-");
        String path = "C:/Users/Tomáš Dvořák/IdeaProjects/Bank_Project/src/main/java/org/example/exports" + details.getAccount().GetOwner().getFirstName()+"_"+details.getAccount().GetOwner().getLastName()+date+".json";
        TransactionDetailsDTO dto = new TransactionDetailsDTO(details);

        try (FileWriter writer = new FileWriter(path)) {
            System.out.println("File saved"+details.getDate().toString());

            String json = gson.toJson(dto);
            writer.write(json);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
