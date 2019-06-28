package com.javadaily.principle;

import com.javadaily.principle.parent.DBUtil;
import com.javadaily.principle.service.CustomerDAO;
import com.javadaily.utils.Dom4JUtil;

/**
 * 模拟客户端
 */
public class Client {

    public static void main(String[] args) {


        DBUtil dbUtil = (DBUtil) Dom4JUtil.parseXMLForClass("src/config.xml");
        CustomerDAO dao = new CustomerDAO(dbUtil);
        dao.addCustomer();
    }


}
