<template>

  <div >
  <Header />

    <div id="show-blogs" v-for="reservation in reservations" :key="reservation.id">
        <h1>Reservaciones{{reservation.id}}</h1>
        <table style="width:100%">
        <tr>
            <td>Usuario</td>
            <td>Hotel</td>
            <td>Habitacion</td>
            <td>Fecha de Entrada</td>
            <td>Fecha de Salida</td>
        </tr>
            <tr>
                <td>{{reservation.user}}</td>
                <td>{{reservation.hotel}}</td>
                <td>{{reservation.room}}</td>
                <td>{{reservation.checkInDate}}</td>
                <td>{{reservation.checkOutDate}}</td>
            </tr>
        </table>
    </div>

  <Footer />
  </div>
</template>

<script>

import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {
  name: 'Reservaciones',
  components: {
        Header,
        Footer
  },

  data(){
    return {
        reservations : []
    }
  },
  methods: {

  },
   created() {
       this.$http.get('http://www.json-generator.com/api/json/get/bUFQTgqmqa?indent=2').then(function(data){
       this.reservations = data.body;
       })
    }
}

</script>

<style scoped>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>