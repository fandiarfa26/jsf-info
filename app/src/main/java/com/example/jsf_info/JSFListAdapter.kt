package com.example.jsf_info

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.arch.core.executor.DefaultTaskExecutor
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import layout.JSFrameworks

class JSFListAdapter (private val listJSF: ArrayList<JSFrameworks>) : RecyclerView.Adapter<JSFListAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_jsf, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listJSF.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, developer, initial_release, current_version, description, url, logo) = listJSF[position]

        holder.tvName.text = name
        holder.tvCurrVer.text = current_version

        Glide.with(holder.itemView.context)
            .load(logo)
            .apply(RequestOptions())
            .into(holder.imgLogo)

        val contextJSF = holder.itemView.context

        holder.itemView.setOnClickListener {
            val detailJSF = Intent(contextJSF, Detail::class.java)
            detailJSF.putExtra(Detail.EXTRA_NAME, name)
            detailJSF.putExtra(Detail.EXTRA_DEVELOPER, developer)
            detailJSF.putExtra(Detail.EXTRA_RELEASE, initial_release)
            detailJSF.putExtra(Detail.EXTRA_VERSION, current_version)
            detailJSF.putExtra(Detail.EXTRA_DESCRIPTION, description)
            detailJSF.putExtra(Detail.EXTRA_URL, url)
            detailJSF.putExtra(Detail.EXTRA_LOGO, logo)
            contextJSF.startActivity(detailJSF)
        }

    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCurrVer: TextView = itemView.findViewById(R.id.tv_item_current_version)
        var imgLogo: ImageView = itemView.findViewById(R.id.img_item_logo)
    }
}