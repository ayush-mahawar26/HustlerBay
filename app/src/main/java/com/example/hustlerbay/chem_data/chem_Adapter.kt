package com.example.hustlerbay.chem_data

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.RecyclerView
import com.example.hustlerbay.R


// custom adapter
class chem_Adapter(val context: Context, val chapterName: List<chapterName>):
    RecyclerView.Adapter<chem_Adapter.chapterChemVH>() {

    inner class chapterChemVH(itemView: View):RecyclerView.ViewHolder(itemView){
        var currentN : chapterName? = null
        var currentPos :Int = 0
        fun getVedio(url : String){
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(context, Uri.parse(url))
        }
        init {
            itemView.setOnClickListener{
                if(currentN!!.name == "Solid State"){
                    getVedio("https://www.youtube.com/watch?v=zw3HDvoCONU")
                }else if(currentN!!.name == "Solution"){
                    getVedio("https://www.youtube.com/watch?v=bi4CbK37m4s")
                }else if(currentN!!.name == "ElectroChemistry"){
                    getVedio("https://youtube.com/playlist?list=PLKKfKV1b9e8pUkWwi4seD5MAfsO0Ii29a")
                }else if(currentN!!.name == "Chemical Kinetic"){
                    getVedio("https://www.youtube.com/watch?v=CT2SRwC-914")
                }else if(currentN!!.name == "Surface Chemistry"){
                    getVedio("https://www.youtube.com/watch?v=sGtO_GGBVvM")
                }else if(currentN!!.name == "Co-Ordinate Compound"){
                    getVedio("https://www.youtube.com/watch?v=SJrkSRxZ3XU")
                }else if(currentN!!.name == "Organic(11th) - Conceptual"){
                    getVedio("https://youtube.com/playlist?list=PL00Y5uKs24eZ2OL9xdwBCDr-3hXE3-A-x")
                }else if(currentN!!.name == "Haloalkanes and Haloarenes"){
                    getVedio("https://youtube.com/playlist?list=PL-gEDY8mfKYehPS81MMi-7qEEsGOF58tf")
                }else if(currentN!!.name == "Alcohols, Phenols and Ethers"){
                    getVedio("https://youtube.com/playlist?list=PLGKb_Xib3OggwqZTsWLqG7Mpwi65GlPK5")
                }else if(currentN!!.name == "Amines"){
                    getVedio("https://www.youtube.com/watch?v=aI0qLGLR6G0")
                }else if(currentN!!.name == "Aldehydes, Ketones, and Carboxylic Acids"){
                    Toast.makeText(context , "Playlist Not Available Currently", Toast.LENGTH_SHORT).show()
                }
            }
        }

        fun setData(Cname: chapterName? , pos : Int) {
            itemView.findViewById<TextView>(R.id.chapterName).text = Cname!!.name
            this.currentN = Cname
            this.currentPos = pos
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chapterChemVH {
        val view = LayoutInflater.from(context).inflate(R.layout.chem_ele , parent , false)
        return chapterChemVH(view)
    }

    override fun onBindViewHolder(holder: chapterChemVH, position: Int) {
        val currentName= chapterName[position]
        holder.setData(currentName , position)
    }

    override fun getItemCount(): Int {
        return  chapterName.size
    }
}
