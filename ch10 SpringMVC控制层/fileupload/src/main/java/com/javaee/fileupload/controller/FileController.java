package com.javaee.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FileController {
    @GetMapping("file")
    public  String toFilePage(){
        return  "singlefile";
    }

    @PostMapping("fileupload")
    public  String uploadSingleFile(MultipartFile file,
                                    Model model) throws IOException {
        System.out.println("文件类型:"+file.getContentType()
        +";文件名："+ file.getOriginalFilename()+
                ";文件大小:"+ file.getSize());
        String saveFileName = "/Users/huaiwen/"+ file.getOriginalFilename();
        File saveFile = new File(saveFileName);
        file.transferTo(saveFile);

        model.addAttribute("msg", "文件上传成功！");
        return "singlefile";
    }
}
