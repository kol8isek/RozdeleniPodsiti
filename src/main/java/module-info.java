module cz.cernysps.rozdelenipodsiti {
    requires javafx.controls;
    requires javafx.fxml;


    opens cz.cernysps.rozdelenipodsiti to javafx.fxml;
    exports cz.cernysps.rozdelenipodsiti;
}