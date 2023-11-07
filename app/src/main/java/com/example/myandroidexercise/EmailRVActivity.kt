package com.example.myandroidexercise

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmailRVActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email_recycler_view)

        val items = arrayListOf<EmailModel>(
            EmailModel("Tester01", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester02", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester03", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester04", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester05", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester06", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester07", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester08", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester09", "This is a test email","Just test email.Enter something here"),
            EmailModel("Tester10", "This is a test email","Just test email.Enter something here"),
        )

        val adapter = RVEmailItemAdapter(items)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        findViewById<Button>(R.id.button_add).setOnClickListener {
            items.add(0, EmailModel("Somebody", "New email", "Check add new Email"))
            adapter.notifyItemInserted(0)
            recyclerView.scrollToPosition(0)
        }

        findViewById<Button>(R.id.button_remove).setOnClickListener {
            items.removeAt(0)
            adapter.notifyItemRemoved(0)
        }

        /*findViewById<Button>(R.id.button_update).setOnClickListener {
            items[0].caption = "Updated Item"
            adapter.notifyItemChanged(0)
        }*/
    }
}