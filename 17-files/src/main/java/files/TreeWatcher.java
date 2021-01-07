package files;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.Executors;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class TreeWatcher {
  static void watchDir(Path dir){
    try {
      WatchService watcher =
              FileSystems.getDefault().newWatchService();
      dir.register(watcher, StandardWatchEventKinds.ENTRY_DELETE);
      Executors.newSingleThreadScheduledExecutor()
              .submit(()->{
                try {
                  WatchKey key = watcher.take();
                  for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println(" event.context(): " + event.context()
                            + "\n event.count(): " + event.count()
                            + "\n event.kind(): " + event.kind());
                    System.exit(0);
                  }
                } catch (InterruptedException e) {
                  return;
                }
              });
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) throws Exception {
    Directories.refreshTestDir();
    Directories.populateTestDir();
    Files.walk(Paths.get("src", "test"))
            .filter(Files::isDirectory)
            .forEach(TreeWatcher::watchDir);
    PathWatcher.delTxtFiles();
  }
}
