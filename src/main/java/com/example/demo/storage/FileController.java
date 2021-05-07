package com.example.demo.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

  @Autowired
  private Storage storage;

  @GetMapping("/files")
  public List<String> getFileNames() {
    return storage.fileNames();
  }

}
