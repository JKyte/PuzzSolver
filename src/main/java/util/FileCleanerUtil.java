package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCleanerUtil {

    public FileCleanerUtil(){

    }

    public void cleanAllStaging(){
        File dir = new File("data");
        File[] files = dir.listFiles();
        for(File file : files){
            if(file.isFile()){
                cleanFile(file.getName());
            }
        }
    }

    public void cleanFile(String filename){
        try {
            File outFile = new File("data/cleaned/" + filename.toLowerCase());
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));
            File inFile = new File("data/staging/" + filename);
            BufferedReader br = new BufferedReader(new FileReader(inFile));
            String line = br.readLine();
            int count = 0;
            while (true) {
                if (line == null) break;

                count++;
                line = line.toLowerCase();
                line = line.replaceAll("[^a-zA-Z_]", "");
                line = line.replaceAll("-", "");
                line = line.replaceAll("'", "");

                if(!line.isEmpty()){
                    bw.write(line+"\n");
                }

                line = br.readLine();
            }
            br.close();

            System.out.println("Words read: " + count);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
