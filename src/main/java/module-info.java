module com.mycompany.practicafxmongodb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.practicafxmongodb to javafx.fxml;
    exports com.mycompany.practicafxmongodb;
}
