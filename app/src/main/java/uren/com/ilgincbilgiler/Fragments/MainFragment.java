package uren.com.ilgincbilgiler.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import butterknife.BindView;
import butterknife.ButterKnife;
import uren.com.ilgincbilgiler.GeneralUtils.AdMobUtils;
import uren.com.ilgincbilgiler.MainFragments.BaseFragment;
import uren.com.ilgincbilgiler.R;

public class MainFragment extends BaseFragment implements View.OnClickListener {

    View mView;


    @BindView(R.id.adView)
    AdView adView;
    @BindView(R.id.nestedSv)
    NestedScrollView nestedSv;


    public MainFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_main, container, false);
            ButterKnife.bind(this, mView);
            init();
            setImages();
            setShapes();
        }
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void init() {
        MobileAds.initialize(getContext(), getActivity().getResources().getString(R.string.ADMOB_APP_ID));
        AdMobUtils.loadBannerAd(adView);
    }

    private void setImages() {

        nestedSv.setBackgroundColor(getResources().getColor(R.color.Black, null));
    }

    private void setShapes() {

    }

    @Override
    public void onClick(View v) {

    }
}