package com.example.examendi_2ev;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder>{

    private ArrayList<Book> items;
    public BookAdapter(ArrayList<Book> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = items.get(position);
        holder.textAuthor.setText(book.getTitulo());
        holder.textAuthor.setText(book.getAutor());
        holder.textPrecio.setText((int) book.getPrecio());
        holder.imagen.setImageResource(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt("bookId", v.getId());

                NavController navController = Navigation.findNavController(v);

                navController.navigate(R.id.titulo,bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class BookViewHolder extends RecyclerView.ViewHolder {
        TextView textTitle;
        TextView textPrecio;
        TextView textAuthor;

        ImageView imagen;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.titulo);
            textAuthor = itemView.findViewById(R.id.autor);
            textPrecio = itemView.findViewById(R.id.precio);
            imagen = itemView.findViewById(R.id.portada);
        }
    }
}

