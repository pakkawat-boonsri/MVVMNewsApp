package com.rozerrose.mvvmnewsapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rozerrose.mvvmnewsapp.databinding.ItemsArticlePreviewBinding
import com.rozerrose.mvvmnewsapp.models.Article

class NewsAdapter(

) : RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(val binding: ItemsArticlePreviewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindArticle(article: Article) {
            Glide.with(binding.root).load(article.urlToImage).into(binding.ivArticleImage)
            binding.tvDescription.text = article.description
            binding.tvTitle.text = article.title
            binding.tvPublishedAt.text = article.publishedAt
            binding.tvSource.text = article.source.name
            setOnItemClickListener {
                onItemClickListener?.let { it(article) }
            }
        }
    }

    private val differCallBack = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }

    }

    private val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ItemsArticlePreviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ArticleViewHolder(
            binding
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = differ.currentList[position]
        holder.bindArticle(article)


    }

    private var onItemClickListener: ((Article) -> Unit)? = null

    fun setOnItemClickListener(listener: (Article) -> Unit) {
        onItemClickListener = listener
    }
}