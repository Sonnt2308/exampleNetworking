package com.example.jsonparser;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import okhttp3.Response;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private static final String URL_DATA = "http://www.dotplays.com/de1";
    private RecyclerView.Adapter adapter;

    private List<ListItem> ListItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListItem = new ArrayList<>();

        loadRecyclerViewData();

        loadRecyclerViewData();
    }

    private void loadRecyclerViewData() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Data...");
        progressDialog.show();


//
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL_DATA,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        progressDialog.dismiss();
//                        try {
//                            JSONObject jsonObject = new JSONObject(response);
//                            JSONArray jsonArray = jsonObject.getJSONArray("JSON");
//
//                            for (int i=0; i<jsonArray.length();i++){
//                                JSONObject object = jsonArray.getJSONObject(i);
//                                ListItem listItem = new ListItem(
//                                        jsonObject.getString("id"),
//                                        jsonObject.getString("label")
//                                );
//                                ListItem.add(listItem);
//                            }
//
//                            adapter = new Myadapter(ListItem, getApplicationContext());
//                            recyclerView.setAdapter(adapter);
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        progressDialog.dismiss();
//                        Toast.makeText(getApplicationContext(), "LỖI", Toast.LENGTH_LONG).show();
//                    }
//                }
//        );
//        RequestQueue requestQueue = Volley.newRequestQueue(this);
//        requestQueue.add(stringRequest);

    }
}
