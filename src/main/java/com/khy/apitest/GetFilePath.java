package com.khy.apitest;

import java.io.File;

/**
 * Created by Administrator on 2018/7/18 0018.
 */
public class GetFilePath {

    public static String getCurrentPath()
    {
        File directory = new File("");//参数为空
        String courseFile="";
        try
        {
            courseFile = directory.getCanonicalPath() ;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return courseFile;
    }
}
