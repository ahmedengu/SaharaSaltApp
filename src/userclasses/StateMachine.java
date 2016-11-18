/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose
 * of building native mobile applications using Java.
 */


package userclasses;

import com.codename1.components.ToastBar;
import com.codename1.googlemaps.MapContainer;
import com.codename1.location.Location;
import com.codename1.location.LocationManager;
import com.codename1.maps.Coord;
import com.codename1.maps.providers.GoogleMapsProvider;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;
import generated.StateMachineBase;

import static com.codename1.ui.FontImage.createMaterial;

/**
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {
    private static Coord destCoord;
    private static int price;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }


    @Override
    protected void onMain_OrderAction(Component c, ActionEvent event) {
        price = Integer.parseInt((String) findComboBox().getSelectedItem());

        if (destCoord == null) {
            ToastBar.showErrorMessage("Choose dest");
            return;
        }
        if (findQuantity().getText().length() == 0) {
            ToastBar.showErrorMessage("add quntity");
            return;
        }
        if (price == 0) {
            ToastBar.showErrorMessage("Choose item");
            return;
        }
        int total = Integer.parseInt(findQuantity().getText()) * price;
        if (Dialog.show("confirm", "Total: " + total, "Ok", "Cancel")) {
            showForm("Pay", null);
        }
    }


    @Override
    protected void beforeMain(Form f) {
        MapContainer map = new MapContainer(new GoogleMapsProvider("AIzaSyAxlzXskkl3KKdjZUuFrV-j8oFjWOjtTIQ"));
        map.setRotateGestureEnabled(true);
        Location lastKnownLocation = LocationManager.getLocationManager().getLastKnownLocation();
        if (lastKnownLocation != null)
            destCoord = new Coord(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        map.zoom(destCoord, 5);
        if (!map.isNativeMaps())
            updateMarkers(map);
        map.setShowMyLocation(true);

        map.addTapListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                destCoord = map.getCoordAtPosition(evt.getX(), evt.getY());
                updateMarkers(map);
            }
        });
        findContainer(f).add(map);
    }

    private void updateMarkers(MapContainer map) {
        map.clearMapLayers();
        if (destCoord != null) {
            map.addMarker(RED_LOCATION_ICON(), destCoord, "Your Dest", "", null);
        }
    }

    public static EncodedImage RED_LOCATION_ICON() {
        Style s = new Style();
        s.setBgTransparency(0);
        s.setFgColor(0xFF0000);
        return createMaterial(FontImage.MATERIAL_LOCATION_ON, s).toEncodedImage();
    }


}