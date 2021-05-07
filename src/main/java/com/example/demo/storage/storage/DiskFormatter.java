package com.example.demo.storage.storage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("disk_storage")
public class DiskFormatter {
}
