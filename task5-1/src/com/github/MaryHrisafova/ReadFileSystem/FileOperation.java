package com.github.MaryHrisafova.ReadFileSystem;

import java.io.*;

/**
 * Created by hrisanfovamm on 23.10.2015.
 */
public class FileOperation {
    public static void readFile(String fileNameToRead) throws IOException {
        StringBuilder readedText=new StringBuilder();
        BufferedReader in=new BufferedReader(new FileReader(new File(fileNameToRead).getAbsoluteFile()));
        try {
            String s;
            while ((s=in.readLine()) != null) {
                readedText.append(s + "\n");
            }
            System.out.print(readedText);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.err.println("Произошла ошибка. Файл не найден или некорректный ввод имени файла." + e);
        }
        catch (IOException e) {
            System.err.println("Произошла ошибка: " + e);
        }
        finally {
            in.close();

        }
    }

    public static void createFile (String nameOfPath) throws IOException {
        File path = new File(nameOfPath);
        try{
            path.createNewFile();
        }
        catch(IOException e){
            System.out.println("Произошла ошибка");
        }
    }

    public static void writeInFile (String fileNameToWrite) throws IOException {
        File path = new File(fileNameToWrite);
        BufferedWriter out=new BufferedWriter(new FileWriter(new File(fileNameToWrite).getAbsoluteFile(),true));
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        try{
            String ch;
            ch = stdin.readLine();
            out.write(ch);
        }
        catch (IOException e){
            System.out.println("Произошла ошибка");
        }
        finally {
            out.close();
            stdin.close();
        }

    }
}