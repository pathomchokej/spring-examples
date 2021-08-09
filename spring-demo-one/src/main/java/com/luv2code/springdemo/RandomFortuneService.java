package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements IFortuneService{

    private String fortuneFile="";
    private List<String> theFortunes = null;
    // create a random number generator
    private Random myRandom = new Random();

    public void setFortuneFile(String fileName){
        this.fortuneFile = fileName;
        ImplementFortuneList();
    }

    private void ImplementFortuneList(){
        File theFile = new File(fortuneFile);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        if(theFile.exists())
        {
            // initialize array list
            theFortunes = new ArrayList<String>();

            // read fortunes from file
            try (BufferedReader br = new BufferedReader(
                    new FileReader(theFile))) {

                String tempLine;

                while ((tempLine = br.readLine()) != null) {
                    tempLine = tempLine.trim();
                    if(tempLine.length() > 0)
                        theFortunes.add(tempLine);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
            theFortunes = null;
    }

    @Override
    public String getFortune() {
        if(null != theFortunes && theFortunes.size() > 0)
        {
            // pick a random string from the array
            int index = myRandom.nextInt(theFortunes.size());

            String tempFortune = theFortunes.get(index);

            return tempFortune;
        }
        else
            return "No fortune list";
    }
}
