package com.github.ricardosbarbosa.tourguide.model;

import android.content.Context;

import com.github.ricardosbarbosa.tourguide.R;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    private static Lists instance;
    public final List<Location> MUSEUS = new ArrayList<Location>();
    public final List<Location> PARQUES = new ArrayList<Location>();
    public final List<Location> CHURCHES = new ArrayList<Location>();
    public  final List<Location> HISTORICALS = new ArrayList<Location>();

    private Lists(Context context) {
        addMuseusLocations(context);
        addParquesLocations(context);
        addChurchesLocations(context);
        addHistoricalLocations(context);
    }

    public static Lists getInstance(Context context) {
        if (instance == null)
            instance = new Lists(context);
        return instance;
    }

    private void addMuseusLocations(Context context) {
        MUSEUS.add(new Location(context.getString(R.string.museu1), null));
        MUSEUS.add(new Location(context.getString(R.string.museu2), null));
        MUSEUS.add(new Location(context.getString(R.string.museu3), null));
        MUSEUS.add(new Location(context.getString(R.string.museu4), null));
        MUSEUS.add(new Location(context.getString(R.string.museu5), null));
        MUSEUS.add(new Location(context.getString(R.string.museu6), null));
        MUSEUS.add(new Location(context.getString(R.string.museu7), null));
        MUSEUS.add(new Location(context.getString(R.string.museu8), null));
        MUSEUS.add(new Location(context.getString(R.string.museu9), null));
        MUSEUS.add(new Location(context.getString(R.string.museu10), null));
        MUSEUS.add(new Location(context.getString(R.string.museu11), null));
        MUSEUS.add(new Location(context.getString(R.string.museu12), null));
        MUSEUS.add(new Location(context.getString(R.string.museu13), null));
        MUSEUS.add(new Location(context.getString(R.string.museu14), null));
    }

    private void addParquesLocations(Context context) {
        PARQUES.add(new Location(context.getString(R.string.parque1), null));
        PARQUES.add(new Location(context.getString(R.string.parque2), null));
        PARQUES.add(new Location(context.getString(R.string.parque3), null));
        PARQUES.add(new Location(context.getString(R.string.parque4), null));
        PARQUES.add(new Location(context.getString(R.string.parque5), null));
    }

    private void addChurchesLocations(Context context) {
        CHURCHES.add(new Location(context.getString(R.string.igreja1), R.drawable.igreja));
        CHURCHES.add(new Location(context.getString(R.string.igreja2), null));
        CHURCHES.add(new Location(context.getString(R.string.igreja3), null));
        CHURCHES.add(new Location(context.getString(R.string.igreja4), null));
    }

    private void addHistoricalLocations(Context context) {
        HISTORICALS.add(new Location(context.getString(R.string.historical1), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical2), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical3), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical4), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical5), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical6), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical7), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical8), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical9), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical10), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical11), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical12), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical13), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical14), null));
        HISTORICALS.add(new Location(context.getString(R.string.historical15), null));
    }
}
