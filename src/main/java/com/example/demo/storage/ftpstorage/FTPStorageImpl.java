package com.example.demo.storage.ftpstorage;

import com.example.demo.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Component
@Profile("ftp_storage")
public class FTPStorageImpl implements Storage {

  @Autowired
  private FTPConnectionFactory ftpConnectionFactory;

  @Override
  public void addFile(InputStream inputStream) {

  }

  @Override
  public void deleteFile(String fileName) {

  }

  @Override
  public List<InputStream> getFiles() {
    return null;
  }

  @Override
  public InputStream getFile(String name) {
    return null;
  }

  @Override
  public List<String> fileNames() {
    return Arrays.asList("F:on1", "F:on2");
  }
}
