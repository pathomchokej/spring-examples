package com.example.springmvc;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Component
public class ConvertWebMToMp4 {

    String Convert(String inputFilename, String outputFilename){

        try
        {
            IMediaReader mediaReader = ToolFactory.makeReader(inputFilename);
            IMediaWriter mediaWriter = ToolFactory.makeWriter(outputFilename, mediaReader);
            mediaReader.addListener(mediaWriter);

            // this line use for preview (slowly)
            //IMediaViewer mediaViewer = ToolFactory.makeViewer(true);
            //mediaReader.addListener(mediaViewer);

            // wait until read file done.
            long start = System.currentTimeMillis();
            while (mediaReader.readPacket() == null) ;
            long end = System.currentTimeMillis();
            Timestamp timestamp = new Timestamp(end - start);
            SimpleDateFormat format = new SimpleDateFormat("SSS");

            String elapsedTime = format.format(timestamp) + " millisecond";
            System.out.println( "Convert Done file is at : " + outputFilename + " use " + elapsedTime);
            return elapsedTime;
        }
        catch (Exception ex)
        {
            return "Convert " + inputFilename + " got excpetion : " + ex.getMessage();
        }
    }
}
