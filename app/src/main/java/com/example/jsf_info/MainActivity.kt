package com.example.jsf_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import layout.JSF_Data
import layout.JSFrameworks

class MainActivity : AppCompatActivity() {

    private lateinit var rvJSF: RecyclerView
    private var list: ArrayList<JSFrameworks> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "Javascript Frameworks"


        rvJSF = findViewById(R.id.recyclerview_jsf)
        rvJSF.setHasFixedSize(true)

        list.addAll(JSF_Data.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setPage(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvJSF.layoutManager = LinearLayoutManager(this)
        val jsfListAdapter = JSFListAdapter(list)
        rvJSF.adapter = jsfListAdapter
    }

    private fun setPage(selectedPage: Int) {
        when (selectedPage) {
            R.id.action_toAbout -> {
                val pAbout = Intent(this@MainActivity, About::class.java)
                startActivity(pAbout)
            }
        }
    }
}
