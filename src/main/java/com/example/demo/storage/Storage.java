package com.example.demo.storage;

import java.io.InputStream;
import java.util.List;

public interface Storage {

  void addFile(InputStream inputStream);

  void deleteFile(String fileName);

  List<InputStream> getFiles();

  InputStream getFile(String name);

  List<String> fileNames();
}
