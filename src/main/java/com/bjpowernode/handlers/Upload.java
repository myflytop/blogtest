package com.bjpowernode.handlers;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
@RequestMapping("/myupload")
public class Upload {
	@RequestMapping(value="/load.do", method=RequestMethod.POST)  
    public String doUploadFile(@RequestParam("file") MultipartFile file,HttpServletRequest request){  
  
        if(!file.isEmpty()){  
            try {  
                  
            	String realPath = request.getSession().getServletContext().getRealPath("/upload");   
                FileUtils.copyInputStreamToFile(file.getInputStream(), new File(realPath,   
                        System.currentTimeMillis()+ file.getOriginalFilename()));  
           System.out.println(realPath);
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
  
        return "/welcome.jsp";  //上传成功则跳转至此success.jsp页面  
    }  

}
