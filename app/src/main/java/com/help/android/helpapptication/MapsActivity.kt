package com.help.android.helpapptication

import android.app.Application
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.*

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.charset.Charset
import java.sql.Struct
import java.util.concurrent.TimeUnit

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var placeList: MutableList<Place>
    lateinit var placeButton: Button
    lateinit var fDialog: Dialog
    lateinit var pList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        placeList = mutableListOf<Place>()
        placeList = readData()
        fDialog = Dialog(this)
        placeButton = findViewById(R.id.buttonList)
        placeButton.setOnClickListener{
            showList(this.findViewById(android.R.id.content), placeList)
        }

//        System.out.print(placeList.toString())

    }

    private fun showList(view: View, placeList: MutableList<Place>) {
        fDialog.setContentView(R.layout.activity_places)
        pList = fDialog.findViewById(R.id.placeList)
        val adapter = MyListAdapter(this, R.layout.activity_place_view, placeList )
        pList.adapter = adapter
        fDialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        fDialog.show()

    }

    private fun readData(): MutableList<Place> {
        placeList = mutableListOf<Place>()
        val inputStream = resources.openRawResource(R.raw.help)
        val reader = BufferedReader(InputStreamReader(inputStream, Charset.forName("UTF-8")))
        reader.readLine()
        reader.useLines { lines -> lines.forEach {
           val tokens = it.split(";")
           placeList.add(Place(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5].toBoolean(), tokens[6].toBoolean(), tokens[6].toBoolean(), tokens[7].toBoolean(), tokens[8]))
//           Log.d("MyActivity", "Just createt: "+ placeList)

        }
       }
        return placeList
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
    }

    private class MyListAdapter(context: Context, var resource: Int, var objects: MutableList<Place>) : ArrayAdapter<Place>(context, resource, objects) {

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val layoutInflater: LayoutInflater = LayoutInflater.from(context)
            val view: View = layoutInflater.inflate(resource, null)

            val name: TextView = view.findViewById(R.id.pName)
            val address: TextView = view.findViewById(R.id.pAddress)
            val hours: TextView = view.findViewById(R.id.pHours)
            val form: TextView = view.findViewById(R.id.pForm)
            val telephone: TextView = view.findViewById(R.id.pTelephone)
            val inormation: TextView = view.findViewById(R.id.pInformation)

            name.text = objects[position].nazwa
            address.text = objects[position].adres
            hours.text = objects[position].godzinY_OTWARCIA
            form.text = objects[position].formA_POMOCY_OPIS
            telephone.text = objects[position].telefon
            inormation.text = objects[position].informacja
//            name.text = objects[position]

            return view
        }
    }
}
