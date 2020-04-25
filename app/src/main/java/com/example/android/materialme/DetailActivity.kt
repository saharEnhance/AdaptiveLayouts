/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.materialme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

/***
 * Detail Activity that is launched when a list item is clicked.
 * It shows more info on the sport.
 */
class DetailActivity : AppCompatActivity() {
    /**
     * Initializes the activity, filling in the data from the Intent.
     *
     * @param savedInstanceState Contains information about the saved state
     * of the activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Initialize the views.
        val sportsTitle = findViewById<TextView>(R.id.titleDetail)
        val sportsImage = findViewById<ImageView>(R.id.sportsImageDetail)

        // Set the text from the Intent extra.
        sportsTitle.text = intent.getStringExtra("title")

        // Load the image using the Glide library and the Intent extra.
        Glide.with(this)
                .load(intent
                        .getIntExtra("image_resource" , 0))
                .into(sportsImage)
    }
}