package com.example.ecommerceapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();
        loadDummyProducts();

        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
    }

    private void loadDummyProducts() {
        productList.add(new Product("1", "Smartphone", "Latest model smartphone", 699.99, android.R.drawable.ic_menu_camera));
        productList.add(new Product("2", "Laptop", "High performance laptop", 1299.99, android.R.drawable.ic_menu_compass));
        productList.add(new Product("3", "Headphones", "Noise cancelling headphones", 199.99, android.R.drawable.ic_menu_gallery));
        productList.add(new Product("4", "Smartwatch", "Waterproof smartwatch", 299.99, android.R.drawable.ic_menu_manage));
        productList.add(new Product("5", "Camera", "Digital SLR camera", 499.99, android.R.drawable.ic_menu_camera));
    }
}
