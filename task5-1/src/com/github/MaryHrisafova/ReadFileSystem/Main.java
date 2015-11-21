package com.github.MaryHrisafova.ReadFileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.github.MaryHrisafova.ReadFileSystem.FileOperation.*;
import static com.github.MaryHrisafova.ReadFileSystem.ReadDir.*;

/**
 * Created by hrisanfovamm on 23.10.2015.
 */
public class Main {
    public static void main(String[] aArgs) throws IOException {
        System.out.println("1-просмотреть каталог" + "\t" + "2-просмотреть файл" + "\t" + "3-создать файл *.txt" + "\t" + "4-осуществить запись в файл");
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(streamReader);
        String command = "";
        String path;

            command = stdin.readLine();
            switch (command) {
                case "1":
                    System.out.println("Введите каталог для просмотра: ");
                    path = stdin.readLine();
                    readDir(path);
                    break;

                case "2":
                    System.out.println("Для чтения файла введите путь и название файла с расширением: ");
                    path = stdin.readLine();
                    readFile(path);
                    break;


                case "3":
                    System.out.println("Для создания файла введите путь и название файла с расширением: ");
                    path = stdin.readLine();
                    createFile(path);
                    break;


                case "4":
                    System.out.println("Для записи в файл введите путь и название файла с расширением: ");
                    path = stdin.readLine();
                    writeInFile(path);
                    break;

        }

        stdin.close();
        streamReader.close();
    }
}