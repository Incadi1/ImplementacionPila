package Control;

import Data.Persona;
import Model.Pila;
import Vista.Tools;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class FXMLDocumentController implements Initializable {


    @FXML
    private WebView WebVie;

    @FXML
    private MenuBar MenuB;
    
    @FXML
    private WebEngine engine;

    Pila<Persona> Personas;

    
    @FXML
    void Cerrar(ActionEvent event) {
        Platform.exit();
    }
   
    
    @FXML 
    void Agregar(ActionEvent event){
        
        Persona ObjP = new Persona();
        Personas.apilar(ObjP);
        engine.loadContent(Tools.convertirPilaAHtml(Personas));

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Personas = new Pila<>();
        engine = WebVie.getEngine();
        engine.loadContent(Tools.convertirPilaAHtml(new Pila<>()));
    }

    //webviwe deja cargar archivos html 
}
