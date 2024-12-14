package com.example.criticalthinkingfiveimagegallery
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

// Adapter class for RecyclerView that binds a list of images to the grid
class PhotoGridAdapter(private val images: List<Int>) : RecyclerView.Adapter<PhotoGridAdapter.PhotoViewHolder>() {

    // ViewHolder class holds a reference to each grid cell's ImageView
    class PhotoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView) // Reference to ImageView in item layout
    }

    // Called when RecyclerView needs a new ViewHolder to represent an item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_photo, parent, false)
        return PhotoViewHolder(view) // Inflate the item layout and create a ViewHolder
    }

    // Binds data (an image resource) to the ImageView for the current position
    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.imageView.setImageResource(images[position]) // Set the image for the current position
    }

    // Returns the total number of images in the list
    override fun getItemCount(): Int {
        return images.size
    }
}