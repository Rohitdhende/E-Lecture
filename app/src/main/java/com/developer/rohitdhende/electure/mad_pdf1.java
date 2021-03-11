package com.developer.rohitdhende.electure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class mad_pdf1 extends AppCompatActivity {
    PDFView pdfView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_pdf1);


        pdfView1 = (PDFView) findViewById(R.id.mad_pdf1);
        pdfView1.fromAsset("MAD1.pdf").load();
    }
}