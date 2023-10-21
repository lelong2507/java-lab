package model;

public class Input {
    private String input;

    public Input() {

    }

    public Input(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "Input [input=" + input + "]";
    }

}