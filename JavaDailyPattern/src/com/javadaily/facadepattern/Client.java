package com.javadaily.facadepattern;

import com.javadaily.facadepattern.facade.FacadeOperate;
import com.javadaily.facadepattern.subsys.FileEncypt;
import com.javadaily.facadepattern.subsys.FileReader;
import com.javadaily.facadepattern.subsys.FileWriter;


/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

//        FileReader fileReader = new FileReader();
//        fileReader.readFile();
//        FileWriter fileWriter = new FileWriter();
//        fileWriter.writeFile();
//        FileEncypt fileEncypt = new FileEncypt();
//        fileEncypt.encyptFile();

        FacadeOperate facadeOperate = new FacadeOperate();
        facadeOperate.operate();
    }
}
