package 课程设计;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 修改和删除 {
	void File_Edit(int ID,int i,String edit,int mode)
	{
		int delete =1;
		int change = 0;
		查询方式 cf = new 查询方式();
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
		if(mode == change)
		{
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
			if(ID != cf.ID)
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
				switch(i)
				{
					case 0: {wt.append(cf.ID+",");
					wt.append(edit+",");
					wt.append((cf.BookNumber)+",");
					wt.append(cf.Bookprice+",");
					wt.append(cf.BookPublisher+",");
					wt.append(cf.Booktype+",");
					wt.append(cf.BookWriter);
					wt.append("\r\n");
					break;
					}
					case 1:{
						wt.append(cf.ID+",");
						wt.append(cf.BookName+",");
						wt.append((cf.BookNumber)+",");
						wt.append(cf.Bookprice+",");
						wt.append(cf.BookPublisher+",");
						wt.append(cf.Booktype+",");
						wt.append(edit);
						wt.append("\r\n");
						break;
					}
					case 2:{
						wt.append(cf.ID+",");
						wt.append(cf.BookName+",");
						wt.append((cf.BookNumber)+",");
						wt.append(cf.Bookprice+",");
						wt.append(edit+",");
						wt.append(cf.Booktype+",");
						wt.append(cf.BookWriter);
						wt.append("\r\n");
						break;
					}
					case 3:{
						wt.append(cf.ID+",");
						wt.append(cf.BookName+",");
						wt.append((cf.BookNumber)+",");
						wt.append(Double.parseDouble(edit)+",");
						wt.append(cf.BookPublisher+",");
						wt.append(cf.Booktype+",");
						wt.append(cf.BookWriter);
						wt.append("\r\n");
						break;
					}
					case 4:{
						wt.append(cf.ID+",");
						wt.append(cf.BookName+",");
						wt.append(Integer.parseInt(edit)+",");
						wt.append(cf.Bookprice+",");
						wt.append(cf.BookPublisher+",");
						wt.append(cf.Booktype+",");
						wt.append(cf.BookWriter);
						wt.append("\r\n");
						break;
					}
					case 5:
					{
						wt.append(cf.ID+",");
						wt.append(cf.BookName+",");
						wt.append((cf.BookNumber)+",");
						wt.append(cf.Bookprice+",");
						wt.append(cf.BookPublisher+",");
						wt.append(edit+",");
						wt.append(cf.BookWriter);
						wt.append("\r\n");
					}
				}

			}
			cry = rd.readLine();
		}
		}
		else if(mode==delete)
		{
			int flag=0;
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
				if(ID != cf.ID)
				{
					if(flag==1)
					wt.append(cf.ID-1+",");
					else
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
					flag=1;
				}
				cry = rd.readLine();
			}
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
}
