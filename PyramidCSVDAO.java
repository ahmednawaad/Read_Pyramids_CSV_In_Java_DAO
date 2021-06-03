package pyramidsdao;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PyramidCSVDAO {

    private List<Pyramid> Pyramids;


    public List<Pyramid> readPyramidsCSVFile(String filePath){
        this.Pyramids = new ArrayList();

        File file = new File(filePath);

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(file.toPath());
        }catch (Exception e){
            System.out.println("Error: " +e.getMessage());
        }

        for(int index = 1; index < lines.size(); index++){

            String line = lines.get(index);
            String[] attributes = line.split(",");

            for (String attribute : attributes){
                attribute.trim();
            }
            try{
                Pyramid pyramid = new Pyramid(attributes[0],attributes[1],attributes[2],attributes[3],attributes[4],
                        attributes[5],attributes[6],attributes[7],attributes[8],attributes[9],attributes[10],attributes[11]
                        ,attributes[12],attributes[13],attributes[14],attributes[15]);
                Pyramids.add(pyramid);
                }catch (ArrayIndexOutOfBoundsException e){
                Pyramid pyramid = new Pyramid(attributes[0],attributes[1],attributes[2],attributes[3],attributes[4],
                        attributes[5],attributes[6],attributes[7],attributes[8],attributes[9],attributes[10],attributes[11]
                        ,attributes[12],attributes[13],attributes[14],null);
                Pyramids.add(pyramid);
            }


        }
        System.out.println("Data set is loaded with " + Pyramids.size()+ " records");

        return Pyramids;

    }



}
