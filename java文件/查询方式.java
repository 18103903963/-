package �γ����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ��ѯ��ʽ
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
		System.out.println("������ӽ���");
		System.out.println("����������鼮�����ƣ��������۸񣬳����磬���࣬����(�س�������)");
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
	
	String BookSearchByName(String s)//�����鼮���ƽ��в�ѯ
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
			a = rd.readLine();//����������һ��
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
	}
	String BookSearchByAuthor(String s)//�����鼮���߽��в�ѯ
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
			a = rd.readLine();//����������һ��
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
			
			
	}
	String BookSearchByID(int s)//�����鼮��Ž��в�ѯ
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
			a = rd.readLine();//����������һ��
		}
		rd.close();
	}
		catch (IOException e)
		{
			
		}
		return text;
	}
	String BookSearchByType(String s)//����ͼ��������в�ѯ
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
			a = rd.readLine();//����������һ��
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
		��ѯ��ʽ �� = new ��ѯ��ʽ ();
		��.NewBookInput();
	}
	
}
class Stock extends ��ѯ��ʽ//�ֿ��࣬����ͳ�Ʋֿ����鼮����������
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
			int num;//����ĳ���鼮������
			String c=b.nextToken();
			for(int i = 1;i <= 2;i++)
			{
				c = b.nextToken();
			}
			num = Integer.parseInt(c);
			Sum+=num;
			a = rd.readLine();//����������һ��
		}
		System.out.println("books number:"+Sum);
		rd.close();
		}
		catch(IOException e)
		{
			
		}
	}
	
}

