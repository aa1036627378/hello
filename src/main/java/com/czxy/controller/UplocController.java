package com.czxy.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author
 * @infos 你要做什么
 * @date 2019/7/8
 */
@RestController
public class UplocController {
@PostMapping("/uploc")
    public ResponseEntity<Void>Uploc(MultipartFile file) throws IOException {
        file.transferTo(new File("Z:\\img\\"+file.getOriginalFilename()));
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
