package com.java;

import java.io.*;//导入java.io包下的所有类

import org.w3c.dom.*;//使用org.w3c.dom操作XML文件
import org.xml.sax.SAXException;//使用org.xml.sax.SAXException读取文件

import javax.xml.parsers.*; //导入 javax.xml.parsers包下的所有类
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author YangBin
 * @date 2020年04月03日
 */
public class DomTest {//类名

    public static void main(String[] args) {//程序主入口函数，带命令行参数
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//创建DOM模式的解析器工厂对象
        try {//try代码块，当发生异常时会转到catch代码块中
            DocumentBuilder builder = factory.newDocumentBuilder();//得到一个DOM解析器对象
            Document doc = builder.parse(new File("C:\\Users\\YangBin\\Desktop\\xml.xml"));//打开指定路径下的xml文件
            NodeList nl = doc.getElementsByTagName("hang");//获得<hang>文件的值
            for (int i = 0; i < nl.getLength(); i++) {//for循环的条件
                System.out.println(doc.getElementsByTagName("产品唯一ID").item(i).getFirstChild().getNodeValue());//获取“产品唯一ID”的信息
                System.out.println(doc.getElementsByTagName("通用名").item(i).getFirstChild().getNodeValue());//获取“通用名”的信息
                System.out.println(doc.getElementsByTagName("商品名").item(i).getFirstChild().getNodeValue());//获取“商品名”的信息
                System.out.println(doc.getElementsByTagName("剂型").item(i).getFirstChild().getNodeValue());//获取“剂型”的信息
                System.out.println(doc.getElementsByTagName("批准文号").item(i).getFirstChild().getNodeValue());//获取“批准文号”的信息
                System.out.println(doc.getElementsByTagName("规格").item(i).getFirstChild().getNodeValue());//获取“规格”的信息
                System.out.println(doc.getElementsByTagName("包装说明").item(i).getFirstChild().getNodeValue());//获取“包装说明”的信息
                System.out.println(doc.getElementsByTagName("包装单位").item(i).getFirstChild().getNodeValue());//获取“包装单位”的信息
                System.out.println(doc.getElementsByTagName("生产企业").item(i).getFirstChild().getNodeValue());//获取“生产企业”的信息
                System.out.println(doc.getElementsByTagName("大包装转换比").item(i).getFirstChild().getNodeValue());//获取“大包装转换比”的信息
                System.out.println(doc.getElementsByTagName("中包装转换比").item(i).getFirstChild().getNodeValue());//获取“中包装转换比”的信息
                System.out.println(doc.getElementsByTagName("备注").item(i).getFirstChild().getNodeValue());//获取“备注”的信息
                System.out.println(doc.getElementsByTagName("库存").item(i).getFirstChild().getNodeValue());//获取“库存”的信息
                System.out.println(doc.getElementsByTagName("供应价").item(i).getFirstChild().getNodeValue());//获取“供应价”的信息
                System.out.println(doc.getElementsByTagName("是否上架").item(i).getFirstChild().getNodeValue());//获取“是否上架”的信息
                System.out.println();//输出空字符进行格式调整
            }
        } catch (ParserConfigurationException e) {//当try代码块有异常时转到catch代码块
            e.printStackTrace();//在命令行打印异常信息出错的位置及原因
        } catch (SAXException e) {//当try代码块有异常时转到catch代码块
            e.printStackTrace();//在命令行打印异常信息出错的位置及原因
        } catch (IOException e) {//当try代码块有异常时转到catch代码块
            e.printStackTrace();//在命令行打印异常信息出错的位置及原因
        }
    }
}
