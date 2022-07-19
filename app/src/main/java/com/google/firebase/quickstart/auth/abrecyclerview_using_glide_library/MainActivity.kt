package com.google.firebase.quickstart.auth.abrecyclerview_using_glide_library
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.quickstart.auth.abrecyclerview_using_glide_library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var recyclerView: RecyclerView? = null
    var Manager: GridLayoutManager? = null
    var adapter: RecyclerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        recyclerView = findViewById<View>(R.id.rv_design) as RecyclerView
        Manager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = Manager
        adapter = RecyclerAdapter(this@MainActivity)
        recyclerView!!.adapter = adapter
    }

}