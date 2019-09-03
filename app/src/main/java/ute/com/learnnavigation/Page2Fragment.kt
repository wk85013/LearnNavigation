package ute.com.learnnavigation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_page2.*

class Page2Fragment : Fragment() {
    val TAG = Page2Fragment::class.java.simpleName

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        var intentString = arguments!!.getString("b")
        Log.i(TAG, "b: " + intentString);

        button1.setOnClickListener {
            //点击跳转page2
            Navigation.findNavController(it).navigateUp()
        }
        button2.setOnClickListener {
            //点击跳转page3
            Navigation.findNavController(it).navigate(R.id.action_page3)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false)
    }


}
