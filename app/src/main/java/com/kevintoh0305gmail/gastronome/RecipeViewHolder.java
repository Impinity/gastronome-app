package com.kevintoh0305gmail.gastronome;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeViewHolder extends RecyclerView.ViewHolder{

    public WebView wv;
    public TextView txtTitle;
    public TextView txtShortDesc;
    public View view;
    public Button btnPrepTime;
    public Button btnDifficulty;
    public Button btnMealType;
    public ImageView imgRecipe;
    private Context context;

    public RecipeViewHolder(View v, Context c)
    {
        super(v);
        view = v;
        txtTitle = v.findViewById(R.id.txtTitle);
        txtShortDesc = v.findViewById(R.id.txtShortDesc);
        btnPrepTime = v.findViewById(R.id.btnPrepTimeTag);
        btnMealType = v.findViewById(R.id.btnMealTypeTag);
        btnDifficulty = v.findViewById(R.id.btnDifficultyTag);
        imgRecipe = v.findViewById(R.id.imgIndex);
        context = c;
    }
}
