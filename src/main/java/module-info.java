module com.mycompany.practicafxmongodb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires mongo.java.driver;
    
    opens com.mycompany.practicafxmongodb to javafx.fxml;
    exports com.mycompany.practicafxmongodb;
}
