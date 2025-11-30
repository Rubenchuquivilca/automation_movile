package com.store.questions;

import com.store.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CuentaProducto implements Question<String> {

    public static Question<String> name() {
    return new CuentaProducto();
}

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginScreen.PRODUCTO_NOMBRE_ANDROID).toString();
    }
}