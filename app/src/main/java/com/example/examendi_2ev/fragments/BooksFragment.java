package com.example.examendi_2ev.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examendi_2ev.Book;
import com.example.examendi_2ev.BookAdapter;
import com.example.examendi_2ev.R;

import java.util.ArrayList;

public class BooksFragment extends Fragment {

    private RecyclerView recyclerView;
    private BookAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayList<Book> items = new ArrayList<>();
        items.add(new Book(1, R.drawable.titulo1,"Maldita Roma","Santiago Posteguillo", 23.3F));
        items.add(new Book(2, R.drawable.titulo2,"El problema final","Arturo Perez", 33.3F));
        items.add(new Book(3, R.drawable.titulo3,"Clon de Kant","Miguel Noguera", 29.3F));
        items.add(new Book(4, R.drawable.titulo4,"Soy Afrodita","Nuria Marin", 217.3F));



        View root = inflater.inflate(R.layout.fragment_books, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new BookAdapter(items);
        recyclerView.setAdapter(adapter);
        return root;
    }
}
