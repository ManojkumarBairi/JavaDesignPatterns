package structural2.decorator.example1.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}