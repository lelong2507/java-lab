package model.entity;

public class Config {
    private String copy_folder;
    private String data_type;
    private String path;

    public Config() {

    }

    public Config(String copy_folder, String data_type, String path) {
        this.copy_folder = copy_folder;
        this.data_type = data_type;
        this.path = path;
    }

    public String getCopy_folder() {
        return copy_folder;
    }

    public void setCopy_folder(String copy_folder) {
        this.copy_folder = copy_folder;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
