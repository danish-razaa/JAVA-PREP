import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileWatcherSystem {

    static class FileWatcher extends Thread {

        private String sourceDir;
        private String destinationDir;
        private String[] extensions;

        public FileWatcher(String sourceDir,
                           String destinationDir,
                           String... extensions) {
            this.sourceDir = sourceDir;
            this.destinationDir = destinationDir;
            this.extensions = extensions;
        }

        @Override
        public void run() {

            long startTime = System.currentTimeMillis();
            long duration = 24 * 60 * 60 * 1000L; // 24 hours

            while (System.currentTimeMillis() - startTime < duration) {

                File folder = new File(sourceDir);
                File[] files = folder.listFiles();

                if (files != null) {

                    for (File file : files) {

                        String fileName = file.getName().toLowerCase();

                        for (String extension : extensions) {

                            if (fileName.endsWith(extension)) {

                                try {

                                    File destinationFile =
                                            new File(destinationDir,
                                                    file.getName());

                                    Files.move(
                                            file.toPath(),
                                            destinationFile.toPath(),
                                            StandardCopyOption.REPLACE_EXISTING);

                                    System.out.println(
                                            Thread.currentThread().getName()
                                                    + " moved "
                                                    + file.getName());

                                } catch (IOException e) {
                                    System.out.println(
                                            "Error moving file: "
                                                    + file.getName());
                                    e.printStackTrace();
                                }

                                break;
                            }
                        }
                    }
                }

                try {
                    Thread.sleep(10000); // 10 seconds
                } catch (InterruptedException e) {
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " interrupted.");
                    break;
                }
            }

            System.out.println(
                    Thread.currentThread().getName()
                            + " stopped.");
        }
    }

    public static void main(String[] args) {

        String destinationDir = "destination_dir";

        FileWatcher imageWatcher =
                new FileWatcher(
                        "source_dir",
                        destinationDir,
                        ".jpg",
                        ".gif");

        FileWatcher textWatcher =
                new FileWatcher(
                        "source_dir_1",
                        destinationDir,
                        ".txt");

        imageWatcher.setName("ImageWatcher");
        textWatcher.setName("TextWatcher");

        imageWatcher.start();
        textWatcher.start();

        System.out.println("Both watcher threads started...");
    }
}