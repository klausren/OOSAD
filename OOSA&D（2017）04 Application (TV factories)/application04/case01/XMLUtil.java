package assignments.factory.case01;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
import java.net.URL;
public class XMLUtil
{
//该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
	public static Object getBean()
	{
		try
		{
			//创建文档对象
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			File filename = new File("assignments/factory/case01/config.xml");
			doc = builder.parse(filename);
			
			//获取包含类名的文本节点
			NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //得到工程的路径
            //String projectpath =System.getProperty("user.dir");
            //类的绝对路径
            //URL classpath =XMLUtil.class.getResource("/");
            //通过类名生成实例对象并将其返回
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
