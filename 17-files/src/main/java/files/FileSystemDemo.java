package files;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class FileSystemDemo {
  static void show(String id,Object o){
    System.out.println(id + ": " + o);
  }

  public static void main(String[] args) {
    System.out.println(System.getProperty("os.name"));
    FileSystem fsys = FileSystems.getDefault();

    for (FileStore fileStore : fsys.getFileStores()) {
      show("File Store",fileStore);
    }
    for (Path path : fsys.getRootDirectories()) {
      show("Root Directory",path);
    }
    show("Separator",fsys.getSeparator());
    show("UserPrincipalLookupService",fsys.getUserPrincipalLookupService());
    show("isOpen",fsys.isOpen());
    show("isReadOnly",fsys.isReadOnly());
    show("FileSystemProvider",fsys.provider());
    show("File Attribute Views",
            fsys.supportedFileAttributeViews());
  }
}
