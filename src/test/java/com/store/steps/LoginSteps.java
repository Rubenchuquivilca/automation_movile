package com.store.steps;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import com.store.questions.CuentaProducto;
import com.store.tasks.AgregarProducto;
import com.store.ui.LoginScreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private Actor actor;


    @Before
    public void setTheStage(){
        actor = OnStage.theActorCalled("User");
    }

    @Given("estoy en la aplicacion de swag labs")
    public void estoy_en_la_aplicacion_de_swag_labs(){
        actor.attemptsTo(WaitUntil.the(LoginScreen.titulo_producto(), isNotVisible())
                .forNoMoreThan(20).seconds());
        System.out.println("el titulo es: " + actor);
    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria(){

        actor.attemptsTo(WaitUntil.the(LoginScreen.lista_producto(), isNotVisible())
                .forNoMoreThan(15).seconds());

        System.out.println("la lista general de productos son : " + actor);
    }
    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto(int unidades, String producto){
        actor.attemptsTo(AgregarProducto.producto());
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente(){
        String productonombre = actor.asksFor(CuentaProducto.name());
        assertThat("actualizo correctamente" + productonombre).isNotBlank();
    }

}
