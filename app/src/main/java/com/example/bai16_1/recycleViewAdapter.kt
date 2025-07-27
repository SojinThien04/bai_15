package com.example.bai16_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class recycleViewAdapter(val ds:List<Outdata>):RecyclerView.Adapter<recycleViewAdapter.ViewHolderPhim>() {
    //class viewholder
    inner class ViewHolderPhim(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderPhim {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return ViewHolderPhim(view)
    }
//số phần tử cần hiển thị
    override fun getItemCount(): Int {
        return ds.size
    }

    override fun onBindViewHolder(holder: ViewHolderPhim, position: Int) {
        val img = holder.itemView.findViewById<ImageView>(R.id.imgPhim)
        val txtTenPhim = holder.itemView.findViewById<TextView>(R.id.txtTenPhim)
        val txtMieuTa = holder.itemView.findViewById<TextView>(R.id.txtMieuTa)

        img.setImageResource(ds[position].img)
        txtTenPhim.text = ds[position].name
        txtMieuTa.text = ds[position].mieuta

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Tên phim: ${ds[position].name}", Toast.LENGTH_SHORT).show()
        }
    }
}