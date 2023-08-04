package com.example.rsat;

import android.content.Context;
import android.content.Intent;

public class RsaTicket {
    public static void startTicket(Context context){
        Intent intent = new Intent(context,RSAActivity.class);
        context.startActivity(intent);
    }
}
