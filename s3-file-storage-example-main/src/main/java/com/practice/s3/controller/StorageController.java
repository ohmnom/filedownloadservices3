package com.practice.s3.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.s3.service.StorageService;

@RestController
@RequestMapping("/file")
public class StorageController {

    @Autowired
    private StorageService service;


    @GetMapping("/download/{fileName}")
    public void downloadFile(@PathVariable String fileName) {
        byte[] data = service.downloadFile(fileName);
        String arr = null;
//        ByteArrayResource resource = new ByteArrayResource(data);
       
			 arr = new String(data);
//		} catch (JSONException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        System.out.println(arr);
    }
}
