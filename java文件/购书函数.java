package �γ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class ���麯�� {
	void ����(int a,int b)
	{
		��ѯ��ʽ cf = new ��ѯ��ʽ();
		File f = new File("Stock.txt");
		File g = new File("Stock_1.txt");
		try {
		FileReader reader = new FileReader(f);
		BufferedReader rd = new BufferedReader(reader);
		FileWriter writer = new FileWriter(g);
		BufferedWriter wt = new BufferedWriter(writer);
		String cry;
		cry = rd.readLine();
		StringTokenizer id;
		while(cry!=null)
		{	
			
			id = new StringTokenizer(cry,",");
			cf.ID = Integer.parseInt(id.nextToken());
			cf.BookName = id.nextToken();
			cf.BookNumber = Integer.parseInt(id.nextToken());
			cf.Bookprice = Double.parseDouble(id.nextToken());
			cf.BookPublisher = id.nextToken();
			cf.Booktype = id.nextToken();
			cf.BookWriter = id.nextToken();
			if(a != cf.ID)
			{
				wt.append(cf.ID+",");
				wt.append(cf.BookName+",");
				wt.append(cf.BookNumber+",");
				wt.append(cf.Bookprice+",");
				wt.append(cf.BookPublisher+",");
				wt.append(cf.Booktype+",");
				wt.append(cf.BookWriter);
				wt.append("\r\n");
			}
			else
			{
				wt.append(cf.ID+",");
				wt.append(cf.BookName+",");
				wt.append((cf.BookNumber-b)+",");
				wt.append(cf.Bookprice+",");
				wt.append(cf.BookPublisher+",");
				wt.append(cf.Booktype+",");
				wt.append(cf.BookWriter);
				wt.append("\r\n");
			}
			cry = rd.readLine();
		}
		rd.close();
		wt.close();
		f.delete();
			g.renameTo(f);
		
	}
		
		catch(IOException e)
		{
			
		}
		
	}
	
	public static void main(String [] args)
	{
		���麯�� a = new ���麯��();
		a.����(1,2);
	}
}
