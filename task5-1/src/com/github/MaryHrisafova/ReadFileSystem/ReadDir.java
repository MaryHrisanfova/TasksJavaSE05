package com.github.MaryHrisafova.ReadFileSystem;

import java.io.*;
import java.util.*;

/**
 * Created by hrisanfovamm on 23.10.2015.
 */
public class ReadDir {
    public static void readDir(String pathName) throws IOException{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] list;
            File path = new File(pathName);
            list = path.list();//получаем массив строк, содержащий имена всех файлов каталога
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
            System.out.println("Содержимое каталога: ");
            for (String dirItem : list) {
                System.out.println(dirItem);
            }
        }
        catch(NullPointerException e){
            System.out.println("Произошла ошибка. Каталог не найден или некорректный ввод имени каталога.");
            e.printStackTrace();
        }
        /*
        catch (IOException e){
            System.out.println("Произошла ошибка");
            e.printStackTrace();
        }
        */
        finally {
            stdin.close();
        }
    }
}