package com.example.demo.storage.distkstorage;

import com.example.demo.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


@Component
@Profile("disk_storage")
public class DiskStorageImpl implements Storage {

  @Autowired
  private DiskFormatter diskFormatter;

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
    return Arrays.asList("D:on1", "D:on2");
  }
}
