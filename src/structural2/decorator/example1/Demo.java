package structural2.decorator.example1;

import structural2.decorator.example1.decorators.*;
import structural2.decorator.example1.decorators.CompressionDecorator;
import structural2.decorator.example1.decorators.DataSource;
import structural2.decorator.example1.decorators.DataSourceDecorator;
import structural2.decorator.example1.decorators.EncryptionDecorator;
import structural2.decorator.example1.decorators.FileDataSource;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
