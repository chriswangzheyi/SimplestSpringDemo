package com.wzy.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadFielsController {

	@RequestMapping(value="/uploadFiles")
	public String detailsUpdate(
			@RequestParam(value = "multifiles", required = false) MultipartFile[] multipleFiles,
			HttpServletRequest request) {

		System.out.println("viewfiles size ="+multipleFiles.length);
		
		//上传路径
		String path = request.getSession().getServletContext().getRealPath("/") + "upload/";
		//名字
		String filename;
		
        for(int i = 0;i<multipleFiles.length;i++){  
            MultipartFile file = multipleFiles[i];               

            try {
               
                filename=file.getOriginalFilename();
                File FinalFile = new File(path, filename);
                if(!FinalFile.exists()){  
                	FinalFile.mkdirs();  
                }
                // 转存文件  
                file.transferTo(FinalFile); 
            } catch (IOException e) {
                e.printStackTrace();
            }  
        }
	
        System.out.println("path="+path);
        
		
		return "index";
	}

}
