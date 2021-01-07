package files;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class PathWatcher {
  static Path test = Paths.get("src", "test");

  static void delTxtFiles() {
    try {
      Files.walk(test)
              .filter(f -> f.toString()
                      .endsWith(".txt"))
              .forEach(f -> {
                try {
                  System.out.println("deleting " + f);
                  Files.delete(f);
                } catch (IOException e) {
                  throw new RuntimeException(e);
                }
              });
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
    Directories.refreshTestDir();
    Directories.populateTestDir();
    Files.createFile(test.resolve("Hello.txt"));
    WatchService watcher = FileSystems.getDefault().newWatchService();
    test.register(watcher, StandardWatchEventKinds.ENTRY_DELETE);
    Executors.newSingleThreadScheduledExecutor()
            .schedule(PathWatcher::delTxtFiles,
                    250,
                    TimeUnit.MILLISECONDS);
    WatchKey key = watcher.take();
    for (WatchEvent<?> event : key.pollEvents()) {
      System.out.println(" event.context(): " + event.context()
              + "\n event.count(): " + event.count()
              + "\n event.kind(): " + event.kind());
      System.exit(0);

    }
  }
}
