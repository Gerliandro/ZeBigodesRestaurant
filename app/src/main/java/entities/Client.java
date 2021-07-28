package entities;

import interfaces.IID;

public class Client implements IID
{
	private String name;
	private int client_id;
	private int table_number;
	private static int client_count = 0;
	
	public Client(String p_name, int p_table_number) 
	{
		super();
		name = p_name;
		client_id = client_count++;
		table_number = p_table_number;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String p_name) 
	{
		name = p_name;
	}

	public int getTable_number() 
	{
		return table_number;
	}

	public void setTable_number(int p_table_number) 
	{
		table_number = p_table_number;
	}
	
	@Override
	public int getID()
	{
		return client_id;
	}
}