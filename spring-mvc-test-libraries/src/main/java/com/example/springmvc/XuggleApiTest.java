package com.example.springmvc;

import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaViewer;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

public class XuggleApiTest {
    private static final String inputFilename = "src/main/resources/test.webm";
    private static final String outputFilename = "src/main/resources/convert.mp4";
    public static void main(String[] args) {
        IMediaReader mediaReader =
                ToolFactory.makeReader(inputFilename);
        IMediaWriter mediaWriter =
                ToolFactory.makeWriter(outputFilename, mediaReader);
        mediaReader.addListener(mediaWriter);
        // this line use for preview (slowly)
        //IMediaViewer mediaViewer = ToolFactory.makeViewer(true);
        //mediaReader.addListener(mediaViewer);
        while (mediaReader.readPacket() == null) ;

        System.out.println("Convert Done file is at : " + outputFilename);
    }
}
