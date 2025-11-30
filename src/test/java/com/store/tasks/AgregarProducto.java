package com.store.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.store.ui.LoginScreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregarProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginScreen.AGREGAR_AL_CARRO_ANDROID));
    }

    public static AgregarProducto producto() {
        return instrumented(AgregarProducto.class);
    }
}
