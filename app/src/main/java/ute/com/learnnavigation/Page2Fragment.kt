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
        Log.i(TAG, ": onViewCreated");
        //接收數值 方法1
        var intentString = arguments!!.getString("b")
        Log.i(TAG, "b: " + intentString);

        button1.setOnClickListener {
            //点击跳转page2
            Navigation.findNavController(it).navigateUp()
        }

        //方法2 使用SafeArgs傳參數
        val action = Page2FragmentDirections.actionPage3(3345678)


        button2.setOnClickListener {
            //点击跳转page3
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG, ": onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page2, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i(TAG, ": onAttach");
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, ": onCreate");
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, ": onPause");
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, ": onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, ": onResume");
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG, ": onDetach");
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG, ": onDestroyView");
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, ": onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, ": onDestroy");
    }


}
