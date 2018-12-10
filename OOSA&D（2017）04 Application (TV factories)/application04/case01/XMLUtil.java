package assignments.factory.case01;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
import java.net.URL;
public class XMLUtil
{
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean()
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			File filename = new File("assignments/factory/case01/config.xml");
			doc = builder.parse(filename);
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //�õ����̵�·��
            //String projectpath =System.getProperty("user.dir");
            //��ľ���·��
            //URL classpath =XMLUtil.class.getResource("/");
            //ͨ����������ʵ�����󲢽��䷵��
            Class c=Class.forName("assignments.factory.case01."+cName);
	  	    Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
