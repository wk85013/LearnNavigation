package ute.com.learnnavigation

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_page3.*


class Page3Fragment : Fragment() {
    val TAG = Page3Fragment::class.java.simpleName
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, ": onViewCreated");
        //接收數值 方法2
        val args: NavGraphPage3Args by navArgs()
        val amount = args.amount
        Log.i(TAG, "amount: " + amount);


        //点击返回page2
        button1.setOnClickListener { Navigation.findNavController(it).navigateUp() }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.i(TAG, ": onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page3, container, false)
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
