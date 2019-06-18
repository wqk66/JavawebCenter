package com.javadaily.factorypattern.util;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * xml解析类
 */
public class Dom4JUtil {

    /**
     * xml解析方法
     * @return
     */
    public static String parseXMLForType(String xmlPath) {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(xmlPath));
            Element factory = document.getRootElement();
            Iterator<Element> it = factory.elementIterator();
            if (it.hasNext()) {
                Element clasz = it.next();
                String className = clasz.getStringValue();
//                Class c = Class.forName(className);
//                Object obj = c.newInstance();
                return className;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * xml解析方法
     * @return
     */
    public static Object parseXMLForClass(String xmlPath) {
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(new File(xmlPath));
            Element factory = document.getRootElement();
            Iterator<Element> it = factory.elementIterator();
            if (it.hasNext()) {
                Element clasz = it.next();

                String className = clasz.getStringValue();
                Class c = Class.forName(className.trim());
                Object obj = c.newInstance();
                return obj;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(parseXMLForClass("src/config.xml"));
    }


}
