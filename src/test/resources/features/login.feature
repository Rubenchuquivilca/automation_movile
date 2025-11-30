Feature: Creacion de Login en Swag Labs
  Ingresar con mi cuenta
  para poder acceder a la lista
  de productos y carrito de compras
  dentro de la aplicacion

  Background:
    Given estoy en la aplicacion de swag labs

    @android @login
    Scenario Outline: Inicio de session exitoso
      And valido que carguen correctamente los productos en la galeria
      When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
      Then valido el carrito de compra actualice correctamente

      Examples:
        | PRODUCTO                        | UNIDADES |
        | Sauce Labs Backpack     | 1                   |
        | Sauce Labs Bolt - T-Shirt | 1                   |
        | Sauce Labs Bike Light     | 2                   |