package br.com.lovefood.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.ServerException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



public class Upload {

	
	public static  String Imagem (HttpServletRequest request, HttpServletResponse response)
			throws ServerException, IOException, ServletException{

		response.setContentType("text/html;charset=utf-8");			
		
		final String path = request.getServletContext().getRealPath("resources") + File.separator + "img";
		
		final Part filePart = request.getPart("foto");
		
		final String fileName = UUID.randomUUID().toString().replace("-","") + ".jpg"; 
		//escrita
		OutputStream out = null;
		//leitura
		InputStream filecontent = null;
		
		try {
			out = new FileOutputStream(new File(path + File.separator + fileName));
			filecontent = filePart.getInputStream();
			
			int read = 0;
			final byte[] bytes = new byte[1024];
			
			while((read = filecontent.read(bytes))!= -1) {
				out.write(bytes, 0, read);
			}
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
			System.out.println(fne.getMessage());
			
		}finally {
			if(out!= null)
				out.close();
			if(filecontent != null)
				filecontent.close();
		}
		
		return fileName;
	}
	
	
}
