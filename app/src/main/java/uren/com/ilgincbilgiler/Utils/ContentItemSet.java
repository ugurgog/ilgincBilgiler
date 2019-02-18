package uren.com.ilgincbilgiler.Utils;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import uren.com.ilgincbilgiler.ContentClasses.Animal;
import uren.com.ilgincbilgiler.ContentClasses.Earth;
import uren.com.ilgincbilgiler.ContentClasses.General;
import uren.com.ilgincbilgiler.ContentClasses.History;
import uren.com.ilgincbilgiler.ContentClasses.Human;
import uren.com.ilgincbilgiler.ContentClasses.Religion;
import uren.com.ilgincbilgiler.ContentClasses.Science;
import uren.com.ilgincbilgiler.ContentClasses.Sexuality;
import uren.com.ilgincbilgiler.ContentClasses.Space;
import uren.com.ilgincbilgiler.R;

import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_ANIMAL;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_DEEPWEB;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_GENERAL;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_HISTORY;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_HUMAN;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_RELIGION;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_SCIENCE;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_SEXUALITY;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_SPACE;
import static uren.com.ilgincbilgiler.Constants.StringConstant.TYPE_TRADITION;

public class ContentItemSet {

    Context context;
    String type;

    public ContentItemSet(String type) {
        this.type = type;
    }

    public ContentItemSet(Context context, String type) {
        this.context = context;
        this.type = type;
    }

    public String[] getMessageBox() {
        switch (type) {
            case TYPE_SPACE:
                Space space = new Space();
                return space.getSPACE_INFO();
            case TYPE_TRADITION:
                Earth earth = new Earth();
                return earth.getEARTH_INFO();
            case TYPE_HUMAN:
                Human human = new Human();
                return human.getHUMAN_INFO();
            case TYPE_ANIMAL:
                Animal animal = new Animal();
                return animal.getANIMAL_INFO();
            case TYPE_HISTORY:
                History history = new History();
                return history.getHISTORY_INFO();
            case TYPE_SCIENCE:
                Science science = new Science();
                return science.getSCIENCE_INFO();
            case TYPE_SEXUALITY:
                Sexuality sexuality = new Sexuality();
                return sexuality.getSEXUALITY_INFO();
            case TYPE_RELIGION:
                Religion religion = new Religion();
                return religion.getRELIGION_INFO();
            case TYPE_GENERAL:
                General general = new General();
                return general.getGENERAL_INFO();
            case TYPE_DEEPWEB:

            default:
                return null;
        }
    }

    public int getImageItemId() {
        switch (type) {
            case TYPE_SPACE:
                return R.drawable.space_bg;
            case TYPE_TRADITION:
                return R.drawable.traditional_bg;
            case TYPE_HUMAN:
                return R.drawable.human_bg;
            case TYPE_DEEPWEB:
                return R.drawable.deep_web_bg;
            case TYPE_ANIMAL:
                return R.drawable.animal_bg;
            case TYPE_HISTORY:
                return R.drawable.history_bg;
            case TYPE_SCIENCE:
                return R.drawable.science_bg;
            case TYPE_SEXUALITY:
                return R.drawable.sexuality_bg;
            case TYPE_RELIGION:
                return R.drawable.religion_bg;
            case TYPE_GENERAL:
                return R.drawable.general_bg;
            default:
                return 0;
        }
    }

    public String readTextFile() {
        InputStream inputStream = context.getResources().openRawResource(getRawItemId());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outputStream.toString();
    }

    public int getRawItemId() {
        switch (type) {
            case TYPE_DEEPWEB:
                return R.raw.deep_web;
            default:
                return 0;
        }
    }
}
