package com.ubicapp.util.gps.service;
import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by BrijD on 14-12-22. http://stackoverflow.com/questions/25376051/service-to-send-gps-coordinates-to-server
 */


public class LocServ extends Service implements LocationListener {

    private static String url_insert_location = "http://172.20.10.4/testing/insert.php";
    public static String LOG = "Log";

    //JSONParser jsonParser = new JSONParser();

    private final Context mContext;

    // flag for GPS status
    boolean isGPSEnabled = false;

    // flag for network status
    boolean isNetworkEnabled = false;

    // flag for GPS status
    boolean canGetLocation = false;

    Location location; // location
    double latitude; // latitude
    double longitude; // longitude

    // The minimum distance to change Updates in meters
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 0; // 0 meters

    // The minimum time between updates in milliseconds
    private static final long MIN_TIME_BW_UPDATES = 1000 ; // 1 second

    // Declaring a Location Manager
    protected LocationManager locationManager;


    public LocServ(Context context){
        this.mContext = context;
    }

    public LocServ(){
        super();
        mContext = LocServ.this;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_SHORT).show();
        Log.i(LOG, "Service started");
        Log.i("asd", "This is sparta");

        new SendToServer().execute(Double.toString(getLocation().getLongitude()),Double.toString(getLocation().getLatitude()));

        return START_STICKY;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(LOG, "Service created");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(LOG, "Service destroyed");
    }

    class SendToServer extends AsyncTask<String,String,String> {


        @Override
        protected String doInBackground(String... la ) {

            try {

                Log.i("string" , la[0]);
                String longi = la[0];
                String lati = la[1];

                // Building Parameters
                Log.d("value", lati);
                Log.d("value", longi);
                ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
                params.add(new BasicNameValuePair("longitude", longi));
                params.add(new BasicNameValuePair("latitude", lati));

                // getting JSON Object
                // Note that create product url accepts POST method

                //JSONObject json = jsonParser.makeHttpRequest(url_insert_location, "POST", params);
                //Log.d("Create Response", json.toString());

            } catch (Exception e) {
                Log.i("error", e.toString());
            }

            return "call";
        }



    }


    public Location getLocation () {
             try {
                 locationManager = (LocationManager) mContext
                         .getSystemService(LOCATION_SERVICE);

                 // getting GPS status
                 isGPSEnabled = locationManager
                         .isProviderEnabled(LocationManager.GPS_PROVIDER);

                 // getting network status
                 isNetworkEnabled = locationManager
                         .isProviderEnabled(LocationManager.NETWORK_PROVIDER);

                 if (!isGPSEnabled && !isNetworkEnabled) {
                     // no network provider is enabled
                 } else {
                     this.canGetLocation = true;
                     if (isNetworkEnabled) {
                      //updates will be send according to these arguments
                         locationManager.requestLocationUpdates(
                                 LocationManager.NETWORK_PROVIDER,
                                 MIN_TIME_BW_UPDATES,
                                 MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                         Log.d("Network", "Network");
                         if (locationManager != null) {
                             location = locationManager
                                     .getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                             if (location != null) {
                                 latitude = location.getLatitude();
                                 longitude = location.getLongitude();
                             }
                         }
                     }
                     // if GPS Enabled get lat/long using GPS Services
                     if (isGPSEnabled) {
                         if (location == null) {
                             locationManager.requestLocationUpdates(
                                     LocationManager.GPS_PROVIDER,
                                     MIN_TIME_BW_UPDATES,
                                     MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                             Log.d("GPS Enabled", "GPS Enabled");
                             if (locationManager != null) {
                                 location = locationManager
                                         .getLastKnownLocation(LocationManager.GPS_PROVIDER);
                                 if (location != null) {
                                     latitude = location.getLatitude();
                                     longitude = location.getLongitude();
                                 }
                             }
                         }
                     }
                 }

             } catch (Exception e) {
                 e.printStackTrace();
             }
             return location;
         }




    @Override
    public void onLocationChanged(Location location) {
//this will be called every second
        new SendToServer().execute(Double.toString(getLocation().getLongitude()),Double.toString(getLocation().getLatitude()));


    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

}