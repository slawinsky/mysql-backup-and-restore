module com.example.mysqlbackupandrestore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mysqlbackupandrestore to javafx.fxml;
    exports com.example.mysqlbackupandrestore;
}