package model.service;

import java.io.File;

import model.entity.Config;

public interface IConfig {
    void readFileConfig();

    void createFileConfig();

    boolean checkConfig(Config config);

    void copyFolder(Config config);

}
