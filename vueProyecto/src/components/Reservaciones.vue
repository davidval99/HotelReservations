<template>

  <div class="reservaciones">
  <Header />
  <br><br><br><br>
  <h1>{{ mensajeReservaciones }}</h1>
  <br>
    <table style="width:100%">
      <tr>
        <th>Hotel</th>
        <th>Habitacion</th>
        <th>Usuario</th>
        <th>Fecha entrada</th>
        <th>Fecha salida</th>
      </tr>
      <tr>
        <td>         </td>
        <td>         </td>
        <td>         </td>
        <td>         </td>
        <td>         </td>
      </tr>
       <tr>
              <td>         </td>
              <td>         </td>
              <td>         </td>
              <td>         </td>
              <td>         </td>
       </tr>
    </table>
    <br><br><br><br>
  <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';

export default {
  components: {
        Header,
        Footer
  },
     props: {
       mensajeReservaciones: String
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
}
th {
  text-align: left;
}
</style>