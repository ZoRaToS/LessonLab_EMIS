module com.emis.lessonlab_emis {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            
    opens com.emis.lessonlab_emis to javafx.fxml;
    exports com.emis.lessonlab_emis;
}