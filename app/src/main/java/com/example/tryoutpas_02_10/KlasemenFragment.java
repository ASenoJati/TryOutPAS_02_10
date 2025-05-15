package com.example.tryoutpas_02_10;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class KlasemenFragment extends Fragment {
    RecyclerView rvKlasemen;
    ProgressBar pbLoading1;
    KlasemenAdapter klasemenAdapter;
    View layoutHeader;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_klasemen, container, false);

        rvKlasemen = view.findViewById(R.id.rvKlasemen);
        pbLoading1 = view.findViewById(R.id.pbLoading1);
        rvKlasemen.setLayoutManager(new LinearLayoutManager(getContext()));
        layoutHeader = view.findViewById(R.id.layoutHeader);

        SoccerAPI api = RetrofitClient.getInstance().create(SoccerAPI.class);
        fetchKlasemen(api);

        return view;
    }

    private void fetchKlasemen(SoccerAPI api) {
        api.getKlasemenLaliga("Klasemen").enqueue(new Callback<KlasemenResponse>() {
            @Override
            public void onResponse(Call<KlasemenResponse> call, Response<KlasemenResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<KlasemenModel> klasemen = response.body().getKlasemenLaliga();
                    klasemenAdapter = new KlasemenAdapter(klasemen);
                    rvKlasemen.setAdapter(klasemenAdapter);
                    layoutHeader.setVisibility(View.VISIBLE);
                    rvKlasemen.setVisibility(View.VISIBLE);
                    pbLoading1.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<KlasemenResponse> call, Throwable t) {
                Log.e("API_ERROR", t.getMessage());
            }
        });
    }
}
