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
import android.widget.LinearLayout;
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

@SuppressLint("ValidFragment")
public class ItemContentFragment extends BaseFragment implements View.OnClickListener {

    View mView;

    @BindView(R.id.adView)
    AdView adView;

    @BindView(R.id.imgvMainItem)
    ImageView imgvMainItem;
    @BindView(R.id.textView)
    TextView textView;

    @BindView(R.id.imgvBack)
    ImageView imgvBack;
    @BindView(R.id.imgvForward)
    ImageView imgvForward;
    @BindView(R.id.randomButton)
    Button randomButton;

    private String type;
    private int itemIndex = 0;

    private String[] ITEM_INFO = new String[]{};
    ContentItemSet contentItemSet;
    private Random rand = new Random();

    private static final int INCREASE = 0;
    private static final int DECREASE = 1;

    public ItemContentFragment(String type) {
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
            mView = inflater.inflate(R.layout.fragment_item_content, container, false);
            ButterKnife.bind(this, mView);
            init();
            setContentItems();
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
        AdMobUtils.loadInterstitialAd(getContext());
        imgvBack.setOnClickListener(this);
        imgvForward.setOnClickListener(this);
        randomButton.setOnClickListener(this);
        contentItemSet = new ContentItemSet(type);
    }

    private void setContentItems() {
        Glide.with(getContext())
                .load(contentItemSet.getImageItemId())
                .apply(RequestOptions.fitCenterTransform())
                .into(imgvMainItem);
        ITEM_INFO = contentItemSet.getMessageBox();
        textView.setText(ITEM_INFO[itemIndex]);
    }

    private void setShapes() {
        imgvBack.setBackground(ShapeUtil.getShape(getResources().getColor(R.color.transparentBlack, null),
                getResources().getColor(R.color.White, null), GradientDrawable.OVAL, 50, 1));
        imgvForward.setBackground(ShapeUtil.getShape(getResources().getColor(R.color.transparentBlack, null),
                getResources().getColor(R.color.White, null), GradientDrawable.OVAL, 50, 1));
        randomButton.setBackground(ShapeUtil.getShape(getResources().getColor(R.color.transparentBlack, null),
                getResources().getColor(R.color.White, null), GradientDrawable.RECTANGLE, 20, 1));
    }

    private void setInfoMessage(int type) {

        if (type == INCREASE) {
            if (itemIndex == (ITEM_INFO.length - 1))
                itemIndex = 0;
            else
                itemIndex++;
        } else if (type == DECREASE) {
            if (itemIndex == 0)
                itemIndex = ITEM_INFO.length - 1;
            else
                itemIndex--;
        }

        textView.setText(ITEM_INFO[itemIndex]);
    }

    @Override
    public void onClick(View v) {

        if (v == imgvBack) {
            imgvBack.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.image_click));
            setInfoMessage(DECREASE);
        }

        if (v == imgvForward) {
            imgvForward.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.image_click));
            setInfoMessage(INCREASE);
        }

        if (v == randomButton) {
            randomButton.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.image_click));
            itemIndex = rand.nextInt(ITEM_INFO.length);
            textView.setText(ITEM_INFO[itemIndex]);
        }

    }
}