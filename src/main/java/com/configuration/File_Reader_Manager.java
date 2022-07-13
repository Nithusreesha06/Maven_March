package com.configuration;

public class File_Reader_Manager {
	
	//sdp
	
	private File_Reader_Manager() {
		
	}
	
	public static File_Reader_Manager get_Instance_FRM() {
		File_Reader_Manager help=new File_Reader_Manager();
		return help;
		
	}
	
	public Configuration_Reader get_Instance_CR() throws Throwable {
		Configuration_Reader reader= new Configuration_Reader();
		return reader;
	}

}
