package com.example.notesdemo.Interface;

import androidx.cardview.widget.CardView;

import com.example.notesdemo.Model.Notes;


public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
