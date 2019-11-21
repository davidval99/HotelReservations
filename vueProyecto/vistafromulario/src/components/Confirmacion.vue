<template>
  <div>

   <Header />
        <h1>Confirmacion de reservacion:</h1>
        <br><br><br>
        <div id="confirm-reservation">
             Nombre del usuario:
             <label>Juan</label>
             <br><br>

             Fecha de nacimiento:
             <label>10-10-1999</label>
             <br><br>

             Correo electronico:
             <label>ex@gmail.com</label>
             <br><br>

             Numero de tarjeta de credito:
             <label>1234</label>
             <br><br>

             Fecha de check-in:
             <label>2018-12-28</label>
             <br><br>

             Fecha de check-out:
             <label>2018-12-31</label>
             <br><br>

             <br><br><br><br>
             <button v-on:click.prevent="post">Realizar Reservacion</button>
             <br><br><br><br>
         </div>
         <div v-if="estado">
            <label>OK</label>
         </div>
    <Footer />
  </div>
</template>

<script>

import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {

  name: 'Confirmacion',

  components: {
        Header,
        Footer
  },

  data() {
    return {
        reservation: {
            nombre: "",
            primerApellido: "",
            segundoApellido: "",
            fecha: "",
            correo: "",
            tarjeta: "",
            fechaIn: "",
            fechaOut: "",
        },
        estado: false
    }
  },

  methods: {

        post: function() {

            this.$http.post('http://localhost:8080/createReservation', {
                name: this.reservation.nombre,
                email: this.reservation.correo,
                creditCardNumber: this.reservation.tarjeta,
                checkInDate: this.reservation.fechaIn,
                checkOutDate: this.reservation.fechaOut
            }, this.estado=true);
        }
  }
}
</script>

<style scoped>
</style>