# LoginPageAndroid
This project can be used for implementation of Login Screen with Splash Image

## Full Screen Activity

```
Java Code

getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
WindowManager.LayoutParams.FLAG_FULLSCREEN);
getSupportActionBar().hide();
```

## Gradient (Basic Code)

```
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item>
        <shape>
            <gradient
                android:startColor="@color/startColor1"
                android:centerColor="@color/centerColor"
                android:endColor="@color/startColor1"
                android:angle="45"/>
        </shape>
    </item>
</selector>

```

## Shapes / Outline (Basic Code)


```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle" >
    <corners
        android:topLeftRadius="35dp"
        android:topRightRadius="35dp"
        android:bottomLeftRadius="35dp"
        android:bottomRightRadius="35dp"
        />
    <solid
        android:color="#00000000"
        />
    <padding
        android:left="0dp"
        android:top="0dp"
        android:right="0dp"
        android:bottom="0dp"
        />
    <size
        android:width="270dp"
        android:height="60dp"
        />
    <stroke
        android:width="1.5dp"
        android:color="#FFFFFF"
        />
</shape>
```

