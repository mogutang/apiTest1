package com.khy.apitest;

public class Main {

    public static void main(String[] args) {
        String filePath="D:\\apache-jmeter-3.3\\resources\\dev_account.csv";
        int a=new GetFileData().getFileRow(filePath);
        System.out.println(a);
        String b=new GetFileData().readTxtLine(filePath,3);
        System.out.println(b);
        String c=new GetFileData().readTxtData(filePath,3,2);
        System.out.println(c);
        String d=new GetFilePath().getCurrentPath();
        d=d.replaceAll("\\\\","\\\\\\\\");
        System.out.println(d);
        //System.out.println(System.getProperty("user.dir"));
    }
}
