package com.khy.apitest;

import java.io.*;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class GetFileData {
    /*获取文件行数*/
    static public int getFileRow(String filepath)
    {
        int fileRowNum=0;
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(filepath));
            String tmpStr="";

            while((tmpStr=br.readLine())!=null)
            {
                fileRowNum++;
            }
            fileRowNum=fileRowNum-1;
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        return fileRowNum;
    }
    /*获取文件指定行列的数据*/
    public static String readTxtLine(String txtPath, int lineNo) {

        String line = "";
        String encoding="GBK";
        try {
            File txtFile = new File(txtPath);
            InputStream in = new FileInputStream(txtFile);
            InputStreamReader read = new InputStreamReader(in,encoding);
            BufferedReader reader = new BufferedReader(read);
            int i = 0;
            while (i < lineNo) {
                line = reader.readLine();
                i++;
            }
            reader.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        return line;
    }

    /*获取文件指定行列的数据*/
    public static  String readTxtData(String filePath,int row,int col){
        String line = "";
        String encoding="GBK";
        String last="";
        try {
            File txtFile = new File(filePath);
            InputStream in = new FileInputStream(txtFile);
            InputStreamReader read = new InputStreamReader(in,encoding);
            BufferedReader reader = new BufferedReader(read);
            // reader.readLine();//第一行信息，为标题信息，不用,如果需要，注释掉
            int index=0;
            while((line=reader.readLine())!=null){
                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分
                if(index==row-1){
                    if(item.length>=col-1){
                        last = item[col-1];//这就是你要的数据了
                        //System.out.println(last);
                    }
                }
                //int value = Integer.parseInt(last);//如果是数值，可以转化为数值
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return last;
    }
}
