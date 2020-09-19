package 课程设计;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 查询方式
{
	String BookName;
	int BookNumber;
	double Bookprice;
	String BookPublisher;
	String Booktype;
	String BookWriter;
	int ID;
	Scanner in;
	void NewBookInput()
	{
		try{
		File number = new File("number.txt");
		File Stock = new File("Stock.txt");
		FileWriter output = new FileWriter(number);
		FileReader read = new FileReader(number);
		FileWriter write = new FileWriter(Stock,true);
		BufferedReader rd = new BufferedReader(read);
		BufferedWriter wt = new BufferedWriter(write);
		System.out.println("新书添加界面");
		System.out.println("请输入添加书籍的名称，数量，价格，出版社，种类，作者(回车键隔开)");
		in = new Scanner(System.in);
		BookName = in.next();
		BookNumber = in.nextInt();
		Bookprice = in.nextDouble();
		BookPublisher = in.next();
		Booktype = in.next();
		BookWriter = in.next();
		ID = rd.read()+2;
		wt.append(ID+",");
		wt.append(BookName+",");
		wt.append(BookNumber+",");
		wt.append(Bookprice+",");
		wt.append(BookPublisher+",");
		wt.append(Booktype+",");
		wt.append(BookWriter);
		wt.append("\r\n");
		wt.close();
		read.close();
		output.append(ID+"");
		output.close();
		}
		catch (IOException e)
		{
			
		}
	
	}
	
	String BookSearchByName(String s)//根据书籍名称进行查询
	{
		String text="";
		try{File stock = new File("Stock.txt");
		FileReader read = new FileReader(stock);
		BufferedReader rd = new BufferedReader(read);
		String a = rd.readLine();
		while(a!=null)
		{
			StringTokenizer b = new StringTokenizer(a,",");
			
			String c;
			c = b.nextToken();
			c = b.nextToken();
			if(c.equals(s)==true)
			{
				text+=a+"\r\n";
			}
			a = rd.readLine();//继续查找下一行
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
	}
	String BookSearchByAuthor(String s)//根据书籍作者进行查询
	{
		String text="";
		try{File stock = new File("Stock.txt");
		FileReader read = new FileReader(stock);
		BufferedReader rd = new BufferedReader(read);
		String a = rd.readLine();
		String c;
		while(a!=null)
		{
			StringTokenizer b = new StringTokenizer(a,",");
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
			if(c.equals(s)==true)
			{
				text+=a+"\r\n";
			}
			a = rd.readLine();//继续查找下一行
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
			
			
	}
	String BookSearchByID(int s)//根据书籍编号进行查询
	{
		String text="";
		try{File stock = new File("Stock.txt");
		FileReader read = new FileReader(stock);
		BufferedReader rd = new BufferedReader(read);
		String a = rd.readLine();
		while(a!=null)
		{
			StringTokenizer b = new StringTokenizer(a,",");
			
			String c;
			c = b.nextToken();
			if(Integer.parseInt(c)==s)
			{
				text=a;
				rd.close();
				return text;
			}
			a = rd.readLine();//继续查找下一行
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
	}
	String BookSearchByType(String s)//根据图书种类进行查询
	{
		String text="";
		try{File stock = new File("Stock.txt");
		FileReader read = new FileReader(stock);
		BufferedReader rd = new BufferedReader(read);
		String a = rd.readLine();
		String c;
		while(a!=null)
		{
			StringTokenizer b = new StringTokenizer(a,",");
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
				c = b.nextToken();
			if(c.equals(s)==true)
			{
				text+=a+"\r\n";
			}
			a = rd.readLine();//继续查找下一行
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
		
	}
	public static void  main(String[] args)
	{
		查询方式 啊 = new 查询方式 ();
		啊.NewBookInput();
	}
	
}
class Stock extends 查询方式//仓库类，用来统计仓库内书籍数量和种类
{
	int Sum;
	File Stock = new File("stock.txt");
	void stockoutput()
	{
		try{
		FileReader read = new FileReader(Stock);
		BufferedReader rd = new BufferedReader(read);
		String a = rd.readLine();
		while(a!=null)
		{
			StringTokenizer b = new StringTokenizer(a,",");
			int num;//计算某种书籍的数量
			String c=b.nextToken();
			for(int i = 1;i <= 2;i++)
			{
				c = b.nextToken();
			}
			num = Integer.parseInt(c);
			Sum+=num;
			a = rd.readLine();//继续查找下一行
		}
		System.out.println("books number:"+Sum);
		rd.close();
		}
		catch(IOException e)
		{
			
		}
	}
	
}

