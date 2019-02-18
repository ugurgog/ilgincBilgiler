package uren.com.ilgincbilgiler.Fragments;


import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import uren.com.ilgincbilgiler.GeneralUtils.AdMobUtils;
import uren.com.ilgincbilgiler.GeneralUtils.ShapeUtil;
import uren.com.ilgincbilgiler.MainFragments.BaseFragment;
import uren.com.ilgincbilgiler.R;
import uren.com.ilgincbilgiler.Utils.ContentItemSet;

import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_DEEPWEB;

@SuppressLint("ValidFragment")
public class MultilineInfoFragment extends BaseFragment {

    View mView;

    @BindView(R.id.adView)
    AdView adView;
    @BindView(R.id.imgvMainItem)
    ImageView imgvMainItem;
    @BindView(R.id.textView)
    TextView textView;

    private String type;
    ContentItemSet contentItemSet;

    public MultilineInfoFragment(String type) {
        this.type = type;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_multiline_info, container, false);
            ButterKnife.bind(this, mView);
            init();
            setContentItems();
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
        AdMobUtils.loadInterstitialAd(getContext());
        contentItemSet = new ContentItemSet(getContext(), type);
    }

    private void setContentItems() {
        Glide.with(getContext())
                .load(contentItemSet.getImageItemId())
                .apply(RequestOptions.fitCenterTransform())
                .into(imgvMainItem);
        textView.setText(contentItemSet.readTextFile());
    }
}