package com.javadaily.facadepattern.facade;

import com.javadaily.facadepattern.subsys.FileEncypt;
import com.javadaily.facadepattern.subsys.FileReader;
import com.javadaily.facadepattern.subsys.FileWriter;

public class FacadeOperate {
    private FileReader fileReader = new FileReader();
    private FileWriter fileWriter = new FileWriter();
    private FileEncypt fileEncypt = new FileEncypt();

    public void operate() {
        fileReader.readFile(null);
        fileWriter.writeFile(null,null);
        fileEncypt.encyptFile();
    }
}
