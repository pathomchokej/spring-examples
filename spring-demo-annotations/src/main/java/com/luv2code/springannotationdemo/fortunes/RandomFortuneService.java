package com.luv2code.springannotationdemo.fortunes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements IFortuneService{
    // TODO: Create list of fortune

    @Value("${fortuneData.path}")
    private String path;
    private Random random = new Random();
    private List<String> theFortunes = new ArrayList<>();

    @PostConstruct
    public void initialize(){
        ImplementFortuneList();
    }

    private void ImplementFortuneList(){
        File theFile = new File(path);

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
    public String getDailyFortune() {

        // TODO: Pick random data from list
        if(null != theFortunes && theFortunes.size() > 0)
        {
            // pick a random string from the array
            int index = random.nextInt(theFortunes.size());

            String tempFortune = theFortunes.get(index);

            return tempFortune;
        }
        else
            return "No fortune list";
    }
}
