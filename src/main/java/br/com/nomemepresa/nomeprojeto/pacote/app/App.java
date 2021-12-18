package br.com.nomemepresa.nomeprojeto.pacote.app;

import br.com.nomemepresa.nomeprojeto.pacote.app.codeprivate.cprivate;
import br.com.nomemepresa.nomeprojeto.pacote.app.codepublic.cpublic;
import br.com.nomemepresa.nomeprojeto.pacote.app.codeprotected.cprotected;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Mauricio");
        map.put(1, "Ana");
        map.put(2, "Wesley");

        System.out.println(map.toString());
        System.out.println(map.values());

//        List<String> list = new ArrayList<String>();
//
//        list.add("GAbriel");
//        list.add("JOao");
//        list.add(2, "Beatriz");

/*        File file;
        FileOutputStream fop = null;
        BufferedReader br = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
            file = new File("test.txt");
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }

            fop = new FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }

            String text = "Ola, como vai?";

            byte[] textBytes = text.getBytes();

            fop.write(textBytes);
            fop.flush();
            fop.close();

            System.out.println("DONE");
            System.out.println("Preparando para leitura");

            fis = new FileInputStream((file));
            bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            while (dis.available() != 0){
                System.out.println(dis.readLine());
            }

            fis.close();
            dis.close();
            bis.close();
        }catch (IOException ex){
                ex.printStackTrace();
            }*/

/*            try {
                String currentLine = "";
                br = new BufferedReader(new FileReader("test.txt"));

                while ((currentLine = br.readLine()) != null) {
                    System.out.println(currentLine);
                }
                if (br != null) {
                    br.close();
                }
            } catch(IOException ex1){
            ex1.printStackTrace();
            }*/
        //new Main();
        // new cpublic();
        // new cprivate();
        //new cprotected();
        // System.out.println( "Hello World!" );

    }
}

