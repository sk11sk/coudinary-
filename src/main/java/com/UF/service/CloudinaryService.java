package com.UF.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryService {

    @Autowired
    private Cloudinary cloudinary;

  public Map upload (MultipartFile file)   {

      try {
          Map data = this.cloudinary.uploader().upload(file.getBytes(), Map.of());
          return  data;
      } catch (IOException e) {
          throw new RuntimeException("Image uploading Failed !!");
      }


  }



}
