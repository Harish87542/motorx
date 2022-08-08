package com.example.login1.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.android.material.snackbar.Snackbar;

import java.io.File;
import java.text.DateFormatSymbols;


    public class Utils_java
    {
        public static final String FOLDER = "trolla";
        public static final String LOGIN_DONE = "login_done";
        public static final String CUST_NAME = "cust_name";
        public static final String USER_COMPANY_NAME = "company_name";
        public static final String USER_PIC = "user_pic";
        public static final String USER_TYPE = "user_type";
        public static final String USER_NAME = "user_name";
        public static final String User_APP_ACTIVE = "app_active";
        public static final String User_password = "password";
        public static final String User_commonlist = "commonlist";
        public static final String USER_IS_FIRST_TIME = "user_first_time";
        public static final String USER_IS_FIRST_ONUPLOAD_ACTIVITY = "user_upload_Act_first";
        public static final String USER_IS_FIRST_TIME_FOR_ADD_TEXT = "user_first_time_for_add_text";
        public static final String USER_IS_FIRST_TIME_TEXT_VIEW = "user_first_time_text_view";
        public static final String USER_IS_FIRST_TIME_EDI_LAYOUT = "user_first_time_Edit_layout";


        public static final String Company_ID = "Company_ID";
        public static final String Company_Name = "Company_Name";
        public static final String Company_ContactPerson = "Company_ContactPerson";
        public static final String Company_CityID = "Company_CityID";
        public static final String Company_MobileNo = "Company_MobileNo";
        public static final String Company_User_Type = "Company_User_Type";
        public static final String Company_Active = "Company_Active";
        public static final String Company_Paid_User = "Company_Paid_User";
        public static final String Company_user_name = "Company_user_name";
        public static final String Company_user_password = "Company_user_password";
        public static final String Company_email = "Company_email";
        public static final String Company_DB_Reference = "Company_DB_Reference";
        public static final String Company_UserID = "Company_UserID";
        public static final String Company_Emp_ID = "Company_Emp_ID";
        public static final String Company_FROM_DATE = "Company_From_date";
        public static final String Company_TO_DATE = "Company_To_date";

        public static final String Company_Phone_No = "Company_Phone_No";
        public static final String Company_Address = "Company_Address";
        public static final String USER_IS_FIRST_TIME_LANG = "user_first_time_lang";


        public static final String USER_REFERRAL = "user_referral";
        public static final String USER_ID = "user_id";
        public static final String FIRST_NAME = "FIRST_NAME";
        public static final String LAST_NAME = "LAST_NAME";
        public static final String USER_EMAIL = "User_EMAIL";
        public static final String USER_ROLE_ID= "USER_ROLE_ID";
        public static final String USER_PHONE= "USER_PHONE";
        public static final String USER_COMPANY_ID= "USER_COMPANY_ID";
        public static final String USER_OFFICE_ID = "USER_OFFICE_ID";
        public static final String USER_EMP_ID = "USER_EMP_ID";
        public static final String USER_LOGIN_URL = "USER_LOGIN_URL";
        public static final String USER_DESIGNATION = "USER_DESIGNATION";
        public static final String USER_PROFILE_IMG = "USER_PROFILE_IMG";
        public static final String USER_INCHARGE_NAME = "USER_INCHARGE_NAME";
        public static final String USER_INCHARGE_ID = "USER_INCHARGE_ID";
        public static final String LOGIN_TAG = "login";
        public static final String USER_INCHARGE_PHONE = "USER_INCHARGE_PHONE";
        public static final String TAG_UPDATE_LANG = "updatelang";
        public static final String TAG_INSERT_LIKES = "insertlikes";
        public static final String TAG_INSERT_UNLIKE = "insertunlike";
        public static final String TAG_INSERT_FAV = "insertfav";
        public static final String TAG_DELTE_FAV = "deletefav";
        public static final String TAG_FAV_MEME = "getfavmeme";
        public static final String TAG_MY_MEME = "getMyUploadedMeme";


        public static final String TAG_UPDATE_NAME = "updateName";
        public static final String TAG_GET_LIKED_USERS = "getLikedUsers";
        public static final String TAG_GET_MEME_BY_USER = "getMemeByUser";


        public static final String TAG_GET_100_MEME = "getallmeme";
        public static final String SEARCH_RESULTS_TAG = "searchresults";
        public static final String SEARCH_LANG_TAG = "searchlang";
        public static final String MEME_PATH = "meme_path";
        public static final String TABLE_PICS = "pics";
        public static final String TABLE_VIDEOS = "videos";
        public static final String TAG_GET_CATEGORY = "getcategory";
        public static final String PICS = "Pictures";
        public static final String VIDEOS = "videos";
        public static final String LANG_SELECTED = "lang_selected";
        public static final String USER_LANG = "user_lang";
        public static final String FILE_PATH = "file_path";
        public static final String FILE_TYPE = "file_type";
        public static final String FILE_NAME = "file_name";
        public static final String FILE_THUMBNAIL = "file_thumb_path";
        private static final String tag = "Utils";
        private static final String VERSION_UNAVAILABLE = "N/A";
        public static String KEY_VALUE = "AIzaSyBIf3lkmWO9LUjC3lzyG4w1pMdmy55sZiA";
        private static int screenWidth = 0;
        private static int screenHeight = 0;


        public static void logVerbose(String text) {
            Log.i("MemeDon", text);
        }

        public static void logVerbose(String tag, String text) {
            Log.i(tag, text);
        }

        public static void logError(String tag, String text) {
            Log.e(tag, text);
        }

        public static void logDebug(String tag, String text) {
            Log.d(tag, text);
        }

        public static boolean isOnline(Context context) {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService( Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = cm.getActiveNetworkInfo();
            return netInfo != null && netInfo.isConnectedOrConnecting();
        }

        public static void setListViewHeightBasedOnChildren(ListView listView) {
            ListAdapter listAdapter = listView.getAdapter();
            if (listAdapter == null)
                return;

            int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                    View.MeasureSpec.UNSPECIFIED);
            int totalHeight = 0;
            View view = null;
            for (int i = 0; i < listAdapter.getCount(); i++) {
                view = listAdapter.getView(i, view, listView);
                if (i == 0)
                    view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth,
                            ViewGroup.LayoutParams.WRAP_CONTENT));

                view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
                totalHeight += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams params = listView.getLayoutParams();
            params.height = totalHeight + 10 +
                    +(listView.getDividerHeight() * (listAdapter.getCount() - 1));
            listView.setLayoutParams(params);
            listView.requestLayout();
        }

        public static void showToast(String message, Activity activity) {
            //AppMs.makeText(activity, message, AppMsg.STYLE_INFO).show();
        }

        public static void snackToast(String message, View view) {
            if (view != null)
                Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
        }

        public static String getMonth(int month) {
            return new DateFormatSymbols().getMonths()[month - 1];
        }

        public static void blinkView(final View view) {
            view.setVisibility( View.INVISIBLE);
            new Handler().postDelayed( new Runnable() {
                @Override
                public void run() {
                    view.setVisibility( View.VISIBLE);
                }
            }, 100);

        }

        public static void blinkView(final View view, int blinkValue) {
            view.setVisibility( View.INVISIBLE);
            new Handler().postDelayed( new Runnable() {
                @Override
                public void run() {
                    view.setVisibility( View.VISIBLE);
                }
            }, blinkValue);

        }

        /**
         * Stack Blur v1.0 from
         * http://www.quasimondo.com/StackBlurForCanvas/StackBlurDemo.html
         * Java Author: Mario Klingemann <mario at quasimondo.com>
         * http://incubator.quasimondo.com
         * <p/>
         * created Feburary 29, 2004
         * Android port : Yahel Bouaziz <yahel at kayenko.com>
         * http://www.kayenko.com
         * ported april 5th, 2012
         * <p/>
         * This is a compromise between Gaussian Blur and Box blur
         * It creates much better looking blurs than Box Blur, but is
         * 7x faster than my Gaussian Blur implementation.
         * <p/>
         * I called it Stack Blur because this describes best how this
         * filter works internally: it creates a kind of moving stack
         * of colors whilst scanning through the image. Thereby it
         * just has to add one new block of color to the right side
         * of the stack and remove the leftmost color. The remaining
         * colors on the topmost layer of the stack are either added on
         * or reduced by one, depending on if they are on the right or
         * on the left side of the stack.
         * <p/>
         * If you are using this algorithm in your code please add
         * the following line:
         * Stack Blur Algorithm by Mario Klingemann <mario@quasimondo.com>
         */

        private static Bitmap fastblur(Bitmap sentBitmap, float scale, int radius) {

            int width = Math.round(sentBitmap.getWidth() * scale);
            int height = Math.round(sentBitmap.getHeight() * scale);
            sentBitmap = Bitmap.createScaledBitmap(sentBitmap, width, height, false);

            Bitmap bitmap = sentBitmap.copy(sentBitmap.getConfig(), true);
            sentBitmap.recycle();
            if (radius < 1) {
                return (null);
            }

            int w = bitmap.getWidth();
            int h = bitmap.getHeight();

            int[] pix = new int[w * h];
            Log.e("pix", w + " " + h + " " + pix.length);
            bitmap.getPixels(pix, 0, w, 0, 0, w, h);

            int wm = w - 1;
            int hm = h - 1;
            int wh = w * h;
            int div = radius + radius + 1;

            int r[] = new int[wh];
            int g[] = new int[wh];
            int b[] = new int[wh];
            int rsum, gsum, bsum, x, y, i, p, yp, yi, yw;
            int vmin[] = new int[Math.max(w, h)];

            int divsum = (div + 1) >> 1;
            divsum *= divsum;
            int dv[] = new int[256 * divsum];
            for (i = 0; i < 256 * divsum; i++) {
                dv[i] = (i / divsum);
            }

            yw = yi = 0;

            int[][] stack = new int[div][3];
            int stackpointer;
            int stackstart;
            int[] sir;
            int rbs;
            int r1 = radius + 1;
            int routsum, goutsum, boutsum;
            int rinsum, ginsum, binsum;

            for (y = 0; y < h; y++) {
                rinsum = ginsum = binsum = routsum = goutsum = boutsum = rsum = gsum = bsum = 0;
                for (i = -radius; i <= radius; i++) {
                    p = pix[yi + Math.min(wm, Math.max(i, 0))];
                    sir = stack[i + radius];
                    sir[0] = (p & 0xff0000) >> 16;
                    sir[1] = (p & 0x00ff00) >> 8;
                    sir[2] = (p & 0x0000ff);
                    rbs = r1 - Math.abs(i);
                    rsum += sir[0] * rbs;
                    gsum += sir[1] * rbs;
                    bsum += sir[2] * rbs;
                    if (i > 0) {
                        rinsum += sir[0];
                        ginsum += sir[1];
                        binsum += sir[2];
                    } else {
                        routsum += sir[0];
                        goutsum += sir[1];
                        boutsum += sir[2];
                    }
                }
                stackpointer = radius;

                for (x = 0; x < w; x++) {

                    r[yi] = dv[rsum];
                    g[yi] = dv[gsum];
                    b[yi] = dv[bsum];

                    rsum -= routsum;
                    gsum -= goutsum;
                    bsum -= boutsum;

                    stackstart = stackpointer - radius + div;
                    sir = stack[stackstart % div];

                    routsum -= sir[0];
                    goutsum -= sir[1];
                    boutsum -= sir[2];

                    if (y == 0) {
                        vmin[x] = Math.min(x + radius + 1, wm);
                    }
                    p = pix[yw + vmin[x]];

                    sir[0] = (p & 0xff0000) >> 16;
                    sir[1] = (p & 0x00ff00) >> 8;
                    sir[2] = (p & 0x0000ff);

                    rinsum += sir[0];
                    ginsum += sir[1];
                    binsum += sir[2];

                    rsum += rinsum;
                    gsum += ginsum;
                    bsum += binsum;

                    stackpointer = (stackpointer + 1) % div;
                    sir = stack[(stackpointer) % div];

                    routsum += sir[0];
                    goutsum += sir[1];
                    boutsum += sir[2];

                    rinsum -= sir[0];
                    ginsum -= sir[1];
                    binsum -= sir[2];

                    yi++;
                }
                yw += w;
            }
            for (x = 0; x < w; x++) {
                rinsum = ginsum = binsum = routsum = goutsum = boutsum = rsum = gsum = bsum = 0;
                yp = -radius * w;
                for (i = -radius; i <= radius; i++) {
                    yi = Math.max(0, yp) + x;

                    sir = stack[i + radius];

                    sir[0] = r[yi];
                    sir[1] = g[yi];
                    sir[2] = b[yi];

                    rbs = r1 - Math.abs(i);

                    rsum += r[yi] * rbs;
                    gsum += g[yi] * rbs;
                    bsum += b[yi] * rbs;

                    if (i > 0) {
                        rinsum += sir[0];
                        ginsum += sir[1];
                        binsum += sir[2];
                    } else {
                        routsum += sir[0];
                        goutsum += sir[1];
                        boutsum += sir[2];
                    }

                    if (i < hm) {
                        yp += w;
                    }
                }
                yi = x;
                stackpointer = radius;
                for (y = 0; y < h; y++) {
                    // Preserve alpha channel: ( 0xff000000 & pix[yi] )
                    pix[yi] = (0xff000000 & pix[yi]) | (dv[rsum] << 16) | (dv[gsum] << 8) | dv[bsum];

                    rsum -= routsum;
                    gsum -= goutsum;
                    bsum -= boutsum;

                    stackstart = stackpointer - radius + div;
                    sir = stack[stackstart % div];

                    routsum -= sir[0];
                    goutsum -= sir[1];
                    boutsum -= sir[2];

                    if (x == 0) {
                        vmin[y] = Math.min(y + r1, hm) * w;
                    }
                    p = x + vmin[y];

                    sir[0] = r[p];
                    sir[1] = g[p];
                    sir[2] = b[p];

                    rinsum += sir[0];
                    ginsum += sir[1];
                    binsum += sir[2];

                    rsum += rinsum;
                    gsum += ginsum;
                    bsum += binsum;

                    stackpointer = (stackpointer + 1) % div;
                    sir = stack[stackpointer];

                    routsum += sir[0];
                    goutsum += sir[1];
                    boutsum += sir[2];

                    rinsum -= sir[0];
                    ginsum -= sir[1];
                    binsum -= sir[2];

                    yi += w;
                }
            }

            Log.e("pix", w + " " + h + " " + pix.length);
            bitmap.setPixels(pix, 0, w, 0, 0, w, h);

            return (bitmap);
        }

        public static Drawable getWallpaper(Context context) {
            Drawable returnDrawable = null;
            Bitmap bitmap = null;
            final WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
            @SuppressLint("MissingPermission") final Drawable drawable = wallpaperManager.getDrawable();

            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    bitmap = bitmapDrawable.getBitmap();
                    returnDrawable = new BitmapDrawable(context.getResources(), fastblur(bitmap, 0.3f, 30));
                    return returnDrawable;
                }
            }

            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888); // Single color bitmap will be created of 1x1 pixel
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            }

            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);

            returnDrawable = new BitmapDrawable(context.getResources(), fastblur(bitmap, 0.3f, 30));

            return returnDrawable;

        }

        public static boolean hasFroyo() {
            // Can use static final constants like FROYO, declared in later versions
            // of the OS since they are inlined at compile time. This is guaranteed behavior.
            return Build.VERSION.SDK_INT >= VERSION_CODES.FROYO;
        }

        public static boolean hasGingerbread() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.GINGERBREAD;
        }

        public static boolean hasHoneycomb() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB;
        }

        public static boolean hasHoneycombMR1() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB_MR1;
        }

        public static boolean hasJellyBean() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN;
        }

        public static boolean hasICS() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.ICE_CREAM_SANDWICH;
        }

        public static boolean hasKitKat() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.KITKAT;
        }

        public static String getVersionName(Context context) {
            // Get app version
            PackageManager pm = context.getPackageManager();
            String packageName = context.getPackageName();
            String versionName;
            try {
                PackageInfo info = pm.getPackageInfo(packageName, 0);
                versionName = info.versionName;
            } catch (PackageManager.NameNotFoundException e) {
                versionName = VERSION_UNAVAILABLE;
            }
            return versionName;
        }

        /**
         * Hides the soft keyboard
         */
        public static void hideSoftKeyboard(Activity activity) {
            activity.getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        }

        public static void hideKeyboard(View view, Context context) {

            if (view != null) {
                InputMethodManager imm = (InputMethodManager) context.getSystemService( Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }

        }

        // For Reference : https://colinyeoh.wordpress.com/2012/10/07/simple-android-animation-on-view-gonevisible/
        public static void slideToBottom(View view) {
            TranslateAnimation animate = new TranslateAnimation(0, 0, 0, view.getHeight());
            animate.setDuration(300);
            animate.setFillAfter(true);
            view.startAnimation(animate);
            view.setVisibility( View.GONE);
        }

        // To animate view slide out from bottom to top
        public static void slideToTop(View view) {
            TranslateAnimation animate = new TranslateAnimation(0, 0, view.getHeight(), 0);
            animate.setDuration(300);
            animate.setFillAfter(true);
            view.startAnimation(animate);
            view.setVisibility( View.VISIBLE);
        }


        public static void slideDownSlideIn(final View slideDownView, final View slideInView) {
            TranslateAnimation animate = new TranslateAnimation(0, 0, 0, slideDownView.getHeight());
            animate.setDuration(300);
            animate.setFillAfter(true);
            animate.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {

                    TranslateAnimation animate1 = new TranslateAnimation(0, 0, slideInView.getHeight(), 0);
                    animate1.setDuration(300);
                    animate1.setFillAfter(true);
                    slideInView.startAnimation(animate1);
                    slideInView.setVisibility( View.VISIBLE);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }
            });
            slideDownView.startAnimation(animate);
            slideDownView.setVisibility( View.GONE);

        }

        public static void openInApp(Context ctx) {


            final String appPackageName = ctx.getPackageName(); // getPackageName() from Context or Activity object
            try {
                ctx.startActivity(new Intent( Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)).addFlags( Intent.FLAG_ACTIVITY_NEW_TASK));
            } catch (ActivityNotFoundException anfe) {
                ctx.startActivity(new Intent( Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)).addFlags( Intent.FLAG_ACTIVITY_NEW_TASK));
            }

        }

        public static final void shareTo(Context context, String s3, String s4, String s5)
        //keerthi added new method for image share
        {
            Intent intent = new Intent("android.intent.action.SEND");

            if (s4 != null) {

                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s4)));
                s5 = "image/jpeg";
                intent.setType(s5);
            } else
                intent.setType("text/plain");
            intent.setType(s5);

            try {
                context.startActivity( Intent.createChooser(intent, s3));
                return;

            } catch (ActivityNotFoundException activitynotfoundexception) {

            }
        }

        public static DisplayMetrics getDisplay(Activity activity) {
            DisplayMetrics metrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
            return metrics;
        }

        public static int dpToPx(int dp) {
            return (int) (dp * Resources
                    .getSystem().getDisplayMetrics().density);
        }

        public static int getScreenHeight(Context c) {
            if (screenHeight == 0) {
                WindowManager wm = (WindowManager) c.getSystemService( Context.WINDOW_SERVICE);
                Display display = wm.getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                screenHeight = size.y;
            }

            return screenHeight;
        }

        public static int getScreenWidth(Context c) {
            if (screenWidth == 0) {
                WindowManager wm = (WindowManager) c.getSystemService( Context.WINDOW_SERVICE);
                Display display = wm.getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                screenWidth = size.x;
            }

            return screenWidth;
        }

        public static boolean isAndroid5() {
            return Build.VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP;
        }


        public String getUserID(Context context) {
            return Settings.Secure.getString(context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        }

    }
