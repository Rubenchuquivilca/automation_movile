package com.store.ui;

import com.store.utils.ConfigHelper;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScreen {

    //ANDROID
    public static final Target TITLE_PRODUCT_ANDROID =
            Target.the("titulo producto")
                    .located(By.xpath("//android.widget.TextView[@content-desc='title']"));
    public static final Target LIST_PRODUCT_ANDROID = Target.the("Lista de productos")
            .located(By.xpath("//android.widget.RecyclerView[@content-desc='Displays all products of catalog']"));

    public static final Target AGREGAR_AL_CARRO_ANDROID =
            Target.the("agregar al carrito un producto")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='addToCartBtn']"));

    public static final Target PRODUCTO_NOMBRE_ANDROID =
            Target.the("producto nombre")
                    .located(By.xpath("//android.widget.TextView[@content-desc='productName']"));

    //IOS
    public static final Target TITLE_PRODUCT_IOS =
            Target.the("titulo producto")
                    .located(By.xpath("//android.widget.TextView[@content-desc='title']"));
    public static final Target LIST_PRODUCT_IOS = Target.the("Lista de productos")
            .located(By.xpath("//android.widget.RecyclerView[@content-desc='Displays all products of catalog']"));

    public static final Target AGREGAR_AL_CARRO_IOS =
            Target.the("agregar al carrito un producto")
                    .located(By.xpath("//android.view.ViewGroup[@content-desc='addToCartBtn']"));
    public static final Target PRODUCTO_NOMBRE_IOS =
            Target.the("producto nombre")
                    .located(By.xpath("//android.widget.TextView[@content-desc='productName']"));


    //METODOS
    public static Target titulo_producto() {
        return ConfigHelper.isAndroid() ? TITLE_PRODUCT_ANDROID : TITLE_PRODUCT_IOS;
    }

    public static Target lista_producto() {
        return ConfigHelper.isAndroid() ? LIST_PRODUCT_ANDROID : LIST_PRODUCT_IOS;
    }

    //public static Target agregar_producto() {
      //  return ConfigHelper.isAndroid() ? AGREGAR_AL_CARRO_ANDROID : AGREGAR_AL_CARRO_IOS;
    //}
}