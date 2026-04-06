# Polimorfismo y Clases Abstractas
## Enunciado

Una empresa de transporte necesita desarrollar un sistema para gestionar distintos tipos de vehículos.

Actualmente, la empresa cuenta con los siguientes vehículos:

    * Autos
    * Camiones
    * Motos

Todos los vehículos comparten ciertas características:

    * Patente
    * Marca
    * Cantidad de combustible (en litros)

Además, todos los vehículos pueden realizar la acción de avanzar una cierta cantidad de kilómetros, pero no todos consumen combustible de la misma forma:

    * Auto: consume 1 litro cada 10 km
    * Camión: consume 1 litro cada 4 km
    * Moto: consume 1 litro cada 20 km

Objetivos

Se desea modelar esta situación aplicando:

    * Herencia
    * Clases abstractas
    * Polimorfismo

## Se pide

  * Crear una clase abstracta Vehiculo que contenga:
    - Atributos comunes
    - Constructor
    - Métodos getters
    - Un método abstracto:
    - public abstract void avanzar(int km);
    - Crear las siguientes clases que hereden de Vehiculo:
      * Auto
      * Camion
      * Moto
  - Implementar en cada clase el método avanzar(int km):
            Debe descontar el combustible según el consumo correspondiente
            Si no alcanza el combustible, no debe avanzar e informar la situación
  - En una clase principal (Main):
            Crear al menos un objeto de cada tipo de vehículo
            Guardarlos en una colección (array o lista) de tipo Vehiculo
            Recorrer la colección y hacer que todos avancen la misma cantidad de kilómetros
            Mostrar por pantalla:
                Tipo de vehículo
                Patente
                Combustible restante
  ## Requisitos importantes
  - No se puede instanciar la clase Vehiculo
  - Se debe utilizar polimorfismo para recorrer los objetos
  - Cada vehículo debe tener su propio comportamiento al avanzar
