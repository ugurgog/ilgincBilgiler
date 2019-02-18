package uren.com.ilgincbilgiler.Fragments;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import butterknife.BindView;
import butterknife.ButterKnife;
import uren.com.ilgincbilgiler.GeneralUtils.AdMobUtils;
import uren.com.ilgincbilgiler.GeneralUtils.ShapeUtil;
import uren.com.ilgincbilgiler.MainFragments.BaseFragment;
import uren.com.ilgincbilgiler.R;

public class MainFragment extends BaseFragment implements View.OnClickListener {

    View mView;


    @BindView(R.id.adView)
    AdView adView;

    @BindView(R.id.imgvUzay)
    ImageView imgvUzay;
    @BindView(R.id.imgvGelenekler)
    ImageView imgvGelenekler;
    @BindView(R.id.imgvHuman)
    ImageView imgvHuman;
    @BindView(R.id.imgvAnimal)
    ImageView imgvAnimal;
    @BindView(R.id.imgvDeepWeb)
    ImageView imgvDeepWeb;
    @BindView(R.id.imgvHistory)
    ImageView imgvHistory;
    @BindView(R.id.imgvBilim)
    ImageView imgvBilim;
    @BindView(R.id.imgvCinsellik)
    ImageView imgvCinsellik;
    @BindView(R.id.imgvDinler)
    ImageView imgvDinler;
    @BindView(R.id.imgvGenel)
    ImageView imgvGenel;

    @BindView(R.id.llUzay)
    LinearLayout llUzay;
    @BindView(R.id.llGelenekler)
    LinearLayout llGelenekler;
    @BindView(R.id.llHuman)
    LinearLayout llHuman;
    @BindView(R.id.llAnimal)
    LinearLayout llAnimal;
    @BindView(R.id.llDeepWeb)
    LinearLayout llDeepWeb;
    @BindView(R.id.llHistory)
    LinearLayout llHistory;
    @BindView(R.id.llBilim)
    LinearLayout llBilim;
    @BindView(R.id.llCinsellik)
    LinearLayout llCinsellik;
    @BindView(R.id.llDinler)
    LinearLayout llDinler;
    @BindView(R.id.llGenel)
    LinearLayout llGenel;

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

        llUzay.setOnClickListener(this);
        llGelenekler.setOnClickListener(this);
        llHuman.setOnClickListener(this);
        llAnimal.setOnClickListener(this);
        llDeepWeb.setOnClickListener(this);
        llHistory.setOnClickListener(this);
        llBilim.setOnClickListener(this);
        llCinsellik.setOnClickListener(this);
        llDinler.setOnClickListener(this);
        llGenel.setOnClickListener(this);
    }

    private void setImages() {
        setItemImage(R.drawable.space_bg, imgvUzay);
        setItemImage(R.drawable.traditional_bg, imgvGelenekler);
        setItemImage(R.drawable.human_bg, imgvHuman);
        setItemImage(R.drawable.animal_bg, imgvAnimal);
        setItemImage(R.drawable.deep_web_bg, imgvDeepWeb);
        setItemImage(R.drawable.history_bg, imgvHistory);
        setItemImage(R.drawable.science_bg, imgvBilim);
        setItemImage(R.drawable.sexuality_bg, imgvCinsellik);
        setItemImage(R.drawable.religion_bg, imgvDinler);
        setItemImage(R.drawable.general_bg, imgvGenel);
    }

    private void setItemImage(int itemId, ImageView imageView){
        Glide.with(getContext())
                .load(itemId)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView);
        imageView.setBackground(ShapeUtil.getShape(getResources().getColor(R.color.transparent, null),
                getResources().getColor(R.color.White, null), GradientDrawable.OVAL, 50, 2));
    }

    private void setShapes() {

    }

    @Override
    public void onClick(View v) {

        if (v == llUzay) {

        }

        if (v == llGelenekler) {

        }

        if (v == llHuman) {

        }

        if (v == llAnimal) {

        }

        if (v == llDeepWeb) {

        }

        if (v == llHistory) {

        }

        if (v == llBilim) {

        }

        if (v == llCinsellik) {

        }

        if (v == llDinler) {

        }

        if (v == llGenel) {

        }
    }
}