package model.repository;

import java.io.*;
import java.util.Properties;

import model.entity.Config;
import model.service.IConfig;

public class ConfigRepository implements IConfig {
    private final String pathConfig = "src/fileConfig/config.properties";
    private final File f = new File(pathConfig);

    @Override
    public void readFileConfig() {
        Properties pr = new Properties();
        if (f.exists()) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                pr.load(br);
                Config config = new Config(pr.getProperty("COPY_PATH"), pr.getProperty("DATA_TYPE"),
                        pr.getProperty("PATH"));

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            createFileConfig();
            readFileConfig();
        }

    }

    @Override
    public void createFileConfig() {
        Properties pr = new Properties();
        FileOutputStream fos = null;
        Config config = createConfig();
        try {
            fos = new FileOutputStream(pathConfig);
            pr.setProperty("COPY_FOLDER", config.getCopy_folder());
            pr.setProperty("DATA_TYPE", config.getData_type());
            pr.setProperty("PATH", config.getPath());
            pr.store(fos, null);
            System.out.println("Create File");
        } catch (Exception e) {
            System.out.println("Cannot create config file");
            System.out.println("System shutdown");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    System.out.println("File cannot create");
                    System.out.println("System shutdown");
                }
            }
        }
    }

    @Override
    public boolean checkConfig(Config config) {
        if (config.getCopy_folder().isEmpty()) {
            System.out.println("Folder Source is not input");
        }
        if (config.getData_type().isEmpty()) {
            System.out.println("Data type is not input");
        }
        if (config.getPath().isEmpty()) {
            System.out.println("Folder Destination is not input");
        }
        return config.getCopy_folder().isEmpty()
                && config.getData_type().isEmpty()
                && config.getPath().isEmpty();
    }

    @Override
    public void copyFolder(Config config) {
        File sourceFolder = new File(config.getCopy_folder());
        File dest = new File(config.getPath());
        if (checkFolder(sourceFolder, dest)) {
            File[] listOfFiles = sourceFolder.listFiles();

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    copyFile(config.getCopy_folder() + "\\" + listOfFiles[i].getName(), config.getPath());
                    System.out.println("File name: " + listOfFiles[i].getName());
                }
            }
        } else {
            System.err.println("System shutdown");
        }
    }

    public Config createConfig() {
        String copyFolder = "COPY_PATH";
        String dataType = "DATA_TYPE";
        String path = "PATH";
        Config config = new Config(copyFolder, dataType, path);
        return config;
    }

    public boolean checkFolder(File source, File dest) {
        if (!source.exists() || !dest.isDirectory()) {
            System.err.println("Can't find folder Source");
        }
        if (!dest.exists() || !dest.isDirectory()) {
            System.err.println("Can't make folder Destination");
        }
        return source.exists() && source.isDirectory()
                && dest.exists() && dest.isDirectory();
    }

    public void copyFile(String file, String folder) {
        File f1 = new File(file);
        File f2 = new File(folder);
        if (f1.exists() && f1.isFile() && f2.exists() && f2.isDirectory()) {
            try {
                FileInputStream fis = new FileInputStream(f1);
                FileOutputStream fos = new FileOutputStream(folder + "/" + f1.getName());
                int b;
                while ((b = fis.read()) != -1) {
                    fos.write(b);
                }
                fis.close();
                fos.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
