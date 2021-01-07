package files;

import java.io.IOException;
import java.nio.file.*;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class PathAnalysis {
  static void say(String id,Object res){
    System.out.print(id + ": ");
    System.out.println(res);
  }

  public static void main(String[] args) throws IOException {
    System.out.println(System.getProperty("os.name"));
    Path p = Paths.get("src","main","java","files","PathAnalysis.java").toAbsolutePath();
    say("Exists",Files.exists(p));
    say("Directory",Files.isDirectory(p));
    say("Executable",Files.isExecutable(p));
    say("Readable",Files.isReadable(p));
    say("RegularFile",Files.isRegularFile(p));
    say("Writable",Files.isWritable(p));
    say("notExists",Files.notExists(p));
    say("Hidden",Files.isHidden(p));
    say("size",Files.size(p));
    say("FileStore",Files.getFileStore(p));
    say("LastModified",Files.getLastModifiedTime(p));
    say("Owner",Files.getOwner(p));
    say("ContentType",Files.probeContentType(p));
    say("SymbolicLink",Files.isSymbolicLink(p));
    if (Files.isSymbolicLink(p)) {
      say("SymbolicLink",Files.readSymbolicLink(p));
    }
    if (FileSystems.getDefault().supportedFileAttributeViews().contains("posix")) {
      say("PosixFilePermissions",
              Files.getPosixFilePermissions(p));
    }
  }
}
