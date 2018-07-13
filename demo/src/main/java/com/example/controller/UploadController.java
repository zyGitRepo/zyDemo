package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * @version [版本号, ]
 * @Author: zy
 * @Description:
 * @Date: Created in 2018/7/11 9:59.
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
public class UploadController {

    //要上传到哪个目录下，由于springboot项目最终是jsr包，故上传路径需要给个确定的绝对路径，一般配置在application.properties中
    @Value("${file.path}")
    private String filePath;

    @RequestMapping("/uploadFile")
    @ResponseBody
    public String upload(MultipartFile file) throws Exception{

        //得到上传文件的后缀名
        String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        //组织好上传后的文件名
        String fileName = Long.toString(new Date().getTime()) + extName ;

        File uploadDir = new File(filePath);

        if(!uploadDir.exists()){
            uploadDir.mkdir();
        }

        //上传
        FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(new File(filePath + "/" + fileName)));

        return fileName;
    }
}
