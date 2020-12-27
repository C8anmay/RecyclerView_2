package com.acm.recyclerview_2

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.acm.recyclerview_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        val view=bind.root
        setContentView(view)
        val itemList:ArrayList<Item_One> = ArrayList()
        itemList.add(Item_One(R.drawable.handbag,"Hyde Park","N14089","LOUIS VUITTON","****","9999.789 KS"))
        itemList.add(Item_One(R.drawable.hudi,"HUDI LONG","SLEEVE SHIRT","Lady Gaga","*****","5400 Ks"))
        itemList.add(Item_One(R.drawable.iphone,"iPhone12 Pro"," ","Apple","*****","1300000 Ks"))
        itemList.add(Item_One(R.drawable.shooe,"Shooe","S,M,L","Lica","****","20000 Ks"))
        val adapt=Adapter(itemList)

        bind.recyclerview1.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        bind.recyclerview1.adapter=adapt

        val itemList2:ArrayList<Item_Two> = ArrayList()
        itemList2.add(Item_Two("iphone 8 plus ", "Apple","****","900000 Ks","110000 Ks",R.drawable.iphone))
        itemList2.add(Item_Two("iphone 8 plus ", "Apple","****","900000 Ks","110000 Ks",R.drawable.hudi))
        itemList2.add(Item_Two("iphone 8 plus ", "Apple","****","900000 Ks","110000 Ks",R.drawable.handbag))
        itemList2.add(Item_Two("iphone 8 plus ", "Apple","****","900000 Ks","110000 Ks",R.drawable.iphone))
        itemList2.add(Item_Two("iphone 8 plus ", "Apple","****","900000 Ks","110000 Ks",R.drawable.iphone))
       val adapter2=Adapter2(itemList2)
        bind.recyclerview2.layoutManager=LinearLayoutManager(this)
        bind.recyclerview2.adapter=adapter2



    }
}