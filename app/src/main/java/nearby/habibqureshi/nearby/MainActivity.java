package nearby.habibqureshi.nearby;

import android.content.Context;
import android.os.AsyncTask;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import nearby.habibqureshi.nearby.NearByJsonClasses.*;
public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
    GoogleMap map;
    private int PROXIMITY_RADIUS = 10000;
    static double longi=-33.87365,lat=151.20689;
    public static final CameraPosition SYDNEY =
            new CameraPosition.Builder().target(new LatLng(longi, lat))
                    .zoom(15.5f)
                    .bearing(0)
                    .tilt(25)
                    .build();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MultiDex.install(this);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sydney = new LatLng(longi, lat);
        this.map=googleMap;
        this.map.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Sydney"));
        this.map.moveCamera(CameraUpdateFactory.newCameraPosition(SYDNEY));
        String url=getUrl(longi,lat,"restaurant");
        M.l(url);
        new DownloadNearbyPlaces().execute(url);


    }
    public void DisplayNearBy(nearby nb){
        List<Result> list=nb.getResults();
        double lat,lng;
        for (int i = 0; i <list.size() ; i++) {
            lat=list.get(i).getGeometry().getLocation().getLat();
            lng=list.get(i).getGeometry().getLocation().getLng();
            this.map.addMarker(new MarkerOptions().position(new LatLng(lat,lng)).title(list.get(i).getName()));
        }
    }
    class DownloadNearbyPlaces extends AsyncTask<String,Void,Boolean> {
        nearby nb;
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
            if (aBoolean) {
                DisplayNearBy(nb);

            }
            else
            {
                M.t(MainActivity.this,"cant find near by");
            }
        }

        @Override
        protected Boolean doInBackground(String... params) {
            URL ulrn = null;
            try {
                ulrn = new URL(params[0]);
                HttpURLConnection con = (HttpURLConnection) ulrn.openConnection();
                InputStream is = con.getInputStream();
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(is));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                con.disconnect();
                Gson gson=new Gson();
                nb=gson.fromJson(response.toString(),nearby.class);
                M.l(nb.getStatus());
                if(nb.getStatus().equals("OK")) {
                    return true;
                }
                else
                   return false;



            } catch (Exception e){
                M.l(e.getMessage()+" exception");
            }

            return null;
        }
    }
    private String getUrl(double latitude, double longitude, String nearbyPlace) {

        StringBuilder googlePlacesUrl = new StringBuilder("https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
        googlePlacesUrl.append("location=" + latitude + "," + longitude);
        googlePlacesUrl.append("&radius=" + PROXIMITY_RADIUS);
        googlePlacesUrl.append("&type=" + nearbyPlace);
        googlePlacesUrl.append("&sensor=true");
        googlePlacesUrl.append("&key=" + "AIzaSyBdw1tqyPIS8csvk4qKMPynUc0EY3k9a_0");
        Log.d("getUrl", googlePlacesUrl.toString());
        return (googlePlacesUrl.toString());
    }


}
