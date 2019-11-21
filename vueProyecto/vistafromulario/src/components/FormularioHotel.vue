<template>
  <div>
    <Header />

        <br><br><br>
        <img align="right" alt="imagen vacia" src="../assets/imagenVacia.jpg">
        <br><br>

        Nombre:
        <input type="text" name="nombre">
        <br><br>

        Primer apellido:
        <input type="text" name="apellido1">
        <br><br>

        Segundo apellido:
        <input type="text" name="apellido2">
        <br><br>

        Fecha de nacimiento:
        <input type="date" data-date-inline-picker="true" name="fecha-nacimiento">
        <br><br>

        Correo electronico:
        <input type="text" name="correo">
        <br><br>

        Numero de tarjeta:
        <input type="text" name="tarjeta">
        <br><br><br><br>

        <button name="button"><router-link to="confirmacion">Reservar</router-link></button>

        <br><br><br><br><br><br><br><br><br><br><br>
    <Footer />
  </div>
</template>

<script>

import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {

    name: 'FormularioHotel',

    data() {
        return {
            reservation: {
                nombre: "",
                primerApellido: "",
                segundoApellido: "",
                fecha: "",
                correo: "",
                habitacion: "",
                tarjeta: "",
                fechaIn: "",
                fechaOut: "",
            }
        }
      },

    methods: {


    },

    components: {
        Header,
        Footer
    }
}

</script>

<style scoped>


</style>
